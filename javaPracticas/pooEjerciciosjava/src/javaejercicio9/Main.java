/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio9;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    public static void main (String args[])
    {
        ArrayList<Sucursal> arraySucursales  = new ArrayList<Sucursal>();
        int opcion, exitProgram = 0;
        
        do
        {
            do
            {
                opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE QUIEN ERES"
                       + "[1]USUARIO"
                       + "[2]DUEÑO"
                       + "[3]SALIR"));
            }while(opcion < 1 || opcion >3);

        
            switch(opcion)
            {
                case 1:
                   mostrarInterfazUsuario(arraySucursales);break;
                case 2:
                    mostrarInterfazDueño(arraySucursales);break;
                case 3:
                    exitProgram = 1;break;
            }
        }while(exitProgram != 1);
        
    }
    public static void mostrarInterfazDueño(ArrayList<Sucursal>array)
    {
        Scanner entrada = new Scanner(System.in);
        int opcion, exitProgram = 0;
        do
        {
            
            do
            {
                System.out.println("DIGITE UNA OPCION: "
                        + "\n[1]INGRESAR SUCURSALES"
                        + "\n[2]MOSTRAR SUCURSALES"
                        + "\n[3]SALIR");
                opcion = entrada.nextInt();
            }while (opcion < 1 || opcion >3);
            
            switch(opcion)
            {
                case 1:
                {
                    array.addAll(inputSucursales());
                    JOptionPane.showMessageDialog(null,"INGRESO DE SUCURSALES EXITOSO");break;
                }
                case 2:
                {
                    if(array.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"SUCURSALES VACIOS");
                    }
                    else
                    {
                        int cont = array.size();
                        for (int i = 0; i < cont; i++) {
                            array.get(i).mostrarSucursal();
                        }
                    }
                    break;
                }
                default:
                {
                    exitProgram = 1;
                }
            }
        }while(exitProgram != 1);
    }
    public static ArrayList <Sucursal> inputSucursales()
    {
        ArrayList<Sucursal> array = new ArrayList<Sucursal>();
        int nSucursales;
        do
        {
            nSucursales = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE SUCURSALES"));
        }while(nSucursales <= 0);
        int nro;
        String direccion;
        String ciudad;
        for (int i = 0; i < nSucursales; i++) {
            nro = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE LA SUCURSAL"));
            direccion = JOptionPane.showInputDialog("DIGITE LA DIRECCION DE LA SUCURSAL");
            ciudad = JOptionPane.showInputDialog("DIGITE LA CIUDAD DE LA SUCURSAL");
            array.add(new Sucursal(nro,direccion,ciudad));
        }
        return array;
    }
    public static void mostrarInterfazUsuario(ArrayList <Sucursal> array)
    {
        Scanner entrada= new Scanner(System.in);
        
        if(array.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUNA SUCURSAL");       
        }
        else
        {
            int nroSucursal , sucursalExistente = 0, nro;
            
            System.out.println("DIGITE EL NRO DE SUCURSAL QUE QUIERE ENVIAR EL PAQUETE");
            System.out.print("NRO: ");
            nroSucursal = entrada.nextInt();
            
            sucursalExistente = indiceIgualdadSucursal(nroSucursal, array);
            
            if(sucursalExistente != -1)
            {
                Paquete paquete = llenarPaquete();     
                array.get(sucursalExistente).setPaquete(paquete);
                System.out.println("INFORMACION");
                array.get(sucursalExistente).mostrarSucursal();
                System.out.println("COSTO A PAGAR: $"+array.get(sucursalExistente).getCosto());
            }
            else
            {
                JOptionPane.showMessageDialog(null,"SUCURSAL NO EXISTENTE");
            }
           
        }
    }
    public static int indiceIgualdadSucursal (int nroSucursal, ArrayList<Sucursal>array)
    {
        
        int contSucursales = array.size(), indice = -1;
        for (int i = 0; i < contSucursales; i++) {
               if(nroSucursal == array.get(i).getNro())
               {
                    indice = i;
               }
        }
        return indice;
    }
    public static Paquete llenarPaquete()
    {
        Scanner entrada= new Scanner(System.in);
        Paquete paquete;
        int  nroPaquete, dniReferencia, peso, selectPrioridad;
        String prioridad= null;
        
        System.out.println("DIGITE EL NRO DE REFERENCIA DEL PAQUETE");
        nroPaquete = entrada.nextInt();
        
        System.out.println("DIGITE EL DNI DE REFERENCIA DEL PAQUETE");
        dniReferencia = entrada.nextInt();
        
        System.out.println("DIGITE ELL PESO DEL PAQUETE (KG)");
        peso = entrada.nextInt();
        
        System.out.println("SELECCION LA PRIORIDAD"
                        + "\n[1]NINGUNA"
                        + "\n[2]ALTA"
                        + "\n[3]EXPRESS");
        selectPrioridad = entrada.nextInt();
        
        if(selectPrioridad == 3)
        {
            prioridad= "EXPRESS";
        }
        else if(selectPrioridad == 2)
        {
            prioridad = "ALTA";
        }
        else
        {
            prioridad = "NINGUNA";
        }
        
        paquete = new Paquete(nroPaquete,dniReferencia, peso, prioridad);
        return paquete;
    }
}
