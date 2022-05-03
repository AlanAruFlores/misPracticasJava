/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio2;

/**
 *
 * @author alang
 */
public class Cuenta {
    private String nombre;
    private int edad;
    private String nacionalidad;
    
    public Cuenta( String nombre, int edad, String nacionalidad)
    {
        setNombre(nombre);
        this.edad = edad;
        this.nacionalidad = nacionalidad;
    }
    public Cuenta ( String invitado)
    {
        this(invitado,0,null);
    }
    public String getNombre()
    {
        return nombre;
    }
    private boolean verificar()
    {
        return getNombre() != null;
    }
    public void setNombre (String nombre)
    {
        if(verificar())
        {
            this.nombre = nombre;
        }
        else
        {
            this.nombre = "INVITADO";
        }
    }
    public void mostrarDatos()
    {
        if(verificar())
        {
            System.out.println("CUENTA");
            System.out.println(" | "+nombre+" | "+edad+" | "+nacionalidad);
        }
        else
        {
            System.out.println("INVITADO");
            System.out.println(" | "+nombre+ " | - | -");
        }
    }
    
    
}
