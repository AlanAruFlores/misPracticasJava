/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciosjava3;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        Tablero objeto;
        int xInitial, yInitial, option, nMovimiento=0, exitProgram=0;
        
        xInitial = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA X INICIAL"));
        yInitial = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA Y INICIAL"));
        
        objeto = new Tablero(xInitial,yInitial);
        
        do
        {
            do
            {
                option = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION:"
                        + "\n[1]MOVER ARRIBA"
                        + "\n[2]MOVER ABAJO"
                        + "\n[3]MOVER DERECHA"
                        + "\n[4]MOVER IZQUIERDA"
                        + "\n[5]SALIR"));
            }
            while(option < 1 || option >6);

            do
            {
                nMovimiento = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL N MOVIMIENTOS"));
            }while(nMovimiento<0);

            switch(option)
            {
                case 1:
                {           
                    objeto.moverArriba(nMovimiento);break;
                }
                case 2:{
                    objeto.moverAbajo(nMovimiento);break;
                }
                case 3:
                {
                    objeto.moverDerecha(nMovimiento);break;
                }
                case 4:
                {
                    objeto.moverIzquierda(nMovimiento);break;
                }
                default:
                {
                    exitProgram = 1;
                }
            } 
            System.out.println("MOVIMIENTO: X="+objeto.getX()+" Y="+objeto.getY());
        }while(exitProgram !=1);

    }
}
