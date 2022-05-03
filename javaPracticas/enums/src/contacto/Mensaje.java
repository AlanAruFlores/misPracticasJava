/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package contacto;

/**
 *
 * @author alang
 */
public class Mensaje {
    private int dia;
    private int año;
    private String contenido;
    
    
    public Mensaje(int dia, int año, String contenido)
    {
        this.dia = dia;
        this.año = año;
        setContenido(contenido);
    }
    
    private void setContenido(String contenido)
    {
        if(contenido == null)
        {
            this.contenido = "MENSAJE VACIO";
        }
        else
        {
            this.contenido = contenido;
        }
    }
    @Override
    public String toString()
    {
        return "DIA: "+dia+" AÑO: "+año+"\n"+contenido;
    }
}
