/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio;

/**
 *
 * @author alang
 */
public class Cuadrilatero {
    private int lado1;
    private int lado2;

    
    public Cuadrilatero (int lado1, int lado2)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
       
        
    }
    public Cuadrilatero(int lado1)    
    {
        this.lado1 = this.lado2 = lado1;
    }
    
   public int getPerimetro()
   {
       int perimetro = 2*(lado1 + lado2);
       return perimetro;
   }
   public int getArea()
   {
       int area = lado1*lado2;
       return area;
   }
    
    
}
