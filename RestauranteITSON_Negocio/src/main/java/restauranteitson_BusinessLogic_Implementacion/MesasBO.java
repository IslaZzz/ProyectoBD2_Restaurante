/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Implementacion;

import com.mycompany.restauranteitson_persistencia.IMesaDAO;
import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_BusinessLogic_Interfaces.IMesasBO;
import restauranteitson_dominio.Mesa;

/**
 *
 * @author santi
 */
public class MesasBO implements IMesasBO {

    private IMesaDAO messaDAO;
    
    @Override
    public List<Mesa> mostrarMesas() throws NegocioException {
        messaDAO.consultar();
    }
    
}
