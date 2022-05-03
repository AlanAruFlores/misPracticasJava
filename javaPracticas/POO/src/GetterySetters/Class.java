/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetterySetters;

/**
 *
 * @author alang
 */
public class Class {
    /*Encapsulamiento nos sirve para ocultar informacion o datos para que esta no sea manupulada por otros ( metodos ) 
    Esta puede ser utilizada solamente por la misma clase, Ejemplo:*/
    private int edad;//Solamente podra ser utilizada por metodos de la misma clase
    private final String nombre;
    
    //Setters y Getters, consisten en establecer un dato a un atributo y mostrarla o enviarla
    //Aca establecemos un valor aa nuestro atributo edad
    
    public Class(String nombre)
    {
        this.nombre = nombre;
    }
    
    public void setEdad (int edad)
    {
        this.edad = edad;//Aca le añadimos un valor a nuestro atributo edad.
    }
    //Aca retornamos o enviamos el valor del atributo edad
    public int getEdad ()
    {
        return edad;//enviamos el valor edad
    }
    /*
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
      */  
    public String getNombre() {
        return nombre;
    }


    
    
}
