/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poojavaejercicio9;

/**
 *
 * @author alang
 */
public class Paquete {
    private int nroReferencia;
    private int dniReferencia;
    private String prioridad;
    private int peso;
    
    public Paquete(int nroReferencia, int dniReferencia, int indicePrioridad, int peso)
    {
        this.nroReferencia = nroReferencia;
        this.dniReferencia = dniReferencia;
        setPrioridad(indicePrioridad);
        this.peso = peso;
    }
    private void setPrioridad(int indice)
    {
        if(indice == 3)
        {
            prioridad = "EXPRESS";
        }
        else if(indice ==2)
        {
            prioridad = "ALTA";
        }
        else
        {
            prioridad = "NINGUNO";
        }
    }
    public int getNroReferencia()
    {
        return nroReferencia;
    }
    public String getPrioridad()
    {
        return prioridad;
    }
    public int getPeso()
    {
        return peso;
    }
    public void mostrarPaquete()
    {
        System.out.println("INFORMACION DEL PAQUETE:"
                + "\nNRO REFERENCIA: "+nroReferencia+""
                + "\nDNI REFENCIA: "+dniReferencia+""
                + "\nPRIORIDAD: "+prioridad+""
                + "\nPESO: "+peso);
    }
}
