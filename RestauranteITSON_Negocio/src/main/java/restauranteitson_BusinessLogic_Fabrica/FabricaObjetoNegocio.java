/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Fabrica;

import com.mycompany.restauranteitson_persistencia.IClienteFrecuenteDAO;
import com.mycompany.restauranteitson_persistencia.IIngredienteDAO;
import restauranteitson_BusinessLogic_Implementacion.ClienteBO;
import restauranteitson_BusinessLogic_Implementacion.IngredientesBO;
import restauranteitson_BusinessLogic_Interfaces.IClientesBO;
import restauranteitson_BusinessLogic_Interfaces.iIngredientesBO;
import restauranteitson_persistencia_Implementaciones.ClienteFrecuenteDAO;
import restauranteitson_persistencia_Implementaciones.IngredienteDAO;

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
    
        IClienteFrecuenteDAO clienteDAO = new ClienteFrecuenteDAO();
        IClientesBO clientesBO = new ClienteBO(clienteDAO);
        return clientesBO;
    
    }
    
}
