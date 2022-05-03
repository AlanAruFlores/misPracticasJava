/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroEmpleado;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Empleado {
    private int id;
    private String nombre;
    private String level;
    private float sueldo;
    private static int cont = 1;
    
    public Empleado (String nombre, String level, float sueldo)
    {
        this.id = cont;
        this.nombre = nombre;
        this.level = level;
        this.sueldo = sueldo;
        cont++;
    }
    
    public void setId(int id)
    {
        this.id = id;
    }
    public int getId()
    {
        return id;
    }
    
    public void setSueldo(float sueldoIngreso)
    {
        if(verificarSueldo(sueldoIngreso))
        {
            sueldo = sueldoIngreso;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"SUELDO MUY BAJO DEL MINIMO");
        }
        
    }
    
    private boolean verificarSueldo(float sueldoIngreso)
    {
        float sueldoMinimo = 15000.0f;
        boolean verificacion = false;
        if(sueldoMinimo < sueldoIngreso)
        {
             verificacion = true;
        }
        return verificacion;
    }
    public void setLevel(String newlevel)
    {
        level = newlevel;
    }
    public void showEmployeer()
    {
        System.out.println(id+" | "+nombre+" | $"+sueldo);
    }
    
}
