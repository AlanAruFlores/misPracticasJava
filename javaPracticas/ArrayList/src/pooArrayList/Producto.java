/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooArrayList;

/**
 *
 * @author alang
 */
public class Producto {
    
    private byte id; 
    private String nombre;
    private String tipo;
    private short stock;
    private float precio;
    private static byte contProduct = 1;
    
    public Producto ( String nombre, String tipo, short stock, float precio)
    {
        this.id = contProduct;
        this.nombre = nombre;
        this.tipo= tipo;
        this.stock = stock;
        this.precio = precio;
        contProduct++;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public short getStock() {
        return stock;
    }

    public void setStock(short stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    public void setId(byte id)
    {
        this.id = id;
    }
    public byte getId()
    {
        return id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    
    public void showObject()
    {
        System.out.println(" | "+id+" | "+nombre+" | "+tipo+" | "+stock+" | $"+precio);
    }
    
}
