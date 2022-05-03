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
public class POO {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Inicio de la programacion orientada a objetos
       
        /*
        Operaciones clase = new Operaciones();
        clase.leerNumeros();
        clase.sumar();
        clase.restar();
        clase.multiplicar();
        clase.dividir();
        clase.mostrarResultados();
        
        
        Operaciones op = new Operaciones();
        op.leerNumeros();
        op.sumar();
        op.mostrarResultados();
        
        Operaciones op4 = new Operaciones();
        op4.leerNumeros();
        op4.dividir();
        op4.mostrarResultados();
       
        Operaciones op9 = new Operaciones();
        op9.leerNumeros();
        op9.multiplicar();;
        op9.mostrarResultados();
        
        Operaciones op6 = new Operaciones();
        op6.leerNumeros();
        op6.restar();
        op6.mostrarResultados();
        
        Operaciones op444 = new Operaciones();
        op444.leerNumeros();
        op444.dividir();
        op444.multiplicar();
        op444.sumar();
        op444.mostrarResultados();
        */
        /*
        Operacion2 op = new Operacion2();
        int numero, numero2;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
        
        op.sumar(numero, numero2);
        op.restar(numero, numero2);
        op.multiplicar(numero, numero2);
        op.dividir(numero, numero2);
        op.mostrarResultados();
        */
        
        Operacion3 op = new Operacion3();
        Operacion3 op2 = new Operacion3();
        
        int numero ,  numero2, suma=0, resta=0, multiplicacion=0, division=0;
        
        numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 1"));
        numero2 = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero 2"));
        
        suma = op.sumar(numero, numero2);
        resta = op.restar(numero, numero2);
        multiplicacion = op.multiplicar(numero, numero2);
        division = op.dividir(numero, numero2);
        
        
        System.out.println("La suma es: "+suma);
        System.out.println("La resta es: "+resta);
        System.out.println("La multiplicacion es: "+multiplicacion);
        System.out.println("La division es: "+division);
        
        suma = op2.sumar(9, 10);
        System.out.println("La suma del objeto 2 es : "+suma);
        
        System.out.println("DIRECCION DE MEMORIA");
        System.out.println(op);
        
    }
}
