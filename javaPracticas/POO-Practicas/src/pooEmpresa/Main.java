/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEmpresa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        ArrayList<Empresa> empresas=  new ArrayList<Empresa>();
        int opcion;
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]INGRESAR UNA EMPRESA"
                + "\n[2]MOSTRAR EMPRESAS"
                    + "\n[3] SALIR"));
        
            switch(opcion)
            {
                case 1:
                {
                    empresas.add(añadirEmpresa());
                    break;
                }
                case 2:
                {
                    if(empresas.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY NINGUNA EMPRESA INGRESADA");
                    }
                    else
                    {
                        System.out.println(empresas); 
                    }
                    break;
                }
                case 3:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO...");break;
                }
                default:
                    JOptionPane.showMessageDialog(null,"ERROR");
            }
        }while(opcion != 3);

                
    }
    static Empresa añadirEmpresa()
    {
        ArrayList<Empleado> empleados = new ArrayList<>();
       String nombreEmpresa;
       nombreEmpresa= JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA EMPRESA");
       empleados.addAll(ingresarEmpleados());
       
       return new Empresa(nombreEmpresa, empleados);
       
       
    }
    static ArrayList<Empleado> ingresarEmpleados()
    {
        ArrayList<Empleado> empleados = new ArrayList<Empleado>();
        String nombre;
        int nElementos;
        
        nElementos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NUMERO DE LEMENTOS A INGRESAR"));
        for (int i = 0; i < nElementos; i++) {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE "+(i+1));
            empleados.add(new Empleado (nombre));
        }
        return empleados;
    }
}
