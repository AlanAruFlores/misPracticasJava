/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetepoo;

/**
 *
 * @author alang
 */
public class Ticket {
    private String nombreCliente;
    private String apellidoCliente;
    private double montoTotal;
    private double montoXcuota;
    
    public Ticket(Persona titular, double montoTotal , double montoXcuota)
    {
        this.nombreCliente = titular.getNombre();
        this.apellidoCliente = titular.getApellido();
        this.montoTotal = montoTotal;
        this.montoXcuota = montoXcuota;
    }
    
    public String toString()
    {
        return "INFORMACION TICKET: \nNOMBRE CLIENTE: "+nombreCliente+"\nAPELLIDO CLIENTE: "+apellidoCliente+"\nMONTO TOTAL: $"+montoTotal+""
                + "\nMONTO X CUOTA: $"+montoXcuota;
    }
}
