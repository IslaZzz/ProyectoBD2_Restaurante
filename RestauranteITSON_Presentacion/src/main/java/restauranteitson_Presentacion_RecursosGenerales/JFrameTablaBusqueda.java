/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package restauranteitson_Presentacion_RecursosGenerales;

import java.awt.GridLayout;
import java.util.List;
import javax.swing.JOptionPane;
import restauranteitson_BusinessLogic_Exepciones.NegocioException;
import restauranteitson_BusinessLogic_Interfaces.IClientesBO;
import restauranteitson_BusinessLogic_Interfaces.IProductosBO;
import restauranteitson_BusinessLogic_Interfaces.iIngredientesBO;
import restauranteitson_dominio.ClienteFrecuente;
import restauranteitson_dominio.Ingrediente;
import restauranteitson_dominio.Producto;

/**
 *
 * @author abrilislas
 */
public class JFrameTablaBusqueda extends JFrameBase{
    private int CUInvocador;
    String filtroBusquedaTexto;
    iIngredientesBO ingredientesBO;
    IClientesBO clientesBO;
    IProductosBO productosBO;
    
    /**
     * Creates new form JFrameTablaBusqueda
     */
    public JFrameTablaBusqueda(int CUInvocador, String filtroBusquedaTexto, iIngredientesBO ingredientesBO){
        super();
        initComponents();
        this.CUInvocador= CUInvocador;
        this.filtroBusquedaTexto= filtroBusquedaTexto;
        this.ingredientesBO=ingredientesBO; 
        generarPanelRegistro(this.CUInvocador);
        //pnlContenidoConsulta
    }
    
    public JFrameTablaBusqueda(int CUInvocador, String filtroBusquedaTexto, IClientesBO clientesBO){
        super();
        initComponents();
        this.CUInvocador= CUInvocador;
        this.filtroBusquedaTexto= filtroBusquedaTexto; 
        this.clientesBO=clientesBO;
    
    }
     public JFrameTablaBusqueda(int CUInvocador, String filtroBusquedaTexto, IProductosBO productosBO){
        super();
        initComponents();
        this.CUInvocador= CUInvocador;
        this.filtroBusquedaTexto= filtroBusquedaTexto; 
        this.productosBO=productosBO;
    
    }
    
