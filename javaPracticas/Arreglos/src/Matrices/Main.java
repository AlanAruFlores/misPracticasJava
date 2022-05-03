/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Matrices;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Una matriz es una array bidimensional, es decir esta va a contener filas y columnas, se podria decir que es un array de arrays
        
        //Se la puede definir de distintas formas , Ejemplo:
        Scanner input  = new Scanner(System.in);
        /*
        Forma 1:
        int matriz [][]  = new int [3][3];
        
        for ( int i = 0 ; i<3; i++)
        {
            for(int j = 0 ; j < 3 ; j++)
            {
                System.out.println("Ingrese el dato de la matriz ["+i+"] ["+j+"]");
                matriz[i][j] = input.nextInt();
            }
        }
        */
        /*
        Forma 2:
        int matriz[][] = {{1,2,3,},{1,2,3},{1,2,3}};
        */
        /*Forma 3:
        int matriz[][], nFilas, mColumnas;
        
        nFilas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Filas de la matriz"));
        mColumnas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese Columnas de la matriz"));
        
        matriz = new int[nFilas][mColumnas];
        
        for (int i = 0 ; i < nFilas ; i++) 
        {
            for(int j = 0 ; j < mColumnas ; j++)
            {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        */
    }
    
}
