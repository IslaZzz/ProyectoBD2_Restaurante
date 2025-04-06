/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import java.util.Calendar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.Comanda;
import restauranteitson_dominio.Mesa;
import restauranteitson_dtos.NuevaComandaDTO;
import restauranteitson_enum.Estado;

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
        MesaDAO mesaDAO = new MesaDAO();
        final Long ID_MESA_CONSULTADA = 1L;
        Mesa mesa = mesaDAO.consultar(ID_MESA_CONSULTADA);
        ClienteDAO clienteDAO = new ClienteDAO();
        Cliente cliente = clienteDAO.consultar(ID_MESA_CONSULTADA);
        NuevaComandaDTO comandaDTO= new NuevaComandaDTO(mesa,"folioXXXX",Calendar.getInstance(),cliente, Estado.ABIERTA);
        Comanda comanda = comandaDAO.registrar(comandaDTO);
        assertEquals(comanda.getFechaHora(),comandaDTO.getFechaHora());
        assertEquals(comanda.getNombreCliente(),comandaDTO.getNombreCliente());
        assertNotNull(comanda.getId());
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
}
