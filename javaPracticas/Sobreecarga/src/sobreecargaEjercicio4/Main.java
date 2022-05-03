/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio4;

/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
        double dinero;
        //Hacer una transaccion
        Usuario user1 = new Usuario("Ale", "Aru", 45302342);
        Usuario user2 = new Usuario("Alejo",45949394);
        
        user1.setSaldo(4000);
        user1.extractMoney(400);
        user2.setSaldo(400);
        
        user1.mostrarDatos();
        user2.mostrarDatos();
        
    }
}
