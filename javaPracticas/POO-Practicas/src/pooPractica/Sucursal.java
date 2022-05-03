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
public class Sucursal extends ComercioAutos{
    
    private Fabrica fabrica;
    
    public Sucursal(String nombre, Fabrica fabrica)
    {
        super(nombre);
        this.fabrica = fabrica;
    }
    public void verEstadoComerciante()
    {
        System.out.println(fabrica);
    }
    @Override
    public String toString()
    {
        return super.toString()+" SUCURSAL";
    }
}
