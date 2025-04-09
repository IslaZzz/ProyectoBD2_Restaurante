/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.Cliente;
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
        NuevaMesaDTO mesaDTO = new NuevaMesaDTO(5,true);
        Mesa mesa = mesaDAO.registrar(mesaDTO);
        assertEquals(mesaDTO.getNumeroMesa(),mesa.getNumeroMesa());
        assertNotNull(mesa.getId());
        
    }
    
    @Test 
    public void testConsultarMesasDisponibles(){
       MesaDAO mesaDAO = new MesaDAO();
       final int numeroMesas = 4;
       List<Mesa> mesasDisponibles = mesaDAO.consultarMesasDisponibles();
        assertNotNull(mesasDisponibles);
//        assertEquals(numeroMesas, mesasDisponibles.size());
    }

    /**
     * Test of consultar method, of class MesaDAO.
     */
    @Test
    public void testConsultar_Long() {
        MesaDAO mesaDAO = new MesaDAO();
        final Long IDMesaBuscada=10L;
        Mesa mesa = mesaDAO.consultar(IDMesaBuscada);
        assertNotNull(mesa);
        assertEquals(IDMesaBuscada,mesa.getId());
        
    }
    
    @Test
    public void testReservarMesa(){
//        MesaDAO mesaDAO = new MesaDAO();
//        ClienteDAO clienteDAO = new ClienteDAO();
//        Mesa mesa = mesaDAO.consultar(9l);
//        Cliente cliente = clienteDAO.consultar(3l);
//        Cliente cliente1 = mesaDAO.reservarMesa(mesa, cliente);
       // assertEquals(cliente1, cliente);
    }
    

    /**
     * Test of consultar method, of class MesaDAO.
     */
    @Test
    public void testConsultar_String() {
    } 
}
