/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooConcecionaria;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author alang
 */
public class Concesionaria {
    private String nombre;
    private ArrayList<Vehiculo> vehiculos;
    
    public Concesionaria(String nombre)
    {
        this.nombre = nombre;
        vehiculos = new ArrayList<>();
    }
    
    public void setVehiculo(Vehiculo v)
    {
        vehiculos.add(v);
    }
    
    public void mostrarVehiculos(int opcion)
    {
        if(verificarLista()!=true)
        {
            if(opcion == 1)
            {
                for (Vehiculo vehiculo : vehiculos) {
                    if(vehiculo instanceof Moto)
                    {
                        System.out.println(vehiculo);
                    }
                }
            }
            else{
                for (Vehiculo vehiculo : vehiculos) {
                    
                    if(vehiculo instanceof Auto)
                    {
                        System.out.println(vehiculo);
                    }
                    
                }
            }
        }
    }
    public void mostrarVehiculos()
    {
        if(verificarLista() != true)
        {
            for (Vehiculo vehiculo : vehiculos) {
                System.out.println(vehiculo);
            }
        }

    }
    private boolean verificarLista()
    {
        if(vehiculos.isEmpty())
        {
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }
        return vehiculos.isEmpty();
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
}
