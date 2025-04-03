/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package implementaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author santi
 */

public class ManejadorConexiones {
    
    public static EntityManager getEntityManager(){
        // solicitamos una fabrica de entity managers
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(
            "com.mycompany_RestauranteITSON_Dominio_jar_1.0-SNAPSHOTPU"
        );
        // la fábrica crea un entityManager = base de datos
        EntityManager entityManager = emFactory.createEntityManager();
        return entityManager;
    }
    
}


