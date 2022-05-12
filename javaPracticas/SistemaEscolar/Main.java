/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEscolar;

/**
 *
 * @author alang
 */
public class Main {
    
    
    public static int generarNumeroAleatorio(int numInicio, int numTerminado){
        return (int)(Math.random()+numTerminado*numInicio);
    }
}
