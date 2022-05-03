/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Sobrecarga;

/**
 *
 * @author alang
 */
public class Persona {
    String nombre;
    int edad;
    String dni;
    
    //Esto se lo conoce como una sobreecarga de Constructores, se diferencian por sus parametros
    public Persona (String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona(String dni) {
        this.dni = dni;
    }
    //Sobreecargaa de Metodos
    public void mostrar()
    {
        System.out.println("Hola soy "+nombre+" y tengo "+edad);
    }
    public void mostrar(int km)
    {
        System.out.println("Dni: "+dni+", km:"+km);
      
    }
    
    
}
