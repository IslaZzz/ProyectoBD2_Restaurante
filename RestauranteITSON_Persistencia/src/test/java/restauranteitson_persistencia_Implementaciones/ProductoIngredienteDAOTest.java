/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.ProductoIngrediente;
import restauranteitson_dtos.NuevaRelacionProductoIngredienteDTO;

/**
 *
 * @author abrilislas
 */
public class ProductoIngredienteDAOTest {
    
    public ProductoIngredienteDAOTest() {
    }

    /**
     * Test of registrar method, of class ProductoIngredienteDAO.
     */
    @Test
    public void testRegistrar() {
        //long idProducto, long idCliente, int cantidadExacta
        ProductoIngredienteDAO productoIngredienteDAO = new ProductoIngredienteDAO();
        final long ID_PRODUCTO_PARAMETRO = 1L;
        final long ID_CLIENTE_PARAMETRO = 3L;
        NuevaRelacionProductoIngredienteDTO productoIngrDTO = new NuevaRelacionProductoIngredienteDTO(ID_PRODUCTO_PARAMETRO,ID_CLIENTE_PARAMETRO,20);
        ProductoIngrediente productoIngrediente= productoIngredienteDAO.registrar(productoIngrDTO);
        assertEquals(productoIngrediente.getIngrediente().getId(),productoIngrDTO.getIdProducto());
        assertEquals(productoIngrediente.getCantidadExacta(),productoIngrDTO.getCantidadExacta());
        assertNotNull(productoIngrediente);
    }

    /**
     * Test of consultar method, of class ProductoIngredienteDAO.
     */
    @Test
    public void testConsultar_String() {
        ProductoIngredienteDAO productoIngredienteDAO = new ProductoIngredienteDAO();
        final long ID_PRODUCTOINGREDIENTE_TEST = 1L;
        ProductoIngrediente productoIngrediente= productoIngredienteDAO.consultar(ID_PRODUCTOINGREDIENTE_TEST);
        assertEquals(productoIngrediente.getId(),ID_PRODUCTOINGREDIENTE_TEST);
        assertNotNull(productoIngrediente);
    
    }

    /**
     * Test of consultar method, of class ProductoIngredienteDAO.
     */
    @Test
    public void testConsultar_Long() {
    }
    
}
