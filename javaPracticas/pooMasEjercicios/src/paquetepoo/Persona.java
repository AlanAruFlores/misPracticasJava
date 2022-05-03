/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetepoo;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;
    
    public Persona(int dni , String nombre , String apellido , int telefono , String mail)
    {
        this.dni = dni;
        setNombre(nombre);
        setApellido(apellido);
        this.telefono = telefono;
        this.mail = mail;
    }
    public void setNombre(String nombre)
    {
        if(verificarCadena(nombre))
        {
            this.nombre = null;
        }
        else
        {
            this.nombre = nombre;
        }
    }
    public void setApellido(String apellido)
    {
        if(verificarCadena(apellido))
        {
            this.apellido = null;
        }
        else
        {
            this.apellido = apellido;
        }
    }
    private boolean verificarCadena(String cadena)
    {
        return cadena == null || cadena.isBlank() || cadena.isEmpty();
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    @Override
    public String toString(){
        return "NOMBRE: "+nombre+"\nAPELLIDO: "+apellido+"\nTELEFONO: "+telefono+"\nMAIL: "+mail;
    }
    
}
