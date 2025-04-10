/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package restauranteitson_Presentacion_RecursosGenerales;

import javax.swing.JFrame;

/**
 *
 * @author abrilislas
 */
public class JFrameBase extends JFrame{

    public JFrameBase() {
        // Tamaño predeterminado
        this.setSize(854, 542);
        // No permitir redimensionar
        this.setResizable(false);
        // Centrar en pantalla
        this.setLocationRelativeTo(null);

        // Cerrar el sistema al cerrar la ventana
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
