/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author alang
 */
public class Persona {
    //Atributos
    String nombre;
    int edad;
    //Constructor (estos constructores son el unico metodo que no van a llevar ningun retorno de valor ni el void)
    /*
    1ra Forma de hacer un constructor
    public Persona(String _nombre, int _edad)
    {
        nombre = _nombre;
        edad = _edad;
    }
    */
    /*2da Forma*/
    public Persona (String nombre , int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    public void mostrarDatos()
    {
        System.out.println("El nombre es "+nombre);
        System.out.println("La edad es: "+edad);
    }
    
    
}
