/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiembrosEstaticos;

/**
 *
 * @author alang
 */
public class Clase1 {
    
    //Esto es un atributo sin static, esto significa que los objetos son dueño de este atributo
    //String frase = "Hola como te va";
    
    
    //Si tengo un atributo estatico (static), significa que la clase es dueña de esta y NO los objetos.
    private static String frase ="Hola como te va";
    
    public static int sumar(int n1, int n2)
    {
        int suma = n1+n2;
        return suma;
    }
    
    public static void main(String[] args)
    {
        /*Por lo tanto si tengo un atributo sin static, llamamos o declaramos a objetos para usarla
        Clase1 obj1 = new Clase1();
        Clase1 obj2 = new Clase1 ();
        
        
        Como el atributo no es estatico, voy a poder cambiar la frase del 2do objeto, por lo que no hay problema
        obj2.frase = "Hola";
        
        
        System.out.println("La frase es: "+obj1.frase);
        System.out.println("La frase es: "+obj2.frase);
        
        Me va a saltar error y  no me va a dejar imprimir el atributo porque no es estatico.
        System.out.println("La frase es: "+Clase1.frase);
        */
        /*Como tengo atributo estatico puedo llamar directamente de la clase , por lo que no hace falta crear objetos.
        Es mejor hacerlo de esta forma
        Ejemplo:
        System.out.println("La frase es: "+Clase1.frase);
        
        Pero si llamo el atributo a traves de objetos, significa que si hay un cambio en unos de estos objetos, 
        repercutira este cambio para todos , es decir:
        */
        Clase1 obj1 = new Clase1();
        Clase1 obj2 = new Clase1 ();
        
        obj2.frase = "Hola"; //Como el atributo es estatico, este cambio repercutira para todos los objetos
        
        
        /*Aca las frases de los 2 objetos seran Hola ya que el atributo es estatico y ocmo es estatico pertenece a la clase
        por lo que un cambio en este atributo va a repercutir a todos los objetos
        */
        System.out.println(obj1.frase);
        System.out.println(obj2.frase);
        System.out.println("La suma es: "+Clase1.sumar(10,5));

    }
}
