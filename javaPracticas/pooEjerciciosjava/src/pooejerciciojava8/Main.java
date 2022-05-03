/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava8;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static int indiceABuscar(int nroCuenta, Cuenta cuenta[] )
    {
        int indice=-1;
        for (int i = 0; i < cuenta.length; i++) {
            if(nroCuenta == cuenta[i].getNroCuenta())
            {
                indice = i;
            }
        }
        return indice;
    }
    public static void main( String []args )
    {
        Scanner entrada = new Scanner(System.in);
        
        String nombre, apellido;
        int dni, nCuentas, nroCuenta, opcion;
        double saldo = 0;
        Cuenta cuenta[];
        Cliente cliente;
        
        System.out.println("DIGITE EL NOMBRE DEL CLIENTE");
        nombre = entrada.next();
        System.out.println("DIGITE EL APELLIDO DEL CLIENTE");
        apellido = entrada.next();
        System.out.println("DIGITE EL DNI");
        dni = entrada.nextInt();
        System.out.println("DIGITE LA CANTIDAD DE CUENTAS QUE TIENE");
        nCuentas = entrada.nextInt();
        
        cuenta = new Cuenta[nCuentas];
        
        for (int i = 0; i < cuenta.length; i++) {
            System.out.println("DIGITE EL NRO DE LA CUENTA "+(i+1));
            nroCuenta = entrada.nextInt();
            System.out.println("DIGITE EL SALDO DE LA CUENTA "+(i+1));
            saldo  = entrada.nextDouble();
            cuenta[i] = new Cuenta(nroCuenta, saldo);
        }
        cliente = new Cliente(nombre,apellido,dni,cuenta);
        
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog(("..MENU.."
                    + "\n[1]CONSULTAR SALDO DE UNA CUENTA"
                    + "\n[2]INGRESAR DINERO DE UNA CUENTA"
                    + "\n[3]RETIRAR DINERO DE UNA CUENTA"
                    + "\n[4]VER CUENTAS"
                    + "\n[5]SALIR")));
            
            switch(opcion)
            {
                case 1:
                    double saldoConsultado;
                    int indice;
                    System.out.println("DIGITE EL NRO DE LA  CUENTA QUIERE CONSULTAR SU SALDO");
                    nroCuenta = entrada.nextInt();
                    indice = indiceABuscar(nroCuenta,cuenta);
                    if(indice == -1)
                    {
                        System.out.println("CUENTA NO SE PUDO ENCONTRAR");
                    }
                    else
                    {
                        System.out.println("Tiene un saldo de :$"+cliente.consultarSaldo(indice));
                    }
                    break;
                case 2:
                    double dinero;
                    System.out.println("DIGITE EL NRO CUENTA PARA INGRESAR DINERO");
                    nroCuenta = entrada.nextInt();
                    indice = indiceABuscar(nroCuenta, cuenta);
                    if(indice ==-1)
                    {
                        System.out.println("NO SE ENCONTRO LA CUENTA");
                    }
                    else
                    {
                        System.out.println("DIGITE LA CANTIDAD DE DINERO A INGRESAR");
                        dinero = entrada.nextDouble();
                        cliente.ingresarDinero(indice, dinero);
                    }
                    
                    break;
                case 3:
                    
                    System.out.println("DIGITE EL NRO DE CUENTA PARA RETIRAR DINERO");
                    nroCuenta = entrada.nextInt();
                    indice = indiceABuscar(nroCuenta,cuenta);
                    if(indice == -1)
                    {
                        System.out.println("NO SE ENCONTRO LA CUENTA");
                    }
                    else
                    {
                        System.out.println("DIGITE LA CANTIDAD DE DINERO A RETIRAR");
                        dinero = entrada.nextDouble();
                        cliente.retirarDinero(indice, dinero);
                    }
                    break;  
                    
                case 4:
                    cliente.mostrarCuentas();break;
                default:
                    System.out.println("SE CONFUNDIO DE OPCION");
            }                  
        }while(opcion != 5);
        
    }
}
