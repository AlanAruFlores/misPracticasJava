/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

/**
 *
 * @author alang
 */
public enum Estilo_Pelea {
    KARATE(30,20),
    BOXEO(40,10);
    
    private int fuerza;
    private int agilidad;
    
    private Estilo_Pelea(int fuerza, int agilidad)
    {
        this.fuerza=fuerza;
        this.agilidad = agilidad;
    }
    
    public int getFuerza()
    {
        return fuerza;
    }
    public void setFuerza(int nuevaFuerza)
    {
        this.fuerza = nuevaFuerza;
    }
    public int getAgilidad()
    {
        return agilidad;
    }
    public void setAgilidad(int nuevaAgilidad)
    {
        this.agilidad = nuevaAgilidad;
    }
    
    public String mostrarEstadisticas()
    {
        return "PODER "+fuerza+" | AGILIDAD: "+agilidad;
    }
}
