/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecarga;

/**
 *
 * @author alang
 */
public class Persona {
    private String nombre;
    private String nombre2;
    private String apellido;
    
    public Persona(String nombre, String nombre2, String apellido)
    {
        this.nombre = nombre;
        this.nombre2 = nombre2;
        this.apellido = apellido;
    }
    /*
    Sin THIS
    public Persona(String nombre, String apellido){
        this.nombre = nombre;
        this.nombre2 = null;
        this.apellido = apellido;
    }
    */
    //THIS --> Nos va a ayudar a reducir la linea de codigo
    public Persona(String nombre ,String apellido)
    {
        this(nombre,null,apellido);//En esta linea estamos pasando argumentos al otro Constructor
    }
    
    public void mostrarDatos()
    {
        System.out.println(nombre+" "+nombre2+" "+apellido);
    }
    
    
    
}
