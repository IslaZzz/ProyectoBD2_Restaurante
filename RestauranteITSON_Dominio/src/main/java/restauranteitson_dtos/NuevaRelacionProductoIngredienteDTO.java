/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

/**
 *
 * @author santi
 */
public class NuevaRelacionProductoIngredienteDTO {
    private long idProducto;
    private long idIngrediente;
    private int cantidadExacta;

    public NuevaRelacionProductoIngredienteDTO() {
    }

    public NuevaRelacionProductoIngredienteDTO(long idProducto, long idIngrediente, int cantidadExacta) {
        this.idProducto = idProducto;
        this.idIngrediente = idIngrediente;
        this.cantidadExacta = cantidadExacta;
    }
    
    public NuevaRelacionProductoIngredienteDTO(long idIngrediente, int cantidadExacta) {
        this.idIngrediente = idIngrediente;
        this.cantidadExacta = cantidadExacta;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public long getIdIngrediente() {
        return idIngrediente;
    }

    public void setIdIngrediente(long idIngrediente) {
        this.idIngrediente = idIngrediente;
    }

    public int getCantidadExacta() {
        return cantidadExacta;
    }

    public void setCantidadExacta(int cantidadExacta) {
        this.cantidadExacta = cantidadExacta;
    }
    
    
    
}
