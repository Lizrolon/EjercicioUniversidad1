/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1g4_1.AccesoADatos;

import eje1g4_1.Entidades.Alumno;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Michi
 */
public class AlumnoData {
   private Connection con=null;
  
   public AlumnoData(){
   
       con = Conexion.getConexion();
   
   }
    public void guardarAlumno(Alumno alumno){
    String sql="INSERT INTO alumno(dni,apellido,nombre,fechanacimiento,estado)"
                   + "VALUES(?,?,?,?,?)";
       try {
           
           PreparedStatement ps= con.prepareStatement(sql);
        ps.setInt(1, alumno.getDni());
        ps.setString(2,alumno.getApellido() );
        ps.setString(3,alumno.getNombre());
        ps.setDate(4,Date.valueOf(alumno.getFechaNac()));
        ps.setBoolean(5, alumno.isActivo());
        ps.executeUpdate();
        
        ResultSet rs = ps.getGeneratedKeys();
        
        if(rs.next()){
        
            alumno.setIdAlumno(rs.getInt(1));
          JOptionPane.showMessageDialog(null,"Alumno agregado con éxito");
            
        
        }
         ps.close();  
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null,"Error al acceder a la tabla Alumno"+ex.getMessage());
       }
    }
  public Alumno buscarAlumno(int id){
      
      Alumno alumno = null;
      
      String sql = "SELECT dni,apellido,nombre,fechanacimiento FROM alumno WHERE idAlumno = ? AND estado = 1";
      PreparedStatement ps= null;
  
      try{
      
      ps = con.prepareStatement(sql);
      ps.setInt(1,id);
      
      ResultSet rs = ps.executeQuery();
      if(rs.next()){
          
          alumno = new Alumno();
          alumno.setIdAlumno(id);
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
           Logger.getLogger(AlumnoData.class.getName()).log(Level.SEVERE, null, ex);
       }
  
  return alumno;
  }  
   
  
  public Alumno buscarAlumnoporDni(int dni){
   Alumno alumno = null;
      
      String sql = "SELECT dni,apellido,fechaNacimiento FROM alumno WHERE dni = ? AND estado = 1";
      PreparedStatement ps= null;
  
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
  
  return alumno;
  }  
  
  public List<Alumno> listarAlumno(){
      
      List<Alumno> alumnos = new ArrayList<>();
  try{
      String sql = "SELECT * FROM alumno WHERE estado = 1";
      PreparedStatement ps = con.prepareStatement(sql);
      ResultSet rs = ps.executeQuery();
      
      while(rs.next()){
          Alumno alumno = new Alumno();
         
          alumno.setIdAlumno(rs.getInt("idAlumno"));
          alumno.setDni(rs.getInt("dni"));
          alumno.setApellido(rs.getString("apellido"));
          alumno.setNombre(rs.getString("nombre"));
          alumno.setFechaNac(rs.getDate("fechaNacimiento").toLocalDate());
          alumno.setActivo(rs.getBoolean("estado"));
          alumnos.add(alumno);
      
      }
      ps.close();
  }catch(SQLException ex){
  
      JOptionPane.showMessageDialog(null,"Error al buscar al alumno"+ex.getMessage());
  
  }
  return alumnos;
  }
  public void modificarAlumno(Alumno alumno){
      
      String sql="UPDATE alumno SET dni = ?, apellido = ?, nombre = ?, fechaNacimiento = ? WHERE idAlumno = ? ";
      PreparedStatement ps = null;
       try {
            ps = con.prepareStatement(sql);
           ps.setInt(1, alumno.getDni());
           ps.setString(2, alumno.getApellido());
           ps.setString(3, alumno.getNombre());
           ps.setDate(4, Date.valueOf(alumno.getFechaNac()));
           ps.setInt(5, alumno.getIdAlumno());
           int exito = ps.executeUpdate();
           
           if(exito==1){
           
           JOptionPane.showMessageDialog(null, "Alumno modificado de manera exitosa");
           
           }else{
           
               JOptionPane.showMessageDialog(null, "El Alumno no existe");
           }
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar al ingresar a la tabla alumno");
       }
 
  
  }
  public void eliminarAlumno(int id){
      
      String sql = "UPDATE alumno SET estado=0 WHERE idAlumno=? ";
       try {
           PreparedStatement ps = con.prepareStatement(sql);
           ps.setInt(1, id);
           int fila = ps.executeUpdate();
           
           if(fila ==1){
           
               JOptionPane.showMessageDialog(null, "Se elimino al alumno");
           
           
           }
           ps.close();
           
       } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla Alumno");
       }
      
  
  
  }
  
  }
  
  
  

