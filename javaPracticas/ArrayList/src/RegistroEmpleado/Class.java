/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RegistroEmpleado;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Class {
    public static byte selectOption()
    {
        byte opcion=0;
        Scanner entrada = new Scanner (System.in);
        do
        {
            System.out.println("DIGITE LA OPCION:"
                + "\n[1]DIGITAR EMPLEADOS"
                + "\n[2]BORRAR EMPLEADO"
                + "\n[3]MOSTRAR EMPLEADOS"
                + "\n[4]MODIFICAR SUELDO"
                + "\n[5]SALIR");
            opcion = entrada.nextByte();
            if(opcion < 1 || opcion >5)
            {
                JOptionPane.showMessageDialog(null,"ERROR\nDIGITE NUEVAMENTE");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"OPCION EXITOSA");
            }
        }while(opcion < 1 || opcion >5);   
        return opcion;
    }
    public static ArrayList<Empleado> addEmployeers()
    {
        ArrayList <Empleado> array = new ArrayList <Empleado>();
        String nombre, level;
        float sueldo;
        int inputEmployeers;
        
        do
        {
            inputEmployeers  = Integer.parseInt ( JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE EMPLEADOS"));
        }while (inputEmployeers <= 0);
        
        for (int i = 0; i < inputEmployeers; i++) {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
            level = JOptionPane.showInputDialog("DIGITE EL NIVEL DEL EMPLEADO");
            sueldo =Float.parseFloat(JOptionPane.showInputDialog("DIGITE SU SUELDO"));
            array.add(new Empleado(nombre,level,sueldo));
        }
        return array;
    }
    
    public static void showAll(ArrayList<Empleado>arrayEmployeers)
    {
        int cont = arrayEmployeers.size();
        if(cont == 0)
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN EMPLEADO");
        }
        else
        {
            for (int i = 0; i < cont; i++) {
                arrayEmployeers.get(i).showEmployeer();
            }
        }
    }
    
    public static void deleteEmployeer(int delete, ArrayList <Empleado> arrayEmployeer)
    {
        
        int cont = arrayEmployeer.size();
        boolean employeer = false;
        
        for (int i = 0; i < cont; i++) {
            if(delete == arrayEmployeer.get(i).getId())
            {
                arrayEmployeer.remove(i);
                employeer = true;
            }
        }
        
        if(employeer != true)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO AL EMPLEADO");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"EMPLEADO ENCONTRADO");
        }
    }
    
    public static void changeDinero(int changeSueldo, ArrayList <Empleado> array)
    {
        int cont = array.size();
        float newSueldo;
        for (int i = 0; i < cont; i++) {
            if(array.get(i).getId() == changeSueldo)
            {
                newSueldo = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL NUEVO SUELDO"));
                array.get(i).setSueldo(newSueldo);
            }
        }
    }
    
    public static void setIds(ArrayList <Empleado> array)
    {
        int cont =array.size(),id = 1;
        
        for (int i = 0; i < cont; i++) {
            array.get(i).setId(id);
            id++;
        }
 
        
    }
    
}
