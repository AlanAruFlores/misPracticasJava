/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Empresa {
    private String nombre;
    private ArrayList<Sucursal>sucursales;
    public float totalGanancias;
    public Empresa(String nombre)
    {
        this.nombre = nombre;
        sucursales = new ArrayList<Sucursal>();
    }
    public ArrayList<Sucursal> getSucursales()
    {
        return sucursales;
    }
    public void eliminarSucursales(int indice)
    {
        sucursales.remove(indice);
        JOptionPane.showMessageDialog(null,"ELIMINADO CON EXITO");
    }
    public Sucursal seleccionarSucursal(int indice)
    {
        return sucursales.get(indice);
    }
    public void mostrarAutos()
    {
        for (Sucursal s : sucursales) {
            s.mostrarAutos();
        }
    }
    public float getGanancias()
    {
        float acum=0;
        for (Sucursal s : sucursales) {
            acum += s.getGanancias();
        }
        return acum;
    }
    public void setSucursal(Sucursal s)
    {
        sucursales.add(s);
    }
    public void mostrarSucursales(){
        for (Sucursal s : sucursales) {
            System.out.println(s);
        }
    }
    @Override 
    public String toString()
    {
        return "NOMBRE EMPRESA: "+nombre+"\nSUCURSALES: "+sucursales.size()+"\nTOTAL GANANCIAS: "+getGanancias();
    }
}
