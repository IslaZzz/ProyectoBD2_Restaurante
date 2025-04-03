/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

import java.util.Calendar;
import java.util.List;
import restauranteitson_dominio.ComandaProducto;
import restauranteitson_enum.Estado;

/**
 *
 * @author santi
 */
public class NuevaComandaDTO {
    
    private long idMesa;
    private String folio;
    private Calendar fechaHora;
    private String nombreCliente;
    private Estado estado;
    private Float total;
    private List<ComandaProducto> comandasProducto;

    public NuevaComandaDTO(long idMesa, String folio, Calendar fechaHora, String nombreCliente, Estado estado, Float total, List<ComandaProducto> comandasProducto) {
        this.idMesa = idMesa;
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.nombreCliente = nombreCliente;
        this.estado = estado;
        this.total = total;
        this.comandasProducto = comandasProducto;
    }

    public NuevaComandaDTO(long idMesa, String folio, Calendar fechaHora, String nombreCliente, Estado estado) {
        this.idMesa = idMesa;
        this.folio = folio;
        this.fechaHora = fechaHora;
        this.nombreCliente = nombreCliente;
        this.estado = estado;
        
    }

    public List<ComandaProducto> getComandasProducto() {
        return comandasProducto;
    }

    public void setComandasProducto(List<ComandaProducto> comandasProducto) {
        this.comandasProducto = comandasProducto;
    }

    public long getIdMesa() {
        return idMesa;
    }

    public String getFolio() {
        return folio;
    }

    public Calendar getFechaHora() {
        return fechaHora;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public Estado getEstado() {
        return estado;
    }

    public Float getTotal() {
        return total;
    }
    
    
}
