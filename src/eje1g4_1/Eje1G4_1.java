
package eje1g4_1;

import eje1g4_1.AccesoADatos.AlumnoData;
import eje1g4_1.AccesoADatos.Conexion;
import eje1g4_1.AccesoADatos.InscripcionData;
import eje1g4_1.AccesoADatos.MateriaData;
import eje1g4_1.Entidades.Alumno;
import eje1g4_1.Entidades.Inscripcion;
import eje1g4_1.Entidades.Materia;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Eje1G4_1 {

   
    public static void main(String[] args)  {
Connection con= Conexion.getConexion();

        /*
       String url= "jdbc:mariadb://localhost:3306/universidadulp1";
       String usuario = "root";
       String pass= "";
       
        try {
            
            PreparedStatement ps1;
            String alumno,alumno2,alumno3;
            String materia,materia2,materia3,materia4,sql;
            String inscriptos;
            ResultSet resultado;
            Class.forName("org.mariadb.jdbc.Driver");
            Connection conexion = DriverManager.getConnection(url,usuario,pass);
            
      /* alumno = "INSERT INTO alumno(dni,apellido,nombre,fechanacimiento,estado)"
               + "VALUES(44689122,'Robledo','Lucia','2002-06-21',true)";
            ps1 = conexion.preparedStatement(alumno);
            ps1.executeUpdate();
            */
      /*  alumno2= "INSERT INTO alumno(dni,apellido,nombre,fechanacimiento,estado)"
                + "VALUES(42689360,'Acosta','Elisa','2003-09-02',true)";
             ps1 = conexion.preparedStatement(alumno2);
             ps1.executeUpdate();
      */
      
       /* alumno3= "INSERT INTO alumno(dni,apellido,nombre,fechanacimiento,estado)"
                 + "VALUES(42786389,'Garcia','Elena','2003-04-23',1)";
             ps1 = conexion.prepareStatement(alumno3);
             ps1.executeUpdate();
            
         */
        
        /*
             materia = "INSERT INTO materia( nombre, año, estado) "
            + "VALUES('Física',1,true)";
             ps1 = conexion.prepareStatement(materia);
             int filas = ps1.executeUpdate();
             if(filas >0){
               JOptionPane.showMessageDialog(null, "La materia se agrego correctamente");
           }
           */
        /*
            materia2 = "INSERT INTO materia( nombre, año, estado)"
           + "VALUES('Informática',1,true)";
             ps1 = conexion.prepareStatement(materia2);
              ps1.executeUpdate();
          */
       /* 
       materia3 = "INSERT INTO materia( nombre, año, estado)"
          + "VALUES('Algoritmos y Programación',2,true)";
           ps1 = conexion.prepareStatement(materia3);
           ps1.executeUpdate();
    */
       /* 
        materia4 = "INSERT INTO materia( nombre, año, estado)"
            + "VALUES('Sistemas Operativos',2,true)";
           ps1 = conexion.prepareStatement(materia4);
           ps1.executeUpdate();
         */
       /*
       inscriptos = "INSERT INTO inscripcion(nota, idAlumno, idMateria)"
               + "VALUES(2,1,3)";
             ps1 = conexion.prepareStatement(inscriptos);
             ps1.executeUpdate();  
       
       
       sql= "Select * from alumno "
               + "join inscripcion on (inscripcion.idAlumno=alumno.idAlumno)"
                //"JOIN materia ON (materia.idMateria = inscripcion.idMateria) +"
               + "where nota >= 8;";
        
       
       ps1 = conexion.prepareStatement(sql);
     resultado =  ps1.executeQuery();
       while(resultado.next()){
          
          System.out.println("Alumno:"+resultado.getString("apellido"));
          System.out.println("Alumno:"+resultado.getString("nombre"));
          System.out.println("Nota:"+resultado.getInt("nota"));
           //System.out.println("Materia:"+resultado.getString("materia"));
           
       }
       
       
        } catch (ClassNotFoundException ex) {
           JOptionPane.showMessageDialog(null,"Error al cargar los Drivers");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de conexión");
        }
        
        
        
    }

//    */
//Alumno juan = new Alumno(4,43593047,"Luna","Juan",LocalDate.of(1990,03,23),true);
//AlumnoData alu= new  AlumnoData();
//InscripcionData ins = new InscripcionData();
//MateriaData matD = new MateriaData();
////alu.guardarAlumno(juan);
// //alu.eliminarAlumno(9);
// Materia mat = new Materia("Matematicas I",1,true);
// 
 //matD.eliminarMateria(5);
 
 //matD.guardarMateria(mat);
 //Materia td = matD.buscarMateria(4);
        //System.out.println(td);

// Alumno juan1 = alu.buscarAlumno(13);
// Materia mate = matD.buscarMateria(1);
 
// Inscripcion in = new Inscripcion(6,juan1,mate);
 
 //ins.actualizarNota(11, 4, 9);
 //ins.guardarInscripcion(in);
 //ins.borrarInscripcionMateriaAlumno(11, 4);
    /*    for(Inscripcion inscripcion:ins.listarInscripciones()){
            System.out.println("Id:"+inscripcion.getIdInscripcion());
            System.out.println("Apellido:"+inscripcion.getAlumno().getApellido());
            System.out.println("Nombre:"+inscripcion.getAlumno().getNombre());
            System.out.println("Materia:"+inscripcion.getMateria().getNombre());
 
        }*/
    
    
      
       
}
}
