/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poojavaejercicio9;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static int indiceSucursal(ArrayList<Sucursal> array, int nroSucursal)
    {
        int cont = array.size();
        int indice = -1;
        for (int i = 0; i < cont; i++) {
            if(array.get(i).getNro() == nroSucursal)
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
    public static int indicePaquete(ArrayList<Paquete> array, int nroReferencia)
    {
        int cont = array.size();
        int indice = -1;
        for (int i = 0; i < cont; i++) {
            if(nroReferencia == array.get(i).getNroReferencia())
            {
                indice = i;
            }
        }

        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL PAQUETE");
        }
        return indice;
    }

    public static void main ( String [] args)
    {
        ArrayList <Sucursal> arraySucursales = new ArrayList <Sucursal> ();
        ArrayList <Paquete> arrayPaquete = new ArrayList <Paquete>();
        Scanner entrada = new Scanner( System.in);
        int opcion,nroSucursal, nroReferencia, dniReferencia, peso, selectPrioridad, indice, contPaquete = 0;
        float costo;
                
        String direccion , ciudad;
        
        do
        {
        System.out.println("...MENU..."
                + "\n[1]INGRESAR SUCURSALES"
                + "\n[2]INGRESAR PAQUETES"
                + "\n[3]VER UNA SUCURSAL"
                + "\n[4]VER UN PAQUETE"
                + "\n[5]VER TODOS LOS PAQUETES"
                + "\n[6]VER TODAS LAS SUCURSALES"
                + "\n[7]VER PAQUETES DE UNA SUCURSAL"
                + "\n[8]SALIR");
        
        opcion = entrada.nextInt();
            switch (opcion)
            {
                case 1:
                    nroSucursal = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE SUCURSAL"));
                    direccion = JOptionPane.showInputDialog("DIGITE LA DIRECCION DE LA SUCURSAL");
                    ciudad = JOptionPane.showInputDialog("DIGITE LA CIUIDAD DE LA SUCURSAL");
                    arraySucursales.add(new Sucursal(nroSucursal, direccion, ciudad));
                    break;
                case 2:
                    nroSucursal = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE SUCURSAL A ENVIAR"));
                    indice = indiceSucursal(arraySucursales, nroSucursal);
                    if(indice != -1)
                    {
                        nroReferencia =Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DEL PAQUETE"));
                        dniReferencia =Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DE REFERENCIA"));
                        peso = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PESO DEL PAQUETE"));
                        do
                        {
                            selectPrioridad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL TIPO DEL PAQUETE"
                                    + "\n[1] NINGUNO"
                                    + "\n[2] ALTA"
                                    + "\n[3] EXPRESS"));
                        }while(selectPrioridad < 1 || selectPrioridad >3);
                        arrayPaquete.add(new Paquete(nroReferencia,dniReferencia,selectPrioridad,peso));
                        costo = arraySucursales.get(indice).getCosto(arrayPaquete.get(contPaquete));
                        JOptionPane.showMessageDialog(null,"EL PRECIO DEL PAQUETE ES: $"+costo);
                        arraySucursales.get(indice).setPaquete(arrayPaquete.get(contPaquete));
                        contPaquete++;
                    }
                    break;
                case 3:
                 nroSucursal = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE SUCURSAL A CONSULTAR"));
                 indice = indiceSucursal(arraySucursales, nroSucursal);
                 if(indice != -1)
                 {
                     arraySucursales.get(indice).mostrarDatos();
                 }
                 break;
                case 4:
                 nroReferencia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO REFERENCIA"));
                 indice = indicePaquete(arrayPaquete , nroReferencia);
                 if(indice != -1)
                 {
                     arrayPaquete.get(indice).mostrarPaquete();
                 }
                 break;
                case 5:
                    if(arrayPaquete.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"NO EXISTE NINGUN PAQUETE");
                    }
                    else
                    {
                        int cont = arrayPaquete.size();
                        for (int i = 0; i < cont; i++) {
                            arrayPaquete.get(i).mostrarPaquete();
                        }
                    }
                    break;
                case 6:
                    if(arraySucursales.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"NO EXISTE NINGUNA SUCURSAL");
                    }
                    else
                    {
                        int cont = arraySucursales.size();
                        for (int i = 0; i < cont; i++) {
                            arraySucursales.get(i).mostrarDatos();
                        }
                    }
                    break;
                case 7:
                    nroSucursal = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE SUCURSAL"));
                    indice = indiceSucursal(arraySucursales, nroSucursal);
                    if(indice != -1)
                    {
                        arraySucursales.get(indice).mostrarPaquetesSucursal();
                    }
                    break;
                
                case 8:
                
                    JOptionPane.showMessageDialog(null,"CERRANDO PROGRAMA...");break;
                
                default:
                
                    JOptionPane.showMessageDialog(null,"ERROR");
                
                    
            }
        
        }while(opcion != 8);
    }
}
