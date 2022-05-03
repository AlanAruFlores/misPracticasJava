/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructorysetters;

/**
 *
 * @author alang
 */
public class Persona {
    private int id;
    private String nombre; 
    private int dni;
    private int edad;
    private int año_nacimiento;
    
    public Persona (String nombre, int dni, int año_nacimiento)
    {
        setId(0); 
        setNombre(nombre);
        setDni(dni);
        setEdad(año_nacimiento);
        this.año_nacimiento = año_nacimiento;
    }
    
    public void showPerson()
    {
        System.out.println(id+" | "+nombre+" | "+dni+" | "+edad+" | "+año_nacimiento);
    }
    
    private void setId(int id)
    {
        if(id == 0)
        {
            this.id = ((int) Math.random()*10+1);
        }
    }
    public int getId()
    {
        return id;
    }
    
    public void setNombre(String nombre)
    {
        if(verificarNombre(nombre))
        {
            this.nombre = nombre;
        }
        else
        {
            this.nombre = "Unnamed";
        }
    }
    private boolean verificarNombre(String nombre)
    {
        return nombre != null || nombre != "";
    }
    
    public void setDni(int dni)
    {
        if(dni <45000000 || dni >46000000)
        {
            this.dni = 0;
        }
        else
        {
            this.dni = dni;
        }
    
    }
    public void setEdad(int f_nacimiento)
    {
        int contEdad=1;
        if(verificarFecha(f_nacimiento))
        {
            contEdad = 2021 - f_nacimiento;
        
            this.edad = contEdad;
        }

    }
    private boolean verificarFecha (int f_nacimiento)
    {  
        return f_nacimiento <= 2021;
    }
    
}
