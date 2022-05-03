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
public abstract class Carta {
    private static int cont = 0;
    private int numero;
    private Letra letra;
    
    public Carta(int numero){
        this.numero = numero;
        establecerLetra(numero);
        reiniciarContador();  
    }
    private void reiniciarContador(){
       if(Carta.cont>3){
           Carta.cont = 0;
       } 
    }
    private void establecerLetra(int numero){
        Letra letras[] = Letra.values();
        if(numero == 1){
            this.letra = Letra.A;
        }
        else if(numero > 10){
            this.letra = letras[Carta.cont];
            Carta.cont++;
        }
        else{
            this.letra = null;
        }
    }
    
    @Override
    public String toString()
    {
        return "NUMERO CARTA: "+numero+" | LETRA: "+letra;
    }
    
}
