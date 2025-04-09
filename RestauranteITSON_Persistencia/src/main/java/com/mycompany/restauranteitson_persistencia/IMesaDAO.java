/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.restauranteitson_persistencia;

import java.util.List;
import restauranteitson_dominio.Cliente;
import restauranteitson_dominio.Mesa;
import restauranteitson_dtos.NuevaMesaDTO;

/**
 *
 * @author santi
 */
public interface IMesaDAO {
    public abstract Mesa registrar(NuevaMesaDTO nuevoMesa);
    public abstract List<Mesa> consultar();
    public abstract List<Mesa> consultarMesasDisponibles();
    public abstract Mesa consultar(Long idMesa);
    public Cliente reservarMesa(Mesa mesa, Cliente cliente);
}
