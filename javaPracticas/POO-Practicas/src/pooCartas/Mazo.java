/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooCartas;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Mazo {
    private ArrayList <Carta> cartas;
    
    public Mazo(){
        this.cartas = new ArrayList();
    }
    
    public void armarMazo(){
        generarCorazones();
        generarPicas();
        generarRombos();
        generarTrebol();
    }
    
    private void generarCorazones(){
        for (int i = 0; i < 13; i++) {
            cartas.add(new CartaCorazon(i+1));
        }
    }
    private void generarPicas(){
        for (int i = 0; i < 13; i++) {
            cartas.add(new CartaPica(i+1));
        }
    }
    private void generarRombos(){
        for (int i = 0; i < 13; i++) {
            cartas.add(new CartaRombo(i+1));
        }
    }
    private void generarTrebol(){
        for (int i = 0; i < 13; i++) {
            cartas.add(new CartaTrebol(i+1));
        }
    }
    
    
    public void mostrarMazo(){
        for(Carta carta : cartas){
            System.out.println(carta);
        }
    }
}
