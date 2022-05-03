/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constantes;

/**
 *
 * @author alang
 */
public class Persona {
    //Definimos atributos
    private final String nombre;//Atributo constante ya que una persona no puede cambiar su nombre
    private int edad;//Atributo normal ya que la edad si se puede cambiar
    
    //Constructor, es decir, asignamos valores a los atributos de la clase
    public Persona(String nombre , int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    /*
    Nos saltara error ya que no se puede cambiarle el nombre a un atributo constante
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public String getNombre()
    {
        return nombre;
    }
    */
    
    //Podemos establecer una nueva edad porque no es constante
    public void setEdad(int edad)
    {
        this.edad = edad;
    }
    //Retornar la nueva edad
    public int getEdad()
    {
        return edad;
    }
    //Metodo para mostrar datos de la persona
        public void mostrarDatos()
    {
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
    }
}
