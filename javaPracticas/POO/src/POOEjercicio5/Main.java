/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio5;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static double getMayorArea(Triangulo triangulos[])
    {
        double areaMayor = triangulos[0].getArea();
        for(int  i = 0 ; i< triangulos.length; i++)
        {
            if(triangulos[i].getArea() > areaMayor)
            {
                areaMayor = triangulos[i].getArea();

                       
            }
        }      
        return areaMayor;
    }
    public static void main (String [] args)
    {
        int ladosIsosceles, baseIsosceles,contTriangulos, idMayorArea=0;
        double areaMayor = 0;
        
        
        contTriangulos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de triangulos Isosceles"));
        Triangulo triangulos[] = new Triangulo[contTriangulos];
        
        for(int i = 0 ; i < triangulos.length ; i++)
        {
            ladosIsosceles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese valor para los lados iguales (Izquierdo y Derecho)"));
            baseIsosceles = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la base del triangulo"));
            
            triangulos[i] = new Triangulo(ladosIsosceles, baseIsosceles);
            
            System.out.println("El perimetro del triangulo "+(i+1)+" es: " +triangulos[i].getPerimetro());
            System.out.println("El Area del triangulo "+(i+1)+" es: "+triangulos[i].getArea());
            System.out.println("---------------------------------------------------------------------------");
            
        }
        areaMayor = getMayorArea(triangulos);
        System.out.println("El Area mas alto es: "+areaMayor);
        
    }
}
