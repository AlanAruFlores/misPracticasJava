/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciosjava;

/**
 *
 * @author alang
 */
public class PooEjerciciosjava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Construir un programa que calcule el perimetro de un cuadrilatero dada 2 longitudes si es 1
        lado se la considera como un cuadrado con lados iguales*/
        Cuadrilatero cuadrilatero1 = new Cuadrilatero(5, 100);
        Cuadrilatero cuadrilatero2 = new Cuadrilatero(4);
        
        cuadrilatero1.mostrarDatos();
        cuadrilatero2.mostrarDatos();
    }
    
}
