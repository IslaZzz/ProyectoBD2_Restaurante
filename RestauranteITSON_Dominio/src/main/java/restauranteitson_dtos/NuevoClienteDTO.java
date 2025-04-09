/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToMany;
import java.util.Calendar;
import java.util.List;
import restauranteitson_dominio.Comanda;

/**
 *
 * @author santi
 */
    public class NuevoClienteDTO {
    private String nombreCliente;
    private String telefonoCliente;
    private String CorreoCliente;
    private Integer numeroVisitas;
    private Calendar fechaRegistro;
    private Calendar fechaUltimaComanda;
    private Double totalGastado;
    private Integer puntosFidelidad;
    
    public NuevoClienteDTO(String nombreCliente, String telefonoCliente, String CorreoCliente) {
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.CorreoCliente = CorreoCliente;
        this.numeroVisitas=0;
        this.fechaRegistro=Calendar.getInstance();
        this.fechaUltimaComanda=null;
        this.totalGastado=0.0;
        this.puntosFidelidad=0;
    }
    

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String getTelefonoCliente() {
        return telefonoCliente;
    }

    public String getCorreoCliente() {
        return CorreoCliente;
    }

    public Integer getNumeroVisitas() {
        return numeroVisitas;
    }

    public void setNumeroVisitas(Integer numeroVisitas) {
        this.numeroVisitas = numeroVisitas;
    }

    public Calendar getFechaRegistro() {
        return fechaRegistro;
    }

    public void setFechaRegistro(Calendar fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public Calendar getFechaUltimaComanda() {
        return fechaUltimaComanda;
    }

    public void setFechaUltimaComanda(Calendar fechaUltimaComanda) {
        this.fechaUltimaComanda = fechaUltimaComanda;
    }

    public Double getTotalGastado() {
        return totalGastado;
    }

    public void setTotalGastado(Double totalGastado) {
        this.totalGastado = totalGastado;
    }

    public Integer getPuntosFidelidad() {
        return puntosFidelidad;
    }

    public void setPuntosFidelidad(Integer puntosFidelidad) {
        this.puntosFidelidad = puntosFidelidad;
    }
    
    
    
}
