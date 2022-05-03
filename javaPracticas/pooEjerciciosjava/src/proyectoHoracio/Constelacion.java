/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoHoracio;

/**
 *
 * @author alang
 */
public class Constelacion {
    private static final int distanciaCercanaSol = 1000;
    private int distancia;
    private boolean bandaCeleste;
    private boolean cercano;
    
    public Constelacion (int distancia , boolean bandaCeleste)
    {
        this.distancia = distancia;
        setCercano(distancia);
        this.bandaCeleste = bandaCeleste;
    }
    public void setCercano(int distancia)
    {
        if(distancia > 1000)
        {
            cercano  = true;
        }
        else
        {
            cercano = false;
        }
    }
    public boolean getCercano()
    {
        return cercano;
    }
    public int getDistancia()
    {
        return distancia;
    }
    public boolean getBandaCeleste()
    {
        return bandaCeleste;
    }
    
}
