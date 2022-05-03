/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;

/**
 *
 * @author alang
 */
public class Programador extends Empleado{
    
    private Experiencia experiencia;
    
    public Programador(String nombre, int edad, Experiencia experiencia)
    {
        super(nombre,edad,experiencia.getSueldo());
        this.experiencia = experiencia;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" | EXPERIENCIA: "+experiencia;
    }
}
