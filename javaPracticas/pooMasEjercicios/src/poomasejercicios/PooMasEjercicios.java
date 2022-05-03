/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poomasejercicios;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class PooMasEjercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ArrayList <Persona> personas = new ArrayList<>();
        
        Persona persona = new Persona("Jose", 23 , Pais.PERU); 
        Persona persona2 = new Persona("Karl", 22, Pais.PERU);
        Persona persona3 = new Persona("Reynoso",29,Pais.PERU);
        
        persona.setAmigo(new Amigo("PEPE"));
        persona2.setAmigo(new Amigo("Ricardo"));
        persona2.setAmigo(new Amigo("Karl"));
        persona3.setAmigo(new Amigo("PABLOS"));
        persona3.setAmigo(new Amigo("PABLOS"));
        persona3.setAmigo(new Amigo("PABLOS"));
        
        personas.add(persona);
        personas.add(persona2);
        personas.add(persona3);
        
        
        mostrarPersonas(personas);
        mostrarPersonasPeru(personas);
    }
    public static void mostrarPersonasPeru(ArrayList<Persona> personas)
    {
        System.out.println("PERSONAS PERU");
        for (Persona p : personas) {
            if(p.getNacionalidad() == Pais.PERU)
            {
                p.mostrarPersona();
            }
        }
    }
    public static void mostrarPersonas(ArrayList<Persona> personas)
    {
        for (Persona  p : personas) {
            p.mostrarPersona();
        }
    }
    
}
