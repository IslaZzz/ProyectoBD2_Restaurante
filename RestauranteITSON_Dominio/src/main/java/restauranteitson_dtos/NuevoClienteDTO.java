/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dtos;

/**
 *
 * @author santi
 */
public class NuevoClienteDTO {
    private String nombreCliente;
    private String telefonoCliente;
    private String CorreoCliente;

    public NuevoClienteDTO(String nombreCliente, String telefonoCliente, String CorreoCliente) {
        this.nombreCliente = nombreCliente;
        this.telefonoCliente = telefonoCliente;
        this.CorreoCliente = CorreoCliente;
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
    
    
}
