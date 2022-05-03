/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import pooEjercicio2.Metodos.MetodoAdministrador;
import pooEjercicio2.Metodos.MetodoUsuario;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList <Usuario> usuarios = new ArrayList<>();
        ArrayList <Libro> libros = new ArrayList<>();
        
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch (opcion)
            {
                case 1:
                {
                   usuarios.add(MetodoUsuario.registrarUsuario());
                   JOptionPane.showMessageDialog(null,"USUARIO REGISTRADO CON EXITO");
                   break;
                }
                case 2:
                {
                    String nombre, contraseña;
                    System.out.println("----LOGIN----");
                    System.out.print("NOMBRE: ");
                    nombre = entrada.nextLine();
                    System.out.println("CONTRASEÑA: ");
                    contraseña = entrada.nextLine();
                    
                    int indice = encontrarIndiceUsuario(nombre, contraseña, usuarios);
                    if(indice != -1)
                    {
                        MetodoUsuario.menuUsuario(usuarios.get(indice), libros);
                    }
                    break;
                }
                case 3:
                {
                    MetodoAdministrador.mostrarMenu(libros, usuarios);
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO...");
                }
            }
        }while(opcion != 4);
        
    }
    
    
    private static int encontrarIndiceUsuario(String nombre, String contraseña, ArrayList<Usuario>usuarios){
        int indice = -1;
        int cont = usuarios.size();
        for (int i = 0; i < cont; i++) {
            if(nombre.equalsIgnoreCase(usuarios.get(i).getNombre()))
            {
                if(contraseña.equalsIgnoreCase(usuarios.get(i).getContraseña()))
                {
                    indice = i;
                }
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO AL USUARIO CON TAL NOMBRE Y CONTRASEÑA");
        }
        return indice;
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR USUARIO "
                    + "\n[2]LOGIN"
                    + "\n[3]ADMINISTRADOR"
                    + "\n[4]SALIR"));
        }while(opcion < 1 || opcion >4);
        
        return opcion;
    }
}
