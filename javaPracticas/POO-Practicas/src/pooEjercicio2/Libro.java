/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Libro {
    private static int cont =0;
    private final int ISBN;
    private String nombre;
    private double precio;
    private int stock;
    public Libro(String nombre, double precio, int stock)
    {
        Libro.cont++;
        this.ISBN = Libro.cont;   
        this.nombre = nombre;
        setPrecio(precio);
        inicializarStock(stock);
        
    }
    public String getNombre()
    {
        return nombre;
    }
    public int getISBN()
    {
        return ISBN;
    }
    public double getPrecio()
    {
        return precio;
    }
    public void inicializarStock(int stock)
    {
            if(verificarStock(stock))
            {
                this.stock = 0 ;
            }
            else
            {
                this.stock = stock;
            }
    }
    public void setStock(boolean accion, int cantidad)
    {
        if(accion == true)
        {
            stock += cantidad;
        }
        else
        {
            stock-= cantidad;
        }
    }
    public int getStock()
    {
        return stock;
    }
    private boolean verificarStock(int stock){
        return stock <=0;
    }
    public void setPrecio(double precio)
    {
        if(verificarPrecio(precio))
        {
            this.precio = 100;
        }
        else
        {
            this.precio = precio;
        }    
    }
    private boolean verificarPrecio(double precio)
    {
        return precio < 100;
    }
    @Override
    public String toString()
    {
        return "ISBN : "+ISBN+" | LIBRO: "+nombre+" | PRECIO: $"+precio+" | STOCK: "+stock;
    }
    
}