    private void generarPanelRegistro(int CUInvocador){
        switch(CUInvocador){
            case 3 -> {//caso Consultar ingredientes
                try {
                    generarPanelIngredientes();
                    repaint();
                }catch(NegocioException ex){
                    JOptionPane.showMessageDialog(this, "Error al consultar los ingredientes", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
            case 4  -> {//caso consultar productos
                try {
                    generarPanelIngredientes();
                    repaint();
                }catch(NegocioException ex){
                    JOptionPane.showMessageDialog(this, "Error al consultar los ingredientes", "Error", JOptionPane.ERROR_MESSAGE);
                }
            
            }
            case 5 ->{//caso consultar clientes
            
            
            }
        
        }
        //caso consultar productos
        //caso consultar clientes
            }
    
    private void generarPanelIngredientes() throws NegocioException{
        try {
            String filtro = filtroBusquedaTexto;
            List<Ingrediente> ingredientes = this.ingredientesBO.consultarIngredientes(filtro);
           
             // Iteramos sobre la lista de ingredientes y agregamos a la tabla
            for (Ingrediente ingrediente : ingredientes) {
                JPanelConsultarIngredientes panel =  new JPanelConsultarIngredientes(ingrediente,this); // Creamos el panel con los datos correspondientes
                panel.setVisible(true);
                pnlMostrar.setLayout(new GridLayout(0, 1)); // One column, many rows
                pnlMostrar.add(panel);
                pnlMostrar.revalidate();  
                repaint();     
            }
        }catch(NegocioException ex){
            JOptionPane.showMessageDialog(this, "Error al consultar los ingredientes", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    private void generarPanelProductos() throws NegocioException{
         try {
            String filtro = filtroBusquedaTexto;
            List<Producto> productos = this.productosBO.consultarProductos(filtro);
             for (Producto producto : productos) {
             // Iteramos sobre la lista de productos y agregamos a la tabla
                JPanelConsultarProductos panel =  new JPanelConsultarProductos(producto,this); // Creamos el panel con los datos correspondientes
                panel.setVisible(true);
                pnlMostrar.setLayout(new GridLayout(0, 1)); // One column, many rows
                pnlMostrar.add(panel);
                pnlMostrar.revalidate();  
                repaint();     
            }
        }catch(NegocioException ex){
            JOptionPane.showMessageDialog(this, "Error al consultar los productos", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    private void generarPanelClientes() throws NegocioException{
         try {
            String filtro = filtroBusquedaTexto;
            List<ClienteFrecuente> clientes = this.clientesBO.consultar(filtro);
             for (ClienteFrecuente clienteFrecuente : clientes) {
                 
             // Iteramos sobre la lista de clientes y agregamos a la tabla
                JPanelConsultarClientes panel =  new JPanelConsultarClientes(clienteFrecuente,this); // Creamos el panel con los datos correspondientes
                panel.setVisible(true);
                pnlMostrar.setLayout(new GridLayout(0, 1)); // One column, many rows
                pnlMostrar.add(panel);
                pnlMostrar.revalidate();  
                repaint();     
            }
        }catch(NegocioException ex){
            JOptionPane.showMessageDialog(this, "Error al consultar a los clientes", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlRoot = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        pnlContenido = new javax.swing.JPanel();
        pnlBotones = new javax.swing.JPanel();
        btnRegistrarNuevoCliente = new javax.swing.JButton();
        pnlContenidoConsulta = new javax.swing.JPanel();
        scrollPane = new javax.swing.JScrollPane();
        pnlMostrar = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(75, 90, 228));
        setPreferredSize(new java.awt.Dimension(601, 411));
        setResizable(false);
        setSize(new java.awt.Dimension(601, 411));

        pnlRoot.setBackground(new java.awt.Color(255, 255, 255));
        pnlRoot.setLayout(new java.awt.BorderLayout());

        pnlContenido.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenido.setLayout(new java.awt.BorderLayout());

        pnlBotones.setBackground(new java.awt.Color(255, 255, 255));
        pnlBotones.setPreferredSize(new java.awt.Dimension(100, 60));
        pnlBotones.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRegistrarNuevoCliente.setBackground(new java.awt.Color(75, 90, 228));
        btnRegistrarNuevoCliente.setFont(new java.awt.Font("InaiMathi", 1, 20)); // NOI18N
        btnRegistrarNuevoCliente.setForeground(new java.awt.Color(225, 225, 246));
        btnRegistrarNuevoCliente.setText("Cerrar");
        btnRegistrarNuevoCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarNuevoClienteActionPerformed(evt);
            }
        });
        pnlBotones.add(btnRegistrarNuevoCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 140, 40));

        pnlContenido.add(pnlBotones, java.awt.BorderLayout.PAGE_END);

        pnlContenidoConsulta.setBackground(new java.awt.Color(255, 255, 255));
        pnlContenidoConsulta.setPreferredSize(new java.awt.Dimension(100, 340));
        pnlContenidoConsulta.setLayout(new java.awt.BorderLayout());

        scrollPane.setPreferredSize(new java.awt.Dimension(300, 411));

        pnlMostrar.setLayout(new java.awt.GridLayout(1, 0));
        scrollPane.setViewportView(pnlMostrar);

        pnlContenidoConsulta.add(scrollPane, java.awt.BorderLayout.CENTER);

        pnlContenido.add(pnlContenidoConsulta, java.awt.BorderLayout.PAGE_START);

        jScrollPane1.setViewportView(pnlContenido);

        pnlRoot.add(jScrollPane1, java.awt.BorderLayout.CENTER);

        getContentPane().add(pnlRoot, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarNuevoClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarNuevoClienteActionPerformed
        dispose();
    }//GEN-LAST:event_btnRegistrarNuevoClienteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrameTablaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameTablaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameTablaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameTablaBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
   ///          new JFrameTablaBusquedaIngredientes(int CUInvocador).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrarNuevoCliente;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pnlBotones;
    private javax.swing.JPanel pnlContenido;
    private javax.swing.JPanel pnlContenidoConsulta;
    private javax.swing.JPanel pnlMostrar;
    private javax.swing.JPanel pnlRoot;
    private javax.swing.JScrollPane scrollPane;
    // End of variables declaration//GEN-END:variables
}
