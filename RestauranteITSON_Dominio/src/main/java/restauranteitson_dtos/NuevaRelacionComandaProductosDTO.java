/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

/**
 *
 * @author santi
 */
public class NuevaRelacionComandaProductosDTO {
    private long idComanda;
    private long idProducto;
    private String comentario;
    private double precioUnitario;
    private int cantidad;
    private double importeTotal;

    public NuevaRelacionComandaProductosDTO(long idComanda, long idProducto, String comentario, double precioUnitario, int cantidad){
        this.idComanda = idComanda;
        this.idProducto = idProducto;
        this.comentario = comentario;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.importeTotal = cantidad * precioUnitario;
    }
    
    public NuevaRelacionComandaProductosDTO( long idProducto, String comentario, double precioUnitario, int cantidad){
        
        this.idProducto = idProducto;
        this.comentario = comentario;
        this.precioUnitario = precioUnitario;
        this.cantidad = cantidad;
        this.importeTotal = cantidad * precioUnitario;
    }

    public NuevaRelacionComandaProductosDTO() {
    }

    public void setIdComanda(long idComanda) {
        this.idComanda = idComanda;
    }

    public void setIdProducto(long idProducto) {
        this.idProducto = idProducto;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setImporteTotal(double importeTotal) {
        this.importeTotal = importeTotal;
    }
    
    

    public long getIdComanda() {
        return idComanda;
    }

    public long getIdProducto() {
        return idProducto;
    }

    public String getComentario() {
        return comentario;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getImporteTotal() {
        return importeTotal;
    }
    
    
    
}
