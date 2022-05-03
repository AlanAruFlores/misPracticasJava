/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaFutbol.Entidades;

/**
 *
 * @author alang
 */
public abstract class Persona {
    private int id;
    private static int cont;
    private String nombre;
    private String apellido;
    private int edad;
    private TipoPersona tipo;
    public Persona(String nombre, String apellido, int edad, TipoPersona tipo)
    {
        Persona.cont++;
        this.id = Persona.cont;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.tipo = tipo;
    }
    public int getId()
    {
        return id;
    }
    public TipoPersona getTipo()
    {
        return tipo;
    }
    
    @Override 
    public String toString()
    {
        return "ID: "+id+" | "+nombre+" | "+apellido+" | "+edad;
    }
}
