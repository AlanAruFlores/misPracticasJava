/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetepoo;

/**
 *
 * @author alang
 */
public class Main {
    public static void main(String  [] args)
    { 
        Persona p1 = new Persona(4541245, "PEPE","ROBERTO",114324454, "roberto@gmail.com");
        Tarjeta t1 = new Tarjeta(Entidad_Financiera.CASTERMARD, p1);
        POSNET p = new POSNET();
        
        t1.setSaldo(1000, true);
        p.efectuarPago(t1, 900, 4);
        
        System.out.println("SALDO DE TARJETA:   "+t1.getSaldo());
        
    }  
}
