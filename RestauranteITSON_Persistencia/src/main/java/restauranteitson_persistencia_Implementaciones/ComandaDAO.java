/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import com.mycompany.restauranteitson_persistencia.IComandaDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import restauranteitson_dominio.Comanda;
import restauranteitson_dtos.NuevaComandaDTO;
import restauranteitson_enum.Estado;

/**
 *
 * @author santi
 */
public class ComandaDAO implements IComandaDAO {

    @Override
    public Comanda registrar(NuevaComandaDTO nuevoComanda) {
        // la fábrica crea un entityManager = base de datos
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // inicar una transaccion
        entityManager.getTransaction().begin();
        
        Comanda comanda = new Comanda();
        comanda.setFolio(nuevoComanda.getFolio());
        comanda.setFechaHora(nuevoComanda.getFechaHora());
        comanda.setNombreCliente(nuevoComanda.getNombreCliente());
        comanda.setEstado(Estado.ABIERTA);
        comanda.setTotal(nuevoComanda.getComandasProducto().stream().mapToDouble(p -> p.getImporteTotal()).sum());
        comanda.setMesa(nuevoComanda.getMesa());
        comanda.setComandaProductos(nuevoComanda.getComandasProducto());
        entityManager.persist(comanda);
        entityManager.getTransaction().commit();
        return comanda;
    }

    @Override
    public List<Comanda> consultar() {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        String jpqlQuery = "SELECT c FROM Comanda c";
        
        TypedQuery<Comanda> query = entityManager.createQuery(jpqlQuery, Comanda.class);
        List<Comanda> Comandas = query.getResultList();
        return Comandas;
    }

    @Override
    public Comanda consultar(Long idComanda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        Comanda comanda = entityManager.find(Comanda.class, idComanda);
        return comanda;
    }

    @Override
    public void actualizarEstadoComanda(Estado estado, Long idComanda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        Comanda comanda = entityManager.find(Comanda.class, idComanda);
        comanda.setEstado(estado);
    
    }
    
    
}
