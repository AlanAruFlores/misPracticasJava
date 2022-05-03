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
public class Auto extends Vehiculo {
    private boolean aireAcondicionado;
    
    public Auto(String marca,String modelo, String patente, boolean aireAcondicionado)
    {
        super(marca,modelo,patente);
        this.aireAcondicionado = aireAcondicionado;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | AIRE ACONDICIONADO: "+aireAcondicionado+" | AUTO";
    }
}
