/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio2;

/**
 *
 * @author alang
 */
public class Dni {
    private String nombre;
    private long nroDocumento;
    private Genero genero;
    private Pais pais;
    
    public Dni(String nombre, Genero genero, Pais pais)
    {
        this.nombre = nombre;
        this.nroDocumento = generarNroDocumento();
        this.genero = genero;
        this.pais = pais;
    }
    private long generarNroDocumento()
    {
        return (long)Math.random()+450000*400000;
    }
    
    @Override
    public String toString()
    {
        return "DNI:"
                + "\nNOMBRE: "+nombre+""
                + "\nNRO DOCUMENTO: "+nroDocumento+""
                + "\nGENERO: "+genero+""
                + "\nPAIS: "+pais;
    }
}
