/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPracticaaa;

/**
 *
 * @author alang
 */
public abstract class Mascota {
    
    private String nombre;
    private int edad;
    
    public Mascota(String nombre, int edad)
    {
        this.nombre = nombre;
        this.edad = edad;
    }
    
    public abstract void alimentarse();
    
    @Override
    public String toString()
    {
        return nombre+" | "+edad;
    }
}
