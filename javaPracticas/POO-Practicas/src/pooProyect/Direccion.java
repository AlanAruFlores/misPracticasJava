/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyect;

/**
 *
 * @author alang
 */
public class Direccion {
    private String nombreCalle;
    private int nroCalle;
    
    public Direccion(String nombreCalle, int nroCalle){
        this.nombreCalle = nombreCalle;
        this.nroCalle = nroCalle;
    }
    
    @Override
    public String toString(){
        return "DIRECCION: "+nombreCalle+nroCalle;
    }
}
