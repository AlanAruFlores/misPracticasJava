/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Carrito {
    private ArrayList<Libro> libros;
      private ArrayList<Integer>cantLibros;
    
    public Carrito()
    {
        libros = new ArrayList<>();
        cantLibros = new ArrayList<Integer>();
    }
    public void setLibro(Libro l, int cantidad)
    {
        libros.add(l);
        cantLibros.add(cantidad);
    }
    public ArrayList<Libro>getLibros()
    {
        return libros;
    }
    public ArrayList<Integer>getCantLibros()
    {
        return cantLibros;
    }
    public void mostrarLibros()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"CARRITO VACIO");
        }
        else
        {
            int i = 0;
            System.out.println("CARRITO");
            
            for (Libro libro : libros) {
                System.out.println(libro.getNombre()+" | STOCK: "+cantLibros.get(i));
                i++;
            }
        }

    }
    public void vaciarCarrito()
    {
        libros.clear();
        cantLibros.clear();
    }
    public boolean verificarCarritoVacio()
    {
        boolean verificacion = false;
        if(verificarLista() != true)
        {
            verificacion = true;
        }
        return verificacion;
    }
    private boolean verificarLista()
    {
        return libros.isEmpty();
    }
    public double calcularPago()
    {
        double costo = 0;
        int i = 0 ;
        for (Libro libro : libros) {
            costo = libro.getPrecio() * cantLibros.get(i);
            i++;
        }
        return costo;
    }
    public void cancelarCarrito()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"NO SE PUEDE CANCELAR PORQUE NO HAY NADA EN EL CARRITO");
        }
        else
        {
            int i = 0;
            for (Libro libro : libros) {
                libro.setStock(true, cantLibros.get(i));
                i++;
            }
            vaciarCarrito();
        }

    }
    
    
}
