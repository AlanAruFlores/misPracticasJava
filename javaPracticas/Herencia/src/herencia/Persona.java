/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alang
 */
public class Persona {
    private String nombre;
    private String apellido;
    
    public Persona(String nombre,  String apellido)
    {
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    public String toString()
    {
        return nombre +" | "+ apellido;
    }
}
