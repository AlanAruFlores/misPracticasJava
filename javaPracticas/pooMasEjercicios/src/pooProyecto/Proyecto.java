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
public class Proyecto {
    private static int cont = 0;
    private int id;
    private String nombre;
    private ArrayList<Integrante> integrantes;
    
    public Proyecto(String nombre)
    {
        setID();
        this.nombre = nombre;
        integrantes = new ArrayList<Integrante>();
    }
    private void setID()
    {
        Proyecto.cont++;
        id = Proyecto.cont;
    }
    public int getID()    
    {
        return id;
    }
    public void setIntegrante(Integrante integrante)
    {
        integrantes.add(integrante);
    }
    public Integrante registrarIntegrante()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL INTEGRANTE");
        Nivel nivel = null;
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NIVEL DEL INTEGRANTE A REGISTRAR"
                + "\n[1]JUNIOR"
                + "\n[2]SEMISENIOR"
                + "\n[3]SENIOR"));
        }while(opcion < 1 || opcion >3);
        
        switch(opcion)
        {
            case 1:
            {
                nivel = Nivel.JUNIOR;
                break;
            }
            case 2:
            {
                nivel = Nivel.SEMISENIOR;
                break;
            }
            case 3:
            {
                nivel = Nivel.SENIOR;
                break;
            }
        }
        return new Integrante(nombre, nivel);
    }
    public int encontrarIndiceIntegrante(int id)
    {
        
        int indice = -1, cont = integrantes.size();
        if(verificarIntegrantes())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN INTEGRANTE REGISTRADO");
        }
        else
        {
            for (int i = 0; i < cont; i++) {
                if(integrantes.get(i).getID() == id)
                {
                    indice = i;
                }
            }
            if(indice == -1)
            {
                JOptionPane.showMessageDialog(null,"NO SE ENCONTRO NINGUN INTEGRANTE");
            }
        }

        return indice;
    }
    private boolean verificarIntegrantes()
    {
        return integrantes.isEmpty() ? true : false;
    }
    public void borrarIntegrante ( int index)
    {
        integrantes.remove(index);
    }
    public void mostrarIntegrantes()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }
        else
        {
            for (Integrante integrante : integrantes) {
                System.out.println(integrante);
            }
        }
    }
    public void mostrarIntegranteXnivel(Nivel nivel)
    {
        
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }
        else
        {
            for (Integrante integrante : integrantes) {
                if(integrante.getNivel() == nivel)
                {
                    System.out.println(integrante);
                }
            }
        }

    }
    private boolean verificarLista()
    {
        return integrantes.isEmpty();
    }
    
    public String toString()
    {
        return "ID PROYECTO: "+id+" | NOMBRE PROYECTO: "+nombre;
    }
}
