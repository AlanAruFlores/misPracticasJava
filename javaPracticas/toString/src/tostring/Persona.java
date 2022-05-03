/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring;

/**
 *
 * @author alang
 */
public class Persona {
    private String nombre;
    private int edad;
    
    public Persona ( String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + '}';
    }
    
}
