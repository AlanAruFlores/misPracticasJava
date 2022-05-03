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
public class Moto extends Vehiculo{
    
    public Moto(String marca, String patente, int km )
    {
        super(marca,patente,km);
    }
    
    @Override
    public void arrancar()
    {
        System.out.println("ARRANCO CON 2 RUEDAS");
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | MOTO";
    }
    
}
