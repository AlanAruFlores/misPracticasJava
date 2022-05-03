/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        /*Crear Simulacion de control de sucursales de autos teniendo en cuenta que los autos solo pueden ser de color ROJO y AZUL*/
        Empresa miEmpresa = crearEmpresa();
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            
            switch(opcion)
            {
                case 1:
                {
                    
                    miEmpresa.setSucursal(registrarSucursal());
                    break; 
                    
                }
                case 2:
                {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA SUCURSAL A ELIMINAR"));
                    int indice = encontrarIndice(id, miEmpresa.getSucursales());
                    if(indice != -1)
                    {
                        miEmpresa.eliminarSucursales(indice);
                    }
                    break;
                }
                case 3:
                {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID A LA SUCURSAL A AGREGAR UN AUTO"));
                    int indice = encontrarIndice(id, miEmpresa.getSucursales());
                    if(indice != -1)
                    {
                        Auto nuevoAuto=registrarAuto();
                        miEmpresa.seleccionarSucursal(indice).setAuto(nuevoAuto);
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("SUCURSALES: ");
                    if(miEmpresa.getSucursales().isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY NINGUNA SUCURSAL REGISTRADA");
                    }
                    else
                    {
                        miEmpresa.mostrarSucursales(); 
                    }
                    break;
                }
                case 5:
                {
                    System.out.println(miEmpresa);
                    break;
                }
                case 6:
                {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA SUCURSAL A VER"));
                    int indice = encontrarIndice(id , miEmpresa.getSucursales());
                    if(indice != -1)
                    {
                        System.out.println(miEmpresa.seleccionarSucursal(indice));
                    }
                    break;
                }
                case 7:
                {
                    miEmpresa.mostrarAutos();
                    break;
                }
                case 8:
                {
                    int indice = encontrarMayorGanancia(miEmpresa.getSucursales());
                    if(indice != -1)
                    {
                        System.out.println("MAYOR GANANCIA");
                        System.out.println(miEmpresa.seleccionarSucursal(indice));
                    }
                    break;
                }
                case 9:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                    break;
                }
            }
        }while(opcion != 9);
        
        
    }
    public static int encontrarMayorGanancia(ArrayList<Sucursal> sucursales)
    {
        int indice = 0 , cont = sucursales.size();
        if(sucursales.isEmpty())
        {
            indice = -1;
            JOptionPane.showMessageDialog(null,"NO HAY NIGUNA SUCURSAL REGISTRADA");
        }
        else
        {
            float mayorGanancias = sucursales.get(0).getGanancias(); 
            for (int i = 1; i < cont; i++) {
                if(mayorGanancias > sucursales.get(i).getGanancias())
                {
                    mayorGanancias = sucursales.get(i).getGanancias();
                    indice = i;
                }
            }
        }
        return indice;
    }
    public static Auto registrarAuto()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL AUTO");
        Color c  = ingresarColor();
        float precio = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL PRECIO DEL AUTO"));
        
        return new Auto(nombre, c , precio);
    }
    public static Color ingresarColor()
    {
        Color c;
        int opcion;
        
        do
        {
            opcion  = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO COLOR"
                    + "\n[1]ROJO"
                    + "\n[2}AZUL"));
        }while(opcion < 1 || opcion >2);
        
        if(opcion  == 1)
        {
            c = Color.ROJO;
        }   
        else
        {
            c = Color.AZUL;
        }
        return c;
    }
    private static int encontrarIndice(int id, ArrayList<Sucursal> sucursales)
    {
        int indice = -1, cont = sucursales.size();
        for (int i = 0; i < cont; i++) {
            if(sucursales.get(i).getId() == id)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA SUCURSAL");
            
        }
        return indice;
    }
    public static Sucursal registrarSucursal()
    {
        JOptionPane.showMessageDialog(null,"SE REGISTRO NUEVA SUCURSAL");
        return new Sucursal();
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]REGISTRAR SUCURSAL"
                + "\n[2]ELIMINAR SUCURSAL"
                + "\n[3]AGREGAR AUTO"
                + "\n[4]MOSTRAR SUCURSALES"
                + "\n[5]MOSTRAR EMPRESA"
                + "\n[6]MOSTRAR UNA SUCURSAL"
                + "\n[7]MOSTRAR AUTOS"
                + "\n[8]SUCURSAL CON MAYOR GANANCIAS"
                + "\n[9]SALIR"));          
        }while(opcion < 1 || opcion >9);
        return opcion;
    }
    public static Empresa crearEmpresa()
    {
        String nombreEmpresa = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA EMPRESA");
        return new Empresa(nombreEmpresa);
    }
}
