/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio14;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Persona {
    private int dni;
    private String nombre;
    private int edad;
    private ArrayList <Amigo> amigos ;
    private Pais nacionalidad;
    
    public Persona(int dni, String nomrbe, int edad, Pais nacionalidad)
    {
        this.nombre = nombre;
        this.edad= edad;
        amigos = new ArrayList<>();
        this.nacionalidad = nacionalidad;
        
    }
    public int getDni()
    {
        return dni;
    }
    public void setAmigo(Amigo amigo)
    {
        amigos.add(amigo);
    }
    @Override
    public String toString()
    {
        return dni+" | "+nombre+" | "+edad+" | "+amigos;
    }
}
