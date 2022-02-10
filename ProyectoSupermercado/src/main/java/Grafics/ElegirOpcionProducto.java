/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafics;

import java.awt.Image;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;

/**
 *
 * @author jaume
 */
public class ElegirOpcionProducto extends javax.swing.JFrame {

    /**
     * Creates new form ElegirOpcionTarjeta
     */
    public ElegirOpcionProducto() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    
    public Image getIconImage(){
        Image miIcono=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/logo1.png"));
        return miIcono;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        añadirTarjeta = new javax.swing.JButton();
        EliminarTarjeta = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("  METRADONA©");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(640, 202));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUIERES ELIMINAR O AÑADIR UN PRODUCTO?");

        añadirTarjeta.setBackground(new java.awt.Color(102, 102, 102));
        añadirTarjeta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        añadirTarjeta.setText("AÑADIR");
        añadirTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirProductoActionPerformed(evt);
            }
        });

        EliminarTarjeta.setBackground(new java.awt.Color(102, 102, 102));
        EliminarTarjeta.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        EliminarTarjeta.setText("ELIMINAR");
        EliminarTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EliminarProductoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(añadirTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(EliminarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(23, 23, 23))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadirTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(EliminarTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirProductoActionPerformed
        ElegirTipoAñadirProducto frame=new ElegirTipoAñadirProducto();
        this.dispose();
    }//GEN-LAST:event_añadirProductoActionPerformed

    private void EliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EliminarProductoActionPerformed
        EliminarProducto frame=new EliminarProducto();
        this.dispose();
    }//GEN-LAST:event_EliminarProductoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton EliminarTarjeta;
    private javax.swing.JButton añadirTarjeta;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
