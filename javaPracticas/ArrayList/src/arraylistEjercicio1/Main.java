/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylistEjercicio1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args)
    {
        /*Ejercicio: Ingresar n numeros, y que el le diga al usuario si ese dato a buscar la contiene el arraylist*/
        ArrayList <Integer> arrayNumbers = new ArrayList <Integer> ();
        
        int nElements;
        boolean search=false;
        nElements = Integer.parseInt(JOptionPane.showInputDialog("INGRESE CUANTOS NUMEROS VA A INGRESAR"));
        arrayNumbers.ensureCapacity(nElements);
        
        for(int i = 0; i < nElements; i++)
        {
            int numero = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NUMERO "+(i+1)));
            arrayNumbers.add(numero);
        }
        
        int searchNumber = Integer.parseInt(JOptionPane.showInputDialog("INGRESE EL NRO A BUSCAR"));
        
        search = arrayNumbers.contains(searchNumber);
        
        /*
        for(Integer elements : arrayNumbers)
        {
            if(elements == searchNumber){
                search = true;
            }
        }
        */
        if(search == true)
        {
            System.out.println("EL NUMERO A BUSCAR, ESTA DENTRO DEL ARRAYLIST");
        }
        else
        {
            System.out.println("EL NUMERO A BUSCAR, NO ESTA DENTRO DEL ARRAYLIST");
        }
        
        
        
    }
}
