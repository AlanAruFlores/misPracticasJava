/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring;

/**
 *
 * @author alang
 */
public class ToString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* To  String nos permite ver el estado del objeto de una forma mas facil sin la
        necesidad de invocar un metodo*/
        Persona p1 = new Persona("Ale",20);
        
        
        System.out.println(p1);
    }
    
}
