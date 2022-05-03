/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciosjava2;

/**
 *
 * @author alang
 */
public class Objeto {
    private int movimientoX;
    private int movimientoY;
    
    public void setMovimientoX( int movimientoX)
    {
        this.movimientoX += movimientoX;
    }
    public void setMovimientoY (int movimientoY)
    {
       this.movimientoY += movimientoY; 
    }
    
    public void mostrarMovimiento()
    {
        System.out.println("( X ; Y ) = ( "+movimientoX+" ; "+movimientoY+" )");
    }
    
}
