/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import com.mycompany.restauranteitson_persistencia.IProductoDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import restauranteitson_dominio.Producto;
import restauranteitson_dtos.NuevoProductoDTO;

/**
 *
 * @author santi
 */
public class ProductoDAO implements IProductoDAO {

    @Override
    public Producto registrar(NuevoProductoDTO nuevoProducto) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // inicar una transaccion
        entityManager.getTransaction().begin();
        
        Producto producto = new Producto();
        producto.setNombreProducto(nuevoProducto.getNombreProducto());
        producto.setPrecio(nuevoProducto.getPrecio());
        producto.setTipo(nuevoProducto.getTipoProducto());
        
        entityManager.persist(producto);
        entityManager.getTransaction().commit();
        return producto;
    }

    @Override
    public List<Producto> consultar(String filtroBusqueda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // forma 1 consultar con JPA - JPQL
        String jpqlQuery = "SELECT p FROM Producto p";
        
        TypedQuery<Producto> query = entityManager.createQuery(jpqlQuery, Producto.class);
        List<Producto> producto = query.getResultList();
        return producto;
    }

    @Override
    public Producto consultar(Long idProducto) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        Producto producto = entityManager.find(Producto.class, idProducto);
        return producto;
    }
    
}
