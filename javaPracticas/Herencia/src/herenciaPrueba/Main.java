/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaPrueba;

import herenciaPrueba.consola.Consola;
import herenciaPrueba.consola.Xbox;
import herenciaPrueba.consola.PlayStation;

/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Consola c = new Consola();
        Xbox x = new Xbox();
        
        System.out.println(c);
        System.out.println(x);
    }
}
