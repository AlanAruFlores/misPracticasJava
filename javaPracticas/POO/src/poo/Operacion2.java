/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author alang
 */
public class Operacion2 {
    
    //Atributos y son variables globales
    int suma;
    int resta;
    int multiplicacion;
    int division;
    
    public void sumar(int numero , int numero2)
    {
        suma = numero + numero2;
    }
    public void restar(int numero , int numero2)
    {
        resta = numero - numero2;
    }
    public void multiplicar(int numero , int numero2)
    {
        multiplicacion = numero * numero2;
    }
    public void dividir(int numero , int numero2)
    {
        division = numero / numero2;
    }
    public void mostrarResultados()
    {
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
    }
    
}
