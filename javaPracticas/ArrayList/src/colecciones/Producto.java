/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones;

/**
 *
 * @author alang
 */
public class Producto {
    private String nombre_Producto;
    private String tipo_Producto;
    private float precio;
    
    public Producto(String nombre_Producto, String tipo_Producto, float precio)
    {
        this.nombre_Producto = nombre_Producto;
        this.tipo_Producto = tipo_Producto;
        this.precio = precio;
        
    } 
    
    public String getNombre_Producto()
    {
        return nombre_Producto;
    }

}
