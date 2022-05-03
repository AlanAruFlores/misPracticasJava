/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;

/**
 *
 * @author alang
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;
    
    public Empleado(String nombre, int edad, double sueldo)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }
    
    @Override 
    public String toString()
    {
        return nombre+" | EDAD: "+edad+" | SUELDO: $"+sueldo;
    }
}
