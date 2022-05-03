/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio;

/**
 *
 * @author alang
 */
public class Persona {
    private String nombre; 
    private int edad;
    private int minutos;
    private String estado;
    public Persona(String nombre , int edad)
    {
      
        setNombre(nombre);
        setEdad(edad);  
        setMinutos(edad);
        setEstado(edad);    
    }
               
    public void getAll()
    {
        System.out.println(nombre + " | "+edad+" | "+minutos+" | "+estado);
    }
    
    //Nombre
    public void setNombre (String nombre)
    {
        if(verificarNombre(nombre))
        {
            this.nombre= nombre;
        }
        else
        {
            this.nombre = "Anonimo";
        }
    }
    public boolean verificarNombre(String nombre)
    {
        return nombre.length() >0;
    }
    
    //Edad
    public void setEdad(int edad)
    {
        if(verificarEdad(edad))
        {
            this.edad = edad;
        }
    }
    public boolean verificarEdad(int edad)
    {
        return edad > 18;
    }
    //Minutos
    private void setMinutos(int edad)
    {
        if(verificarEdad(edad))
        {
            minutos = (int) Math.random()*10+1;
        }
        
    }
    //Estado
    private void setEstado(int edad)
    {
        if(verificarEdad(edad) == true)
        {
            estado = "PARTICIPANTE";
        }
        else
        {
            estado = "NO PARTICIPA";
        }
    }
    public String getEstado()
    {
        return estado;
    }
}
    