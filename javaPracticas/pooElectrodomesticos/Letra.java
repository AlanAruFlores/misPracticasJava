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
public enum Letra {
    A(100),B(80),C(60),D(50),E(30),F(10);
    
    private double precio;
    
    private Letra(double precio){
        this.precio = precio;
    }
    public double getPrecio(){
        return precio;
    }
    
}
