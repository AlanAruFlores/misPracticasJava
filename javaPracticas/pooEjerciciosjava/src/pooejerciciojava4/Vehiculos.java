/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava4;

/**
 *
 * @author alang
 */
public class Vehiculos {
    private final String marca;
    private final String modelo;
    private float precio;
                
    public Vehiculos(String marca, String modelo, float precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        setPrecio(precio);
    }
    
    public void setPrecio(float precio)
    {
        if(verificarPrecio(precio) != true)
        {
            this.precio = precio;
        }
        else
        {
            this.precio = 0;
        }
    }
    public float getPrecio()
    {
        return precio;
    }
    
    private boolean verificarPrecio(float precio){
        return precio <= 0;
    }
    
   
    public void mostrarVehiculos()
    {
        System.out.println("VEHICULO");
        System.out.println("MARCA: "+marca+""
                + "\nMODELO: "+modelo+""
                + "\nPRECIO: $"+precio);
    }
}
