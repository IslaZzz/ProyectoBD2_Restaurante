/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

import restauranteitson_enum.UnidadIngrediente;

/**
 *
 * @author santi
 */
public class NuevoIngredienteDTO {
    
    private String nombre;
    private UnidadIngrediente unidadIngrediente;
    private Integer stock;
    
    public NuevoIngredienteDTO(String nombre) {
        this.nombre = nombre;
    }

    public NuevoIngredienteDTO(String nombre, UnidadIngrediente unidadIngrediente) {
        this.nombre = nombre;
        this.unidadIngrediente = unidadIngrediente;
    }
    
    public NuevoIngredienteDTO(String nombre, Integer stock) {
        this.nombre = nombre;
        this.stock = stock;
    }

    public NuevoIngredienteDTO(String nombre, UnidadIngrediente unidadIngrediente, Integer Stock) {
        this.nombre = nombre;
        this.unidadIngrediente = unidadIngrediente;
        this.stock = Stock;
    }

    public String getNombre() {
        return nombre;
    }

    public UnidadIngrediente getUnidadIngrediente() {
        return unidadIngrediente;
    }

    public Integer getStock() {
        return stock;
    }
    
    
    
}
