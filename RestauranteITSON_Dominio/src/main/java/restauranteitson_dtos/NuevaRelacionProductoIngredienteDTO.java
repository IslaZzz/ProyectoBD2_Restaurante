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
    private long idCliente;
    private int cantidadExacta;

    public NuevaRelacionProductoIngredienteDTO() {
    }

    public NuevaRelacionProductoIngredienteDTO(long idProducto, long idCliente, int cantidadExacta) {
        this.idProducto = idProducto;
        this.idCliente = idCliente;
        this.cantidadExacta = cantidadExacta;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public long getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(long idCliente) {
        this.idCliente = idCliente;
    }

    public int getCantidadExacta() {
        return cantidadExacta;
    }

    public void setCantidadExacta(int cantidadExacta) {
        this.cantidadExacta = cantidadExacta;
    }
    
    
    
}
