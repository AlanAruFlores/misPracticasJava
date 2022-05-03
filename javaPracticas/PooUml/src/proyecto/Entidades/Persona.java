/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Entidades;

/**
 *
 * @author alang
 */
public abstract class Persona {
    private int dni;
    private String nombre; 
    private int edad;
    private Estado estado; //null
    
    
    public Persona(int dni, String nombre, int edad, Estado estado)
    {
        this.dni = dni;
        this.nombre  = nombre;
        this.edad = edad;
        this.estado = estado;
    }
    
    public abstract void mostrarDireccion();
    
    @Override
    public String toString()
    {
        return "DNI: "+dni+" | NOMBRE: "+nombre+" | EDAD: "+edad+"| ESTADO : "+estado;
    }
}
