/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEscuela;
import herenciaEscuela.Principal.Rango;
/**
 *
 * @author alang
 */
public class Trabajador {
    private String nombre;
    private int edad;
    private Rango rango;
    public Trabajador(String nombre, int edad, Rango rango)
    {
       setNombre(nombre);
       this.edad = edad;
       this.rango = rango;
    }
    public void setNombre(String nombre)
    {
        if(verificarNombre(nombre))
        {
            this.nombre = "Anonimo";
        }
        else
        {
            this.nombre = nombre;
        }
        
    }
    private boolean verificarNombre(String nombre)
    {
        return nombre.isBlank() || nombre.isEmpty() || nombre == null;
    }
    public String toString()
    {
        return nombre+" | "+edad+" | "+rango;
    }
}
