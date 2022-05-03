/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio;
import HerenciaEjercicio.Entidades.Administrador;
import HerenciaEjercicio.Entidades.Usuario;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class OtrosMetodos {
   public static void mostrarMenuAdministrador(Administrador adm, ArrayList<Usuario>usuarios)
   {
       int opcion;
       do
       {
           opcion = ingresarOpcionAdmin();
           switch(opcion)
           {
               case 1:
               {
                   if(usuarios.isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"NO HAY NINGUN USUARIO REGISTRADO");
                   }
                   else
                   {
                       adm.eliminarUsuario(usuarios);
                   }
                   break;
               }
               case 2:
               {
                   if(usuarios.isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"NO HAY NINGUN USUARIO REGISTRADO");
                   }
                   else
                   {
                       adm.verInformacionUsuario(usuarios);
                   }
                   break;
               }
               case 3:
               {
                   if(usuarios.isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"NO HAY NIGUN USUARIO REGIISTRADO");
                   }
                   else
                   {
                        Rango r = ingresarRango();
                        adm.verMiembroDeUnTipo(r, usuarios);
                   }
                   break;
               }
               case 4:
               {
                   JOptionPane.showMessageDialog(null,"SALIENDO..");
               }
           }
       }while(opcion != 4);
   }   
   static Rango ingresarRango()
   {
       Rango r = null;
       int opcion;
       do
       {
           opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                   + "\n[1]"+Rango.NONE+""
                   + "\n[2]"+Rango.ADMINISTRADOR));
       }while(opcion < 1 || opcion >2);
       
       switch(opcion)
       {
           case 1:
           {
               r = Rango.NONE;
               break;
           }
           case 2:
           {
               r = Rango.ADMINISTRADOR;
           }
       }
       return r;
   }
   static int ingresarOpcionAdmin()
   {
       int opcion;
       do
       {
           opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                   + "\n[1]ELIMINAR USUARIO"
                   + "\n[2]VER INFORMACION DE UN USUARIO"
                   + "\n[3]VER MIEMBROS DE UN TIPO"
                   + "\n[4]SALIR"));
           if(opcion < 1 || opcion >4)
           {
               JOptionPane.showMessageDialog(null,"DIGITE UNA OPCION CORRECTA!!");
           }
       }while(opcion < 1 || opcion >4);
       return opcion;
   }
   //---------------------------------------------------------------------------------------------------------------
   
   
   //USUARIO:
   
   public static void mostrarMenuUsuario(Usuario user, ArrayList<Usuario> usuarios)
   {
       int opcion;
       do
       {
           opcion = ingresarOpcion();
           switch(opcion)
           {
               case 1:
               {
                   if(usuarios.isEmpty())
                   {
                       JOptionPane.showMessageDialog(null,"NINGUN USUARIO REGISTRADO");
                   }
                   else{
                       OtrosMetodos.mostrarUsuarios(usuarios);
                       int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL USUARIO A ENVIAR"));
                       int indice = encontrarUsuario(id, usuarios);
                       if(indice != -1)
                       {
                           Mensaje m = user.crearMensaje();
                           user.mandarMensaje(usuarios.get(indice), m);
                       }
                   }
                   break;
               }
               case 2:
               {
                   user.mostrarMensajes();
                   break;
               }
               case 3:
               {
                   System.out.println(user);
                   break;
               }
               case 4:
               {
                   JOptionPane.showMessageDialog(null,"SALIENDO");
                   break;
               }
           }
       }while(opcion != 4);
   }
   private static int encontrarUsuario(int id, ArrayList<Usuario> usuarios)
   {
       int cont = usuarios.size(), indice = -1;
       for (int i = 0; i < cont; i++) {
           if(id == usuarios.get(i).getId())
           {
               indice = i;
           }
       }
       if(indice == -1)
       {
           JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL USUARIO");
       }
       return indice;
   }
   static void mostrarUsuarios(ArrayList<Usuario>usuarios)
   {
       for (Usuario usuario : usuarios) {
           System.out.println(usuario);
       }
   }
   static int ingresarOpcion()
   {
       int opcion;
       do
       {
           opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                   + "\n[1]ENVIAR MENSAJE"
                   + "\n[2]VER MENSAJES"
                   + "\n[3]VER SU PERFIL"
                   + "\n[4]SALIR"));
       }while(opcion < 1 || opcion >4);
       
       return opcion;
   }
           
}
