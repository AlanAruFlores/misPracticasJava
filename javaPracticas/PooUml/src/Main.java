/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import entidades.Juego;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Scanner;
import entidades.*;


/**
 *
 * @author alang
 */
public class Main {
    static ArrayList<JuegoVenta> juegos = new ArrayList<>();
    static ArrayList<Usuario> usuarios = new ArrayList<>();
    static Scanner entrada = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            
            switch(opcion)
            {
                case 1:
                {
                    juegos.add(registrarJuego());
                    break;
                }
                case 2:
                {
                    usuarios.add(registrarUsuario());
                    break;
                }
                case 3:
                {
                    logear();
                    break;
                }     
                default:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO");
                }
                    
            }

        

        }while(opcion != 4);
    }
    
       
    public static void logear()
    {
        System.out.println("---------LOGIN--------------");
        System.out.print("NOMBRE: ");
        String nombre = entrada.nextLine();
        System.out.println("CONTRASEÑA: ");
        String contraseña = entrada.nextLine();
        
        int indice = encontrarIndiceUsuario(nombre, contraseña);
        
        if(indice != -1)
        {
            mostrarInterfazUsuario(usuarios.get(indice));
        }
    }
    public static void mostrarInterfazUsuario(Usuario user)
    {
        int opcion;
        do
        {
            opcion = ingresarOpcionUsuario();
            switch(opcion)
            {
                case 1:
                {
                    if(juegos.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY NINGUN JUEGO");
                    }
                    else
                    {
                        user.comprarJuegos(juegos);
                    }
                    break;
                }
                case 2:
                {
                    verJuegos();
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
            }
        }while(opcion != 3);
    }
    public static void verJuegos()
    {
        if(juegos.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN JUEGO");
        }
        else
        {
             for (JuegoVenta juegoVenta : juegos) {
                System.out.println(juegoVenta);
            }
        }

    }
    public static int ingresarOpcionUsuario()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt("INTERFAZ USUARIO"
                    + "\n[1]COMPRAR JUEGO"
                    + "\n[2]VER JUEGOS"
                    + "\n[3]SALIR");
        }while(opcion < 1 || opcion >3);
        return opcion;
    }
    private static int encontrarIndiceUsuario(String nombre, String contraseña)
    {
        int indice = -1, cont = usuarios.size();
        for (int i = 0; i < cont; i++) {
            if(usuarios.get(i).getNombre() == nombre && usuarios.get(i).getContraseña() == contraseña)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null, "NO SE ENCONTRO EL USUARIO");
        }
        return indice;
    }

    public static Usuario registrarUsuario()
    {
        String mail = JOptionPane.showInputDialog("DIGITE EL MAIL");
        String contraseña = JOptionPane.showInputDialog("DIGITE LA CONTRASEÑA");
        return new Usuario(mail,contraseña);
    }
    public static JuegoVenta registrarJuego()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL JUEGO");
        float precio = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL PRECIO DEL JUEGO"));
        int stock = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE STOCK"));
        
        return new JuegoVenta(nombre, precio, stock);
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]REGISTRAR JUEGOS"
                + "\n[2]REGISTRAR USUARIOS"
                + "\n[3]LOGIN"
                + "\n[4]SALIR" ));
        }while(opcion < 1 || opcion >4);

        return opcion;
        
    }
  }
