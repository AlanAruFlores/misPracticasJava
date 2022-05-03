/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio5;

/**
 *
 * @author alang
 */
public class Arreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Mezclar 2 arreglos, es decir, imprimirlos en orden
        Class clss = new Class();
        
        int arrayfirst[], arraysecond[], arraythird[];
        
        arrayfirst = new int[10];
        arraysecond = new int[10];
        arraythird = new int [arrayfirst.length + arraysecond.length];
        
        int cont=0, j=0;
        /*
        Otra forma de definir arreglos
        int [] arrayfirst = new int[10];
        int [] arraysecond = new int[10];
        */
        for(int i = 0; i < arrayfirst.length; i++)
        {
            arrayfirst[i]=clss.inputNumbers(i);
            arraysecond[i]=clss.inputNumbers2(i);
        }
        for(int i = 0; i<arrayfirst.length;i++)
        {
            arraythird[j]=arrayfirst[i];
            j++;
            arraythird[j]=arraysecond[i];
            j++;
        }
        for (int elementos: arraythird)
        {
            cont++;
            System.out.println("El valor "+cont+" del tercer Array es: "+elementos);
        }
    }
    
}
