/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooArrayList;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Administrador {
    
    public static byte ejecutarMenu()
    {
        byte optionAdministrador;
        do
        {
            optionAdministrador = Byte.parseByte(JOptionPane.showInputDialog("QUE OPCOION DESEAS REALIZAR COMO ADMINISTRADOR"
                    + "\n[1] AGREGAR PRODUCTOS"
                    + "\n[2] ELIMINAR ALGUN PRODUCTO"
                    + "\n[3] LIMPIAR TODO"
                    + "\n[4] MOSTRAR PRODUCTOS REGISTRADOS"
                    + "\n[5] VOLVER"));
            
            if(optionAdministrador < 1 || optionAdministrador >6)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }
        while(optionAdministrador < 1 || optionAdministrador > 5);
        
        return optionAdministrador;
    }
    public static void goToSection(ArrayList <Producto> products,byte optionAdministrador,boolean execution)
    {
        if(optionAdministrador == 1)
        {
            Administrador.setObjects(products, execution);
            execution = true;
        }
        else if(optionAdministrador == 2){
            Administrador.deleteObjects(products);
        }
        else if(optionAdministrador == 3){
                        products.clear();
        }
        else if(optionAdministrador == 4 ) {
            Administrador.showObjects(products);
        }         
        else if(optionAdministrador == 5){
            JOptionPane.showMessageDialog(null,"VOLVIENDO");
        }
    }
    
    public static void showObjects(ArrayList <Producto> products)
    {
        System.out.println("PRODUCTOS REGISTRADOS");
        System.out.println("ID | NOMBRE | TIPO  | STOCK | PRECIO");
        for(Producto p : products)
        {
            p.showObject();
        }
    }
    
    public static void setObjects (ArrayList <Producto> products, boolean execution)
    {
        
        String nombre;
        String tipo;
        short stock;
        float precio;
        JOptionPane.showMessageDialog(null,products.size());

        int nElements = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE PRODUCTO A REGISTRAR"));
        Main.contElements += nElements; 
        
        for(int i = products.size(); i < Main.contElements ; i++ )
        {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PRODUCTO "+(i+1));
            nombre = nombre.toUpperCase();
            tipo = setType(i);
            stock = Short.parseShort(JOptionPane.showInputDialog("DIGITE EL STOCK QUE TENDRA EL PRODUCTO "+(i+1)));
            precio = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL PRECIO DEL PRODCUTO "+(i+1)));
            
            products.add(new Producto (nombre,tipo,stock,precio));
            JOptionPane.showMessageDialog(null,"PRODUCTO REGISTRADO EXITOSAMENTE");
        }   
       // return contElements;
    }
    
    
    public static void deleteObjects (ArrayList <Producto> products)
    {
        Scanner input = new Scanner(System.in);
        byte deleteObject;

       
        showObjects(products);
        
        System.out.println("DIGITE QUE PRODUCTO (ID) VA A ELIMINIAR");
        deleteObject = input.nextByte();
        Main.contElements--;
        products.remove(deleteObject-1);
        
        
    }
    
    
    public static byte error(byte option)
    {
        while(option <1 || option>3)
        {
            option = Byte.parseByte(JOptionPane.showInputDialog("BIENVENIDO A LA FACTURACION DE MERCADO"
                    + "\nSELECCIONE SI ERES:"
                    + "\n[1]USUARIO"
                    + "\n[2]ADMINISTRADOR"
                    + "\n[3]SALIR"));
        }
        return option;
    }
    public static String setType(int i)
    {
        int optionType;
        String type ;
        optionType = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL TIPO DEL PRODUCTO"+(i+1)+""
                + "\nDISPONIBLE: "
                + "\n[1]LACTEO"
                + "\n[2]CARNE"));
        
        while(optionType < 1 || optionType > 2)
        {
            optionType = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nDIGITE EL TIPO DEL PRODUCTO"+(i+1)+""
                + "\nDISPONIBLE: "
                + "\n[1]LACTEO"
                + "\n[2]CARNE"));
        }
        if( optionType == 1)
        {
            type = "LACTEO";
        }
        else
        {
            type = "CARNE";
        }
               
        return type;
    }
}
