/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooConcecionaria;

/**
 *
 * @author alang
 */
public abstract class Vehiculo {
    private String marca;
    private String patente;
    private int km;
    
    public Vehiculo(String marca, String patente, int km)
    {
        this.marca= marca;
        this.patente = patente;
        this.km = km;
    }
    
    public abstract void arrancar();
    
    @Override
    public String toString()
    {
        return marca+" | "+patente+" | "+km;
    }
}
