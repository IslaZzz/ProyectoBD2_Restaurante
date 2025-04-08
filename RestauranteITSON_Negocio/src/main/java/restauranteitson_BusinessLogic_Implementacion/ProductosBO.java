/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_BusinessLogic_Implementacion;

import com.mycompany.restauranteitson_persistencia.IProductoDAO;
import com.mycompany.restauranteitson_persistencia.IProductoIngrediente;
import java.util.List;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_BusinessLogic_Interfaces.IProductosBO;
import restauranteitson_dominio.Producto;
import restauranteitson_dtos.NuevaRelacionProductoIngredienteDTO;
import restauranteitson_dtos.NuevoProductoDTO;

/**
 *
 * @author LABCISCO-PC006
 */
public class ProductosBO implements IProductosBO {

    
    private static final int LIMITE_CARACTERES_NOMBRE_PRODUCTO = 100;
    private IProductoDAO productpDAO;
    private IProductoIngrediente productoIngredienteDAO;
    

    @Override
    public List<Producto> consultarProductos(String busqueda)throws NegocioException {
        return productpDAO.consultar(busqueda);
    }

    @Override
    public Producto agregarProducto(NuevoProductoDTO nuevoProductoDTO, List<NuevaRelacionProductoIngredienteDTO> productoIngredientesDTO)throws NegocioException {
        if ("".equals(nuevoProductoDTO.getNombreProducto())) {
            throw new NegocioException("Ingrese un nombre");
        }
        if (nuevoProductoDTO.getTipoProducto() == null) {
            throw new NegocioException("Ingrese la categoria del producto");
        }
        if (nuevoProductoDTO.getPrecio()<=0 || nuevoProductoDTO.getPrecio() == null) {
            throw new NegocioException("Ingrese un precio para el producto");
        }
        if (productoIngredientesDTO.isEmpty()) {
            throw new NegocioException("Seleccione ingredientes para el producto");
        }
        for (NuevaRelacionProductoIngredienteDTO nuevaRelacionProductoIngredienteDTO : productoIngredientesDTO) {
            if (nuevaRelacionProductoIngredienteDTO.getCantidadExacta()== 0 ) {
                throw new NegocioException("Ingrese un valor para la cantidad del ingrediente");
            }
        }
        
        Producto producto = productpDAO.registrar(nuevoProductoDTO);
        
        crearRelacionProductoIngrediente(productoIngredientesDTO, producto.getId());
        
        return producto;
        
    }
    
    public void crearRelacionProductoIngrediente(List<NuevaRelacionProductoIngredienteDTO> productoIngredientesDTO, Long idProducto){
        for (NuevaRelacionProductoIngredienteDTO nuevaRelacionProductoIngredienteDTO : productoIngredientesDTO) {
            nuevaRelacionProductoIngredienteDTO.setIdProducto(idProducto);
            productoIngredienteDAO.registrar(nuevaRelacionProductoIngredienteDTO);
        }
    }
    
}
