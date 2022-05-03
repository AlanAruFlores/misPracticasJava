/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio;

/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
        /*Crear un programa en que defina si programadores fueron a una universidad o no y que en casos de que no
        se le resto un 5% del sueldo, teniendo en cuenta que se es pagan 5000 euros*/
        
        Programador p1 = new Programador (4532343, "Ale", "Aru", "UTN");
        Programador p2 = new Programador (45443324, "Leo", "Aru");
        
        p1.mostrarDatos();
        p2.mostrarDatos();
    }
}
