/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import com.mycompany.restauranteitson_persistencia.IIngredienteDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import restauranteitson_dominio.Comanda;
import restauranteitson_dominio.Ingrediente;
import restauranteitson_dtos.NuevoIngredienteDTO;

/**
 *
 * @author santi
 */
public class IngredienteDAO implements IIngredienteDAO {

    @Override
    public Ingrediente registrar(NuevoIngredienteDTO nuevoIngredienteDTO) {
        // la fábrica crea un entityManager = base de datos
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // inicar una transaccion
        entityManager.getTransaction().begin();
        
        Ingrediente ingrediente = new Ingrediente();
        
        ingrediente.setNombreIngrediente(nuevoIngredienteDTO.getNombre());
        ingrediente.setUnidadMedida(nuevoIngredienteDTO.getUnidadIngrediente());
        ingrediente.setStock(nuevoIngredienteDTO.getStock());
        
        entityManager.persist(ingrediente);
        entityManager.getTransaction().commit();
        return ingrediente;
    }

    @Override
    public List<Ingrediente> consultarIngredientes(String filtro) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // forma 1 consultar con JPA - JPQL
        String jpqlQuery = "SELECT i FROM Ingrediente i";
        
        TypedQuery<Ingrediente> query = entityManager.createQuery(jpqlQuery, Ingrediente.class);
        List<Ingrediente> ingredientes = query.getResultList();
        return ingredientes;
    }

    @Override
    public Ingrediente consultar(Long idIngrediente) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        Ingrediente ingrediente = entityManager.find(Ingrediente.class, idIngrediente);
        return ingrediente;
    }
    
}
