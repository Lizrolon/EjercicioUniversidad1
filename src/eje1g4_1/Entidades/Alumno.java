/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eje1g4_1.Entidades;

import java.time.LocalDate;

/**
 *
 * @author Michi
 */
public class Alumno {
    int idAlumno;
    int dni;
    String apellido;
    String nombre;
    LocalDate fechaNac;
    boolean activo;
    
    public Alumno(){}
    
    
    public Alumno(int idAlumno,int dni, String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        
        this.idAlumno = idAlumno;
        this.dni=dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
        
    }

    public Alumno(int dni,String apellido, String nombre, LocalDate fechaNac, boolean activo) {
        this.dni=dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.fechaNac = fechaNac;
        this.activo = activo;
        
    }

    public int getIdAlumno() {
        return idAlumno;
    }

    public void setIdAlumno(int idAlumno) {
        this.idAlumno = idAlumno;
    }
 public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }
    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

   

    @Override
    public String toString() {
        return "Alumno{" + "idAlumno=" + idAlumno + ", Apellido=" + apellido + ", Nombre=" + nombre + ", Fecha de Nacimiento=" + fechaNac + ", Activo=" + activo + ", Dni=" + dni + '}';
    }
  
    
}
