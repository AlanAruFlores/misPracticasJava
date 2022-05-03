/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciicojavaCharly;

/**
 *
 * @author alang
 */
public class Titular {
    private int dni;
    private String nombre;
    private String apellido;
    private int telefono;
    private String mail;
    
    public Titular(int dni, String nombre, String apellido, int telefono, String mail)
    {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
}
