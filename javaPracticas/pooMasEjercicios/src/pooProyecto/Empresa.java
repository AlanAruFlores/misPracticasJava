/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Empresa {
    private String nombre;
    private ArrayList<Proyecto> proyectos;
    
    public Empresa(String nombre)
    {
        this.nombre = nombre.toUpperCase();
        proyectos = new ArrayList<>();
    }
    public Proyecto registrarProyecto(){
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PROYECTO A CREAR");
        return new Proyecto(nombre);
    }
    public void setProyecto(Proyecto p)
    {
        proyectos.add(p);
        JOptionPane.showMessageDialog(null,"PROYECTO REGISTRADO CON EXITO");
    }
    public void mostrarProyectos()
    {
        if(verificarListaVacia())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN PROYECTO EN LA EMPRESA");
        }
        else
        {
            for (Proyecto proyecto : proyectos) {
                System.out.println(proyecto);
            }
        }

    }
    public Proyecto seleccionarProyecto(int indice)
    {
        return proyectos.get(indice);
    }
    public int encontrarIndiceProyecto(int id)
    {
        int indice = -1;
        if(verificarListaVacia())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN PROYECTO REGISTRADO");
        }
        else
        {
            for (int i = 0; i < proyectos.size(); i++) {
                if(proyectos.get(i).getID() == id)
                {
                    indice = i;
                }
            }
            if(indice == -1)
            {
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL PROYECTO");
            }
        }
        return indice;

    }
    private boolean verificarListaVacia()
    {
        return proyectos.isEmpty();
    }
    public String toString()
    {
        return nombre;
    }
}
