/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2.Metodos;

import javax.swing.JOptionPane;
import java.util.ArrayList;
import pooEjercicio2.Domicilio;
import pooEjercicio2.Entidad_Bancaria;
import pooEjercicio2.Nacionalidad;
import pooEjercicio2.Tarjeta;
import pooEjercicio2.Usuario;
import pooEjercicio2.Libro;

/**
 *
 * @author alang
 */
public class MetodoUsuario {
    
    //--------REGISTRO USUARIO------------
    public static Usuario registrarUsuario()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL USUARIO");
        String contraseña = JOptionPane.showInputDialog("DIGITE LA CONTRASEÑA");
        Nacionalidad n = seleccionarNacionalidad();
        Domicilio d = registrarDomicilio();
        Tarjeta t = ingresarTarjeta();
        
        return new Usuario(nombre, n , d, t, contraseña);
    }
    static Tarjeta ingresarTarjeta()
    {
        Entidad_Bancaria eb = seleccionarEntidad();
        return new Tarjeta(eb);
    }
    static Entidad_Bancaria seleccionarEntidad()
    {
        Entidad_Bancaria eb = null;
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]"+Entidad_Bancaria.MASTERCARD+""
                    + "\n[2]"+Entidad_Bancaria.NACION));
            if(opcion < 1 || opcion >2)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }while(opcion < 1 || opcion >2);
        
        switch(opcion)
        {
            case 1:
            {
                eb = Entidad_Bancaria.MASTERCARD;
            }
            case 2:
            {
                eb = Entidad_Bancaria.NACION;
            }
        }
        return eb;
    }
    static Domicilio registrarDomicilio()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE LA DIRECCIOND E SU CASA");
        int nro = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE SU CASA"));
        return new Domicilio(nombre, nro);
    }
    static Nacionalidad seleccionarNacionalidad()
    {
        Nacionalidad n = null;
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA NACIONALIDAD"
                    + "\n[1]"+Nacionalidad.ARGENTINA+""
                    + "\n[2]"+Nacionalidad.ESPAÑA+""
                    + "\n[3]"+Nacionalidad.BRASIL+""
                    + "\n[4]"+Nacionalidad.PERU));
            if(opcion < 1 || opcion >4)
            {
                JOptionPane.showMessageDialog(null,"OPCION INCORRECTA");
            }
        }while(opcion < 1 || opcion >4);
        
        switch(opcion)
        {
            case 1:
            {
                n = Nacionalidad.ARGENTINA;
                break;
            }
            case 2:
            {
                n = Nacionalidad.ESPAÑA;
                break;
            }
            case 3:
            {
                n = Nacionalidad.BRASIL;
                break;
            }
            default:
            {
                n = Nacionalidad.PERU;
                break;
            }
                        
        }
        return n;
        
    }
    //----------------------------------------------
    
    
    //-----------------MENU USUARIO-------------------------
    public static void menuUsuario(Usuario user, ArrayList <Libro> libros){
       int opcion;
       do
       {
           opcion = ingresarOpcionUsuario();
           switch(opcion)
           {
              
               case 1:
               {
                   int id = user.comprarLibro(libros);
                   int indice = encontrarIndice(id, libros);
                   if(indice != -1)
                   {
                       user.finalizarCompra(libros.get(indice));
                   }
                   break;
               }
               
               case 2:
               {
                   user.verCarrito();
                   break;
               }
               case 3:
               {
                   user.verHistorial();
                   break;
               }
               case 4:
               {
                   user.comprarCarrito();
                   break;
               }
               case 5:
               {
                   user.cancelarCarrito();
                   break;
               }
               case 6:
               {
                   System.out.println(user);
                   break;
               }
               case 7:
               {
                   user.recargarTarjeta();
                   break;
               }
               default:
               {
                   JOptionPane.showMessageDialog(null,"SALIENDO...");
               }
           }
       }while(opcion != 8 );
    }
    private static int encontrarIndice(int id, ArrayList<Libro> libros)
    {
        int indice = -1;
        int cont = libros.size();
        for (int i = 0; i < cont; i++) {
            if(id == libros.get(i).getISBN())
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
    static int ingresarOpcionUsuario()
    {
        int opcion;
        do
        {
             opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]COMPRAR LIBROS"
                + "\n[2]VER CARRITO"
                + "\n[3]VER HISTORIAL"
                + "\n[4]COMPRAR CARRITO"
                + "\n[5]CANCELAR CARRITO"
                + "\n[6]VER MI INFORMACION"
                + "\n[7]RECARGAR TARJETA"
                + "\n[8]SALIR"));
             if(opcion < 1 || opcion >8)
             {
                 JOptionPane.showMessageDialog(null,"LA OPCION ES INCORRECTA");
             }
        }while(opcion < 1 || opcion >8);

        return  opcion;
    }
}
