/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaejercicio9;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Sucursal {
    private int nro;
    private String direccion;
    private String ciudad;
    private Paquete paquete;
    public Sucursal(int nro, String direccion , String ciudad)
    {
        this.nro = nro;
        this.direccion = direccion;
        this.ciudad = ciudad;
    }
    public int getNro()
    {
        return nro;
    }
    
    private int calcularPrecio()
    {
        int costo;
        
        if(paquete.prioridad().equals("ALTA"))
        {
          costo = (paquete.getPesoKg() * 1) + 10;
        }
        else if(paquete.prioridad().equals("EXPRESS"))
        {
            costo = (paquete.getPesoKg() * 1 ) + 20;
        }
        else
        {
            costo = paquete.getPesoKg() * 1;
        }
        
        return costo;
    }
    public int getCosto()
    {
        return calcularPrecio();
    }
    public void setPaquete(Paquete paquete)
    {
        this.paquete = paquete;
    }
    public void mostrarSucursal()
    {
        System.out.println("INFORMACION SUCURSAL"
                + "\nNRO: "+nro+""
                + "\nDIRECCION: "+direccion+""
                + "\nCIUDAD: "+ciudad);
    }
}
