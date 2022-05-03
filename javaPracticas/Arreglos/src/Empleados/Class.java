/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    
    public int contEmpleados()
    {
        int cont = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de empleados del arreglo"));
 
        
        while ( cont < 0)
        {
            cont = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nIngrese la cantidad de empleados"));
        }
        
        return cont;
    }
    public int inputEmpleados(int i )
    {
        int empleado = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el empleado "+(i+1)));
        
        return empleado;
    }
    public byte errorOption()
    {
        byte opcion;
        do
        {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("Digite que opcion desea realizar"
                        + "\n[1]Ingresar Empleados"
                        + "\n[2]Ver empleados"
                    + "\n[3]Salir"));
            if(opcion < 1 || opcion >2)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }while(opcion < 1 || opcion >2);
        return opcion; 
    }
}
