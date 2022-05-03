/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava10;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Persona {
    private String nombre; 
    private String mail;
    private String pais;
    private String contraseña;
    private ArrayList <Amigo> amigos = new ArrayList <>();
    private ArrayList <Mensaje> mensajes = new ArrayList <>();
    
    public Persona (String nombre, String mail, String pais, String contraseña)
    {
        setNombre(nombre);
        setMail(mail);
        this.pais = pais.toUpperCase();
        this.contraseña = contraseña;
    }
    
    public Persona (String nombre, String mail,String contraseña)
    {
        this(nombre,mail,"PRIVADO",contraseña);
    }
    
    public void setNombre(String nombre)
    {
        if(validarName(nombre))
        {
            this.nombre = "USER";
        }
        else
        {
            this.nombre = nombre.toUpperCase();
        }
    }
    private boolean validarName(String nombre)
    {
        return nombre.isEmpty();
    }
    
    public void setMail(String mail)
    {
        if(validarMail(mail))
        {
            this.mail = mail.toLowerCase();
        }        
    }
    private boolean validarMail (String mail)
    {
        return mail.contains("@gmail.com");
    }
    public void setContraseña(String contraseña)
    {
        this.contraseña = contraseña;
    }
    
    public void setAmigos(Persona persona)
    {    
        Amigo amigo = new Amigo(persona.getNombre(), persona.getPais(), persona.getMail());
        amigos.add(amigo);
    }
    public ArrayList <Amigo> getAmigos()
    {
        return amigos;
    }
    public void mostrarAmigos()
    {
        int cont = amigos.size();
        if(amigos.isEmpty())
        {
            System.out.println("NO HAY AMIGOS");
        }
        else
        {
            System.out.println("AMIGOS");
            for (int i = 0; i < cont; i++) {
                amigos.get(i).mostrarDatos();
            }
        }
    }
    public String getNombre()
    {
        return nombre;
        
    }
    public String getMail()
    {
        return mail;
    }
    public String getPais()
    {
        return pais;
    }
    public String getContraseña()
    {
        return contraseña;
    }
    
    public void setMensajes(Mensaje mensaje)
    {
        this.mensajes.add(mensaje);
    }
    public void mostrarMensajes(){
        
        int contMensajes = mensajes.size();
        
        if(contMensajes > 0)
        {
            System.out.println(mensajes+"\n");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN MENSAJE");
        }
    }
}
