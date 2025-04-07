/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restauranteitson_BusinessLogic_Interfaces;

import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_dominio.Ingrediente;
import restauranteitson_dtos.NuevoIngredienteDTO;

/**
 *
 * @author abrilislas
 */
public interface iIngredientesBO {
    public abstract Ingrediente registrarNuevoIngrediente(NuevoIngredienteDTO nuevoIngredienteDTO) throws NegocioException;
    public abstract List<Ingrediente> consultarIngredientes(String filtro) throws NegocioException;
    public abstract Ingrediente consultar(Long idIngrediente) throws NegocioException;
    
}
