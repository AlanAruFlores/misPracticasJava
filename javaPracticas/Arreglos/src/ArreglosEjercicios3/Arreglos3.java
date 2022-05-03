/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicios3;

/**
 *
 * @author alang
 */
public class Arreglos3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Guardar 5 numeros en un Arreglo y sacar la media de los postivos , negativos y contar los 0
        Class clase = new Class();
        
        int [] numbersArray = new int [5];
        int numbers, acumulador = 0, acumNegative=0, cont=0, contPositive=0, contNegative=0;
        float mediaPositive=0, mediaNegative=0;
        boolean verification=false;
        
        for(int i = 0; i<numbersArray.length;i++)
        {
            numbers=clase.inputNumbers(i);
            numbersArray[i] = numbers;
            cont += clase.contZero(numbers);
            verification = clase.verificationNumbers(numbers);
            
            if(verification == true)
            {
                acumulador += numbersArray[i];
                contPositive++;
            }
            else
            {
                acumNegative += numbersArray[i];
                contNegative++;
            }
            
            
        }
        
        mediaPositive = (float) acumulador / contPositive;
        mediaNegative = (float) acumNegative / contNegative;
        
        if(contNegative == 0 && contPositive > 0)
        {
            
        
            System.out.println("El promedio de los numeros positivos fue de: "+mediaPositive);
            System.out.println("No se hallo ningun numero negativo");
            System.out.println("Numeros 0 ingresados: "+cont);
        }
        else 
            if(contNegative > 0 && contPositive == 0)
            {
                System.out.println("El promedio de los numeros negativos fue de: "+mediaNegative);
                System.out.println("No se hallo ningun numero positivo");
                System.out.println("Numeros 0 ingresados: "+cont);
            }
        else
            {
                System.out.println("El promedio de los numeros positivos fue de: "+mediaPositive);
                System.out.println("El promedio de los numeros negativos fue de: "+mediaNegative);
                System.out.println("Numeros 0 ingresados: "+cont);
            }
        /*
        Otra forma de comparar:
        if(contPositive == 0)
        {
            System.out.println("No se hallo ningun numero positive");
        }
        else
        {
            System.out.println("El promedio de los numeros positivos es: "+mediaPositive);
        }
        if(contNegative == 0)
        {
            System.out.println("No se hallo ningun negativo")
        }
        else
        {
            System.out.println("El promedio de los numeros negativos es: "+mediaNegativo¿e);
        }
        
        System.out.println("La cantidad de 0 ingresados es: "+cont);
        */
        
        
    }
    
}

