/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import HerenciaEjercicio.Entidades.Usuario;
import HerenciaEjercicio.Entidades.Administrador;

/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        ArrayList <Usuario> usuarios = new ArrayList<>();
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                   usuarios.add(registrarUsuario());
                   break;
                }
                case 2:
                {
                    usuarios.add(registrarAdministrador());
                    break;
                }
                case 3:
                {
                    logearCuenta(usuarios);
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO");
                }
            }
              
            
                
        }while(opcion != 4);
        
    }
    //CASE 3
    public static void logearCuenta(ArrayList<Usuario> usuarios)
    {
        String nombre , contraseña;
        Scanner entrada = new Scanner(System.in);
        System.out.print("LOGIN:"
                + "\nNOMBRE:");
        nombre = entrada.nextLine();
        System.out.print("CONTRASEÑA: ");
        contraseña = entrada.nextLine();
        
        int indice = encontrarCuenta(nombre, contraseña, usuarios);
        
        if(indice != -1)
        {
            if(usuarios.get(indice).getRango() == Rango.ADMINISTRADOR)
            {
               OtrosMetodos.mostrarMenuAdministrador((Administrador)usuarios.get(indice), usuarios);
            }
            else
            {
                OtrosMetodos.mostrarMenuUsuario(usuarios.get(indice), usuarios);
            }
        }
    }
    private static int encontrarCuenta(String nombre, String contraseña, ArrayList<Usuario> usuarios)
    {
        int cont = usuarios.size();
        int indice = -1;
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
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL USUARIO");
        }
    
        return indice;
    }
    
    
    
    //CASE 1 , CASE 2
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR USUARIO"
                    + "\n[2]REGISTRAR ADMINISTRADOR"
                    + "\n[3]LOGIN"
                    + "\n[4]SALIR"));
            if(opcion < 1 || opcion >4)
            {
                JOptionPane.showMessageDialog(null,"OPCION INCORRECTA");
            }
        }while(opcion < 1 || opcion >4);
        return opcion;
    }
    public static Usuario registrarUsuario()
    {
        String nombre, contraseña;
        nombre = ingresarNombre("USUARIO");
        contraseña = ingresarContraseña("USUARIO");
        return new Usuario(nombre, contraseña);
    }
    public static Administrador registrarAdministrador()
    {
        String nombre, contraseña;
        nombre = ingresarNombre("ADMINISTRADOR");
        contraseña = ingresarContraseña("ADMINISTRADOR");
        return new Administrador (nombre, contraseña);
    }
    public static String ingresarNombre(String entidad)
    {
        return JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL "+entidad);
    }
    public static String ingresarContraseña(String entidad)
    {
        return JOptionPane.showInputDialog("DIGITE LA CONTRASEÑA DEL "+entidad);
    }
    
    
}
