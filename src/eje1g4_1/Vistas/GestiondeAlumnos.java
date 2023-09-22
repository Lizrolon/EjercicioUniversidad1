
package eje1g4_1.Vistas;

<<<<<<< Updated upstream
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import eje1g4_1.AccesoADatos.AlumnoData;
import eje1g4_1.AccesoADatos.Conexion;
import eje1g4_1.Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
=======
import eje1g4_1.AccesoADatos.AlumnoData;
import eje1g4_1.Entidades.Alumno;
import java.sql.Date;
import java.time.LocalDate;
import javax.swing.JOptionPane;
>>>>>>> Stashed changes

/**
 *
 * @author Michi
 */
public class GestiondeAlumnos extends javax.swing.JInternalFrame {
<<<<<<< Updated upstream
  
    

=======
Alumno alu = new Alumno();
AlumnoData aluD = new AlumnoData();
    /**
     * Creates new form Alumno
     */
>>>>>>> Stashed changes
    public GestiondeAlumnos() {
        initComponents();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jInternalFrame1 = new javax.swing.JInternalFrame();
        jPanel1 = new javax.swing.JPanel();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtDoc = new javax.swing.JTextField();
<<<<<<< Updated upstream
        jbuscar = new javax.swing.JButton();
=======
        jbBuscar = new javax.swing.JButton();
>>>>>>> Stashed changes
        jLabel3 = new javax.swing.JLabel();
        jtAp = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jtnom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
<<<<<<< Updated upstream
=======
        jFechaNacimiento = new com.toedter.calendar.JDateChooser();
>>>>>>> Stashed changes
        jbNuevo = new javax.swing.JButton();
        jbEliminar = new javax.swing.JButton();
        jbGuardar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jrEst = new javax.swing.JRadioButton();
        jDate = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();

        jInternalFrame1.setVisible(true);

        javax.swing.GroupLayout jInternalFrame1Layout = new javax.swing.GroupLayout(jInternalFrame1.getContentPane());
        jInternalFrame1.getContentPane().setLayout(jInternalFrame1Layout);
        jInternalFrame1Layout.setHorizontalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jInternalFrame1Layout.setVerticalGroup(
            jInternalFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setText("Alumno");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Documento:");

<<<<<<< Updated upstream
        jbuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbuscar.setText("Buscar");
        jbuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jbuscarMouseClicked(evt);
            }
        });
        jbuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbuscarActionPerformed(evt);
=======
        jbBuscar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
>>>>>>> Stashed changes
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Apellido:");

        jLabel4.setText("Nombre:");

        jLabel5.setText("Estado:");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de Nacimiento:");

        jbNuevo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbNuevo.setText("Nuevo");
        jbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbNuevoActionPerformed(evt);
            }
        });

        jbEliminar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbEliminar.setText("Eliminar");

        jbGuardar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jbGuardar.setText("Guardar");
        jbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGuardarActionPerformed(evt);
            }
        });

<<<<<<< Updated upstream
        jBsalirA.setText("Salir");
        jBsalirA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirAActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Edit");
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);
=======
        jBSalir.setText("Salir");
        jBSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBSalirMouseClicked(evt);
            }
        });
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
>>>>>>> Stashed changes

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addGap(48, 48, 48))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jbNuevo, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(18, 18, 18)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jbEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jbGuardar)
                                .addGap(18, 18, 18)
                                .addComponent(jBSalir))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jtDoc)
                                    .addComponent(jtAp)
                                    .addComponent(jtnom, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE))
                                .addGap(38, 38, 38)
<<<<<<< Updated upstream
                                .addComponent(jbuscar))
                            .addComponent(jrEst)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
=======
                                .addComponent(jbBuscar))
                            .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jrEst))))
>>>>>>> Stashed changes
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtDoc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
<<<<<<< Updated upstream
                    .addComponent(jbuscar))
=======
                    .addComponent(jbBuscar))
>>>>>>> Stashed changes
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtAp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtnom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
<<<<<<< Updated upstream
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jrEst))
                .addGap(18, 18, 18)
=======
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jrEst))
                        .addGap(27, 27, 27)
                        .addComponent(jLabel6))
                    .addComponent(jFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
>>>>>>> Stashed changes
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBsalirA)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbEliminar)
                            .addComponent(jbGuardar)
                            .addComponent(jbNuevo))
<<<<<<< Updated upstream
                        .addGap(0, 129, Short.MAX_VALUE))))
=======
                        .addGap(0, 41, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBSalir)
                        .addGap(27, 27, 27))))
>>>>>>> Stashed changes
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

