/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import com.mycompany.restauranteitson_persistencia.IClienteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import restauranteitson_dominio.Cliente;
import restauranteitson_dtos.NuevoClienteDTO;

/**
 *
 * @author santi
 */
public class ClienteDAO implements IClienteDAO {

    @Override
    public Cliente registrar(NuevoClienteDTO nuevoCliente) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // inicar una transaccion
        entityManager.getTransaction().begin();
        
        Cliente cliente = new Cliente();
        cliente.setNombreCliente(nuevoCliente.getNombreCliente());
        cliente.setTelefonoCliente(nuevoCliente.getTelefonoCliente());
        cliente.setCorreo(nuevoCliente.getCorreoCliente());
        
        entityManager.persist(cliente);
        entityManager.getTransaction().commit();
        
        return cliente;
    }

    @Override
    public List<Cliente> consultar(String filtroBusqueda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // forma 1 consultar con JPA - JPQL
        String jpqlQuery = "SELECT c FROM Cliente c";
        
        TypedQuery<Cliente> query = entityManager.createQuery(jpqlQuery, Cliente.class);
        List<Cliente> clientes = query.getResultList();
        return clientes;
    }

    @Override
    public Cliente consultar(Long idCliente) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        Cliente cliente = entityManager.find(Cliente.class, idCliente);
        return cliente;
    }
    
}
