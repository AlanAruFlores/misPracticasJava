/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacto;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Persona {
    private static int contID=1;
    private int id;
    private String nombre;
    private int edad;
    private Nacionalidad nacionalidad;
    private ArrayList <Mensaje> mensajes;
    
    
    public Persona(String nombre, int edad, Nacionalidad nacionalidad)
    {
        this.id = contID;
        this.nombre = nombre; 
        this.edad=edad;
        this.nacionalidad = nacionalidad;
        mensajes = new ArrayList<>();
        contID++;
    }
    public int getID()
    {
        return id;
    }
    public void enviarMensaje(Persona p, Mensaje m)
    {
        p.setMensaje(m);
    }
    private void setMensaje(Mensaje m)
    {
        mensajes.add(m);
    }
    public ArrayList<Mensaje> getMensaje()
    {
        return mensajes;
    }
    
    @Override
    public String toString()
    {
        return  "NOMBRE: "+nombre+" EDAD: "+edad+" NACIONALIDAD: "+nacionalidad; 
    }
    
    
}
