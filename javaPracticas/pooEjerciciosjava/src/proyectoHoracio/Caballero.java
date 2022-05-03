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
public class Caballero {
    private String nombre;
    private int edad;
    private int nivelMaldad;
    private boolean precoz;
    private int añosArmadura;
    Constelacion constelacion;
    
    public Caballero(String nombre, int edad, int nivelMaldad, int añosArmadura,Constelacion constelacion)
    {
        this.nombre = nombre;
        this.edad = edad;
        this.añosArmadura = añosArmadura;
        setPrecoz(añosArmadura);
        this.nivelMaldad = nivelMaldad;
        this.constelacion = constelacion;
                
    }
    public int getNivelMaldad()
    {
        return nivelMaldad;
    }
    public Constelacion getConstelacion()
    {
        return constelacion;
    }
    public void mostrarCaballero()
    {
        System.out.println(nombre+" | "+edad+" | "+nivelMaldad);
    }
    public void setPrecoz(int añosArmadura)
    {
        if(añosArmadura < 12)
        {
            precoz = true;
        }
        else
        {
            precoz = false;
        }
    }
    public boolean getPrecoz()
    {
        return precoz;
    }
    
}