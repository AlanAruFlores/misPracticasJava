/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListpoo;

/**
 *
 * @author alang
 */
public class Instrumento {
    private static int cont = 0 ;
    private int id;
    private float precio;
    private Tipo tipo;
    
    public Instrumento(float precio, Tipo tipo)
    {
        setId();
        setPrecio(precio);
        this.tipo = tipo;
    }
    private void setId()
    {
        this.id = Instrumento.cont++;
    }
    public int getID()
    {
        return id;
    }
    public Tipo getTipo()
    {
        return tipo;
    }
    public void setPrecio(float precio)
    {
        if(verificarPrecio(precio))
        {
            this.precio = 0 ;
        }
        else
        {
            this.precio = precio;
        }
    }
    private boolean verificarPrecio(float precio)
    {
        return precio <= 0;
    }
    public String toString()
    {
        return "ID INSTRUMENTO: "+id+" | PRECIO: "+precio +" | TIPO : "+tipo;
    }
}