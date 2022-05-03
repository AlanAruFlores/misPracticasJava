/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEmpresa.Main;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import herenciaEmpresa.Empleado;
import herenciaEmpresa.Gerente;
import herenciaEmpresa.Dueño;
import herenciaEmpresa.Departamento;


/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
         int opcion;
         Dueño d = null;
         ArrayList<Empleado> empleados=  new ArrayList<>();
         do
         {
             opcion = ingresarOpcion();
             switch(opcion)
             {
                 case 1:
                 {
                     if(d == null)
                     {
                         d = registrarDueño();
                     }
                     else
                     {
                         JOptionPane.showMessageDialog(null,"SOLO PUEDE HABER 1 DUEÑO");
                     }
                     break;
                 }
                 case 2:
                 {
                     empleados.add(registrarGerente());
                     break;
                 }
                 case 3:
                 {
                     empleados.add(registrarEmpleado());
                     break;
                 }
                 case 4:
                 {
                     JOptionPane.showMessageDialog(null,"SLAIENDO..");
                 }
             }
         }while(opcion != 4);
    }
    public static Dueño registrarDueño()    
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL SUELDO"));
        
        return new Dueño(nombre,edad,sueldo);
    }
    public static Gerente registrarGerente()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL SUELDO"));
        Departamento d = registrarDepartamento();
        
        return new Gerente(nombre, edad, sueldo, d);
    }      
    public static Empleado registrarEmpleado()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL SUELDO"));
        
        return new Empleado(nombre, edad, sueldo);
    }
    private static Departamento registrarDepartamento(){
        Departamento d = null;
        int opcion;

            opcion = ingresarOpcionDepartamento();
            
            switch(opcion)
            {
                case 1:
                {
                    d = Departamento.CONTABILIDAD;
                    break;
                }
                case 2:
                {
                    d = Departamento.PRODUCCCION;
                    break;
                }
                case 3:
                {
                    d = Departamento.RECURSOS_HUMANOS;
                    break;
                }
            }
            return d;
    }
    private static int ingresarOpcionDepartamento()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN DEPARTAMENTO"
                    + "\n[1]"+Departamento.CONTABILIDAD+""
                    + "\n[2]"+Departamento.PRODUCCCION+""
                    + "\n[3]"+Departamento.RECURSOS_HUMANOS)); 
        }while(opcion < 1 || opcion >3);
        return opcion;
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR DUEÑO"
                    + "\n[2]REGISTRAR GERENTE"
                    + "\n[3]EMPLEADO"
                    + "\n[4]SALIR"));
            
        }while(opcion < 1 || opcion >3);
        return opcion;
    }
}
