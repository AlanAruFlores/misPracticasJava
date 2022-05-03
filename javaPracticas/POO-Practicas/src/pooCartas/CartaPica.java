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
public class CartaPica extends Carta {
   
    public CartaPica(int numero){
        super(numero);
    }
    
    @Override
    public String toString(){
        return super.toString()+" | PICA";
    }
}
