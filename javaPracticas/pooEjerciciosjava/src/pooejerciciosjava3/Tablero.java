/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciosjava3;

/**
 *
 * @author alang
 */
public class Tablero {
    private int x;
    private int y;
    
    
    public Tablero(int x, int y)
    {
        this.x = x;
        this.y = y;
    }
    
    public void moverArriba(int nMovimiento)
    {
        y+= nMovimiento;
    }
    public void moverAbajo (int nMovimiento)
    {
        y-=nMovimiento;
    }
    public void moverDerecha(int nMovimiento)
    {
        x+= nMovimiento;
    }
    public void moverIzquierda(int nMovimiento)
    {
        x-=nMovimiento;
    }
    
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
}
