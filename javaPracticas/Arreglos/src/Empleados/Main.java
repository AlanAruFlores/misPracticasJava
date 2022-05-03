/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Empleados;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hacer una lista de empleados 
        Class clss = new Class();
        
        
        int empleados[] , nElementos, cont = 0,k=0 ;
        int showEmpleados[] = new int [0] ; 
        byte opcion;
       
        String continueOption;

        do
        {
            opcion = clss.errorOption();
            switch (opcion)
            {
                case 1:
                {
                    nElementos = 0;
                    nElementos = clss.contEmpleados();
                    empleados = new int[nElementos];
                    
                    cont += nElementos;
                    showEmpleados  = new int [cont];
                    
                    for ( int i = 0 ; i < nElementos ; i++)
                    {
                        empleados [i] = clss.inputEmpleados(i);
                    }
                    for ( int j = k ; j < cont ; j++)
                    {
                        showEmpleados[j] = empleados[j];                       
                    }
                    k = cont;
                    break;
                }
                case 2:
                {
                    if (cont == 0 )
                    {
                        System.out.println("No hay ningun empleado");
                    }
                    else
                    {
                        System.out.println("Empleados:");
                        for ( int i = 0 ; i<cont; i++)
                        {
                            System.out.println(showEmpleados[i]);
                        }
                    }
                    break;
                }
                
              
            }
            continueOption = JOptionPane.showInputDialog("¿Desea ir al menu principal? escriba si o no");
            continueOption = continueOption.toUpperCase();
        } while (continueOption.equals("SI"));
        
    }
    
}
