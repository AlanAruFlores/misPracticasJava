/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Operaciones {
      //Atributoso o variables globales
    int numero;
    int numero2;
    int suma;
    int resta;
    int multiplicacion;
    int division;
    //Metodos (Acciones)
    public void leerNumeros()
    {
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
    }
    public void sumar()
    {
        suma = numero + numero2;
    } 
    public void restar()
    {
        resta = numero - numero2;
    }
    public void multiplicar()
    {
        multiplicacion = numero * numero2;
    }
    public void dividir()
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
