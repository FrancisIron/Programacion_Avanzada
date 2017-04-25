/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.view;

import com.modelo.Colegio;
import com.datos.CargarDatos;
import com.datos.GuardarDatos;
import com.modelo.Alumno;
import com.modelo.Curso;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.JAXBException;

/**
 *
 * @author R22bot2.15 Pocket
 */
public class VentanaCurso extends javax.swing.JFrame {

    /**
     * Creates new form VerCurso
     */
    private Colegio colegio;
    private VentanaPrincipal vnPr;

    public VentanaCurso(VentanaPrincipal vnPr) {
        this.vnPr = vnPr;
        initComponents();
        CargarDatos carga = new CargarDatos();
        colegio = (carga.cargarXML());
        crearListaCurso(colegio);
        jRadioButton1.doClick();
        crearTablaCurso();
        listeners();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPopupMenu1 = new javax.swing.JPopupMenu();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jComboBox1 = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        botonNotas = new javax.swing.JButton();
        botonAsistencia = new javax.swing.JButton();
        botonAnotaciones = new javax.swing.JButton();
        botonAsignatura = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Nombre", "Apoderado"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(jTable1);

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("A");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("B");

        jLabel1.setText("Curso");

        botonNotas.setText("Ver notas");
        botonNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonNotasActionPerformed(evt);
            }
        });

        botonAsistencia.setText("Ver asistencia");
        botonAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsistenciaActionPerformed(evt);
            }
        });

        botonAnotaciones.setText("Ver anotaciones");
        botonAnotaciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnotacionesActionPerformed(evt);
            }
        });

        botonAsignatura.setText("Asignaturas");
        botonAsignatura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAsignaturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jRadioButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jRadioButton2)))
                .addContainerGap(96, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonNotas)
                    .addComponent(botonAsignatura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(botonAnotaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(botonAsistencia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(98, 98, 98))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonNotas)
                    .addComponent(botonAsistencia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonAnotaciones)
                    .addComponent(botonAsignatura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed

    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void botonNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonNotasActionPerformed
        int posicion = jTable1.getSelectedRow();
        if (posicion != -1) {
            String nombreAlumno = (String) jTable1.getValueAt(posicion, 0);
            String nombreApoderado = (String) jTable1.getValueAt(posicion, 1);
            for (Curso c : colegio.getCursos()) {
                for (Alumno a : c.getListaAlumnos()) {
                    if (a.getNombre().equals(nombreAlumno) && a.getApoderado().getNombre().equals(nombreApoderado)) {
                        VentanaNota ventana = new VentanaNota(a, this);
                        ventana.setVisible(true);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione un alumno", "Error", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_botonNotasActionPerformed

    private void botonAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsistenciaActionPerformed
        int posicion = jTable1.getSelectedRow();
        if (posicion != -1) {
            String nombreAlumno = (String) jTable1.getValueAt(posicion, 0);
            String nombreApoderado = (String) jTable1.getValueAt(posicion, 1);
            for (Curso c : colegio.getCursos()) {
                for (Alumno a : c.getListaAlumnos()) {
                    if (a.getNombre().equals(nombreAlumno) && a.getApoderado().getNombre().equals(nombreApoderado)) {
                        VentanaAsistencia ventana = new VentanaAsistencia(a, this);
                        ventana.setVisible(true);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione un alumno", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAsistenciaActionPerformed

    private void botonAnotacionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnotacionesActionPerformed
        int posicion = jTable1.getSelectedRow();
        if (posicion != -1) {
            String nombreAlumno = (String) jTable1.getValueAt(posicion, 0);
            String nombreApoderado = (String) jTable1.getValueAt(posicion, 1);
            for (Curso c : colegio.getCursos()) {
                for (Alumno a : c.getListaAlumnos()) {
                    if (a.getNombre().equals(nombreAlumno) && a.getApoderado().getNombre().equals(nombreApoderado)) {
                        VentanaAnotaciones ventana = new VentanaAnotaciones(a, this);
                        ventana.setVisible(true);
                        break;
                    }
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Selecione un alumno", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonAnotacionesActionPerformed

    private void botonAsignaturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAsignaturaActionPerformed
        String curso = (String) (jComboBox1.getSelectedItem());
        if (jRadioButton1.isSelected()) {
            curso += "A";
        } else {
            curso += "B";
        }
        for (Curso c : colegio.getCursos()) {
            if (c.getCurso().equals(curso)) {
                VentanaAsignatura ventana = new VentanaAsignatura(c, this);
                ventana.setVisible(true);
                break;
            }
        }
    }//GEN-LAST:event_botonAsignaturaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnotaciones;
    private javax.swing.JButton botonAsignatura;
    private javax.swing.JButton botonAsistencia;
    private javax.swing.JButton botonNotas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

    public void crearListaCurso(Colegio colegio) {
        ArrayList<String> array = new ArrayList<>();
        System.out.println(colegio.getCursos().size());
        for (int i = 0; i < colegio.getCursos().size(); i++) {
            if (!array.contains(colegio.getCursos().get(i).getCurso().split("")[0])) {
                array.add(colegio.getCursos().get(i).getCurso().split("")[0]);
            }
        }
        DefaultComboBoxModel def = new DefaultComboBoxModel(array.toArray());
        jComboBox1.setModel(def);
    }

    private void crearTablaCurso() {
        ((DefaultTableModel) jTable1.getModel()).setRowCount(0);
        String curso = (String) (jComboBox1.getSelectedItem());
        if (jRadioButton1.isSelected()) {
            curso += "A";
        } else {
            curso += "B";
        }
        ArrayList<String> array = new ArrayList<>();
        for (Curso c : colegio.getCursos()) {
            if (c.getCurso().equals(curso)) {
                ArrayList<String> tabla = new ArrayList<>();
                for (Alumno a : c.getListaAlumnos()) {
                    ((DefaultTableModel) jTable1.getModel()).addRow(new String[]{a.getNombre(), a.getApoderado().getNombre()});
                }
            }

        }

    }

    public void listeners() {
        jComboBox1.addActionListener(a -> {
            crearTablaCurso();
        });

        jRadioButton1.addActionListener(a -> {
            crearTablaCurso();
        });
        jRadioButton2.addActionListener(a -> {
            crearTablaCurso();
        });

        this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                vnPr.setVisible(true);
                GuardarDatos guardar = new GuardarDatos();
                try {
                    guardar.parserXML(colegio);
                } catch (IOException ex) {
                    Logger.getLogger(VentanaCurso.class.getName()).log(Level.SEVERE, null, ex);
                }
                VentanaCurso.this.dispose();
            }
        });
    }
}