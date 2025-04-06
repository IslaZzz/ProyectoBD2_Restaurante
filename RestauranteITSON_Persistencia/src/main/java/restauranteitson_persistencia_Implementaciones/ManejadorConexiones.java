/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_persistencia_Implementaciones;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author santi
 */

public class ManejadorConexiones {
    
      // solicitamos una fabrica de entity managers
       private static final EntityManagerFactory emFactory = Persistence.createEntityManagerFactory(
            "com.mycompany_RestauranteITSON_Dominio_jar_1.0-SNAPSHOTPU"
        );
    
    public static EntityManager getEntityManager(){
        return emFactory.createEntityManager();
    }
    
}


