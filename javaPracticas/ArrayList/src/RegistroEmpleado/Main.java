/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroEmpleado;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main (String [] args)
    {
        ArrayList <Empleado> arrayEmployeers =  new ArrayList <Empleado>();
        Scanner entrada = new Scanner(System.in);
        
        byte opcion;
        int cont, delete;
        boolean exit = false;
        int changeSueldo;
        
        
        do
        {
            opcion = Class.selectOption();
            switch(opcion)
            {
                case 1:    
                {
                    arrayEmployeers.addAll(Class.addEmployeers());
                    break;
                }
                case 2:
                {
                    Class.showAll(arrayEmployeers);
                    cont = arrayEmployeers.size();
                    if (cont !=0)
                    {
                        delete = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL EMPLEADO"));
                        Class.deleteEmployeer(delete, arrayEmployeers);
                        Class.setIds(arrayEmployeers);
                    }
                    break;   
                }
                case 3:
                {
                    Class.showAll(arrayEmployeers);break;
                }
                case 4:
                {
                    changeSueldo = Integer.parseInt(
                    JOptionPane.showInputDialog("DIGITE EL ID DEL EMPLEADO A CAMBIAR"));
                    Class.changeDinero(changeSueldo, arrayEmployeers);
                    break;   
                }
                case 5:
                {
                    exit = true;
                }
            }
        }while ( exit != true);
    
          
    }
}
