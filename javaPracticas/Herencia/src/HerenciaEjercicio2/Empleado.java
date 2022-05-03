/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio2;

/**
 *
 * @author alang
 */
public class Empleado {
    private int id;
    private static int cont = 0;
    private String nombre;
    private int edad;
    private double sueldo;
    private Dni dni;
    
    public Empleado(String nombre, int edad,double sueldo, Dni dni)
    {
        Empleado.cont++;
        this.id = Empleado.cont;
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
        this.dni = dni;
    }
    public int getId()
    {
        return id;
    }
    
    @Override
    public String toString()
    {
        return nombre+" | ID:"+id+" | "+edad+" | SUELDO: $"+sueldo+"\n"+dni;
    }
}
