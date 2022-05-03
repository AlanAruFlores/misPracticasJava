/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooCartas;

/**
 *
 * @author alang
 */
public class CartaCorazon extends Carta{
    
    public CartaCorazon(int numero){
        super(numero);
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" | CORAZON";
    }
}

