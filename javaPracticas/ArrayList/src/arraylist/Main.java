/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Inicio de ArrayList 
        //Definir el Arraylist:
        ArrayList <Integer> numeros2 = new ArrayList<Integer>();
        int numeros []  = {1,2,3,4,5};
        
        
        //Para agregar valores dentro del Arraylist
        numeros2.add(1);
        numeros2.add(2);
        numeros2.add(2);
        numeros2.add(2);
        numeros2.add(2);
        
        numeros2.clear();
        
        
        //Nos sirve para sacar la memoria sin usar
        numeros2.trimToSize();
        
       for( int elementos : numeros)
       {
           System.out.println(elementos);
       }
       
       //Imprimimos el Arraylist
       for( Integer elementos  : numeros2)
       {
           System.out.println(elementos);
       }
       ArrayList <Integer> arrayNumbers = new  ArrayList<Integer>();
       arrayNumbers.add(1);
       arrayNumbers.add(2);
       arrayNumbers.add(3);
       arrayNumbers.add(4);
       //ArrayList <Integer> arrayClone = new ArrayList<Integer>();
       Iterator <Integer> iterador = arrayNumbers.iterator();
       
       
       

       
       while(iterador.hasNext())
       {    
           System.out.println(iterador.next());
       }
       /*
       arrayClone.addAll(arrayNumbers);
       arrayClone.trimToSize();
    
       for(Integer number : arrayClone)
       {
           System.out.println(number);
       }
       */
   }
    
}
