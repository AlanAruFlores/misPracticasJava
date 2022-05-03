/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaproyectovuelo.entidades;
import java.util.ArrayList;
import herenciaproyectovuelo.Compañia;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public abstract class Aeropuerto {
    private static int cont = 0;
    private int id;
    private String nombre;
    private Domicilio domicilio;
    private TipoAeropuerto tipo;
    private ArrayList<Compañia> compañias;
    
    public Aeropuerto(String nombre, Domicilio domicilio, TipoAeropuerto tipo)
    {
        Aeropuerto.cont++;
        this.id = Aeropuerto.cont;
        this.nombre =nombre;
        this.domicilio = domicilio;
        this.tipo = tipo;
        this.compañias = new ArrayList<>();
    }
    public int getId()
    {
        return id;
    }
    public TipoAeropuerto getTipo()
    {
        return tipo;
    }
    public ArrayList<Compañia> getCompañias()
    {
        return compañias;
    }
    public void setCompañia(Compañia c)
    {
        this.compañias.add(c);
    }
    public void mostrarCompañias()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUNA COMPAÑIA REGISTRADA");
        }
        else
        {
            for (Compañia compañia : compañias) {
                System.out.println(compañia);
            }
        }
    }
    public void mostrarCompañia()
    {
        if(verificarLista() != true)
        {
            mostrarCompañias();
            int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA COMPAÑIA A VER SUS VUELOS"));
            int indice = encontrarCompañia(id);
            if(indice != -1)
            {
                compañias.get(indice).mostrarVuelos();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NINGUNA COMPAÑIA REGISTRADA");
        }
    }
    private int encontrarCompañia(int id)
    {
        int indice = -1 , cont = compañias.size();
        for (int i = 0; i < cont; i++) {
            if(compañias.get(i).getId() == id)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA COMPAÑIA");
        }
        return indice;
    }
    private boolean verificarLista()
    {
        return this.compañias.isEmpty();
    }
    @Override 
    public String toString()
    {
        return "ID: "+id+" | NOMBRE AEROPUERTO: "+nombre+" | DIRECCION: "+domicilio;
    }
}
