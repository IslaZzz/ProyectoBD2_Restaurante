/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.restauranteitson_persistencia;

import java.util.List;
import restauranteitson_dominio.Producto;
import restauranteitson_dtos.NuevoProductoDTO;

/**
 *
 * @author santi
 */
public interface IProductoDAO {
    public abstract Producto registrar(NuevoProductoDTO nuevoProducto);
    public abstract List<Producto> consultar(String filtroBusqueda);
    public abstract Producto consultar(Long idProducto);
}
