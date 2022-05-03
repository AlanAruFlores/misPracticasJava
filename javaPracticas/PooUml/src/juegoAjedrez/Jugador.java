/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoAjedrez;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Jugador extends Usuario{
    
    public Jugador(String nombre)
    {
        super(nombre);
        establecerLetra();
    }
    @Override
    public void establecerLetra()
    {
        setSigno("X");
    }
    @Override
    public int elegirPosicion()
    {
        int numero; 
        do
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN VALOR DE 1 AL 9"));
        }while(numero < 1 || numero >9);      
        return numero;
    }
}
