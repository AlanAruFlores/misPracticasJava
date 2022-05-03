/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Class {
    public static Producto rellenarProducto(int i)
    {
        int nElements;
        String nombre,tipo="";
        
        Producto producto;
        
        float precio;
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PRODUCTO N°"+(i+1));
        tipo = ingresarTipo(tipo,i);
        precio = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL PRECIO DEL PRODUCTO N°"+(i+1)));
        
        
        producto = new Producto (nombre,tipo,precio);
        
        return producto;
    }
    public static String ingresarTipo(String tipo, int i)
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL TIPO DEL PRODUCTO N°"+(i+1)+
                        "\n[1]CARNE"
                        + "\n[2]LACTEO"));    
        }while(opcion  <  1 || opcion > 2);
        if(opcion == 1)
        {
            tipo = "CARNE";
        }
        else
        {
            tipo = "LACTEO";
        }
        
        return tipo;
    }
    public static void rellenarArrayCorrecto()
    {
        
    }
    public static void mostrarCarnes(int contCarne, ArrayList<Producto> arrayCarne) 
    {
        System.out.println("SECCION DE CARNES");
        for (int i = 0; i < contCarne; i++) {
            System.out.println((i+1)+" "+arrayCarne.get(i).getNombre_Producto());
        }
    }
    public static void mostrarLacteos(int contLacteo, ArrayList<Producto> arrayLacteos)
    {
        System.out.println("SECCION DE LACTEOS:");
        for (int i = 0; i < contLacteo; i++) {
            System.out.println((i+1)+" "+arrayLacteos.get(i).getNombre_Producto());
        }
    }
    public static int selectProduct()
    {
        Scanner entrada = new Scanner(System.in);
        int selectProduct;
        
        System.out.print("DIGITE EL ID DEL PRODUCTO A CAMBIAR:");
        selectProduct = entrada.nextInt();
        return selectProduct;
    }
    public static int setSection(int nro)
    {
        int option=0;
        
        if(nro == 0)
        {
            do
            {
                option = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A QUE SECCION ESTABLECER ESE PRODUCTO"
                        + "\n[2]SECCION LACTEOS"));
            }while(option!=2);         
        }
        else
        {
            do
            {
                option = Integer.parseInt(JOptionPane.showInputDialog("DIGITE A QUE SECCION ESTABLECER ESE PRODUCTO"
                         + "\n[1]SECCION CARNES"));
            }while(option != 1);
        }
        return option;
    }
    
}
