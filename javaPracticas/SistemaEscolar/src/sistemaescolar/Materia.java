/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolar;

/**
 *
 * @author alang
 */
public class Materia {
    private String nombre;
    
    public Materia (String nombre)
    {
        this.nombre = nombre.toUpperCase();
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
    
}
