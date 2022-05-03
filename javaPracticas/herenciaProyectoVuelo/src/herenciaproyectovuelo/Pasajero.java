/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaproyectovuelo;

/**
 *
 * @author alang
 */
public class Pasajero {
    private String nombre;
    private int nroPasaporte;
    private Nacionalidad nacionalidad;
    
    public Pasajero(String nombre, int nroPasaporte, Nacionalidad nacionalidad)
    {
        this.nombre = nombre;
        this.nroPasaporte = nroPasaporte;
        this.nacionalidad = nacionalidad;
    }
    
    @Override
    public String toString()
    {
        return nombre+" | NRO PASAPORTE : "+nroPasaporte+" | NACIONALIDAD: "+nacionalidad;
    }
}
