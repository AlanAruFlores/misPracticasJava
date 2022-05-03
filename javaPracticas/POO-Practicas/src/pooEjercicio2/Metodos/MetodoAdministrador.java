/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2.Metodos;
import javax.swing.JOptionPane;
import pooEjercicio2.Libro;
import pooEjercicio2.Usuario;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class MetodoAdministrador {
    
    public static void mostrarMenu(ArrayList<Libro> libros, ArrayList<Usuario> usuarios)
    {
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    libros.add(agregarLibro());
                    break;
                }
                case 2:
                {
                    MetodoAdministrador.aumentarStock(libros);
                    break;
                }
                case 3:
                {
                    MetodoAdministrador.mostrarUsuarios(usuarios);
                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO");
                }
            }
        }while(opcion !=4);
    }
    static int ingresarOpcion()
    {
        int opcion;
        do
        {
             opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]AGREGAR PRODUCTO"
                + "\n[2]ESTABLECER STOCK"
                + "\n[3]VER USUARIOS"
                + "\n[4]SALIR"));
             if(opcion < 1 || opcion >4)
             {
                 JOptionPane.showMessageDialog(null,"ERROR, OPCION INCORRECTA");
             }
        }while(opcion < 1 || opcion >4);
        return opcion;
    }
    static Libro agregarLibro()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL LIBRO");
        double precio = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL PRECIO DEL LIBRO"));
        int stock = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE STOCK"));
        return new Libro(nombre, precio, stock);
    }
    static void aumentarStock(ArrayList<Libro>libros)
    {
        mostrarLibros(libros);
        if(verificarLibros(libros) != true)
        {
            int ISBN = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ISBN PARA ENCONTRAR EL LIBRO"));
            int indice = encontrarIndice(ISBN, libros);
            
            if(indice != -1)
            {
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL STOCK AUMENTAR"));
                libros.get(indice).setStock(true, cantidad);
            }
        }

    }
    static int encontrarIndice(int ISBN , ArrayList<Libro>libros)
    {
        int indice = -1 , cont  = libros.size();
        for (int i = 0; i < cont; i++) {
            if(ISBN == libros.get(i).getISBN())
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL LIBRO");
        }
        return indice;
    }
    static void mostrarUsuarios(ArrayList<Usuario> usuarios)
    {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    static void mostrarLibros(ArrayList<Libro> libros)
    {
       if(verificarLibros(libros))
       {
           JOptionPane.showMessageDialog(null,"NO HAY NINGUN LIBRO");
       }
       else
       {
            for (Libro libro : libros) {
                System.out.println(libro);
            }
       }

    }
    private static boolean verificarLibros(ArrayList<Libro>libros)
    {
        return libros.isEmpty();
    }
}
