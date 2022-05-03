/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;

/**
 *
 * @author alang
 */
public enum Experiencia {
    JUNIOR(1000),
    SEMISENIOR(2000),
    SENIOR(3000);
    
    private double sueldo;
    
    private Experiencia(double sueldo)
    {
        this.sueldo = sueldo;
    }
    
    public double getSueldo()
    {
        return sueldo;
    }
}
