/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import org.junit.Test;
import restauranteitson_dominio.Mesa;

/**
 *
 * @author abrilislas
 */
public class ComandaDAOTest {
    
    public ComandaDAOTest() {
    }

    /**
     * Test of registrar method, of class ComandaDAO.
     */
    @Test
    public void testRegistrar() {
        ComandaDAO comandaDAO = new ComandaDAO();
        Mesa mesa = new Mesa();
        ClienteDAO cliente = new ClienteDAO();
       // NuevaComandaDTO comandaDTO= new NuevaComandaDTO(mesa,"folioXXXX",Calendar.getInstance(),);
      // assertEquals();
    }
    /**
     * Test of consultar method, of class ComandaDAO.
     */
    @Test
    public void testConsultar_Long() {
    }
    @Test
    public void testActualizarComanda(){
    
    
    }
    /*
    LogrosDAO logrosDAO = new LogrosDAO();
        VideojuegosDAO videojuegosDAO = new VideojuegosDAO();
        Videojuegos videojuego = videojuegosDAO.consultar(1L);
        NuevoLogroDTO nuevoLogro = new NuevoLogroDTO("Bloddy suprise",200,videojuego);
        Logro logro =logrosDAO.registrar(nuevoLogro);
        assertEquals(nuevoLogro.getNombre(), logro.getNombre());
        assertEquals(nuevoLogro.getPuntos(), logro.getPuntos());
        assertNotNull(logro.getId());
    */
    
}
