/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;

/**
 *
 * @author alang
 */
public class Persona {
    private String nombre; 
    private int edad;
    private Pais pais;
    
    public Persona(String nombre, int edad, Pais pais)
    {
        this.nombre = nombre;
        this.edad= edad;
        this.pais = pais;
    }
    
    public Pais getPais()
    {
        return pais;
    }
    
    @Override
    public String toString()
    {
        return  nombre+" | "+edad+" | "+pais;
    }
    
}
