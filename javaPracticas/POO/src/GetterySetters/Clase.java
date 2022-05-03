/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GetterySetters;

/**
 *
 * @author alang
 */
public class Clase {
    
    public static void main (String[] args)
    {
        Class objeto = new Class("Ale");
        //objeto.edad = 10 Si mi atributo no es privada, podemos manupularla por otros metodos.
        objeto.setEdad(10);   
        
        System.out.println("Mi nombre es "+objeto.getNombre()+" y mi edad es :"+objeto.getEdad());
        
    }
}
