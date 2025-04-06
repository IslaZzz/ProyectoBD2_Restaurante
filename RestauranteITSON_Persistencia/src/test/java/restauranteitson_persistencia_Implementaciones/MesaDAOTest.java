/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.Mesa;
import restauranteitson_dtos.NuevaMesaDTO;

/**
 *
 * @author abrilislas
 */
public class MesaDAOTest {
    
    public MesaDAOTest() {
    }

    /**
     * Test of registrar method, of class MesaDAO.
     */
    @Test
    public void testRegistrarSunnyDay() {
        MesaDAO mesaDAO = new MesaDAO();
        NuevaMesaDTO mesaDTO = new NuevaMesaDTO(1,15,false);
        Mesa mesa = mesaDAO.registrar(mesaDTO);
        assertEquals(mesaDTO.getNumeroMesa(),mesa.getNumeroMesa());
        assertNotNull(mesa.getId());
        
    }

    /**
     * Test of consultar method, of class MesaDAO.
     */
    @Test
    public void testConsultar_Long() {
        MesaDAO mesaDAO = new MesaDAO();
        final Long IDMesaBuscada=2L;
        Mesa mesa = mesaDAO.consultar(IDMesaBuscada);
        assertNotNull(mesa);
        assertEquals(IDMesaBuscada,mesa.getId());
        
    }

    /**
     * Test of consultar method, of class MesaDAO.
     */
    @Test
    public void testConsultar_String() {
    } 
}
