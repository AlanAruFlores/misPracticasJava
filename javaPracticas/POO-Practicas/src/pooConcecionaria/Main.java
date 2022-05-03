/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooConcecionaria;

/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Concesionaria concesionaria  = new Concesionaria("VentAutos");
        
        concesionaria.setVehiculo(new Auto("Tesla","ABC123",100,true));
        concesionaria.setVehiculo(new Moto("Tesla","ZXN123",80));
        
        concesionaria.mostrarVehiculos();
        System.out.println("");
        concesionaria.mostrarVehiculos(8);
        
        
        
    }
}
