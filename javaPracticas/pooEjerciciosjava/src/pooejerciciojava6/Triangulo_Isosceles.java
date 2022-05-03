/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava6;

/**
 *
 * @author alang
 */
public class Triangulo_Isosceles {
    private float lado;
    private float base; 
    
    public Triangulo_Isosceles(float lado, float base)
    {
        this.lado = lado;
        this.base = base;
    }
    
    public float getPerimetro()
    {
        return (lado*2)+base;
    }
    public double getArea()
    {
        double altura = Math.sqrt(lado*lado-(base*base/4));
        return (base * altura)/2;
    }
    public void mostrarDatos()
    {
        System.out.println("TRIANGULO ISOSSCELES:");
        System.out.println("LADOS: "+lado+""
               +"\nBASE: "+base+""
               +"\nPERIMETRO: "+getPerimetro()+""
               +"\nAREA: "+getArea());
    }
}
