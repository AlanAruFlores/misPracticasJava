/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio.Entidades;
import HerenciaEjercicio.Rango;
import HerenciaEjercicio.Mensaje;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Usuario {
    private static int cont = 0;
    private int id;
    private String nombre;
    private String contraseña;
    private Rango rango;
    private ArrayList<Mensaje> mensajes;
    
    public Usuario(String nombre, String contraseña)
    {
        Usuario.cont++;
        this.id = Usuario.cont;
        setNombre(nombre);
        this.contraseña = contraseña;
        mensajes = new ArrayList<>();
        rango = Rango.NONE;
    }
    public Usuario(String nombre, String contraseña,Rango rango)
    {
        this(nombre,contraseña);
        rango = Rango.ADMINISTRADOR;
    }
    public int getId()
    {
        return id;
    }
    public String getNombre() 
    {
        return nombre;
    }
    public void setNombre(String nombre)
    {
        if(verificarNombre(nombre))
        {
           this.nombre = "Unnamed"; 
        }
        else
        {
            this.nombre = nombre;
        }
    }
    private boolean verificarNombre(String nombre)
    {
        return nombre.isEmpty()|| nombre.isBlank() ||nombre == null;
    }
    
    public String getContraseña()
    {
        return contraseña;
    }
    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }
    public Rango getRango()
    {
        return rango;
    }
    public Mensaje crearMensaje()
    {
        Scanner entrada = new Scanner(System.in);
        String tema, cuerpo;
            System.out.print("CREANDO MENSAJE......"
                    + "\nTITULO: ");
            tema = entrada.nextLine();
            System.out.print("MENSAJE: ");
            cuerpo = entrada.nextLine();
            
        return new Mensaje(tema, cuerpo, nombre);    
    }
    public void mandarMensaje(Usuario u, Mensaje m){
        u.recibirMensaje(m);
    }
    private void recibirMensaje(Mensaje m)
    {
        mensajes.add(m);
    }
    public void mostrarMensajes()
    {
        if(verificarMensajes())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN MENSAJE");
        
        }
        else
        {
            for (Mensaje mensaje : mensajes) {
                System.out.println("\n"+mensaje);
                System.out.println("------------------------");
            }
        }
    }
    private boolean verificarMensajes()
    {
        return mensajes.isEmpty();
    }
    
    @Override
    public String toString()
    {
        return "ID: "+id+" |USUARIO: "+rango+"\nNOMBRE: "+nombre;
    }
    
    
}
