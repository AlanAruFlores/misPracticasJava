/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoAjedrez;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    public static void main(String[] args) {
        Jugador usuario = new Jugador("Ale");
        CPU bot = new CPU();
        usuarios.add(usuario);
        usuarios.add(bot);
        TaTeTi juego = new TaTeTi ( usuarios ); 
       
        int opcion;
        
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    juego.mostrarEstadisticas();
                    break;
                }
                case 2:
                {
                    juego.ejecutarJuego();
                    break;
                }
                case 3:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO..");
                    break;
                }
                case 4:
                {
                    break;
                }
            }
        }while(opcion != 3);
        

        
        
    }
    public static int ingresarOpcion(){
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]VER ESTADISTICAS"
                    + "\n[2]JUGAR"
                    + "\n[3]SALIR"));
            
        }while(opcion < 1 || opcion > 3);
        return opcion;
    }
}
