/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOBuscador;

/**
 *
 * @author alang
 */
public class Libro {
    
    private static int cont = 0;
    private String autor;
    private int ISBN;
    private int id;
    private String nombreLibro;
    private double precio;
    private int stock;
    
    
    public Libro(String nombreLibro, double precio, int stock, String autor)
    {
        Libro.cont++;
        this.id = Libro.cont;
        setISBN();
        this.nombreLibro = nombreLibro;
        this.precio = precio;
        this.stock = stock;
        this.autor = autor;
    }
    private void setISBN()
    {
        this.ISBN = (int)(Math.random()+10000*1000);
    }
    public String getNombre()
    {
        return nombreLibro;
    }
    @Override
    public String toString()
    {
        return nombreLibro;
    }
    
}
