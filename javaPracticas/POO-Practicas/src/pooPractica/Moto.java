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
public class Moto extends Vehiculo {
    private boolean radio;
    
    public Moto(String marca,String modelo,String patente,boolean radio)
    {
        super(marca,modelo,patente);
        this.radio = radio;
    }
    
    @Override
    public String toString()
    {
        return super.toString() +" | RADIO : "+radio+" | MOTO";
    }
}
