/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args)
    {
        Objeto obj1;
        
        int matriz[][] = new int [10][10];
        int movimiento,contMovX=0, contMovY=0, nombre, aux;
        boolean verificacion=false;
        String continuar;
     
        
        nombre = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un nombre al objeto"));
        obj1 = new Objeto (nombre);
        
        
        
        do
        {
        verificacion = false;
        movimiento = Integer.parseInt(JOptionPane.showInputDialog("Ingrese algun movimiento"
                + "\n[1] Arriba"
                + "\n[2] Izquierda"
                + "\n[3] Abajo"
                + "\n[4] Derecha"));
        
        
        if(movimiento == 1)
        {
          
            
            contMovY=obj1.getMovimientoY(movimiento, contMovY);
            
                if(contMovY >=0)
                {
                    matriz[contMovY+1][contMovX]=0;
                    matriz [contMovY][contMovX] = nombre;
                    verificacion = true;
                }
                else
                {
                    contMovY--;
                    System.out.println("No se puede seguir moviendo hacia abajo");
                    verificacion = false;
                }

        }
        else
            if(movimiento == 2)
            {
                contMovX = obj1.getMovimientoX(movimiento, contMovX);
                if(contMovX>=0)
                {
                    matriz[contMovY][contMovX+1]=0;
                    matriz[contMovY][contMovX] = nombre;
                    verificacion = true;
                }
                else
                {
                    contMovX++;
                    System.out.println("No se puede seguir moviendose a la Izquierda");
                    verificacion = false;
                }
            }
        else
            if(movimiento == 3)
            {
                contMovY=obj1.getMovimientoY(movimiento, contMovY);
            
                if(contMovY <=9)
                {
                    matriz[contMovY-1][contMovX]= 0;
                    matriz [contMovY][contMovX] = nombre;
                    verificacion = true;
                }
                else
                {
                    contMovY--;
                    System.out.println("No se puede seguir moviendo");
                    verificacion = false;
                }

            }
        else
            {
                contMovX = obj1.getMovimientoX(movimiento, contMovX);
                if(contMovX<=9)
                {
                    matriz[contMovY][contMovX-1]=0;
                    matriz[contMovY][contMovX] = nombre;
                    verificacion = true;
                }
                else
                {
                    contMovX--;
                    System.out.println("No se puede seguir moviendose a la Derecha");
                    verificacion = false;
                }
            }
        
        if(verificacion == true)
        {
           for(int i = 0 ; i<10; i++)
           {
               for(int j = 0 ; j< 10; j++)
               {
                   System.out.print(matriz[i][j]+"  ");
               }
               System.out.println("");
           }
           System.out.println("-----------------------------------------");
        }
        
        
        continuar = JOptionPane.showInputDialog("¿Desea continuar?"
        + "\nIngrese SI para continuar"
        + "\nIngrese NO para no continuar");
        
        continuar = continuar.toUpperCase();
        }while(continuar.equals("SI"));
    }
}
