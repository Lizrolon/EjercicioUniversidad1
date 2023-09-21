
package eje1g4_1.Vistas;

import eje1g4_1.AccesoADatos.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;


public class MenuPrincipal extends javax.swing.JFrame {
    Conexion con=new Conexion();
    DefaultTableModel modelo;
    Statement st;
    ResultSet rs;
   
    
    
    public MenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);// centralizar pantalla
       
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jmFormularioAlumno = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jmFormularioMateria = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jmManejoInscripciones = new javax.swing.JMenuItem();
        jmManipulacionNotas = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jmAlumnosporMateria = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenu1.setText("Alumno");

        jmFormularioAlumno.setText("Formulario de Alumno");
        jmFormularioAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioAlumnoActionPerformed(evt);
            }
        });
        jMenu1.add(jmFormularioAlumno);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Materia");

        jmFormularioMateria.setText("Formulario de Materia");
        jmFormularioMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmFormularioMateriaActionPerformed(evt);
            }
        });
        jMenu2.add(jmFormularioMateria);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("Administración");

        jmManejoInscripciones.setText("Manejo de Inscripciones");
        jmManejoInscripciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManejoInscripcionesActionPerformed(evt);
            }
        });
        jMenu5.add(jmManejoInscripciones);

        jmManipulacionNotas.setText("Manipulación de notas");
        jmManipulacionNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmManipulacionNotasActionPerformed(evt);
            }
        });
        jMenu5.add(jmManipulacionNotas);

        jMenuBar1.add(jMenu5);

        jMenu6.setText("Consultas");

        jmAlumnosporMateria.setText("Alumnos por Materia");
        jmAlumnosporMateria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmAlumnosporMateriaActionPerformed(evt);
            }
        });
        jMenu6.add(jmAlumnosporMateria);

        jMenuBar1.add(jMenu6);

        jMenu7.setText("Salir");
        jMenuBar1.add(jMenu7);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmFormularioAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioAlumnoActionPerformed
      
      Escritorio.removeAll();
      Escritorio.repaint();
      GestiondeAlumnos ga = new GestiondeAlumnos();
      ga.setVisible(true);
      Escritorio.add(ga);
      Escritorio.moveToFront(ga);
    }//GEN-LAST:event_jmFormularioAlumnoActionPerformed

    private void jmFormularioMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmFormularioMateriaActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        
        Materia mat = new Materia();
        mat.setVisible(true);
        Escritorio.add(mat);
        Escritorio.moveToFront(mat);
        
        
        
    }//GEN-LAST:event_jmFormularioMateriaActionPerformed

    private void jmManejoInscripcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManejoInscripcionesActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        
        Inscripciones ins = new Inscripciones();
        ins.setVisible(true);
        Escritorio.add(ins);
        Escritorio.moveToFront(ins);
   
    }//GEN-LAST:event_jmManejoInscripcionesActionPerformed

    private void jmManipulacionNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmManipulacionNotasActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        
        ActualizaciondeNotas acn = new ActualizaciondeNotas();
        acn.setVisible(true);
        Escritorio.add(acn);
        Escritorio.moveToFront(acn);
    }//GEN-LAST:event_jmManipulacionNotasActionPerformed

    private void jmAlumnosporMateriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmAlumnosporMateriaActionPerformed
       
        Escritorio.removeAll();
        Escritorio.repaint();
        
        ConsultadeAlumnosporMateria cam = new ConsultadeAlumnosporMateria();
        cam.setVisible(true);
        Escritorio.add(cam);
        Escritorio.moveToFront(cam);
        
    }//GEN-LAST:event_jmAlumnosporMateriaActionPerformed

    
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem jmAlumnosporMateria;
    private javax.swing.JMenuItem jmFormularioAlumno;
    private javax.swing.JMenuItem jmFormularioMateria;
    private javax.swing.JMenuItem jmManejoInscripciones;
    private javax.swing.JMenuItem jmManipulacionNotas;
    // End of variables declaration//GEN-END:variables

    
       
        
    
}
