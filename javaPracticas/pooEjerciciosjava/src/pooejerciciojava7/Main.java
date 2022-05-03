/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava7;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main (String [] args)
    {
        Scanner entrada  = new Scanner(System.in);
        NroComplejo arrayNros[] = new NroComplejo[2];
        NroComplejo suma,multiplicacion;
        int n , i, opcion=0, exit=0;
        for (int j = 0; j < arrayNros.length; j++) {
            System.out.println("DIGITE LA N DEL NRO COMPLEJO "+(j+1));
            n = entrada.nextInt();
            System.out.println("DIGITE LA I DEL NRO COMPLEJO "+(j+1));
            i= entrada.nextInt();
            arrayNros[j] = new NroComplejo(n,i);
        }
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA OPCION"
                    + "\n[1]SUMAR NROS COMPLEJOS"
                    + "\n[2}MULTIPLICAR NROS COMPLEJOS"
                    + "\n[3]VERIFICAR SI AMBOS SON IGUALES"
                    + "\n[4}MULTIPLICAR NRO COMPLEJO POR UN ENTERO"
                    + "\n[5]SALIR"));
            switch(opcion)
            {
                case 1:
                {
                   suma = arrayNros[0].sumarNrosComplejos(arrayNros[1]); 
                   System.out.println("LA SUMA ENTRE ("+arrayNros[0].getN()+""
                           + " + "+arrayNros[0].getI()+" i) y ("+arrayNros[1].getN()+""
                           + " + "+arrayNros[1].getI()+"i)"
                           + "es = "+suma.getN()+" + "+suma.getI()+"i");break;
                }
                case 2:
                {
                    multiplicacion  = arrayNros[0].multiplicarNrosComplejos(arrayNros[1]);
                    System.out.println("LA MULTIPLICACION ENTRE ("+arrayNros[0].getN()+""
                           + " + "+arrayNros[0].getI()+" i) y ("+arrayNros[1].getN()+""
                           + " + "+arrayNros[1].getI()+"i)"
                           + "es = "+multiplicacion.getN()+" + "+multiplicacion.getI()+"i");break;
                }
                case 3:
                {
                    if(arrayNros[0].verificarIgualdad(arrayNros[1]) == true)
                    {
                        System.out.println("SON IGUALES");break;
                    }
                    else
                    {
                        System.out.println("NO SON IGUALES");break;
                    }
                }
                case 4:
                {
                    int entero = 0, seleccion;
                    System.out.println("DIGITE EL NRO ENTERO");
                    entero = entrada.nextInt();
                    System.out.println("A CUAL NRO COMPLEJO DESEAS MUTLIPLICARLO?");
                    arrayNros[0].mostrarComplejo();
                    arrayNros[1].mostrarComplejo();
                    seleccion = entrada.nextInt();

                    if(seleccion == 1)
                    {
                        multiplicacion = arrayNros[0].multiplicarXEntero(entero);
                    }
                    else
                    {
                        multiplicacion = arrayNros[1].multiplicarXEntero(entero);
                    }

                    System.out.println("EL RESULTADO ES "+multiplicacion.getN()+" +"
                            + " "+multiplicacion.getI()+" i");break;
                }
                case 5:
                {
                    exit = 1;break;
                }
            }
        }while(exit != 1);
        
    }
}
