/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

import java.util.Calendar;
import java.util.List;
import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.ComandaProducto;
import restauranteitson_dominio.Mesa;
import restauranteitson_enum.Estado;

/**
 *
 * @author santi
 */
public class NuevaComandaDTO {
    
    private Mesa mesa;
    private String folio;
    private Calendar fechaHora;
    private Cliente cliente;
    private Estado estado;
    private Float total;
    private List<ComandaProducto> comandasProducto;
    
    
    public NuevaComandaDTO(Mesa mesa, String folio, Calendar fechaHora, Cliente cliente, Estado estado) {
        this.mesa = mesa;
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.estado = estado;
        
    }
    public NuevaComandaDTO(Mesa mesa, String folio, Calendar fechaHora, Cliente cliente, Estado estado, Float total, List<ComandaProducto> comandasProducto) {
        this.mesa = mesa;
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.cliente = cliente;
        this.estado = estado;
        this.total = total;
        this.comandasProducto = comandasProducto;
    }

    //public List<ComandaProducto> getComandasProducto() {
   //     return comandasProducto;
   // }

    public void setComandasProducto(List<ComandaProducto> comandasProducto) {
        this.comandasProducto = comandasProducto;
    }

    public Mesa getMesa() {
        return mesa;
    }

    public String getFolio() {
        return folio;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    public Cliente getNombreCliente() {
        return cliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public Float getTotal() {
        return total;
    }
    
    
}
