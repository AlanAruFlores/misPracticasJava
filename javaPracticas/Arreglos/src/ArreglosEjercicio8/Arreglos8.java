/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio8;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Arreglos8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Desarrollar una aplicacion, declarar un array de 10 elementos enteros y pedirle al usuario que ingrese
        8 numeros enteros e ingresar otro numero con una posicion*/
        Class clss = new Class();
        
        int [] arrayNumbers =  new int[10];
        int newNumber=0, newPosition=0;
        
        //Ingresamos 8 numeros
        for(int i = 0 ; i<8; i++)
        {
            arrayNumbers[i] = clss.inputNumbers(i);
        }
        System.out.println("Array Original");
        for(int elementos:arrayNumbers)
        {
            System.out.print("["+elementos+"] - ");
        }
        
        // Le solicitamos al usuario que ingrese un numero nuevo y una posicion
        JOptionPane.showMessageDialog(null,"Faltan numeros a ingresar: ");
        newNumber = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nuevo numero"));
        newPosition = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su posicion (entre 1 y 10)"));
        
        /*Esto sirve para que en caso de que el cliente elija una determinada posicion, este se reste a una. 
        Por ejemplo si el usuario desea ubicar el numero nuevo en la posicion 10, esta posicion 10 
        va a ser igual a arrayNumbers[9]*/
        newPosition--;
        if(newPosition >= 0 && newPosition <=7)
        {
            for(int i = 7; i>=newPosition;i--)
            {
                arrayNumbers[i+1] = arrayNumbers[i];
            }
            arrayNumbers[newPosition] = newNumber;
        }
        else
        {
            arrayNumbers[newPosition] = newNumber;
        }
        
        System.out.println("\nArray con un numero nuevo y una nueva posicion");
       for(int elementos: arrayNumbers)
       {
           System.out.print("["+elementos+"] - ");
       } 
         
        /*
        int tabla[] = new int[10];
        int numero;
        int posicion;
        
        Scanner entrada = new Scanner(System.in);
        
        //Pedimos los 8 números
        for(int i=0;i<8;i++){
            System.out.print("Digite un número: ");
            tabla[i] = entrada.nextInt();
        }
        
        //Pedimos el nuevo número que queremos insertar
        System.out.print("Digite el número que desea insertar en la tabla: ");
        numero = entrada.nextInt();
        
        //Pedimos la posición que queremos insertar
        System.out.print("Digite la posición donde quiere insertarlo: ");
        posicion = entrada.nextInt();
        
        
        Recorremos el arreglo desde la penúltima posición, ya que aunque el arreglo
        tenga un tamaño de 10 números, tiene 9 posiciones, 
        ya que comienza en la posición [0], por lo tanto empezamos
        desde la posición 8 y vamos moviendo todos los números hasta llegar
        a la posición que hemos definido:
        
        for(int i=8;i>=posicion;i--){
            tabla[i+1] = tabla[i];
        }
        
        //Insertamos el número en la posición
        tabla[posicion] = numero;
        
        //Imprimimos el arreglo
        for(int i:tabla){
            System.out.println(i);
        }
       */
        
        
    }
    
}
