/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import com.mycompany.restauranteitson_persistencia.IComandaProductoDAO;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;
import restauranteitson_dominio.Comanda;
import restauranteitson_dominio.ComandaProducto;
import restauranteitson_dominio.Producto;
import restauranteitson_dtos.NuevaRelacionComandaProductosDTO;

/**
 *
 * @author santi
 */
public class ComandaProductoDAO implements IComandaProductoDAO {

    @Override
    public ComandaProducto registrar(NuevaRelacionComandaProductosDTO nuevoComandaProducto) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // inicar una transaccion
        entityManager.getTransaction().begin();
        
        ComandaProducto comandaProducto = new ComandaProducto();
        comandaProducto.setComanda(entityManager.find(Comanda.class, nuevoComandaProducto.getIdComanda()));
        comandaProducto.setProducto(entityManager.find(Producto.class, nuevoComandaProducto.getIdProducto()));
        comandaProducto.setCantidad(nuevoComandaProducto.getCantidad());
        comandaProducto.setComentario(nuevoComandaProducto.getComentario());
        comandaProducto.setPrecioUnitario(nuevoComandaProducto.getPrecioUnitario());
        comandaProducto.setImporteTotal(nuevoComandaProducto.getImporteTotal());
        entityManager.persist(comandaProducto);
        entityManager.getTransaction().commit();
        
        return comandaProducto;
    }

    @Override
    public List<restauranteitson_dominio.ComandaProducto> consultar(String filtroBusqueda) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        // forma 1 consultar con JPA - JPQL
        String jpqlQuery = "SELECT c FROM ComandaProducto c";
        
        TypedQuery<ComandaProducto> query = entityManager.createQuery(jpqlQuery, ComandaProducto.class);
        List<ComandaProducto> Comandas = query.getResultList();
        return Comandas;
    }

    @Override
    public ComandaProducto consultar(Long idComandaProducto) {
        EntityManager entityManager = ManejadorConexiones.getEntityManager();
        ComandaProducto comandaProducto = entityManager.find(ComandaProducto.class, idComandaProducto);
        return comandaProducto;
    }
    
}
