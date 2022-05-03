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
public class Domicilio {
    private String nombreCalle;
    private int nroCalle;
    
    public Domicilio(String nombreCalle, int nroCalle)
    {
        this.nombreCalle = nombreCalle;
        this.nroCalle = nroCalle;
    }
    
    @Override
    public String toString()
    {
        return nombreCalle+" | "+nroCalle;
    }
}
