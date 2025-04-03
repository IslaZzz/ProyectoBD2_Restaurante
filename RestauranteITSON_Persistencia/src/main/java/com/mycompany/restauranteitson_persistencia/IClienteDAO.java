/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.restauranteitson_persistencia;

import java.util.List;
import restauranteitson_dominio.Cliente;
import restauranteitson_dtos.NuevoClienteDTO;

/**
 *
 * @author santi
 */
public interface IClienteDAO {
     public abstract Cliente registrar(NuevoClienteDTO nuevoCliente);
    public abstract List<Cliente> consultar(String filtroBusqueda);
    public abstract Cliente consultar(Long idCliente);
}
