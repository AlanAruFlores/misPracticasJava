/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;
import java.util.Scanner;
import javax.swing.JOptionPane;
import java.util.ArrayList;

/**
 *
 * @author alang
 */
public class Class {
    public static int menu()
    {
        Scanner entrada =  new Scanner(System.in);
        int opcion;
        boolean error = false;
        do
        {
            System.out.println("-------------INICIO DEL PROGRAMA---------------");
            System.out.println("DIGITE UNA OPCION A INGRESAR:"
                    + "\n[1]JUGAR"
                    + "\n[2]VER ESTADISTICAS"
                    + "\n[3]SALIR");
            System.out.print("OPCION: ");
            opcion = entrada.nextInt();
        
            if(opcion  < 1 || opcion >3)
            {
                error = true;
                JOptionPane.showMessageDialog(null,"ERROR");
            }
            
        }while (error == true);
        
        return opcion;        
    }
    public static void playGame(ArrayList <Usuario> arrayUsers)
    {
        Scanner entrada = new Scanner(System.in);
        char [][] matriz = new char[3][3];
        char select, letra;
        int selectX, selectY, k=0;
        boolean verification1 , verification2, error= false;
        System.out.println("-----------TABLERO---------------");
        Class.mostrarTabla(matriz);
        
        do
        {
            
            do       
            {
                error = false;
                selectY = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA FILA EN DONDE VA A ELEGIR, JUGADOR "+(k+1)));
                selectX = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA COLUMNA EN DONDE VA A ELEGIR, JUGADOR "+(k+1)));
                
                if(matriz [selectY][selectX]=='X' || matriz [selectY][selectX] == '0'){
                    error = true;
                    JOptionPane.showMessageDialog(null,"ERROR LUGAR NO DISPONIBLE");
                }
                /*
                if(selectY < 0 || selectY > 2 )
                {
                    error = true;
                    JOptionPane.showMessageDialog(null,"POSICION NO DISPONIBLE");
                }
*/
            }while(error  == true);
            
            
            if(k == 0)
            {
                k++;
                letra = 'X';
                
            }
            else
            {

                k--;
                letra = 'O'; 
            }
            matriz[selectY][selectX] = letra;

            
            verification1 = winnerPlayer1(matriz);
            verification2 = winnerPlayer2(matriz);

            System.out.println("-------------------------");
            Class.mostrarTabla(matriz);
            
            if(verification1 == true)
            {
                JOptionPane.showMessageDialog(null,"FELICIDADES "+arrayUsers.get(0).getNombre()+", GANASTE LA PARTIDA");
                arrayUsers.get(0).setVictorias(1);
                arrayUsers.get(1).setPerdidas(1);break;
            }
           
            else if (verification2 == true)
            {
                JOptionPane.showMessageDialog(null,"FELICIDADES "+arrayUsers.get(1).getNombre()+", GANASTE LA PARTIDA");
                arrayUsers.get(1).setVictorias(1);
                arrayUsers.get(0).setPerdidas(1);
            }
            else
            {
                System.out.println("SIGUIENTE TURNO:");
            }
        }while(verification1 != true || verification2 != true);
        
    }
    public static void mostrarTabla(char matriz [] [])
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("| "+matriz [i] [j]+" |");
            }
            System.out.println("");
        }
    }
    
    
    public static boolean winnerPlayer1(char matriz [][])
    {
        boolean verification = false;
        
        
        //Horizontales
        if(matriz [0][0] == 'X'  && matriz [0][1] == 'X' && matriz [0][2] == 'X')
        {
            verification = true;
        }
        else if(matriz [1][0] == 'X'  && matriz [1][1] == 'X' && matriz [1][2] == 'X')
        {
            verification = true;
        }
        else if(matriz [2][0] == 'X'  && matriz [2][1] == 'X' && matriz [2][2] == 'X')
        {
            verification = true;
        }
        
        //Verticales
        else if(matriz [0][0] == 'X'  && matriz [1][0] == 'X' && matriz [2][0] == 'X')
        {
            verification = true;
        }
        else if(matriz [0][1] == 'X'  && matriz [1][1] == 'X' && matriz [2][1] == 'X')
        {
            verification = true;
        }
        else if(matriz [0][2] == 'X'  && matriz [1][2] == 'X' && matriz [2][2] == 'X')
        {
            verification = true;
        }
        //Diagonales
        else if(matriz [0][0] == 'X'  && matriz [1][1] == 'X' && matriz [2][2] == 'X')
        {
            verification = true;
        }
        else if(matriz [2][0] == 'X'  && matriz [1][1] == 'X' && matriz [0][2] == 'X')
        {
            verification = true;
        }
        
        else
        {
            verification = false;
            
        }
       
        return verification;
        
    }
    public static boolean winnerPlayer2(char matriz [][])
    {
        boolean verification = false;
        
        
        //Horizontales
        if(matriz [0][0] == 'O'  && matriz [0][1] == 'O' && matriz [0][2] == 'O')
        {
            verification = true;
        }
        else if(matriz [1][0] == 'O'  && matriz [1][1] == 'O' && matriz [1][2] == 'O')
        {
            verification = true;
        }
        else if(matriz [2][0] == 'O'  && matriz [2][1] == 'O' && matriz [2][2] == 'O')
        {
            verification = true;
        }
        
        //Verticales
        else if(matriz [0][0] == 'O'  && matriz [1][0] == 'O' && matriz [2][0] == 'O')
        {
            verification = true;
        }
        else if(matriz [0][1] == 'O'  && matriz [1][1] == 'O' && matriz [2][1] == 'O')
        {
            verification = true;
        }
        else if(matriz [0][2] == 'O'  && matriz [1][2] == 'O' && matriz [2][2] == 'O')
        {
            verification = true;
        }
        //Diagonales
        else if(matriz [0][0] == 'O'  && matriz [1][1] == 'O' && matriz [2][2] == 'O')
        {
            verification = true;
        }
        else if(matriz [2][0] == 'O'  && matriz [1][1] == 'O' && matriz [0][2] == 'O')
        {
            verification = true;
        }
        
        else
        {
            verification = false;
            
        }
       
        return verification;
    }
    
}
