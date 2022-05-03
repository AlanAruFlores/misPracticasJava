/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava10;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Amigo {
    private String nombre;
    private String pais;
    private String mail;
    private ArrayList <Mensaje> mensajes = new ArrayList <>();
    
    public Amigo(String nombre, String pais, String mail)
    {
        this.nombre = nombre;
        this.pais = pais;
        this.mail = mail;
                
    }
    public String getMail()
    {
        return mail;
    }
    public void saveMensajes(Mensaje mensaje)
    {
        this.mensajes.add(mensaje);
    }
    public ArrayList <Mensaje> getMensaje()
    {
        return mensajes;
    }
    public void mostrarDatos()
    {
        System.out.println(" "+nombre+" | "+pais+" | "+mail);
    }
}
