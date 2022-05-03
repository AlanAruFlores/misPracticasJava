/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciosjava2;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
        Objeto ob1 = new Objeto();
        Scanner entrada = new Scanner(System.in);
        int opcion, exitProgram=0;
        do
        {
            System.out.println("[1]ARRIBA"
                    + "\n[2]ABAJO"
                    + "\n[3]DERECHA"
                    + "\n[4]IZQUIERDA"
                    + "\n[5]SALIR}"
                    + "\nMOVIMIENTO: ");
            ob1.mostrarMovimiento();
            opcion = entrada.nextInt();
            
            switch(opcion)
            {
                case 1:
                {
                    ob1.setMovimientoY(1);
                    break;
                }
                case 2:
                {
                    ob1.setMovimientoY(-1);
                    break;
                }
                case 3:
                {
                    ob1.setMovimientoX(-1);
                    break;
                }
                case 4:
                {
                    ob1.setMovimientoX(1);
                    break;
                }
                case 5:
                {
                    exitProgram = 1;
                }
            }
        }while(exitProgram != 1);
        
        ob1.mostrarMovimiento();
        
        
        
    }
}
