/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPractica;

/**
 *
 * @author alang
 */
public class Vehiculo {
    private String marca;
    private String modelo;
    private String patente;
    
    public Vehiculo(String marca, String modelo, String patente)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.patente = patente;
    }
    
    @Override
    public String toString()
    {
        return marca+" | "+modelo+" | "+patente;
    }
}
