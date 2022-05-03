/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio3;

/**
 *
 * @author alang
 */
public class Auto {
    private String marca;
    private String modelo;
    private float precio;
    
    public Auto(String marca, String modelo, float precio)
    {
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    
    public float getPrecio()
    {
        return precio;
    }
    
    public void mostrarAuto()
    {
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Precio: $"+precio);
    }
    
}
