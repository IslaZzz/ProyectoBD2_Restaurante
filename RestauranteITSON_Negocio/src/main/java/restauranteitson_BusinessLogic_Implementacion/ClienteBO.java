/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Implementacion;

import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_BusinessLogic_Interfaces.IClientesBO;
import restauranteitson_dominio.Cliente;
import restauranteitson_dtos.NuevoClienteDTO;

/**
 *
 * @author abrilislas
 */
public class ClienteBO implements IClientesBO {
    
    private static final int LIMITE_CARACTERES_NOMBRE_CLIENTE = 100;
    private static final int CARACTERES_TELEFONO_REQUERIDOS = 10;
    private static final int LIMITE_CARACTERES_CORREO =30;
    

    @Override
    public Cliente registrar(NuevoClienteDTO nuevoCliente) throws NegocioException {
        
    
    }

    @Override
    public List<Cliente> consultar(String filtroBusqueda) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Cliente consultar(Long idCliente) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
