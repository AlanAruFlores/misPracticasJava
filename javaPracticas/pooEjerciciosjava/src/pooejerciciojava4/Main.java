/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava4;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static int detectarCocheMasBarato(ArrayList<Vehiculos>arrayVehiculos, int nVehiculos)
    {
        
        int id=0;
        float precioMenor=0;
        precioMenor = arrayVehiculos.get(0).getPrecio();
       
        for(int i = 1 ; i <nVehiculos; i++)
        {
            if(arrayVehiculos.get(i).getPrecio() < precioMenor)
            {
                
                precioMenor = arrayVehiculos.get(i).getPrecio();
                id = i;
            }
        }
        return id;
    }
    public static void main(String [] args){   
        ArrayList <Vehiculos> arrayVehiculos = new ArrayList<Vehiculos>();
        int nVehiculos, id;
        nVehiculos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE NRO VEHICULOS"));
        String marca, modelo;
        float precio, precioMenor = 0f;
        
        for (int i = 0; i < nVehiculos; i++) {
            marca = JOptionPane.showInputDialog("DIGITE LA MARCA DEL VEHICULO "+i);
            modelo = JOptionPane.showInputDialog("DIGITE EL MODELO DEL VEHICULO "+i);
            precio = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL PRECIO "+i));
            
            if(precio > 0)
            {
                arrayVehiculos.add(new Vehiculos(marca,modelo,precio));
            }
        }
        id = detectarCocheMasBarato(arrayVehiculos,nVehiculos);
        

        
        arrayVehiculos.get(id).mostrarVehiculos();
       
        
    }
    
}
