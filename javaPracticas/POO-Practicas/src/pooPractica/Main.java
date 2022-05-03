/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPractica;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<ComercioAutos> comercios = new ArrayList<>();
    
    private static void establecerValores()
    {
        comercios.add(new Fabrica("Ford"));
        comercios.add(new Sucursal("AutoVent", (Fabrica)comercios.get(0)));
        
    }
    
    public static void main(String[] args) {
        int opcion;
        
        do
        {
            opcion = ingresarOpcion();
            
            if(comercios.get(opcion-1) instanceof Fabrica)
            {
                mostrarMenuFabrica((Fabrica)comercios.get(opcion-1));
            }
            else
            {
                mostrarMenuSucursal((Sucursal)comercios.get(opcion-1));
            }
        }while(true);
        
    }
    public static void mostrarMenuSucursal(Sucursal sucursal)
    {
        int opcion;
        do
        {
            opcion = ingresarOpcionSucursal();
            switch(opcion)
            {
                case 1:
                {
                    sucursal.mostrarMostrarVehiculos();
                    break;
                }
                case 2:
                {
                    System.out.println(sucursal);
                    break;
                }
                case 3:
                {
                    sucursal.verEstadoComerciante();
                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
            }
        }while(opcion != 4);
         
        
        
    }
    public static int ingresarOpcionSucursal()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]MOSTRAR VEHICULOS"
                    + "\n[2]VER ESTADO SUCURSAL"
                    + "\n[3]VER INFORMACION DE SU COMERCIANTE"
                    + "\n[4]SALIR4"));
        }while(opcion < 1 || opcion >4);
        
        return opcion;
    }
    public static void mostrarMenuFabrica(Fabrica fabrica)
    {
        int opcion = ingresarOpcionFabrica();
        do
        {
            switch(opcion)
            {
                case 1:
                {
                    fabrica.mostrarMostrarVehiculos();
                    break;
                }
                case 2:
                {
                    fabrica.crearNuevoVehiculo();
                    break;
                }
                case 3:
                {
                    fabrica.enviarVehiculosFabricados((Sucursal) comercios.get(1));
                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
            }
        }while(opcion != 4);
    }
    private static int ingresarOpcionFabrica()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]MOSTRAR VEHICULOS"
                    + "\n[2]CREAR VEHICULO"
                    + "\n[3]ENVIAR VEHICULOS FABRICADOS"
                    + "\n[4]SALIR"));
        }while(opcion< 1 || opcion >4);
        return opcion;
    }
    public static void mostrarComercios()
    {
        for (ComercioAutos comercio : comercios) {
            System.out.println(comercio);
        }
    }
    public static int ingresarOpcion()
    {
        int opcion;
        
        mostrarComercios();
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"));
        }while(opcion < 1 || opcion > comercios.size());
        
        return opcion;
    }
}
