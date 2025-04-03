/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.restauranteitson_persistencia;

import java.util.List;
import restauranteitson_dominio.Ingrediente;
import restauranteitson_dtos.NuevoIngredienteDTO;

/**
 *
 * @author santi
 */
public interface IIngredienteDAO {
    public abstract  Ingrediente registrar(NuevoIngredienteDTO nuevoIngredienteDTO);
    
    public abstract  List<Ingrediente> consultarIngredientes(String filtro);
    
    public abstract  Ingrediente consultar(Long idIngrediente);
}
