/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio9;

/**
 *
 * @author alang
 */
public class Paquete {
    private int nroReferencia;
    private int dniReferencia;
    private int pesoKg;
    private String prioridad;
    
    public Paquete ( int nroReferencia, int dniReferencia, int pesoKg, String prioridad)
    {
        this.nroReferencia = nroReferencia;
        this.dniReferencia = dniReferencia;
        this.pesoKg = pesoKg;
        this.prioridad = prioridad;
    }
    public int getPesoKg()
    {
        return pesoKg;
    }
    public String prioridad()
    {
        return prioridad;
    }
    
    public void mostrarPaquete()
    {
        System.out.println("INFORMACION DEL PAQUETE");
        System.out.println("\nNRO DE REFERENCIA: "+nroReferencia+""
                + "\nDNI DE REFERENCIA: "+dniReferencia+""
                + "\nPESO: "+pesoKg+""
                + "\nPRIORIDAD: "+prioridad);
    }
}
