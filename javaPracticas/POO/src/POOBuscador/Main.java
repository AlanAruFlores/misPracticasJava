/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOBuscador;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Libro> libros = new ArrayList<>();
        
        
        libros.add(new Libro("El Hobbit",300, 700, "La sobras"));
        libros.add(new Libro("El señor de los anillos",400,400,"Tolkien"));
        
        
        do
        {
            String nombreLibro = ingresarNombre();
             
            System.out.println("RESULTADOS: ");
            if(verificarNombre(nombreLibro))
            {
                System.out.println("NO HAY RESULTADOS");
            }
            else
            {
                mostrarResultados(libros, nombreLibro);
            }
        }while(true);

                    
        
    }
    static void mostrarResultados(ArrayList<Libro> libros, String nombreLibro)
    {
        boolean resultado = false;
        for (Libro libro : libros) { 
            
            if(devolverPosicion(libro, nombreLibro) >= 0)
            {
                resultado = true;
                System.out.println(libro);
            }

            /*
            if(libro.getNombre().contains(nombreLibro.toUpperCase()))
            {
                resultado = true;
                System.out.println(libro);
            }
*/
        }
        if(resultado == false)
        {
            System.out.println("NO HAY RESULTADOS");
        }
    }
    private static int devolverPosicion(Libro libro, String nombreLibro)
    {
        return libro.getNombre().toUpperCase().indexOf(nombreLibro.toUpperCase());
    }
    private static boolean verificarNombre(String nombre)
    {
        return nombre.isBlank() || nombre.isEmpty() || nombre == null;
    }
    static String ingresarNombre()
    {
        String nombreLibro = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL LIBRO A BUSACAR");
        return nombreLibro;
    }
}
