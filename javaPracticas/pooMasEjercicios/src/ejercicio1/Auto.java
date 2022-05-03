/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;

/**
 *
 * @author alang
 */
public class Auto {
    private String nombre;
    private Color color;
    private float precio;
    
    public Auto(String nombre, Color color, float precio)
    {
        this.nombre = nombre;
        this.color = color;
        this.precio = precio;
    }
    
    public String toString()
    {
        return "AUTO: "+nombre+" | COLOR: "+color+" | PRECIO: $"+precio;
    }
}
