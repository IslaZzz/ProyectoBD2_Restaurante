/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_dominio;

import java.util.Calendar;
import java.util.List;

/**
 *
 * @author santi
 */
public class ReporteClientesFrecuentes extends Reporte {
    private List<ClienteFrecuente> ClienteFrecuentes;
    
    public ReporteClientesFrecuentes(String nombre, Calendar fechaCreacion) {
        super(nombre, fechaCreacion);
    }
    
    public ReporteClientesFrecuentes(String nombre, Calendar fechaCreacion,List<ClienteFrecuente> ClienteFrecuentes) {
        super(nombre, fechaCreacion);
        this.ClienteFrecuentes = ClienteFrecuentes;
    }

    public List<ClienteFrecuente> getClienteFrecuentes() {
        return ClienteFrecuentes;
    }

    public void setClienteFrecuentes(List<ClienteFrecuente> ClienteFrecuentes) {
        this.ClienteFrecuentes = ClienteFrecuentes;
    }
}
