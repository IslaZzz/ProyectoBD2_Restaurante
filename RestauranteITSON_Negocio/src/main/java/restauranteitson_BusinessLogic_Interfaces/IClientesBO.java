/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restauranteitson_BusinessLogic_Interfaces;

import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.ClienteFrecuente;
import restauranteitson_dtos.NuevoClienteDTO;

/**
 *
 * @author abrilislas
 */
public interface IClientesBO {
    
    public abstract ClienteFrecuente registrar(NuevoClienteDTO nuevoCliente) throws NegocioException;
    public abstract List<ClienteFrecuente> consultar(String filtroBusqueda) throws NegocioException;
    public abstract ClienteFrecuente consultar(Long idCliente) throws NegocioException;
}
