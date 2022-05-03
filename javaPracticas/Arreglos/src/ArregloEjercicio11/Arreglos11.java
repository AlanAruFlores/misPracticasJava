/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArregloEjercicio11;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Desarrollar una aplicacion que lea 5 elementos y que estas esten ordenados de forma creciente, y luego
        agregar estos valores a un array de 10 elemento y pedirle que ingrese un dato numerico e insertarlo en el lugar correspondiente
        para que este siga siendo creciente
        */
        
        //Llamo a la clase "Class"
        Class cla_ss = new Class();
        
        int [] inputNumbers = new int[10];
        int newNumber =0, cont_lugar=0,j=0;
        boolean creciente = false;
        do
        {
            for ( int i = 0 ; i<5; i++)
            {
                inputNumbers[i] = cla_ss.inputNumbers(i);
                if(i == 4)
                {
                    for(int k = 0 ; k<4 ; k++)
                    {
                        if(inputNumbers[j]<inputNumbers[j+1])
                        {
                            creciente = true;
                        }
                        if(inputNumbers[j]>=inputNumbers[j+1])
                        {
                            creciente = false;
                        }
                    }    
                }   
            }
            if(creciente == false)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Entrada de datos exitoso");
            }
                    
        }while(creciente == false);
        
        newNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nuevo numero"));
        
        while(inputNumbers[j]<newNumber && j<5)
        {
           cont_lugar++;
            j++;
        }
        
        for(int i = 4; i<=cont_lugar;i++)
        {
            inputNumbers[i+1] = inputNumbers[i];
        }
        
        inputNumbers[cont_lugar] = newNumber;
        
        for(int elementos: inputNumbers)
        {
            System.out.println("["+elementos+"]-");
        }
        
        
        
        
        //Defino Arrays
        /*
        int [] inputNumbers = new int[10];
        int newValue = 0,aux=0;
        
        boolean creciente=false, decreciente=false;
        do
        {
            for ( int i = 0; i<5; i++)
            {
                inputNumbers[i] = cla_ss.inputNumbers(i);
                if(i == 4)
                {
                    for(int j = 0 ; j<4 ; j++)
                    {
                        if(inputNumbers[j]<inputNumbers[j+1])
                        {
                            decreciente = false;
                            creciente = true;
                        }
                        if(inputNumbers[j]>=inputNumbers[j+1])
                        {
                            decreciente = true;
                            creciente = false;
                        }
                    }    
                }   
            }
            if(decreciente == true)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Entrada de datos exitoso");
            }

        }while(decreciente == true);
        
        newValue=Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nuevo valor"));
        inputNumbers[5] = newValue;
        
        for(int i = 0 ; i < inputNumbers.length;i++)
        {
            for (int j = 0 ; j < inputNumbers.length; j++)
            {
               if (inputNumbers[i]<inputNumbers[j])
               {
                  aux=inputNumbers[i];
                  inputNumbers[i] = inputNumbers[j];
                  inputNumbers[j] = aux;
               }
            }
        }
        
        for(int elementos: inputNumbers)
        {
            System.out.print("["+elementos+"]-");
        }
        
        
        
        
        /*
        
        for(int i = 0; i<array.length; i++)
        {
            for(int j= 0; j<(array.length-1);j++)
            {
                if(array[i]<array[j+1])
                {
                    aux = array[i];
                    array[i]= array[j+1];
                    array[j+1]=aux;
                }
            }
        }
        for(int elemento : array)
        {
            System.out.println("["+elemento+"]-");
        }
       */
        
        
        
        
    } 
}   

