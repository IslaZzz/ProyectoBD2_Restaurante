/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restauranteitson_BusinessLogic_Interfaces;

import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
//import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.Mesa;

/**
 *
 * @author santi
 */
public interface IMesasBO {
    public abstract List<Mesa> mostrarMesas()throws NegocioException;
    
    
    public abstract Cliente reservarMesa(Long idMesa,Cliente cliente)throws NegocioException;
}
