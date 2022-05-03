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
public class Auto extends Vehiculo {
    private boolean aireAcondicionado;
    
    public Auto(String marca, String patente, int km, boolean aireAcondicionado)
    {
        super(marca,patente, km);
        this.aireAcondicionado = aireAcondicionado;
    }
    
    public void probarMetodo()
    {
        
    }
    @Override
    public void arrancar()
    {
        System.out.println("ARRANCO CON 4 RUEDAS");
    }
    
    @Override 
    public String toString()
    {
        return super.toString()+" | Aire Acondicionado: "+aireAcondicionado+" | AUTO";
    }
}
