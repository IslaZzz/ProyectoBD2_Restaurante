/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.restauranteitson_persistencia;

import java.util.List;
import restauranteitson_dominio.ComandaProducto;
import restauranteitson_dtos.NuevaRelacionComandaProductosDTO;

/**
 *
 * @author santi
 */
public interface IComandaProductoDAO {
    public abstract ComandaProducto registrar(NuevaRelacionComandaProductosDTO nuevoComandaProducto);
    public abstract List<ComandaProducto> consultar(String filtroBusqueda);
    public abstract ComandaProducto consultar(Long idComandaProducto);
}
