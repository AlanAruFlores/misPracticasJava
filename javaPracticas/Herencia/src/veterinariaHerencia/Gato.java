/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaHerencia;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Gato extends Animal{
    Scanner entrada = new Scanner(System.in);
    public Gato(String nombre, int edad, String colorPiel)
    {
        super(nombre,edad,colorPiel,TipoAnimal.GATO);
    }
       
}
