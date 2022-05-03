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
public class Domicilio {
   private String nombreCalle;
   private int numeroCalle;
   
   public Domicilio(String nombreCalle, int numeroCalle)
   {
       this.nombreCalle = nombreCalle;
       this.numeroCalle = numeroCalle;
   }
   
   @Override
   public String toString()
   {
       return nombreCalle+" | "+numeroCalle;
   }
   
}
