/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

/**
 *
 * @author santi
 */
public class NuevaMesaDTO {
    private long IdCliente;
    private Integer numeroMesa;
    private Boolean disponibilidad;

    public NuevaMesaDTO(Integer numeroMesa, Boolean disponibilidad) {
        this.numeroMesa = numeroMesa;
        this.disponibilidad = disponibilidad;
    }

    public NuevaMesaDTO(long IdCliente, Integer numeroMesa, Boolean disponibilidad) {
        this.IdCliente = IdCliente;
        this.numeroMesa = numeroMesa;
        this.disponibilidad = disponibilidad;
    }

    public long getIdCliente() {
        return IdCliente;
    }

    public Integer getNumeroMesa() {
        return numeroMesa;
    }

    public Boolean getDisponibilidad() {
        return disponibilidad;
    }
    
}
