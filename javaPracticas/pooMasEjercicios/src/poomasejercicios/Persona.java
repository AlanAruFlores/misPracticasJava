/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poomasejercicios;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Persona {
    private String nombre;
    private int edad;
    private Pais nacionalidad;
    private ArrayList<Amigo> amigos;
    
    public Persona(String nombre , int edad, Pais nacionalidad){
        this.nombre = nombre;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        amigos = new ArrayList<Amigo>();
    }
    public Persona(String nombre,int edad)
    {
        this(nombre,edad,null);
    }
    
    
    public void setAmigo(Amigo amigo)
    {
        amigos.add(amigo);
    }
    public Pais getNacionalidad()
    {
        return nacionalidad;
    }
    public void mostrarPersona()
    {
        System.out.println(nombre+" | "+edad+" | "+nacionalidad+" | AMIGOS: "+amigos);
    }
}
