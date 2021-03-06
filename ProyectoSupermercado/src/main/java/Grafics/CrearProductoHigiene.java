/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Grafics;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import Main.Classes.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import Main.Classes.*;
import Main.Classes.ProductoAlimento.Categoria;
import Main.Classes.ProductoHigiene.TipoHigiene;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;

/**
 *
 * @author josep
 */
public class CrearProductoHigiene extends javax.swing.JFrame {

    /**
     * Creates new form CrearTarjeta
     */
    
    public InterfazUsuario3 frameLlamando2;

    public CrearProductoHigiene() {
        initComponents();
        this.setVisible(true);
        this.setLocationRelativeTo(null);
    }

    public JTextArea getDescripcionHigiene() {
        return descripcionHigiene;
    }

    public void setDescripcionHigiene(JTextArea descripcionHigiene) {
        this.descripcionHigiene = descripcionHigiene;
    }

    public JTextField getNombreHigiene() {
        return nombreHigiene;
    }

    public void setNombreHigiene(JTextField nombreHigiene) {
        this.nombreHigiene = nombreHigiene;
    }

    public JTextField getPrecioHigiene() {
        return precioHigiene;
    }

    public void setPrecioHigiene(JTextField precioHigiene) {
        this.precioHigiene = precioHigiene;
    }

    public JComboBox getTipoHigiene() {
        return tipoHigiene;
    }

    public void setTipoHigiene(JComboBox tipoHigiene) {
        this.tipoHigiene = tipoHigiene;
    }
    
    public InterfazUsuario3 getFrameLlamando2() {
        return frameLlamando2;
    }

    public void setFrameLlamando2(InterfazUsuario3 frameLlamando2) {
        this.frameLlamando2 = frameLlamando2;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        botonCancelar = new javax.swing.JButton();
        nombreHigiene = new javax.swing.JTextField();
        precioHigiene = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tipoHigiene = new javax.swing.JComboBox();
        jLabel6 = new javax.swing.JLabel();
        botonGuardar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        descripcionHigiene = new javax.swing.JTextArea();
        fondo1 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        jLabel5.setText("jLabel5");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("  METRADONA??");
        setIconImage(getIconImage());
        setMinimumSize(new java.awt.Dimension(398, 331));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        botonCancelar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        botonCancelar.setText("Cancelar");
        botonCancelar.setToolTipText("");
        botonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(botonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 110, 40));
        getContentPane().add(nombreHigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 50, 200, -1));
        getContentPane().add(precioHigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 230, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Precio");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo higiene");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        tipoHigiene.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "crema", "serum", "maquillaje", "mascarilla", "champu", "gel", "desorodante", "jabon", "mascarillas", "toallitas", "otros" }));
        getContentPane().add(tipoHigiene, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 190, 120, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("HIGIENE");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 0, 170, 40));

        botonGuardar.setBackground(new java.awt.Color(102, 102, 102));
        botonGuardar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        botonGuardar.setForeground(new java.awt.Color(255, 255, 255));
        botonGuardar.setText("Guardar");
        botonGuardar.setMaximumSize(new java.awt.Dimension(75, 23));
        botonGuardar.setMinimumSize(new java.awt.Dimension(75, 23));
        botonGuardar.setPreferredSize(new java.awt.Dimension(75, 23));
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(botonGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 110, 40));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Descripci??n");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));

        descripcionHigiene.setColumns(20);
        descripcionHigiene.setLineWrap(true);
        descripcionHigiene.setRows(5);
        jScrollPane3.setViewportView(descripcionHigiene);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 110, 230, 80));

        fondo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Green-Wallpaper-5.jpg"))); // NOI18N
        getContentPane().add(fondo1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 330));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_botonCancelarActionPerformed

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        try{
            ProductoHigiene.TipoHigiene tipoHigiene = TipoHigiene.valueOf(this.getTipoHigiene().getSelectedItem().toString());
            ProductoHigiene ph = ProductoHigiene.crearProductoHigiene(tipoHigiene, this.getNombreHigiene().getText(), Double.parseDouble(this.getPrecioHigiene().getText()), this.getDescripcionHigiene().getText());
            ProductoHigiene.a??adirHigiene(ph);
            Herramientas.aviso("Se ha registrado correctamente");
        } catch (Exception error) {
            Herramientas.aviso("Ha habido algun error, porfavor inserta los datos correctos");
            Excepciones.pasarExcepcionLog("Ha habido algun error, porfavor inserta los datos correctos", error);
        }
        this.dispose();
    }//GEN-LAST:event_botonGuardarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonCancelar;
    private javax.swing.JButton botonGuardar;
    private javax.swing.JTextArea descripcionHigiene;
    private javax.swing.JLabel fondo1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField nombreHigiene;
    private javax.swing.JTextField precioHigiene;
    private javax.swing.JComboBox tipoHigiene;
    // End of variables declaration//GEN-END:variables


}
