/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio.Entidades;
import HerenciaEjercicio.Rango;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Administrador extends Usuario {
  
    public Administrador(String nombre, String contraseña)
    {
        super(nombre, contraseña, Rango.ADMINISTRADOR);
    }
    public void eliminarUsuario(ArrayList<Usuario>usuarios)
    {
        mostrarUsuarios(usuarios);
        int id= Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL USUARIO A ELIMINAR"));
        int indice = encontrarCuenta(id, usuarios);
        
        if(indice != -1)
        {
            if(usuarios.get(indice).getRango() != Rango.ADMINISTRADOR)
            {
                usuarios.remove(indice);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"NO SE PUEDE ELIMINAR A UN ADMINISTRADOR");
            }      
        }
    }
    public void verInformacionUsuario(ArrayList<Usuario> usuarios)
    {
        mostrarUsuarios(usuarios);
        int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL USUARIO A VER SU INFORMACION"));
        int indice = encontrarCuenta(id, usuarios);
        if(indice != -1)
        {
            System.out.println(usuarios.get(indice));
        }
    }
    void mostrarUsuarios(ArrayList<Usuario> usuarios)
    {
        for (Usuario usuario : usuarios) {
            System.out.println(usuario);
        }
    }
    private int encontrarCuenta(int id, ArrayList<Usuario> usuarios)
    {
        int indice = -1, cont =  usuarios.size();
        for (int i = 0; i < cont; i++) {
            if(id == usuarios.get(i).getId())
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL INDICE");
        }
        return indice;
    }
    public void verMiembroDeUnTipo(Rango rango, ArrayList<Usuario>usuario)
    {
        if(verificarLista(usuario))
        {
            JOptionPane.showMessageDialog(null,"NO EXISTE NINGUN USUARIO");
        }
        else
        {
            for (Usuario user : usuario) {
                System.out.println("LISTA: ");
                if(user.getRango() == rango)
                {
                    System.out.println(user);
                }
            }
        }
    }
    private boolean verificarLista(ArrayList<Usuario>usuarios)
    {
        return usuarios.isEmpty();
    }
    
}
