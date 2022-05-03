/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEmpresa;

/**
 *
 * @author alang
 */
public class Empleado {
    private String nombre;
    private int edad;
    private double sueldo;
    
    
    public Empleado(String nombre , int edad, double sueldo)
    {
        setNombre(nombre);
        this.edad = edad;
        setSueldo(sueldo);
    }
    public void setSueldo(double sueldo)
    {
        if(verificarSueldo(sueldo))
        {
            this.sueldo = 1000;
        }
        else
        {
            this.sueldo = sueldo;
        }
    }
    private boolean verificarSueldo(double sueldo)
    {
        return sueldo < 1000;
    }
    public void setNombre(String nombre)
    {
        if(verificarNombre(nombre))
        {
            this.nombre = "ANONIMO";
        }
        else
        {
            this.nombre = nombre;
        }
    }
    private boolean verificarNombre(String nombre)
    {
        return nombre == null || nombre.isBlank() || nombre.isEmpty();
    }
    
    public void realizarFuncion()
    {
        System.out.println("ESTOY TRABAJANDO");
    }
    @Override
    public String toString()
    {
        return "NOMBRE : "+nombre+" | EDAD: "+edad+" | SUELDO : $"+sueldo;
    }
    
}
