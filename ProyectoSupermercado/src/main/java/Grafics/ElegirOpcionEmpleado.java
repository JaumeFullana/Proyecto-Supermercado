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
public class ElegirOpcionEmpleado extends javax.swing.JFrame {

    /**
     * Creates new form ElegirOpcionTarjeta
     */
    public ElegirOpcionEmpleado() {
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
        añadirEmpleado = new javax.swing.JButton();
        eliminarEmpleado = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("  METRADONA©");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(640, 202));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("QUIERES ELIMINAR O AÑADIR UN EMPLEADO?");

        añadirEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        añadirEmpleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        añadirEmpleado.setText("AÑADIR");
        añadirEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadirEmpleadoActionPerformed(evt);
            }
        });

        eliminarEmpleado.setBackground(new java.awt.Color(102, 102, 102));
        eliminarEmpleado.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        eliminarEmpleado.setText("ELIMINAR");
        eliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarEmpleadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(añadirEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(eliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
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
                    .addComponent(añadirEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void añadirEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadirEmpleadoActionPerformed
        RegistradoEmpleados frame=new RegistradoEmpleados();
        this.dispose();
    }//GEN-LAST:event_añadirEmpleadoActionPerformed

    private void eliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarEmpleadoActionPerformed
        EliminarEmpleado frame=new EliminarEmpleado();
        this.dispose();
    }//GEN-LAST:event_eliminarEmpleadoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton añadirEmpleado;
    private javax.swing.JButton eliminarEmpleado;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}