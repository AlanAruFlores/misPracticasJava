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
public class Compañia {
    private static int cont = 0;
    private int id;
    private String nombre;
    private ArrayList<Vuelo>vuelos;
    
    
    public Compañia ( String nombre)
    {
        Compañia.cont++;
        id = Compañia.cont;
        this.nombre = nombre;
        vuelos = new ArrayList<>();
    }
    
    public int getId()
    {
        return id;
    }
    public void setVuelo(Vuelo v)
    {
        vuelos.add(v);
    }
    public ArrayList<Vuelo> getVuelos()
    {
        return vuelos;
    }
    public void mostrarVuelos()
    {
        if(verificarListaVuelos())
        {
            JOptionPane.showMessageDialog(null,"VUELOS NO REGITRADOS");
        }
        else
        {
            System.out.println("VUELOS: ");
            for (Vuelo vuelo : vuelos) {
                System.out.println(vuelo);
            }
        }
    }
    private boolean verificarListaVuelos()
    {
        return vuelos.isEmpty();
    }

    @Override
    public String toString() {
        return "Compa\u00f1ia{" + "ID: "+id+"NOMBRE: " + nombre + '}';
    }
    
   
    
}
