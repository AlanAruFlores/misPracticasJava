/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author alang
 */
public class Practica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Practica de todo lo visto .
        //Suma entre 2 numeros
        Class clase = new Class ();
        int numero, numero2;
        byte opcion,menuOpciones;
        String volverInicio;
        boolean verificador = false;
        do
        {
            menuOpciones = Byte.parseByte(JOptionPane.showInputDialog("1..Realizar operaciones aritematicas"
                    + "\n2..Mostrar tabla de multiplicaciond de algun numero"
                    + "\n3..Ver multiples tablas de multiplicaciones"));
            
            
            if(menuOpciones == 1)
            {
                numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
                numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2")); 
                opcion = clase.elegirOpcionAritmetica();
                if (opcion == 1) {
                   JOptionPane.showMessageDialog(null, "La suma entre los 2 numeros es " + clase.sumarNumeros(numero, numero2));
                } else if (opcion == 2) {
                   JOptionPane.showMessageDialog(null, "La resta entre los 2 numeros es " + clase.restarNumeros(numero, numero2));
                } else if (opcion == 3) {
                    JOptionPane.showMessageDialog(null, "La multiplicacion entre los 2 numeros es " + clase.multiplicarNumeros(numero, numero2));
                } else if(opcion == 4) {
                    JOptionPane.showMessageDialog(null, "La division entre los 2 numeros es " + clase.dividirNumeros(numero, numero2));
                }
            }
            else
                if(menuOpciones == 2)
                {
                    int resultado;
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero el cual quiere mostra su tabla de multiplicacion"));
                          
                    for (int i = 0 ; i<=10; i++)
                    {
                        resultado = numero * i;
                        System.out.println(""+numero+" x "+i+" = "+resultado);
                
                    }
                }
            else
                {
                    int inicioTabla, finTabla;
                    int resultado;
                    
                    inicioTabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que numero quiere que comienze la tabla de mutiplicacion"));
                    finTabla = Integer.parseInt(JOptionPane.showInputDialog("Ingrese hasta que numero quiere que finalize la tabla de multiplicacion"));
                    
                    for (int i = inicioTabla ; i<=finTabla ; i++)
                    {
                        System.out.println("Tabla del "+i);
                        for (int j = 0 ; j <=10; j++)
                        {
                            resultado = i*j;
                            System.out.println(""+i+" x "+j+" = "+resultado);
                            
                        }
                    }
                    
                }
            volverInicio = JOptionPane.showInputDialog("Si usted quiere volver al inicio "
                    + "y realizar otra operacion, escriba si o no");
            verificador = clase.verificar(volverInicio, verificador);
            
        }while(verificador == true);
        JOptionPane.showMessageDialog(null, "Gracias por su atencion");
    }

}
