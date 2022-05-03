/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Proceso1 proceso1 = new Proceso1();
        Proceso2 proceso2 = new Proceso2();
        
        proceso1.start();
        proceso2.start();
    }
}
