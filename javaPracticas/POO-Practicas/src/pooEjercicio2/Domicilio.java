/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2;

/**
 *
 * @author alang
 */
public class Domicilio {
    private String nombre;
    private int nro;
    
    public Domicilio(String nombre, int nro)
    {
        this.nombre = nombre;
        this.nro = nro;
    }
    
    @Override
    public String toString()
    {
        return nombre+" | "+nro;
    }
}
