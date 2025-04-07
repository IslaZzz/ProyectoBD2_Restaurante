/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package restauranteitson_BusinessLogic_Interfaces;

import java.util.List;
import restauranteitson_dominio.Producto;
import restauranteitson_dtos.NuevoProductoDTO;

/**
 *
 * @author LABCISCO-PC006
 */
public interface IProductosBO {
    public abstract Producto agregarProducto(NuevoProductoDTO nuevoProductoDTO);
    
    public abstract List<Producto> consultarProductos();
    
    
}
