/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooTorneo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Torneo {
    private String nombre;
    private double premio;
    private Domicilio domicilio;
    private ArrayList<Luchador> luchadores;
    
    public Torneo(String nombre, double premio, Domicilio domicilio)
    {
        this.nombre = nombre;
        this.premio = premio;
        this.domicilio = domicilio;
        this.luchadores = new ArrayList<>();
    }
    
    public void setLuchador(Luchador luchador)
    {
        this.luchadores.add(luchador);
    }
    
    public void mostrarLuchadores()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN PARTICIPANTE REGISTRADO");
        }
        else
        {
            for (Luchador luchador : luchadores) {
                System.out.println(luchador);
            }
        }
    }
    private boolean verificarLista()
    {
        return luchadores.isEmpty();
    }
    
    @Override
    public String toString()
    {
        return "NOMBRE DEL TORNEO ORGANIZADO: "+nombre+" | PREMIO: $"+premio+" | DOMICILIO: "+domicilio;
    }
}
