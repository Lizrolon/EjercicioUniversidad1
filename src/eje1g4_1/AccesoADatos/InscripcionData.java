/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1g4_1.AccesoADatos;

import eje1g4_1.Entidades.Alumno;
import eje1g4_1.Entidades.Inscripcion;
import eje1g4_1.Entidades.Materia;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Michi
 */
public class InscripcionData {
    Connection con;
    MateriaData matData = new MateriaData();
    AlumnoData aluData = new AlumnoData();
    public InscripcionData(){
           this.con = Conexion.getConexion();
    }
  
    public void guardarInscripcion(Inscripcion inscripcion){
    
        String sql = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
                + "VALUES(?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getAlumno().getIdAlumno());
            ps.setInt(3, inscripcion.getMateria().getIdMateria());
             ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
            
                inscripcion.setIdInscripcion(rs.getInt(1));
                
            JOptionPane.showMessageDialog(null, "Inscripción realizada con éxito");
                
            }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }

    }
    
    public void actualizarNota(int idAlumno, int idMateria, double nota){
    
        String sql = "UPDATE inscripcion SET nota=? WHERE idAlumno = ? AND idMateria ";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
          int fila=  ps.executeUpdate();
            if(fila>0){
            
                JOptionPane.showMessageDialog(null, "Nota actualizada correctamente");
            
            }
            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al ingresar a la tabla inscripción");
        }
        
        
    
    }
    
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
    
    String sql = "DELETE  FROM inscripcion WHERE idAlumno=? AND idMateria = ? ";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ps.setInt(2, idMateria);
           int filas= ps.executeUpdate();
           
           if(filas>0){
           
               JOptionPane.showMessageDialog(null,"Inscripción eliminada correctamente");
           
           }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al ingresar a la tabla Inscripcion");
        }

    }

    public List<Inscripcion> listarInscripciones(){
        ArrayList<Inscripcion> cursadas = new ArrayList<>();
    
        String sql = "SELECT * FROM inscripcion";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
          while(rs.next()){
              Inscripcion inscripciones = new Inscripcion();
              inscripciones.setIdInscripcion(rs.getInt("idInscripto"));
              Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
              Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
              inscripciones.setNota(rs.getDouble("nota"));
              inscripciones.setAlumno(alu);
              inscripciones.setMateria(mat);
              
          cursadas.add(inscripciones);
          }  
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción"+ex.getMessage());
        }
        
        return cursadas;
    }
    public List<Inscripcion> listarInscripcionesPorAlumno(int id){
    ArrayList<Inscripcion> cursadas = new ArrayList<>();
    
        String sql = "SELECT * FROM inscripcion WHERE idAlumno=?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery(); 
            
          while(rs.next()){
              Inscripcion inscripciones = new Inscripcion();
              inscripciones.setIdInscripcion(rs.getInt("idInscripto"));
              Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
              Alumno alu = aluData.buscarAlumno(rs.getInt("idAlumno"));
              inscripciones.setAlumno(alu);
              inscripciones.setMateria(mat);
              inscripciones.setNota(rs.getDouble("nota"));
          cursadas.add(inscripciones);
          }  
            ps.close();
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Inscripción");
        }
        
        return cursadas;
    }
 
    public List<Materia> obtenerMateriascursadas(int id){
        
        ArrayList<Materia> materias = new ArrayList<>();
        
        
        try {
            String sql = "SELECT inscripcion.idMateria, nombre, año FROM inscripcion, materia WHERE inscripcion.idMateria=materia.idMateria"
                + "AND inscripcion.idAlumno = ?";
        PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
        while(rs.next()){
       Materia materia = new Materia();
        materia.setIdMateria(rs.getInt("idMateria"));
        materia.setNombre(rs.getString("nombre"));
        materia.setAnioMateria(rs.getInt("año"));
        materias.add(materia);
        
        }    
        ps.close();
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones");
        }
        
        
        
       return materias; 
        
    
    }
   
    public List<Materia> materiasNoCursadas(int id){
    ArrayList<Materia> materias = new ArrayList<>();
    
    String sql="SELECT * FROM materia WHERE estado = 1 AND idMateria not in"
            + "(SELECT idMateria FROM inscipcion WHERE idAlumno=?)";
    
     try {
            
        PreparedStatement ps;
            ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            
        while(rs.next()){
       Materia materia = new Materia();
        materia.setIdMateria(rs.getInt("idMateria"));
        materia.setNombre(rs.getString("nombre"));
        materia.setAnioMateria(rs.getInt("año"));
        materias.add(materia);
        
        }    
        ps.close();
            
            
        } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al obtener Inscripciones");
        }
        
    return materias;
    }
   
    public List<Alumno> obtenerAlumnosporMateria(int id){
        
        List<Alumno> alumnosMateria = new ArrayList<>();
        
        String sql = "SELECT a.idAlumno, dni, nombre, apellido, fechanacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria= ? AND a.estado= 1";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
          ResultSet rs = ps.executeQuery();
          while(rs.next()){
          
              Alumno alumno = new Alumno();
              alumno.setIdAlumno(rs.getInt("idAlumno"));
              alumno.setDni(rs.getInt("dni"));
              alumno.setApellido(rs.getString("apellido"));
              alumno.setNombre(rs.getString("nombre"));
              alumno.setFechaNac(rs.getDate("fechanacimiento").toLocalDate());
              alumno.setActivo(rs.getBoolean("estado"));
              alumnosMateria.add(alumno);
   
          }
            ps.close();
            
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al obtener alumnos por materia");
        }
    return alumnosMateria;
    }
    
    
    }
    



