/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio13;

/**
 *
 * @author alang
 */
public class Arreglos13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer 10 numeros enteros en un arreglo y guardar en otro arreglo los pares e impares
        Class cl_ss = new Class();
        
        int[]arrayNumbers = new int[10];
        int [] arrayPar ;
        int [] arrayImpar;
        
        int contPar=0, contImpar=0, k = 0, k2=0;
        
        for (int i = 0; i<arrayNumbers.length; i++)
        {
            arrayNumbers[i] = cl_ss.inputNumbers(i);
            
            contPar += cl_ss.verificationTypeOfNumber(arrayNumbers,i);
            contImpar +=cl_ss.verificationTypeOfNumber4(arrayNumbers, i);
            
        }
        
        
        arrayPar = new int[contPar];
        arrayImpar = new int[contImpar];
        /*
        System.out.println(arrayPar.length);
        System.out.println(arrayImpar.length);
        */
        
        for (int valorArray : arrayNumbers)
        {
            if(valorArray%2==0)
            {
                arrayPar[k]=valorArray;
                k++;
            }
            if(valorArray%2!=0)
            {
                arrayImpar[k2]=valorArray;
                k2++;
            }
        }
        System.out.println("Array Par:");
        for(int elementos:arrayPar)
        {
            System.out.print("["+elementos+"]-");
        }
        System.out.println("Array Impar");
        for(int elemento:arrayImpar)
        {
            System.out.print("["+elemento+"]-");
        }
        
        
        
    }
    
}
