/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import restauranteitson_dominio.Ingrediente;
import restauranteitson_dtos.NuevoIngredienteDTO;
import restauranteitson_enum.UnidadIngrediente;

/**
 *
 * @author abrilislas
 */
public class IngredienteDAOTest {
    
    public IngredienteDAOTest() {
    }

    /**
     * Test of registrar method, of class IngredienteDAO.
     */
    @Test
    public void testRegistrar() {
        IngredienteDAO ingredienteDAO = new IngredienteDAO();
        NuevoIngredienteDTO ingredienteDTO = new NuevoIngredienteDTO("Pasta",UnidadIngrediente.GRAMOS,1000);
        Ingrediente ingrediente = ingredienteDAO.registrar(ingredienteDTO);
        assertEquals(ingrediente.getNombreIngrediente(),ingredienteDTO.getNombre());
        assertEquals(ingrediente.getUnidadMedida(),ingredienteDTO.getUnidadIngrediente());
        assertNotNull(ingrediente.getId());
    }

    /**
     * Test of consultarIngredientes method, of class IngredienteDAO.
     */
    @Test
    public void testConsultarIngredientes() {
        IngredienteDAO ingredienteDAO = new IngredienteDAO();
        final Long ID_INGREDIENTE_BUSCADO= 1L;
        Ingrediente ingrediente = ingredienteDAO.consultar(ID_INGREDIENTE_BUSCADO);
        assertEquals(ingrediente.getId(),ID_INGREDIENTE_BUSCADO);
        assertNotNull(ingrediente);
    }

    /**
     * Test of consultar method, of class IngredienteDAO.
     */
    @Test
    public void testConsultar() {
    }
    
}
