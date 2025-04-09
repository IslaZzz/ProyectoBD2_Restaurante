/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Fabrica;

import com.mycompany.restauranteitson_persistencia.IClienteDAO;
import com.mycompany.restauranteitson_persistencia.IIngredienteDAO;
import com.mycompany.restauranteitson_persistencia.IMesaDAO;
import com.mycompany.restauranteitson_persistencia.IProductoDAO;
import com.mycompany.restauranteitson_persistencia.IProductoIngrediente;
import restauranteitson_BusinessLogic_Implementacion.ClienteBO;
import restauranteitson_BusinessLogic_Implementacion.IngredientesBO;
import restauranteitson_BusinessLogic_Implementacion.MesasBO;
import restauranteitson_BusinessLogic_Implementacion.ProductosBO;
import restauranteitson_BusinessLogic_Interfaces.IClientesBO;
import restauranteitson_BusinessLogic_Interfaces.IMesasBO;
import restauranteitson_BusinessLogic_Interfaces.IProductosBO;
import restauranteitson_BusinessLogic_Interfaces.iIngredientesBO;
import restauranteitson_persistencia_Implementaciones.ClienteDAO;
import restauranteitson_persistencia_Implementaciones.IngredienteDAO;
import restauranteitson_persistencia_Implementaciones.MesaDAO;
import restauranteitson_persistencia_Implementaciones.ProductoDAO;
import restauranteitson_persistencia_Implementaciones.ProductoIngredienteDAO;

/**
 *
 * @author abrilislas
 **/
public class FabricaObjetoNegocio {
    
    public static iIngredientesBO crearIngredienteBO(){
    IIngredienteDAO ingredienteDAO = new IngredienteDAO();
    iIngredientesBO ingredienteBO = new IngredientesBO(ingredienteDAO);
    return ingredienteBO;
    }
    
    public static IClientesBO crearClienteBO(){
        IClienteDAO clienteDAO = new ClienteDAO();
        IClientesBO clientesBO = new ClienteBO(clienteDAO);
        return clientesBO;
    
    }
    
    public static IMesasBO crearMesaBO(){
        IMesaDAO MesaDAO = new MesaDAO();
        IMesasBO mesasBO = new MesasBO(MesaDAO);
        return mesasBO;
    
    }
    
    public static IProductosBO crearProductoBO(){
        IProductoDAO productoDAO = new ProductoDAO();
        IProductoIngrediente productoIngrediente = new ProductoIngredienteDAO();
        IProductosBO productosBO = new ProductosBO(productoDAO, productoIngrediente);
        return productosBO;
    }
    
}