<<<<<<< Updated upstream
    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
       Connection con=null;
       String  sql="INSERT INTO alumno (dni,apellido,nombre,fechaNacimiento,estado)"
                     + "VALUES (?,?,?,?,?) ";
       try{   
           
          
                       con = Conexion.getConexion();
                      PreparedStatement ps= con.prepareStatement(sql);  
                      ps.setString(1,jtDoc.getText());
                      ps.setString(2,jtAp.getText());
                      ps.setString(3,jtnom.getText());
                      ps.setDate(4,Date.valueOf(jDate.getDateFormatString()));
                      ps.setString(5,jrEst.getText());
                      ps.executeUpdate();
                      limpiar();
                 
             JOptionPane.showMessageDialog(null, "Alumno agregado con exito");
             
             } catch (SQLException ex) {
                     JOptionPane.showMessageDialog(null, "error al agregar nuevo alumno");
                 }
            
       
                
        
        
       
    }//GEN-LAST:event_jbGuardarActionPerformed

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
 jtDoc.setText("");
 jtAp.setText("");
 jtnom.setText("");
 jDate.setDateFormatString("");
 
 
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbuscarActionPerformed
    
  
    }//GEN-LAST:event_jbuscarActionPerformed

    private void jBsalirAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirAActionPerformed
      System.exit(0); 
    }//GEN-LAST:event_jBsalirAActionPerformed

    private void jbuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jbuscarMouseClicked
  Alumno alumno = null;
        int dni= Integer.parseInt(jtDoc.getText());
        
    
      String sql = "SELECT dni,apellido,fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
      PreparedStatement ps= null;
  Connection con=null;
      try{
      
      ps = con.prepareStatement(sql);
      ps.setInt(1,dni);
      
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          
          alumno = new Alumno();
          alumno.setIdAlumno(dni);
          alumno.setDni(rs.getInt("dni"));
          alumno.setApellido(rs.getString("apellido"));
          alumno.setNombre(rs.getString("nombre"));
          alumno.setFechaNac(rs.getDate("fechanacimiento").toLocalDate());
          alumno.setActivo(true);
      }else{
      
          JOptionPane.showMessageDialog(null,"No se encuentra ese alumno en la Base de Datos");
      
      }
        ps.close();
      } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al intentar acceder a la tabla alumnos");
       }
  
    }//GEN-LAST:event_jbuscarMouseClicked
public void limpiar(){
 jtDoc.setText("");
 jtAp.setText("");
 jtnom.setText("");
 jDate.setDateFormatString("");
 jrEst.setText("");
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBsalirA;
    private com.toedter.calendar.JDateChooser jDate;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JInternalFrame jInternalFrame1;
=======
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBSalirMouseClicked
        this.dispose();
    }//GEN-LAST:event_jBSalirMouseClicked

    private void jbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbNuevoActionPerformed
        
    }//GEN-LAST:event_jbNuevoActionPerformed

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        int docu = Integer.parseInt(jtDoc.getText());
        Alumno alum = aluD.buscarAlumno(docu);
        if(alum==null){
        
        JOptionPane.showMessageDialog(this,"El documento ingresado no se encuentra en la base de datos");
        
        
        }else{
        jrEst.setEnabled(alum.isActivo());
        jtAp.setText(alum.getApellido());
        jtnom.setText(alum.getNombre());
        jFechaNacimiento.setDate(Date.valueOf(alum.getFechaNac()));
        }
  
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGuardarActionPerformed
        int docu = Integer.parseInt(jtDoc.getText());
        String ape = jtAp.getText();
        String nom = jtnom.getText();  
        String fechaN = jFechaNacimiento.getDateFormatString();
        boolean act =  jrEst.isSelected();
        alu.setDni(docu);
        alu.setNombre(nom);
        alu.setFechaNac(LocalDate.parse(fechaN));
        alu.setApellido(ape);
        alu.setActivo(act);
        aluD.guardarAlumno(alu);
    }//GEN-LAST:event_jbGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBSalir;
    private com.toedter.calendar.JDateChooser jFechaNacimiento;
>>>>>>> Stashed changes
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
<<<<<<< Updated upstream
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
    private javax.swing.JButton jbuscar;
=======
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbEliminar;
    private javax.swing.JButton jbGuardar;
    private javax.swing.JButton jbNuevo;
>>>>>>> Stashed changes
    private javax.swing.JRadioButton jrEst;
    private javax.swing.JTextField jtAp;
    private javax.swing.JTextField jtDoc;
    private javax.swing.JTextField jtnom;
    // End of variables declaration//GEN-END:variables
}


