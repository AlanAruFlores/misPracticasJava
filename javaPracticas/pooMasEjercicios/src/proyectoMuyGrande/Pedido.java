/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMuyGrande;

/**
 *
 * @author alang
 */
public class Pedido {
    private float precioTotal=0;
    private Producto producto;
    private int stock;
    
    public Pedido(Producto producto, int stock)
    {
        this.producto = producto;
        this.stock = stock;
        setPrecioTotal();
    }
    private void setPrecioTotal()
    {
        precioTotal = producto.getPrecio() * stock;
    }
    public float getPrecio()
    {
        return precioTotal;
    }
    public String toString()
    {
        return "PEDIDO: "+producto.getNombre()+" | CANTIDAD COMPRADA: "+stock+" | PRECIO TOTAL: $"+precioTotal;
    }
}
