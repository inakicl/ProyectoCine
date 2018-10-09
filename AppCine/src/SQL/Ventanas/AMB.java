/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SQL.Ventanas;

import DB4o.Ventanas.*;
import DB4o.Clases.Pelicula;
import DB4o.Conexion.Conexion;
import SQL.Dao.*;
import java.util.List;
import javax.swing.JOptionPane;

import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.logging.*;

/**
 *
 * @author morfe
 */
public class AMB extends javax.swing.JFrame {

    private JPanel contentPane;
    private static String salaPeliEmpleado;
    //variables de ventana
    public Eleccion eleccionVentana;
    
    //variables de control de funciones
    public SalaFunciones salaFunciones;
    public EmpleadoFunciones empleadoFunciones;
    public PeliculaFunciones peliculaFunciones;

    //tabla
    static DefaultTableModel modeloTabla;// http://www.elprogramador.com.mx/llenar-un-jtable-con-datos-de-una-base-de-datos-mysql/

    /**
     * Creates new form Porseaka
     */
    public AMB(String queMeLLega) {

        modeloTabla = new DefaultTableModel(null, getColumnas());
        //setFilas();

        initComponents();
       // this.salaPeliEmpleado = queMeLLega;
        System.out.println(salaPeliEmpleado);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoErrores = new javax.swing.JTextField();
        labelTituloVentana = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        labelID = new javax.swing.JLabel();
        labelTitulo = new javax.swing.JLabel();
        labelAnyo = new javax.swing.JLabel();
        labelDirector = new javax.swing.JLabel();
        labelAP = new javax.swing.JLabel();
        labelAS = new javax.swing.JLabel();
        labelDuracion = new javax.swing.JLabel();
        lableTrailer = new javax.swing.JLabel();
        textoID = new javax.swing.JTextField();
        textoTitulo = new javax.swing.JTextField();
        textoAnyo = new javax.swing.JTextField();
        textoDirector = new javax.swing.JTextField();
        textoDuracion = new javax.swing.JTextField();
        textoAcSe = new javax.swing.JTextField();
        textoTrailer = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        botonClear = new javax.swing.JButton();
        textoAcPr = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaResultado = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        botonGuardar = new javax.swing.JButton();
        botonModificar = new javax.swing.JButton();
        botonBorrar = new javax.swing.JButton();
        botonAtras = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(204, 255, 204));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoErrores.setEditable(false);
        textoErrores.setBackground(new java.awt.Color(204, 204, 204));
        textoErrores.setBorder(null);
        getContentPane().add(textoErrores, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 550, -1));

        labelTituloVentana.setFont(new java.awt.Font("Tw Cen MT Condensed Extra Bold", 1, 48)); // NOI18N
        labelTituloVentana.setForeground(new java.awt.Color(255, 0, 0));
        labelTituloVentana.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTituloVentana.setText("PELÍCULAS");
        labelTituloVentana.setToolTipText("");
        getContentPane().add(labelTituloVentana, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 22, 550, 80));

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Filtrado"));

        labelID.setForeground(new java.awt.Color(255, 0, 0));
        labelID.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelID.setText("ID Pelicula:");

        labelTitulo.setForeground(new java.awt.Color(255, 0, 0));
        labelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelTitulo.setText("Título:");

        labelAnyo.setForeground(new java.awt.Color(255, 0, 0));
        labelAnyo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAnyo.setText("Año:");

        labelDirector.setForeground(new java.awt.Color(255, 0, 0));
        labelDirector.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDirector.setText("Director:");

        labelAP.setForeground(new java.awt.Color(255, 0, 0));
        labelAP.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAP.setText("Actor Principal:");

        labelAS.setForeground(new java.awt.Color(255, 0, 0));
        labelAS.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAS.setText("Actor Secundario:");

        labelDuracion.setForeground(new java.awt.Color(255, 0, 0));
        labelDuracion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelDuracion.setText("Duración en minutos:");

        lableTrailer.setForeground(new java.awt.Color(255, 0, 0));
        lableTrailer.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lableTrailer.setText("Trailer:");

        btnBuscar.setText("Buscar / Mostrar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        botonClear.setText("Limpiar");
        botonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonClearActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lableTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(textoTrailer, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoAcPr, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 153, Short.MAX_VALUE)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botonClear)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(textoAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelAP, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelAS, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(textoAcSe, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(labelTitulo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(textoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(textoTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(labelID))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAnyo)
                    .addComponent(labelDirector))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelAP)
                    .addComponent(labelAS))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textoAcSe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(labelDuracion))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lableTrailer)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(textoTrailer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar)
                    .addComponent(botonClear)
                    .addComponent(textoAcPr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        labelAP.getAccessibleContext().setAccessibleName("Actor Principal");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 790, 300));

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Tabla"));

        tablaResultado.setModel(modeloTabla);
        tablaResultado.setRequestFocusEnabled(false);
        jScrollPane1.setViewportView(tablaResultado);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 948, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
                .addContainerGap())
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 980, 380));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Crear/Editar"));

        botonGuardar.setText("Añadir");
        botonGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonGuardarActionPerformed(evt);
            }
        });

        botonModificar.setText("Modificar");
        botonModificar.setToolTipText("Solo se activara al seleccionar un registro de la tabla");

        botonBorrar.setText("Borrar");
        botonBorrar.setToolTipText("Solo está disponible cuando se seleccione un registro de la tabla");
        botonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBorrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonBorrar, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(botonGuardar)
                .addGap(18, 18, 18)
                .addComponent(botonModificar)
                .addGap(18, 18, 18)
                .addComponent(botonBorrar)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 150, 170, 300));

        botonAtras.setText("Atrás");
        botonAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAtrasActionPerformed(evt);
            }
        });
        getContentPane().add(botonAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 50, 140, 40));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botonGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonGuardarActionPerformed
        Añadir a;
        switch (salaPeliEmpleado) {
            case "empleado":
                a = new Añadir();
                a.cambiarVentanaEmpleadoss();
                a.show();
                break;
            case "sala":
                a = new Añadir();
                a.cambiarVentanaSalas();
                a.show();
                break;
            case "pelicula":
                a = new Añadir();
                a.cambiarVentanaPelis();
                a.show();
                break;
        }


    }//GEN-LAST:event_botonGuardarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        int idPelicula = 0;
        if (textoID.getText().isEmpty()) {
            idPelicula = 0;
        } else {
            idPelicula = Integer.parseInt(textoID.getText());
        }
        String titulo = textoTitulo.getText();
        if (titulo.isEmpty()) {
            titulo = null;
        }
        String anyoEstreno = textoAnyo.getText();
        if (anyoEstreno.isEmpty()) {
            anyoEstreno = null;
        }
        String director = textoDirector.getText();
        if (director.isEmpty()) {
            director = null;
        }
        String actorPrinci = textoAcPr.getText();
        if (actorPrinci.isEmpty()) {
            actorPrinci = null;
        }
        String actorSecun = textoAcSe.getText();
        if (actorSecun.isEmpty()) {
            actorSecun = null;
        }
        String duracion = textoDuracion.getText();
        if (duracion.isEmpty()) {
            duracion = null;
        }
        String trailer = textoTrailer.getText();
        if (trailer.isEmpty()) {
            trailer = null;
        }

        Pelicula p1 = new Pelicula(idPelicula, titulo, anyoEstreno, director, actorPrinci, actorSecun, duracion, trailer);
        Conexion conexion = new Conexion();
        conexion.buscarPelicula(p1);


    }//GEN-LAST:event_btnBuscarActionPerformed

    private void botonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonClearActionPerformed

        textoID.setText("");
        textoTitulo.setText("");
        textoAnyo.setText("");
        textoDirector.setText("");
        textoAcPr.setText("");
        textoAcSe.setText("");
        textoDuracion.setText("");
        textoTrailer.setText("");
        textoErrores.setText("");
    }//GEN-LAST:event_botonClearActionPerformed

    private void botonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBorrarActionPerformed

        int idPelicula = 0;
        if (textoID.getText().isEmpty()) {
            idPelicula = 0;
        } else {
            idPelicula = Integer.parseInt(textoID.getText());
        }

        String titulo = textoTitulo.getText();
        if (titulo.isEmpty()) {
            titulo = null;
        }
        String anyoEstreno = textoAnyo.getText();
        if (anyoEstreno.isEmpty()) {
            anyoEstreno = null;
        }
        String director = textoDirector.getText();
        if (director == "") {
            director = null;
        }
        String actorPrinci = textoAcPr.getText();
        if (actorPrinci.isEmpty()) {
            actorPrinci = null;
        }
        String actorSecun = textoAcSe.getText();
        if (actorSecun.isEmpty()) {
            actorSecun = null;
        }
        String duracion = textoDuracion.getText();
        if (duracion.isEmpty()) {
            duracion = null;
        }
        String trailer = textoTrailer.getText();
        if (trailer.isEmpty()) {
            trailer = null;
        }

        Pelicula p1 = new Pelicula(idPelicula, titulo, anyoEstreno, director, actorPrinci, actorSecun, duracion, trailer);
        Conexion conexion = new Conexion();
        conexion.borrarPelicula(p1);
    }//GEN-LAST:event_botonBorrarActionPerformed

    private void botonAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAtrasActionPerformed
        this.dispose();        
        //Eleccion el = new Eleccion();
       //eleccionVentana.set
        //el.show();
    }//GEN-LAST:event_botonAtrasActionPerformed

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
            java.util.logging.Logger.getLogger(AMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AMB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AMB(salaPeliEmpleado).setVisible(true);
            }
        });
    }

    public static void rellenarPelicula(List<Pelicula> pelis) {
        /* for (int i = 0; i < pelis.size(); i++) {

            tablaResultado.setValueAt(String.valueOf(pelis.get(i).getIdPelicula()), i, 0);
            tablaResultado.setValueAt(pelis.get(i).getTitulo(), i, 1);
            tablaResultado.setValueAt(pelis.get(i).getAnyoEstreno(), i, 2);
            tablaResultado.setValueAt(pelis.get(i).getDirector(), i, 3);
            tablaResultado.setValueAt(pelis.get(i).getActorPrinci(), i, 4);
            tablaResultado.setValueAt(pelis.get(i).getActorSecun(), i, 5);
            tablaResultado.setValueAt(pelis.get(i).getDuracion(), i, 6);
            tablaResultado.setValueAt(pelis.get(i).getTrailer(), i, 7);

        }*/
        modeloTabla.setRowCount(0);
        Object datosPelicula[] = new Object[8];
        int i = 0;
        for (Pelicula peli : pelis) {
            datosPelicula[0] = peli.getIdPelicula();
            datosPelicula[1] = peli.getTitulo();
            datosPelicula[2] = peli.getAnyoEstreno();
            datosPelicula[3] = peli.getActorPrinci();
            datosPelicula[4] = peli.getActorSecun();
            datosPelicula[5] = peli.getDirector();
            datosPelicula[6] = peli.getDuracion();
            datosPelicula[7] = peli.getTrailer();
            setFilas(datosPelicula);
            // modeloTabla.addRow(datosPelicula[i]);
            i++;
        }

    }

    public static void rellenarErrores(String frase) {
        textoErrores.setText(frase);

    }

    public static void cambiarVentanaPelis() {
        labelTituloVentana.setText("PELÍCULAS");
        labelID.setText("ID Pélicula:");
        labelTitulo.setText("Título:");
        labelAnyo.setText("Año: ");
        labelDirector.setText("Director:");
        labelAP.setText("Actor/a principal:");
        labelAS.setText("Actor/a secundario/a:");
        labelDuracion.setText("Duración:");
        lableTrailer.setText("Trailer");
    }

    public static void cambiarVentanaSalas() {
        labelTituloVentana.setText("SALAS");
        labelID.setText("ID Sala:");
        labelTitulo.setText("Capacidad:");
        labelAnyo.setText("Pantalla: ");
        labelDirector.setText("Apertura:");
        labelAP.setText("Horario:");
        labelAS.setText(" ");
        labelDuracion.setText(" ");
        lableTrailer.setText(" ");
        textoAcSe.hide();
        textoDuracion.hide();
        textoTrailer.hide();
    }

    public static void cambiarVentanaEmpleadoss() {
        labelTituloVentana.setText("EMPLEADOS");
        labelID.setText("ID Empleado:");
        labelTitulo.setText("Nombre:");
        labelAnyo.setText("Primer apellido: ");
        labelDirector.setText("Segundo apellido:");
        labelAP.setText("Fecha de Nacimiento:");
        labelAS.setText("Fecha de contratación:");
        labelDuracion.setText("Fecha Fin de Contrato:");
        lableTrailer.setText("Nacionalidad: ");

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton botonAtras;
    public static javax.swing.JButton botonBorrar;
    public static javax.swing.JButton botonClear;
    public static javax.swing.JButton botonGuardar;
    public static javax.swing.JButton botonModificar;
    public static javax.swing.JButton btnBuscar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JLabel labelAP;
    public static javax.swing.JLabel labelAS;
    public static javax.swing.JLabel labelAnyo;
    public static javax.swing.JLabel labelDirector;
    public static javax.swing.JLabel labelDuracion;
    public static javax.swing.JLabel labelID;
    public static javax.swing.JLabel labelTitulo;
    public static javax.swing.JLabel labelTituloVentana;
    public static javax.swing.JLabel lableTrailer;
    public static javax.swing.JTable tablaResultado;
    public static javax.swing.JTextField textoAcPr;
    public static javax.swing.JTextField textoAcSe;
    public static javax.swing.JTextField textoAnyo;
    public static javax.swing.JTextField textoDirector;
    public static javax.swing.JTextField textoDuracion;
    public static javax.swing.JTextField textoErrores;
    public static javax.swing.JTextField textoID;
    public static javax.swing.JTextField textoTitulo;
    public static javax.swing.JTextField textoTrailer;
    // End of variables declaration//GEN-END:variables

    private String[] getColumnas() {
        String columna[] = new String[]{"ID_PELI", "Hola2", "Hola3", "", "", "", "", ""};
        return columna;
    }

    private static void setFilas(Object datos[]) {

        modeloTabla.addRow(datos);

    }
}
