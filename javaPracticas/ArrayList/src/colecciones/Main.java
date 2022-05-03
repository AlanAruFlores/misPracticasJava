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
public class Main {
    public static void main (String [] args)
    {
        Scanner entrada = new Scanner(System.in);
        
        ArrayList<Producto> array = new ArrayList<Producto> ();
        ArrayList<Producto> arrayCarne = new ArrayList<Producto>(); 
        ArrayList<Producto> arrayLacteos = new ArrayList<Producto>();
        
        int opcion,contCarne = 0, contLacteo=0, selectProduct, option, optionSection, optionWindow;
        int nElements = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE PRODUCTOS A INGRESAR"));
        String continueProgram;
        
        for (int i = 0; i < nElements; i++) {
            array.add(Class.rellenarProducto(i));
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DONDE LO DESEA GUARDAR: "
                       + "\n[1]SECCION DE CARNE"
                       + "\n[2]SECCION DE LACTEO"));
            if(opcion == 1)
            {
                   arrayCarne.add(array.get(i));
                   contCarne++;
            }
            else
            {
                arrayLacteos.add(array.get(i));
                contLacteo++;
            }
            }
        do
        {           
            do
            {
                optionWindow = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                        + "\n[1]MOSTRAR PRODUCTOS"
                        + "\n[2}CAMBIAR PRODUCTO"));
            }while(optionWindow < 1 || optionWindow > 2);        
            if(optionWindow == 1)
            {
                //CARNES
                Class.mostrarCarnes(contCarne, arrayCarne);
                //LACTEOS
                Class.mostrarLacteos(contLacteo, arrayLacteos);
            }
            else
            {
                do
                {
                    System.out.println("DIGITE EN DONDE SE UBICA AQUEL PRODUCTO PARA CAMBIAR SU POSICION"
                        + "\n[1]CARNE"
                        + "\n[2]LACTEO");
                    option = entrada.nextInt();
                }while(option < 1 || option >2);
        
                if(option == 1){
                    Class.mostrarCarnes(contCarne, arrayCarne);
                    selectProduct = Class.selectProduct();
                    selectProduct--;
                    optionSection = Class.setSection(0);

                    if(optionSection == 2)
                    {
                        arrayLacteos.add(contLacteo,arrayCarne.get(selectProduct));
                        arrayCarne.remove(selectProduct);
                        contCarne--;
                        contLacteo++;
                    }
                }   
                else
                {
                    Class.mostrarLacteos(contLacteo, arrayLacteos);
                    selectProduct = Class.selectProduct();
                    selectProduct--; 
                    optionSection = Class.setSection(1);
                    if(optionSection  == 1)
                    {
                        arrayCarne.add(contCarne, arrayLacteos.get(selectProduct));
                        arrayLacteos.remove(selectProduct);
                        contCarne++;
                        contLacteo--;
                    }
                
                }
            }
            continueProgram  = JOptionPane.showInputDialog("DIGITE SI/NO PARA CONTINUAR");
            continueProgram = continueProgram.toUpperCase();
        }while(continueProgram.equals("SI"));
    }
}
