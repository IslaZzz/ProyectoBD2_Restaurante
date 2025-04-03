/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.restauranteitson_persistencia;

import java.util.List;
import restauranteitson_dominio.ProductoIngrediente;
import restauranteitson_dtos.NuevaRelacionProductoIngredienteDTO;

/**
 *
 * @author santi
 */
public interface IProductoIngrediente {
    public abstract ProductoIngrediente registrar(NuevaRelacionProductoIngredienteDTO nuevoProductoIngrediente);
    public abstract List<ProductoIngrediente> consultar(String filtroBusqueda);
    public abstract ProductoIngrediente consultar(Long idProductoIngrediente);
}
