/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooTorneo;

/**
 *
 * @author alang
 */
public class Luchador {
    private String nombre;
    private int fuerza;
    private Estilo estilo;
    
    public Luchador(String nombre, int fuerza, Estilo estilo)
    {
        this.nombre = nombre ;
        this.fuerza= fuerza;
        this.estilo = estilo;
    }
    
    @Override
    public String toString()
    {
        return nombre+" | FUERZA: "+fuerza+" | ESTILO PELEA: "+estilo;
    }
}
