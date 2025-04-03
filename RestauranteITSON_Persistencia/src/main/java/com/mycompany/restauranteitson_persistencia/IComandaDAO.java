/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.restauranteitson_persistencia;

import java.util.List;
import restauranteitson_dominio.Comanda;
import restauranteitson_dtos.NuevaComandaDTO;

/**
 *
 * @author santi
 */
public interface IComandaDAO {
    public abstract Comanda registrar(NuevaComandaDTO nuevoComanda);
    public abstract List<Comanda> consultar();
    public abstract Comanda consultar(Long idComanda);
}
