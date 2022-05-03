/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEmpresa;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados;
    
    public Empresa(String nombre, ArrayList<Empleado> empleados)
    {
        this.nombre = nombre;
        this.empleados = new ArrayList<>();
        this.empleados.addAll(empleados);
    }
    
    @Override
    public String toString()
    {
        return nombre+" | "+empleados;
        
    }
    
    
}
