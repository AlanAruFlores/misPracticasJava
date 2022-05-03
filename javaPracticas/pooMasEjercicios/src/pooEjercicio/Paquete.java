/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio;

/**
 *
 * @author alang
 */
public class Paquete {
    private int pesokg;
    private int nroReferencia;
    private int dni;
    private Prioridad prioridad;
    
    public Paquete(int pesoKg, int nroReferencia, int dni, Prioridad prioridad)
    {
        this.pesokg = pesoKg;
        this.nroReferencia = nroReferencia;
        this.dni = dni;
        this.prioridad = prioridad;
    }
    
    public Prioridad getPrioridad()
    {
        return prioridad;
    }
    public int getPeso()    
    {
        return pesokg;
    }
    @Override
    public String toString()
    {
        return "NRO PAQUETE: "+nroReferencia+" | DNI: "+dni+" | PESO: "+pesokg+"Kg | PRIORIDAD: "+prioridad;
    }
    
}
