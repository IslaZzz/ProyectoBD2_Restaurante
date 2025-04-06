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
public class ReporteComanda extends Reporte {
    
    private List<Comanda> comandas;
    
    public ReporteComanda(String nombre, Calendar fechaCreacion) {
        super(nombre, fechaCreacion);
    }
    
    public ReporteComanda(String nombre, Calendar fechaCreacion,List<Comanda> comandas) {
        super(nombre, fechaCreacion);
        this.comandas = comandas;
    }

    public List<Comanda> getComandas() {
        return comandas;
    }

    public void setComandas(List<Comanda> comandas) {
        this.comandas = comandas;
    }

    
}
