/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio;

/**
 *
 * @author alang
 */
public class Programador {
    private int dni;
    private String nombre; 
    private String apellido;
    private String universitario;
    private double sueldo;
    
    
    public Programador(int dni , String nombre , String apellido, String universitario)
    {
        setDni(dni);
        setNombre(nombre);
        setApellido(apellido);
        setUniversitario(universitario);
        setSueldo();
    }
    public Programador(int dni, String nombre, String apellido)
    {
        this(dni,nombre,apellido,null);
    }
    
    //Datos Personales
    private void setDni (int dni)
    {
        this.dni = dni;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setApellido(String apellido)
    {
        this.apellido = apellido;
    }
    //Universidad
    public void setUniversitario(String universitario)
    {
        this.universitario = universitario;
    }
    public String getUniversitario()
    {
        return universitario;
    }
    //Verificacion
    private boolean verificar()
    {
        return getUniversitario() != null;
    }
    private void setSueldo()
    {
        double porcentaje, sueldoNeto = 5000;
        if(verificar()==true)
        {
            this.sueldo = sueldoNeto;
        }
        else
        {
            porcentaje = (5*5000)/100;
            this.sueldo = sueldoNeto-porcentaje;
        }
    }
    //Mostrar Datos
    public void mostrarDatos()
    {
        if(universitario != null)
        {
            System.out.println("UNIVERSITARIO");
            System.out.println("|"+nombre+"|"+apellido+"|"+universitario+"|"+sueldo);
        }
        else
        {
            System.out.println("NO UNIVERSITARIO");
            System.out.println("|"+nombre+"|"+apellido+"|"+sueldo);
        }
    }
    
    
    
    
    
    
    
    
    
}
