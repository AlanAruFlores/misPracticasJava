/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author alang
 */
public abstract class Juego {
    private String nombre;
    private int stock ;
    
    public Juego(String nombre, int stock)
    {
        this.nombre = nombre;
        this.stock = stock;
    }
    public Juego(String nombre)
    {
        this.nombre = nombre;
        this.stock = 0;
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getStock()
    {
        return stock;
    }
    @Override
    public String toString()
    {
        return nombre;
    }
    
}
