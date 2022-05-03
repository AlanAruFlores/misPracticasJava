/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        //Realizar un programa donde se pueda registrar, eliminar, mostrar, salir
        ArrayList<Empleado>empleados = new ArrayList<>();
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    empleados.add(registrarEmpleado());
                    showMessage("REGISTRADO CON EXITO");
                    break;
                }
                case 2:
                {
                    eliminarEmpleado(empleados);
                    break;
                }
                case 3:
                {
                    Main.mostrarEmpleados(empleados);
                    break;
                }
                default:
                {
                    showMessage("SALIENDO");
                }
            }
        }while(opcion != 4);
        
    }
    public static void eliminarEmpleado(ArrayList<Empleado> empleados)
    {
        if(verificarLista(empleados))
        {
            showMessage("NO SE PUEDE ELIMINAR NIGUN EMPLEADO PORQUE NO TIENE REGISTRADO NINGUNO");
        }
        else
        {
            Main.mostrarEmpleados(empleados);
            int id = inputInt("DIGITE EL ID DEL EMPLEADO A ELIMINAR");
            int indice = encontrarIndice(empleados, id);
            if(indice != -1)
            {
               empleados.remove(indice);
               showMessage("ELIMINADO CON EXITO");
            }
        }

    }
    public static int encontrarIndice(ArrayList<Empleado>empleados,int id){
        int indice = -1, cont = empleados.size();
        for (int i = 0; i < cont; i++) {
            if(id == empleados.get(i).getId())
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            showMessage("NO SE ENCONTRO EL MENSAJE");
        }
        return indice;
    }
    public static void mostrarEmpleados(ArrayList<Empleado> empleados)
    {
        if(verificarLista(empleados))
        {
            showMessage("NO REGISTRO NINGUN EMPLEADO");
        }
        else
        {
             for (Empleado empleado : empleados) {
                 System.out.println(empleado);
            }
        }

    }
    private static boolean verificarLista(ArrayList<Empleado>empleados)
    {
        return empleados.isEmpty();
    }
    public static Empleado registrarEmpleado()
    {
        String nombre = inputString("DIGITE EL NOMBRE");
        int edad = inputInt("DIGITE LA EDAD");
        double sueldo = inputDouble("DIGITE EL SUELDO");
        
        return new Empleado(nombre,edad,sueldo);
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR EMPLEADO"
                    + "\n[2]ELIMINAR EMPLEADO"
                    + "\n[3]MOSTRAR EMPLEADOS"
                    + "\n[4]SALIR"));
        }while(opcion< 1 || opcion >4);
        return opcion;
    }
    public static String inputString(String c)
    {
        String cadena = JOptionPane.showInputDialog(c);
        return cadena;
    }
    public static int inputInt(String c)
    {
        int n = Integer.parseInt(JOptionPane.showInputDialog(c));
        return n;
    }
    public static double inputDouble(String c)
    {
        double n = Double.parseDouble(JOptionPane.showInputDialog(c));
        return n;
    }
    public static void showMessage(String c)
    {
        JOptionPane.showMessageDialog(null,c);
    }
}