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
public class TaTeTi {
    private static int nFilas = 3;
    private static int nColumnas = 3;
    private String matriz[][];
    private ArrayList<Usuario> usuarios;
    private ArrayList<Integer> listaPosiciones;
    
    public TaTeTi(ArrayList <Usuario> usuarios) 
    {
        this.usuarios = new ArrayList<>();
        this.usuarios.addAll(usuarios);
        matriz =  new String[nFilas][nColumnas];
        listaPosiciones = new ArrayList<Integer>();
        rellenarMatriz();
    }
    private void rellenarMatriz()
    {
        for (int i = 0; i < nFilas; i++) {
            for (int j = 0; j < nColumnas; j++) {
                matriz[i][j] = "-";
            }
        }
        
    }
    
    public void mostrarEstadisticas()
    {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    
    public void ejecutarJuego()
    {
        boolean exitGame = false;
        int k = 0;
        Usuario usuarioGanador = null;
        rellenarMatriz();
        do
        {
            System.out.println("---------------------------------");
            mostrarMatriz();
            establecerPosicion(k);  
            usuarioGanador = verificarGanador(k);
            exitGame = verificarJuegoTerminado();
            k = establecerIterador(k);        
        }while(usuarioGanador == null && exitGame != true);
        
        System.out.println("-------------------------------");
        mostrarMatriz();
        
        
        if(usuarioGanador != null)
        {
            JOptionPane.showMessageDialog(null,"FELICIDADES "+usuarioGanador.getNombre()+", GANASTE !!!!");
            usuarioGanador.setVictoria();
            if(usuarioGanador.getSigno() == "X")
            {                
                usuarios.get(1).setPerdidas();
            }
            else
            {
                usuarios.get(0).setPerdidas();
            }
                   
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NO HUBO GANADOR :(");
        }
        
        listaPosiciones.clear();
       
    }
     
    private boolean verificarJuegoTerminado()
    {
        boolean exitGame = false;
        int k = 0;
        codigo : for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(matriz[i][j].contains("-") == false)
                {
                    k++;
                    if(k==9)
                    {
                        JOptionPane.showMessageDialog(null,"JUEGO TERMINADO");
                        exitGame = true;
                        break codigo;
                    }
                }
            }
        }
        return exitGame;
    }
    private Usuario verificarGanador(int k)
    {
        Usuario user = null;
        int d = 0;
        
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(usuarios.get(k).getSigno() == matriz[i][j])
                {
                    d++;
                    if(d == 3)
                    {
                        user = usuarios.get(k);
                    }
                    
                }
            }
            d = 0;
        }
        
        if(user == null)
        {
            d = 0;
            for (int i = 0; i < 3; i++) {
                for (int j = 0; j < 3; j++) {
                    if(usuarios.get(k).getSigno() == matriz[j][i])
                    {
                        d++;
                        if(d == 3)
                        {
                            user = usuarios.get(k);
                        }
                    }
                }
                d=0;
            }
        }
        else if(user == null)
        {
            d = 0;
            for (int i = 0; i < 3; i++) {
                if(matriz[i][i] == usuarios.get(k).getSigno())
                {
                    d++;
                    if(d == 3)
                    {
                        user = usuarios.get(k);
                    }
                }
            }
        }
        else if(user == null)
        {
            d = 0;
            int c = 2;
            for (int i = 0; i < 3; i++) {
                if(matriz[i][c] == usuarios.get(k).getSigno())
                {
                    d++;
                    if(d == 3)
                    {
                        user = usuarios.get(k);
                    }
                }
                c--;
            }
        }
        
        
        return user;
    }
    private void establecerPosicion(int k)
    {
        int pos;
        do
        {
            pos = usuarios.get(k).elegirPosicion();
        }while(listaPosiciones.contains(pos));   
        
        listaPosiciones.add(pos);
        establecerMatriz(pos,k);
 
    }
    private void establecerMatriz(int pos, int iterador)
    {
        int k = 1;
        for (int i = 0; i < 3 ; i++){
            for (int j = 0; j < 3; j++) {
                if(pos == k)
                {
                    matriz[i][j] = usuarios.get(iterador).getSigno();               
                }
                k++;
            }
        }
    }
    private void mostrarMatriz()
    {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j]+" | ");
            }
            System.out.println("");
        }
    }
    private int establecerIterador(int k)
    {
        if(k == 0){
            k++;
        }
        else
        {
            k--;
        }
        return k;
    }
    
}
