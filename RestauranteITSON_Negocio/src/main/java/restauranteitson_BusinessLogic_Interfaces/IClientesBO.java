/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restauranteitson_BusinessLogic_Interfaces;

import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_dominio.Cliente;
import restauranteitson_dtos.NuevoClienteDTO;

/**
 *
 * @author abrilislas
 */
public interface IClientesBO {
    
    public abstract Cliente registrar(NuevoClienteDTO nuevoCliente) throws NegocioException;
    public abstract List<Cliente> consultar(String filtroBusqueda) throws NegocioException;
    public abstract Cliente consultar(Long idCliente) throws NegocioException;
}
