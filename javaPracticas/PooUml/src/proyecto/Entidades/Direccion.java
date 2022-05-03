/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Entidades;

/**
 *
 * @author alang
 */
public class Direccion {
    private String calle;
    private int nroCalle;
    private int codigoPostal;
    private String localidad;
    private String provincia;
    
    public Direccion(String calle, int nroCalle, int codigoPostal, String localidad, String provincia)
    {
        this.calle = calle;
        this.nroCalle = nroCalle;
        this.codigoPostal = codigoPostal;
        this.localidad = localidad;
        this.provincia = provincia;
    }

    @Override
    public String toString() {
        return "Direccion{" + "calle=" + calle + ", nroCalle=" + nroCalle + ", codigoPostal=" + codigoPostal + ", localidad=" + localidad + ", provincia=" + provincia + '}';
    }
    
    
    
}
