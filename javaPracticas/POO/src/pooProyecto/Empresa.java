/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Empresa {
    private String nombre;
    private ArrayList<Empleado> empleados; 
    private Domicilio domicilio;
    
    public Empresa(String nombre, Domicilio domicilio)
    {
        this.nombre = nombre;
        this.domicilio = domicilio;
        empleados = new ArrayList<>();
    }
    
    public void setEmpleado(Empleado empleado)
    {
        this.empleados.add(empleado);
    }
           
    public void mostrarEmpleados()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN EMPLEADO REGISTRADO");
        }
        else
        {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
    public void mostrarTipoEmpleado(int opcion)
    {
        if(opcion  == 1)
        {
            System.out.println("DISEÑADORES:");
            for(Empleado empleado: empleados) {
                if(empleado instanceof DiseñadorGrafico)
                {
                    System.out.println(empleado);
                }
            }
        }
        else 
        {
            System.out.println("PROGRAMADORES: ");
            for (Empleado empleado : empleados) {
                if(empleado instanceof Programador)
                {
                    System.out.println(empleado);
                }
            }
        }
    }
    private boolean verificarLista()
    {
        return empleados.isEmpty();
    }
    
    @Override
    public String toString()
    {
        return "EMPRESA: "+nombre+" | Domicilio: "+domicilio;
    }
}
