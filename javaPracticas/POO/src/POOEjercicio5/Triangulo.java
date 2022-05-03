/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio5;
/**
 *
 * @author alang
 */
public class Triangulo {
    private double lado1;
    private double lado2;
    private double lado3;
    
    public Triangulo(double lados, double base)
    {
        this.lado1 = this.lado2 = lados;
        this.lado3 = base;
    }
    public double getPerimetro()
    {
        double perimetro = lado1+lado2+lado3;
        return perimetro;
    }
    public double getArea()
    {
        double altura = Math.sqrt(Math.pow(lado1, 2) - (Math.pow(lado3,2) / 4));
        double area = (lado3 * altura) / 2;
        
        return area;
    }
    
    
    
    
}
