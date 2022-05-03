/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio11;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Persona {
    private static int cont = 1;
    private int id;
    private String nombre;
    private int edad;
    private ArrayList<Amigos>amigos;
    
    public Persona(String nombre,int edad)
    {
        this.id = cont;
        this.nombre = nombre;
        this.edad = edad;
        amigos = new ArrayList<>();
        cont++;
    }
    public int getId()
    {
        return id;
    }
    public void setAmigos(Amigos amigo)
    {
        amigos.add(amigo);
    }
    @Override
    public String toString()
    {
        return "ID: "+id+" Nombre "+nombre+" Edad: "+edad+" Amigos: "+amigos;
    }
    
}
