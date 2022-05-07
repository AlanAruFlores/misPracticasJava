  /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooElectrodomesticos;

/**
 *
 * @author alang
 */
public class Main {
    static Electrodomestico[]electrodomesticos = new Electrodomestico[10];
    
    
    private static void asignarElementos(){
        electrodomesticos[0] = new Televisor();
        electrodomesticos[1] = new Lavadora();
        electrodomesticos[2] = new Televisor(300, 30);
        electrodomesticos[3] = new Lavadora(400,200);
        electrodomesticos[4] = new Televisor(300, 30, Color.NEGRO, Letra.C,50, false);
        electrodomesticos[5] = new Lavadora(400, 40, Letra.A, Color.ROJO, 30);    
        electrodomesticos[6] = new Televisor();
        electrodomesticos[7] = new Lavadora();
        electrodomesticos[8] = new Televisor();
        electrodomesticos[9] = new Lavadora();
    }
    public static void main(String[] args) {
        double precioTotal = 0;
        
        asignarElementos();
        recorrerArrayLavadoras();
        recorrerArrayTelevisores();
        
        precioTotal = calcularCostoTotal();
        System.out.println("------------------------------");
        System.out.println("EL COSTO TOTAL ES: "+precioTotal);
        
        
    }
    static void recorrerArrayLavadoras(){
        System.out.println("--------LAVADORAS-------");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Lavadora)
                mostrarPrecioFinal(electrodomestico);   
        }
    }
    static void recorrerArrayTelevisores(){
        System.out.println("---------TELEVISORES---------");
        for (Electrodomestico electrodomestico : electrodomesticos) {
            if(electrodomestico instanceof Televisor)
                mostrarPrecioFinal(electrodomestico);
        }
    }
    private static void mostrarPrecioFinal(Electrodomestico electrodomestico){
        electrodomestico.mostrarPrecioFinal();
    }
    private static double calcularCostoTotal(){
        double costoTotal = 0;
        for (Electrodomestico electrodomestico : electrodomesticos) {
            costoTotal +=electrodomestico.calcularPrecioFinal();
        }
        return costoTotal;
    }
}
