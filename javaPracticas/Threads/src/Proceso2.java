/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alang
 */
public class Proceso2 extends Thread{
    @Override
    public void run(){
        for (int i = 0; i < 10; i++) {
            System.out.println("PROCESO 2");
        }
        
    }
}
