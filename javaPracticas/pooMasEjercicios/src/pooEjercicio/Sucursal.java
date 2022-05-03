/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Sucursal {
    private static int cont = 0;
    private int nroSucursal ;
    private String direccion;
    private String ciudad;
    private ArrayList<Paquete> paquetes;
    
    public Sucursal(String direccion , String ciudad)
    {
        setNroSucursal();
        this.direccion = direccion;
        this.ciudad = ciudad;
        paquetes = new ArrayList<>();
    }
    public int getNroSucursal()
    {
        return nroSucursal;
    }
    private void setNroSucursal()
    {
        Sucursal.cont ++;
        nroSucursal = cont; 
    }
    public double establecerPrecio(Paquete packagee)
    {
        int peso = packagee.getPeso();
        Prioridad p = packagee.getPrioridad();
        double precio  = peso * 1;
        
        if (p == Prioridad.ALTA)
        {
            precio += 10;
        }
        else if( p == Prioridad.EXPRESS)
        {
            precio += 20;
        }
        else
        {
            precio = precio;
        }
        return precio;
    }
    public void mostrarPaquetes()
    {
        System.out.println("SUCURSAL NRO : "+nroSucursal);
        if(paquetes.isEmpty())
        {
            System.out.println("NO HAY PAQUETES REGISTRADOS");
        }
        else
        {
            for (Paquete p : paquetes) {
                System.out.println(p);
            }
        }

    }
    public void setPaquete(Paquete p)
    {
        paquetes.add(p);
    }
    @Override
    public String toString()
    {
        return "NRO SUCURSAL: "+nroSucursal+" | DIRECCION: "+direccion +" | CIUDAD: "+ciudad;
    }
}
