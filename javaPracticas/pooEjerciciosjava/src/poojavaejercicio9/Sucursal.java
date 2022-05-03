/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poojavaejercicio9;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Sucursal {
    private int nroSucursal;
    private String direccion;
    private String ciudad;
    private ArrayList <Paquete> paquetes = new ArrayList();
    public Sucursal(int nroSucursal, String direccion , String ciudad)
    {
        this.nroSucursal = nroSucursal;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.paquetes = new ArrayList();
    }
    public void setPaquete(Paquete paquete)
    {
        paquetes.add(paquete);
    }
    public int getNro()
    {
        return nroSucursal;
    }
    
    private float calcularCosto(Paquete paquete)
    {
        float costo;
        if(paquete.getPrioridad() == "EXPRESS")
        {
            costo = (paquete.getPeso() * 1) + 20;
        }
        else if(paquete.getPrioridad() == "ALTA")
        {
            costo = (paquete.getPeso() * 1) + 10;
        }
        else
        {
            costo = (paquete.getPeso() * 1);
        }
        return costo;
    }
    public float getCosto(Paquete paquete)
    {
        return calcularCosto(paquete);
    }
    
    public void mostrarDatos()
    {
        System.out.println("NRO SUCURSAL: "+nroSucursal+""
                + "\nDIRECCION: "+direccion+""
                + "\nCIUDAD: "+ciudad+""
                + "\n------------------------------------");
    }
    public void mostrarPaquetesSucursal()
    {
        if(paquetes.isEmpty())
        {
            System.out.println("SIN PAQUETES");
        }
        
        int cont = paquetes.size();
        for (int i = 0; i < cont; i++) {
            paquetes.get(i).mostrarPaquete();
        }
    }
    
}
