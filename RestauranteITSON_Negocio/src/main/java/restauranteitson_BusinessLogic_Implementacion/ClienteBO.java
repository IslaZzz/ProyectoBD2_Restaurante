/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Implementacion;

import com.mycompany.restauranteitson_persistencia.IClienteFrecuenteDAO;
import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_BusinessLogic_Interfaces.IClientesBO;
import restauranteitson_dominio.ClienteFrecuente;
import restauranteitson_dtos.NuevoClienteDTO;
import restauranteitson_persistencia_Implementaciones.ClienteFrecuenteDAO;

/**
 *
 * @author abrilislas
 */
public class ClienteBO implements IClientesBO {
    
    private static final int LIMITE_CARACTERES_NOMBRE_CLIENTE = 100;
    private static final int CARACTERES_TELEFONO_REQUERIDOS = 10;
    private static final int LIMITE_CARACTERES_CORREO =30;
    String ERROR_MAX_CAR = "Has superado el máximo de caracteres aceptados ";
    String CAMPO_REQUERIDO = "Hay campos vacíos, asegúrate de llenar todos";
    String FORM_INVALIDO = "Ingrese un formato valido";
    IClienteFrecuenteDAO clienteDAO;
    
    public ClienteBO(IClienteFrecuenteDAO clienteDAO ){
        this.clienteDAO = clienteDAO;
    }
    @Override
    public ClienteFrecuente registrar(NuevoClienteDTO nuevoCliente) throws NegocioException {
        //limite caracteres nombre
        if(nuevoCliente.getNombreCliente().length()>LIMITE_CARACTERES_NOMBRE_CLIENTE){throw new NegocioException(ERROR_MAX_CAR+LIMITE_CARACTERES_NOMBRE_CLIENTE);}
        //limite caracteres correo
        if(nuevoCliente.getCorreoCliente().length()>LIMITE_CARACTERES_CORREO){throw new NegocioException(ERROR_MAX_CAR+LIMITE_CARACTERES_CORREO);}
        //campos vacios
        if("".equals(nuevoCliente.getNombreCliente()) || "".equals(nuevoCliente.getTelefonoCliente())){
            throw new NegocioException(CAMPO_REQUERIDO);
        }
        //formato telefono incorrecto
        if(nuevoCliente.getTelefonoCliente().length()!=CARACTERES_TELEFONO_REQUERIDOS){
            throw new NegocioException(FORM_INVALIDO);
        }
            //formato correcto
            return this.clienteDAO.registrar(nuevoCliente);
    }

    @Override
    public List<ClienteFrecuente> consultar(String filtroBusqueda) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ClienteFrecuente consultar(Long idCliente) throws NegocioException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
