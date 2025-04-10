/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import com.mycompany.restauranteitson_persistencia.IClienteFrecuenteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.Calendar;
import java.util.List;
import restauranteitson_dominio.ClienteFrecuente;
import restauranteitson_dtos.NuevoClienteDTO;

/**
 *
 * @author santi
 */
public class ClienteFrecuenteDAO implements IClienteFrecuenteDAO {

    @Override
    public ClienteFrecuente registrar(NuevoClienteDTO nuevoClienteFrecuente) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // inicar una transaccion
        entityManager.getTransaction().begin();
        
        //creamos la fecha de registro con calendar
        ClienteFrecuente clienteFrecuente = new ClienteFrecuente();
  
        clienteFrecuente.setNombreCliente(nuevoClienteFrecuente.getNombreCliente());
        clienteFrecuente.setTelefonoCliente(nuevoClienteFrecuente.getTelefonoCliente());
        clienteFrecuente.setCorreo(nuevoClienteFrecuente.getCorreoCliente());
        
        clienteFrecuente.setFechaRegistro(Calendar.getInstance());
        clienteFrecuente.setNumeroVisitas(nuevoClienteFrecuente.getNumeroVisitas());
        clienteFrecuente.setPuntosFidelidad(nuevoClienteFrecuente.getPuntosFidelidad());
        clienteFrecuente.setFechaUltimaComanda(nuevoClienteFrecuente.getFechaUltimaComanda());
        clienteFrecuente.setTotalGastado(nuevoClienteFrecuente.getTotalGastado());
        
        entityManager.persist(clienteFrecuente);
        entityManager.getTransaction().commit();
        return clienteFrecuente;
    }

    @Override
    public List<ClienteFrecuente> consultar(String filtroBusqueda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        List<ClienteFrecuente> clientes;
         try {
            int visitasMinimas = Integer.parseInt(filtroBusqueda);//si causa exepcion es un nombre

            String jpqlQuery = "SELECT c FROM ClienteFrecuente c WHERE c.numeroVisitas >= :visitas";
            TypedQuery<ClienteFrecuente> query = entityManager.createQuery(jpqlQuery, ClienteFrecuente.class);
            query.setParameter("visitas", visitasMinimas);
            clientes = query.getResultList();

        } catch (NumberFormatException e) {
            //en caso de ser un nombre
            String jpqlQuery = "SELECT c FROM ClienteFrecuente c WHERE LOWER(c.nombreCliente) LIKE :filtro";
            TypedQuery<ClienteFrecuente> query = entityManager.createQuery(jpqlQuery, ClienteFrecuente.class);
            query.setParameter("filtro", "%" + filtroBusqueda.toLowerCase() + "%");
            clientes = query.getResultList();
        }
        return clientes;
    }
    
}
