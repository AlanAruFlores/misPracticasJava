/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio14;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 2 arrays de 10 numeros(ordenadas crecientemente), fusionarlos en una terceray que este tambien este crecientemente
        
        //Llamamos a la clase "Class"
        Class clss = new Class();
        
        int []arrayNumbers  =  new int [10];
        int []arrayNumbers2 = new int [10];
        int []arrayNumber3=new int[20];
        
        int cont = 10,aux=0;
        boolean crecienteArray = false, crecienteArray2=false;
        
        do
        {
            for(int i =0 ; i<arrayNumbers.length ; i++)
            {
                arrayNumbers[i] = clss.inputNumbers(i);
                if(i == 9)
                {
                    for(int j = 0; j<arrayNumbers.length-1 ; j++)
                    {
                        if(arrayNumbers[j] < arrayNumbers[j+1])
                        {
                            crecienteArray = true;
                        }
                        if(arrayNumbers[j] >= arrayNumbers[j+1])
                        {
                            crecienteArray = false;break;
                        }
                    }
                }
                
            }
            if(crecienteArray == false)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Entrada de datos exitoso");
            }
            
        }while (crecienteArray == false);
        
        do
        {
            for(int i =0 ; i<arrayNumbers2.length ; i++)
            {
                arrayNumbers2[i] = clss.inputNumbers2(i);
                if(i == 9)
                {
                    for(int j = 0; j<arrayNumbers2.length-1; j++)
                    {
                        if(arrayNumbers2[j] < arrayNumbers2[j+1])
                        {
                            crecienteArray2 = true;
                        }
                        else
                        {
                            crecienteArray2=false;break;
                        }
                    }
                }
            }

            if(crecienteArray2 == false)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Entrada de datos exitosos");
            }
        }while(crecienteArray2 == false);
        
        for(int i = 0; i<arrayNumbers.length;i++)
        {
            arrayNumber3[i] = arrayNumbers[i];
            
            if(i == 9)
            {
                for(int j =0 ; j<arrayNumbers2.length; j++)
                {
                    arrayNumber3[cont] = arrayNumbers2[j]; 
                    cont++;
                }
            }
        }

        for(int i = 0 ; i<arrayNumber3.length; i++)
        {
            for(int j = 0; j<arrayNumber3.length;j++)
            {
                if(arrayNumber3[i] < arrayNumber3[j])
                {
                    aux = arrayNumber3[i];
                    arrayNumber3[i] = arrayNumber3[j];
                    arrayNumber3[j] = aux;
                }
            }
        }
        
        System.out.println("Array Ordenado forma Creciente: ");
        for ( int elemento : arrayNumber3 )
        {
            System.out.print("["+elemento+"]-");
        }
        
        JOptionPane.showMessageDialog(null,"Gracias por su tiempo");
        
        
    }
    
}
