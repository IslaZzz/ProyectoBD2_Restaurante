/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.Producto;
import restauranteitson_dtos.NuevoProductoDTO;
import restauranteitson_enum.TipoProducto;

/**
 *
 * @author abrilislas
 */
public class ProductoDAOTest {
    
    public ProductoDAOTest() {
    }

    /**
     * Test of registrar method, of class ProductoDAO.
     */
    @Test
    public void testRegistrar() {
        //String nombreProducto, TipoProducto tipoProducto, Double precio
        ProductoDAO productoDAO = new ProductoDAO();
        NuevoProductoDTO productoDTO = new NuevoProductoDTO("Spaghetti",TipoProducto.PLATILLO,159.00);
        Producto producto = productoDAO.registrar(productoDTO);
        assertEquals(producto.getNombreProducto(),productoDTO.getNombreProducto());
        assertEquals(producto.getNombreProducto(),productoDTO.getNombreProducto());
        assertEquals(producto.getPrecio(),productoDTO.getPrecio());
        assertNotNull(producto);
        
    }

    /**
     * Test of consultar method, of class ProductoDAO.
     */
    @Test
    public void testConsultar_String() {
        ProductoDAO productoDAO = new ProductoDAO();
        final Long ID_PRODUCTO_BUSCADO = 1L; 
        Producto platillo = productoDAO.consultar(ID_PRODUCTO_BUSCADO);
        assertEquals(platillo.getId(),ID_PRODUCTO_BUSCADO);
        assertNotNull(platillo);
    }

    /**
     * Test of consultar method, of class ProductoDAO.
     */
    //consulta con filtro pendiente
    @Test
    public void testConsultar_Long() {
    }
    
}
