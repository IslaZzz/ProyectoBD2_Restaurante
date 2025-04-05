/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import com.mycompany.restauranteitson_persistencia.IProductoIngrediente;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import restauranteitson_dominio.Ingrediente;
import restauranteitson_dominio.Producto;
import restauranteitson_dominio.ProductoIngrediente;
import restauranteitson_dtos.NuevaRelacionProductoIngredienteDTO;

/**
 *
 * @author santi
 */
public class ProductoIngredienteDAO implements IProductoIngrediente {

    @Override
    public ProductoIngrediente registrar(NuevaRelacionProductoIngredienteDTO nuevoProductoIngrediente) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // inicar una transaccion
        entityManager.getTransaction().begin();
        
        ProductoIngrediente productoIngrediente = new ProductoIngrediente();
        productoIngrediente.setIngrediente(entityManager.find(Ingrediente.class, nuevoProductoIngrediente.getIdProducto()));
        productoIngrediente.setProducto(entityManager.find(Producto.class, nuevoProductoIngrediente.getIdProducto()));
        productoIngrediente.setCantidadExacta(nuevoProductoIngrediente.getCantidadExacta());
        entityManager.persist(productoIngrediente);
        entityManager.getTransaction().commit();
        return productoIngrediente;
    }

    @Override
    public List<ProductoIngrediente> consultar(String filtroBusqueda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // forma 1 consultar con JPA - JPQL
        String jpqlQuery = "SELECT p FROM ProductoIngrediente p";
        
        TypedQuery<ProductoIngrediente> query = entityManager.createQuery(jpqlQuery, ProductoIngrediente.class);
        List<ProductoIngrediente> ingredientes = query.getResultList();
        return ingredientes;
    }

    @Override
    public ProductoIngrediente consultar(Long idProductoIngrediente) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        ProductoIngrediente productoIngrediente = entityManager.find(ProductoIngrediente.class, idProductoIngrediente);
        return productoIngrediente;
    }
    
}
