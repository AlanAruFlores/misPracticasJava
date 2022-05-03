/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicioS6;

/**
 *
 * @author alang
 */
public class Arreglos6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 2 tablas (Arreglos ) de 12 valores cada una y mostrarlas en un tercero pero 3 en 3.
        Class clss = new Class();
        
        int [] arrayNumbers = new int[12];
        int [] arrayNumbers2 = new int[12];
        int [] arrayNumbers3 = new int[arrayNumbers.length + arrayNumbers2.length];
        
        int cont=1, j = 0 , x = 3, y = 0, z=0;
        
        for(int  i = 0; i<arrayNumbers.length; i++)
        {
            arrayNumbers[i] =  clss.inputNumbersArray(i);
        }
        for (int i = 0; i<arrayNumbers2.length;i++)
        {
            arrayNumbers2[i] = clss.inputNumbersArray2(i);
        }
        
        for(int i = 0 ; i<4; i++)
        {
            for(int k=j ; k<x; k++)
            {
                arrayNumbers3[k] = arrayNumbers[y];
                y++;
            }
            j+=3;
            x+=3;
            for(int g=j ; g<x;g++)
            {
                arrayNumbers3[g] = arrayNumbers2[z];
                z++;
            }
            j+=3;
            x+=3;
        }
        for( int elemento : arrayNumbers3)
        {
            System.out.println("El valor "+(cont)+" es = "+elemento);
            cont++;
        }
        
        
        
    }
    
}
