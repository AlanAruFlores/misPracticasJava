/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enums;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Enums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // ENUMS: SE UTILIZA CUANDO SABEMOS QUE INFORMACION PONDRA EL USUARIO
        ArrayList <Persona> array = new ArrayList <>();
        Persona p1= new Persona("Jose", 20, Pais.NUEVA_ZELANDA);
        Persona p2 =  new Persona("Carlos",21, Pais.NUEVA_ZELANDA);
        Persona p3 = new Persona ("Pepe",60, Pais.NUEVA_ZELANDA);
        
        array.add(p1);
        array.add(p2);
        array.add(p3);

        for (int i = 0; i < 3; i++) {
            if(array.get(i).getPais().equals(Pais.NUEVA_ZELANDA))
            {
                System.out.println(array.get(i));
            }
        }
        
    }
    
}
