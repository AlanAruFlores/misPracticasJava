/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;

/**
 *
 * @author alang
 */
public class Empleado {
    private int id;
    private String nombre;
    private int edad;
    private int dni;
    private String cargo;
    private float sueldo;

    public Empleado(int id, String nombre , int edad, int dni, String cargo, float sueldo)
    {
        this.id = id;
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.cargo = cargo;
        this.sueldo = sueldo;
        
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSueldo() {
        return sueldo;
    }

    public void setSueldo(float sueldo) {
        this.sueldo = sueldo;
    }
    
    
    
}
