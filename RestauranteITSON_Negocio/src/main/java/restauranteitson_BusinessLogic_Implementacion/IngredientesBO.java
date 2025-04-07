/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Implementacion;

import com.mycompany.restauranteitson_persistencia.IIngredienteDAO;
import java.util.List;
import restauranteitson_BusinessLogic_Interfaces.iIngredientesBO;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_dominio.Ingrediente;
import restauranteitson_dtos.NuevoIngredienteDTO;

/**
 *
 * @author abrilislas
 */
public class IngredientesBO implements iIngredientesBO {
    
    private static final int LIMITE_CARACTERES_NOMBRE_INGREDIENTE = 100;
    private static final int CARACTERES_LIMITES_FILTRO_BUSQUEDA = 100;
    private static final float VALOR_MINIMO_STOCK = 0;
    private IIngredienteDAO ingredienteDAO;
    
    public IngredientesBO(IIngredienteDAO ingredienteDAO){
        this.ingredienteDAO = ingredienteDAO;
    }
    @Override
    public Ingrediente registrarNuevoIngrediente(NuevoIngredienteDTO nuevoIngredienteDTO) throws NegocioException {
        if("".equals(nuevoIngredienteDTO.getNombre())){throw new NegocioException("Proporciona el nombre del ingrediente ");}
       // if(nuevoIngredienteDTO.getNombre()==null && nuevoIngredienteDTO.getStock()==null){throw new NegocioException("No se aceptan campos vacios");}
        if(nuevoIngredienteDTO.getNombre().length()>LIMITE_CARACTERES_NOMBRE_INGREDIENTE){throw new NegocioException("Longitud del nombre excedido: " + LIMITE_CARACTERES_NOMBRE_INGREDIENTE);}
        if(nuevoIngredienteDTO.getStock()==null){throw new NegocioException("Ingrese un valor");}
        if(nuevoIngredienteDTO.getStock()<VALOR_MINIMO_STOCK){throw new NegocioException("Ingrese un valor positivo");}
        ///En caso de ser un objeto con parametros correctos
        return this.ingredienteDAO.registrar(nuevoIngredienteDTO);
    }

    @Override
    public List<Ingrediente> consultarIngredientes(String filtro) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public Ingrediente consultar(Long idIngrediente) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
