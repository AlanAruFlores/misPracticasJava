/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPractica;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public abstract class ComercioAutos {
    private String nombre;
    protected ArrayList<Vehiculo> vehiculos;
    
    public ComercioAutos(String nombre)
    {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    public void setVehiculo(Vehiculo vehiculo)
    {
        this.vehiculos.add(vehiculo);
    }
    
    public void mostrarMostrarVehiculos()
    {
        if(verificarVehiculos())
        {
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }else{
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
        }
    }
    protected boolean verificarVehiculos()
    {
        return vehiculos.isEmpty();
    }
    
    @Override 
    public String toString()
    {
        return nombre;
    }
}
