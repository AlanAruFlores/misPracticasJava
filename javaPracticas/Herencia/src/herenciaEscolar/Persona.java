/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEscolar;

/**
 *
 * @author alang
 */
public class Persona {
    protected String nombre;
    protected String apellido;
    protected int edad;
    
    public Persona(String nombre ,String apellido , int edad)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        setEdad(edad);
    }
    public void setEdad(int edad)
    {
        if(verificarEdad(edad))
        {
            this.edad = 10;
        }
        else
        {
            this.edad = edad;
        }
    }
    private boolean verificarEdad(int edad)
    {
        return edad <=0;
    }
}
