/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio10;

/**
 *
 * @author alang
 */
public class Clase {

    public void printArrayOriginal(int [] arrayNumbers)
    {
        System.out.println("Array Original");
        for(int elementos: arrayNumbers)
        {
            System.out.print("["+elementos+"]-");
        }
    }
    public void printSaveValue(int [] numbers)
    {
        System.out.println("\nValores Guardados");
        for(int elementos: numbers)
        {
            System.out.print(elementos+" - ");
        }
    }
    public void printOrderValue(int [] arrayNumbers)
    {
        System.out.println("\nOrdenamiento");
        for(int elementos: arrayNumbers)
        {
            System.out.print(elementos+" - ");
        }
    }
}
