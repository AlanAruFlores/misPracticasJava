/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListpoo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Fabrica {
    private String nombre;
    private ArrayList<Sucursal> sucursales;
    
    public Fabrica(String nombre)
    {
        sucursales = new ArrayList<>();
        this.nombre = nombre;
    }
    
    public void setSucursal(Sucursal s)
    {
        sucursales.add(s);
    }
    public void mostrarSucursales()
    {
        if(sucursales.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NIGUNA SUCURSAL REGISTRADA");
        }
        else
        {
            for (Sucursal s : sucursales) {
                System.out.println(s);
            }
        }
    }
    public int encontrarIndice(int id)
    {
        int indice = -1;
        int cont = sucursales.size();
        for (int i = 0 ; i < cont ; i++) {
            if(sucursales.get(i).getID() == id)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA SUCURSAL");
        }
        return indice;
    }
    public Sucursal seleccionarSucursal(int indice)
    {
        Sucursal s = null;
        if(sucursales.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"LAS SUCURSALES ESTAN VACIAS");
        }
        else
        {
            s = sucursales.get(indice);
        }
        return s;
    }
    public String toString()
    {
        return nombre;
    }
}
