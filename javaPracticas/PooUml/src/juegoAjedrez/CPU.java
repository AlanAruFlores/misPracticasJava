/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoAjedrez;

/**
 *
 * @author alang
 */
public class CPU extends Usuario {
    
    public CPU()
    {
        super("CPU");
        establecerLetra();
       
    }
    
    @Override 
    public void establecerLetra()
    {
        setSigno("O");
    }
    @Override
    public int elegirPosicion(){
        return (int)(Math.random()*9+1);
    }
    
    @Override 
    public String toString()
    {
        return super.toString();
    }
    
}
