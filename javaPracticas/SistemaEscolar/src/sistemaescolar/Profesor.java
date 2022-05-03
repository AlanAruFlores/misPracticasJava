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
public class Profesor {
    private int dni;
    private String nombre;
    private int edad;
    
    public Profesor(int dni, String nombre, int edad)
    {
       this.dni = dni;
       this.nombre = nombre;
       this.edad = edad;
    }
    
    public int getDni()
    {
        return dni;
    }
    @Override
    public String toString()
    {
        return dni+" "+nombre+" "+edad;
    }
}
