/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava6;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    public static int indiceMayorArea(Triangulo_Isosceles [] array)
    {
        int indiceMayor=0;
        double mayorArea=0;
        for (int i = 0; i < array.length; i++) {
            if(array[i].getArea() > mayorArea)
            {
                indiceMayor = i;
                mayorArea = array[i].getArea();
            }
        }
        return indiceMayor;
    }
    public static void main( String []args)
    {
        Scanner entrada = new Scanner(System.in);
        
        Triangulo_Isosceles [] arrayTriangulos;
        int nTriangulos, indiceMayor=0;
        float lado, base;
        
        System.out.println("DIGITE LA CANTIDAD DE TRIANGULOS A INGRESAR");
        nTriangulos = entrada.nextInt();
        
        arrayTriangulos = new Triangulo_Isosceles [nTriangulos];
        
        for (int i = 0; i < arrayTriangulos.length; i++) {
            System.out.println("DIGITE LOS LADOS DEL TRIANGULO "+(i+1));
            lado = entrada.nextFloat();
            System.out.println("DIGITE LA BASE DEL TRIANGULO "+(i+1));
            base = entrada.nextFloat();
            
            arrayTriangulos[i]= new Triangulo_Isosceles(lado,base);
            arrayTriangulos[i].mostrarDatos();
        }
        
        indiceMayor = indiceMayorArea(arrayTriangulos);
        System.out.println("DATOS DEL TRIANGULO CON MAYOR AREA: ");
        arrayTriangulos[indiceMayor].mostrarDatos();
       
    }
}
