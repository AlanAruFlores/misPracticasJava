/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio3;

/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
        //Hacer un programa que determine si es un triangulo o cuadrado y determine el perimetro
        Geometria g1 = new Geometria (9,9,4);
        Geometria g2 =  new Geometria (4,4);
        
        g1.mostrarDatos();
        g2.mostrarDatos();
    }
}
