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
public class Producto {
    private static int cont=0;
    private int id;
    private String nombre; 
    private float precio;
    private int stock;
    private Estado estado;
    
    public Producto(String nombre , float precio, int stock)
    {
        Producto.cont++;
        id = Producto.cont;
        this.nombre = nombre;
        setPrecio(precio);
        setStock(stock);
        setEstado(precio, stock);
        
    }
    
    
    //Metodos getters
    public int getId(){return id;}
    public String getNombre(){return nombre;}
    public float getPrecio(){return precio;}
    public Estado getEstado(){return estado;}
    public int getStock() {return stock;}
    
    private void setEstado(float precio , int stock)
    {
        if(verificarPrecio(precio) || verificarStock(stock))
        {
            estado = Estado.NO_DISPONIBLE;
        }
        else
        {
            estado = Estado.DISPONIBLE;
        }
    }
    public void setStock(int stock)
    {
        if(verificarStock(stock))
        {
            this.stock = 0;
        }
        else
        {
            this.stock = stock;
        }
        setEstado(precio, this.stock);
    }
    private boolean verificarStock(int stock)
    {
        return stock <= 0;
    }
    public void setPrecio(float precio)
    {
        if(verificarPrecio(precio))
        {
            this.precio = 0;
        }
        else
        {
            this.precio = precio;
        }
        setEstado(this.precio , stock);
    }
    private boolean verificarPrecio(float precio)
    {
        return precio <=0;
    }
    @Override
    public String toString()
    {
        return "ID PRODUCTO: "+id+" | NOMBRE: "+nombre+" | PRECIO: $"+precio+" | STOCK:  "+stock+" | ESTADO: "+estado;
    }
}
