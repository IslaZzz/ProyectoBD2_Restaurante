package restauranteitson_persistencia_Implementaciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.Cliente;
import restauranteitson_dtos.NuevoClienteDTO;
import restauranteitson_persistencia_Implementaciones.ClienteDAO;

/**
 *
 * @author santi
 */
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
    @Test
    public void testRegistrarCliente(){
        ClienteDAO clienteDAO = new ClienteDAO();
        NuevoClienteDTO nuevoClienteDTO = new NuevoClienteDTO("Santiago", "6442196261", "santiagoLeon@gmai.com");
        Cliente cliente = clienteDAO.registrar(nuevoClienteDTO);
        assertNotNull(cliente.getId());
        assertEquals(cliente.getNombreCliente(), nuevoClienteDTO.getNombreCliente());
        assertEquals(cliente.getCorreo(), nuevoClienteDTO.getCorreoCliente());
    }
    
}
