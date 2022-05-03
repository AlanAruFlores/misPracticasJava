/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPracticaaa;

/**
 *
 * @author alang
 */
public class Perro extends Mascota{
     
     private Raza raza;
     
     public Perro(String nombre, int edad, Raza raza)
     {
         super(nombre,edad);
         this.raza = raza;
     }
     
     public int tenerFuerzaMandibular()
     {
         return raza.getFuerzaMandibula();
     }
     public Raza getRaza()
     {
         return raza;
     }
     
     @Override
     public void alimentarse()
     {
         System.out.println("ME ALIMENTO CON CARNE");
     }
     
     @Override
     public String toString()
     {
         return super.toString()+" | PERRO";
     }
}
