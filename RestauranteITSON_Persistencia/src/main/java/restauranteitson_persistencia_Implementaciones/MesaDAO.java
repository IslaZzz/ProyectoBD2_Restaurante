/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import com.mycompany.restauranteitson_persistencia.IMesaDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.Mesa;
import restauranteitson_dtos.NuevaMesaDTO;

/**
 *
 * @author santi
 */
public class MesaDAO implements IMesaDAO {

    @Override
    public Mesa registrar(NuevaMesaDTO nuevoMesa) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        entityManager.getTransaction().begin();
        
        Mesa mesa = new Mesa();
        //cambiar al actualizar, se recibira el objecto cliente 
        mesa.setNumeroMesa(nuevoMesa.getNumeroMesa());
        mesa.setCliente(entityManager.find(Cliente.class, nuevoMesa.getIdCliente()));
        mesa.setDisponibilidad(nuevoMesa.getDisponibilidad());
        
        entityManager.persist(mesa);
        entityManager.getTransaction().commit();
        return mesa;
        
    }

    @Override
    public Mesa consultar(Long idMesa) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        Mesa mesa = entityManager.find(Mesa.class,idMesa);
        return mesa;
    }

    @Override
    public List<Mesa> consultar(String filtroBusqueda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // forma 1 consultar con JPA - JPQL
        String jpqlQuery = "SELECT m FROM Mesa m";
        
        TypedQuery<Mesa> query = entityManager.createQuery(jpqlQuery, Mesa.class);
        List<Mesa> Mesas = query.getResultList();
        return Mesas;
    }
    
}