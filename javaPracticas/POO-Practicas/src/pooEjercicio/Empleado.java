/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio;

/**
 *
 * @author alang
 */
public class Empleado {
    //Atributos
    private static int cont=0;
    private int id;
    private String nombre ;
    private int edad;
    private double sueldo;
    
    
    //Metodos
    public Empleado(String nombre, int edad, double sueldo)
    {
        Empleado.cont++;
        this.id = Empleado.cont;
        this.nombre = nombre;
        this.edad = edad;        
        this.sueldo = sueldo;
    }
    public int getId()
    {
        return  id;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    @Override
    public String toString()
    {
        return id+" | "+nombre+"  | "+edad+" | "+sueldo;
    }
}
