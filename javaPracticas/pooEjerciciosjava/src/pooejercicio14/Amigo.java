/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio14;

/**
 *
 * @author alang
 */
public class Amigo {
    private String nombre;
    
    public Amigo (String nombre)
    {
        this.nombre = nombre;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    @Override
    public String toString()
    {
        return nombre;
    }
        
}
