/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaHerencia;

/**
 *
 * @author alang
 */
public class Animal{
    private String nombre;
    private int edad;
    private String colorDePiel;
    private TipoAnimal tipo;
    
   
    public  Animal(String nombre, int edad, String colorDePiel, TipoAnimal tipo){
        this.nombre = nombre;
        this.edad = edad;
        this.colorDePiel = colorDePiel.toUpperCase();
        this.tipo = tipo;
    }
    public TipoAnimal getTipoAnimal()
    {
        return tipo;
    }
    @Override
    public String toString()
    {
        return "NOMBRE DE LA MASCOTA: "+nombre+" | EDAD: "+edad+" AÑOS | "+tipo;
    }
}
