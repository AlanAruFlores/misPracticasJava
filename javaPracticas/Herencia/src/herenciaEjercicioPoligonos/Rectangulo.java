/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEjercicioPoligonos;

/**
 *
 * @author alang
 */
public class Rectangulo extends Poligonos{
    private int lado;
    private int lado2;
    
    
    public Rectangulo(int lado, int lado2)
    {
        this.lado = lado;
        this.lado2 = lado2;
    }
    
    @Override
    public double calcularArea(){
        return lado * lado2;
    }
    @Override 
    public void mostrarArea()
    {
        System.out.println("EL AREA DEL RECTANGULO ES: "+calcularArea());
    }
}
