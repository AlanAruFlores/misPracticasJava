/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava10;

/**
 *
 * @author alang
 */
public class Mensaje {
    private int dia; 
    private int mes;
    private int año;
    private String contenido;
    private String receptor;
    
    public Mensaje(int dia, int mes, int año, String contenido, String receptor)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        setContenido(contenido);
        this.receptor = receptor;
    }
    public void setContenido(String contenido)
    {
        if(contenido.isEmpty())
        {
            this.contenido = "VACIO";
        }
        else{
            this.contenido = contenido;
        }
    }
    @Override
    public String toString()
    {
        return "FECHA DE ENVIO: "+dia+"/"+mes+"/"+año+"\nCONTENIDO: "+contenido+"\nPOR: "+receptor;
    }
}
