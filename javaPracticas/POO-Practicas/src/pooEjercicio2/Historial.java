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
public class Historial {
    private ArrayList<Libro> libros;
    
    public Historial()
    {
        libros = new ArrayList<>();
    }
       
    public void setLibros(Carrito c)
    {
        libros.addAll(c.getLibros());
    }
    
    public void mostrarHistorial()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"HISTORIAL VACIO");
        }
        else
        {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
        }
    }
    private boolean verificarLista()
    {
        return libros.isEmpty();
    }
    
}
