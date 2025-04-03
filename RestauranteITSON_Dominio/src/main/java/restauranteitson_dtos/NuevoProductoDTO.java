/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

import restauranteitson_enum.TipoProducto;

/**
 *
 * @author santi
 */
public class NuevoProductoDTO {
    
    private String nombreProducto;
    private TipoProducto tipoProducto;
    private Double precio;

    public NuevoProductoDTO(String nombreProducto, TipoProducto tipoProducto, Double precio) {
        this.nombreProducto = nombreProducto;
        this.tipoProducto = tipoProducto;
        this.precio = precio;
    }

    public String getNombreProducto() {
        return nombreProducto;
    }

    public TipoProducto getTipoProducto() {
        return tipoProducto;
    }

    public Double getPrecio() {
        return precio;
    }
    
    
}
