package restauranteitson_persistencia_Implementaciones;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.ClienteFrecuente;
import restauranteitson_dtos.NuevoClienteDTO;

/**
 *
 * @author santi
 */
public class ClienteDAOTest {
    
    public ClienteDAOTest() {
    }

    @Test
        public void testRegistrarCliente(){
        ClienteFrecuenteDAO clienteDAO = new ClienteFrecuenteDAO();
        NuevoClienteDTO nuevoClienteDTO = new NuevoClienteDTO("Abril", "6311111405", "TasteOfCherry@gmai.com");
        ClienteFrecuente cliente = clienteDAO.registrar(nuevoClienteDTO);
        assertNotNull(cliente.getId());
        assertEquals(cliente.getNombreCliente(), nuevoClienteDTO.getNombreCliente());
        assertEquals(cliente.getCorreo(), nuevoClienteDTO.getCorreoCliente());
    } 
}
