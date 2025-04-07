/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Implementacion;

import com.mycompany.restauranteitson_persistencia.IProductoDAO;
import java.util.List;
import restauranteitson_BusinessLogic_Interfaces.IProductosBO;
import restauranteitson_dominio.Producto;
import restauranteitson_dtos.NuevoProductoDTO;

/**
 *
 * @author LABCISCO-PC006
 */
public class ProductosBO implements IProductosBO {

    
    private static final int LIMITE_CARACTERES_NOMBRE_PRODUCTO = 100;
    private IProductoDAO productpDAO;
    

    @Override
    public List<Producto> consultarProductos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Producto agregarProducto(NuevoProductoDTO nuevoProductoDTO) {
        if ("".equals(nuevoProductoDTO.getNombreProducto())) {
            
        }
        if (nuevoProductoDTO.getTipoProducto() == null) {
            
        }
        if (nuevoProductoDTO.getPrecio()<=0 || nuevoProductoDTO.getPrecio() == null) {
            
        }
        return this.agregarProducto(nuevoProductoDTO);
    }
    
}
