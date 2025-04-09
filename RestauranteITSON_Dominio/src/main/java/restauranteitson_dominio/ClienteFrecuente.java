/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dominio;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import java.util.Calendar;

/**
 *
 * @author abrilislas
 */
@Entity
public class ClienteFrecuente extends Cliente {

    @Column(name = "numeroVisitas")
    private Integer numeroVisitas;

    @Column(name = "fechaRegistro")
    private Calendar fechaRegistro;

    @Column(name = "fechaUltimaComanda")
    private Calendar fechaUltimaComanda;

    @Column(name = "totalGastado")
    private Double totalGastado;

    @Column(name = "puntosFidelidad")
    private Integer puntosFidelidad;

    //@OneToOne(mappedBy = "cliente")
   // private Mesa mesa;

    // Default Constructor
    public ClienteFrecuente() {}

    // Getters and Setters
//    public Long getId() {
//        return id;
//    }

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
