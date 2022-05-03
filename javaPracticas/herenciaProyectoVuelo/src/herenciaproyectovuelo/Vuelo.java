/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaproyectovuelo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Vuelo {
    private static int cont = 0 ;
    private int id;
    private String ciudadOrigen;
    private String ciudadDestino;
    private double precioDelViaje;
    private int nroMaximo ;
    private ArrayList<Pasajero> pasajeros;
    private int contReserva;
    
    public Vuelo(String ciudadOrigen, String ciudadDestino, double precioDelViaje, int nroMaximo)
    {
        Vuelo.cont++;
        this.id = Vuelo.cont;
        this.ciudadOrigen = ciudadOrigen.toUpperCase();
        this.ciudadDestino = ciudadDestino.toUpperCase();
        this.precioDelViaje = precioDelViaje;
        this.nroMaximo = nroMaximo;
    }
    public String getciudadOrigen()
    {
        return ciudadOrigen;
    }
    public String getCiudadDestino()
    {
        return ciudadDestino;
    }
    public void setPasajero(Pasajero p)
    {
        pasajeros.add(p);
        contReserva++;
    }
   
    public void mostrarPasajeros()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"ESTA VACIA");
        }
        else
        {
            System.out.println("PASAJEROS : ");
            for (Pasajero pasajero : pasajeros) {
                System.out.println(pasajero);
            }
        }
    }
    private boolean verificarLista()
    {
        return pasajeros.isEmpty();
    }

    @Override
    public String toString() {
        return "Vuelo{" + "id=" + id + ", ciudadOrigen=" + ciudadOrigen + ", ciudadDestino=" + ciudadDestino + ", precioDelViaje=" + precioDelViaje + ", nroMaximo=" + nroMaximo + ", contReserva=" + contReserva + '}';
    }
    
}
