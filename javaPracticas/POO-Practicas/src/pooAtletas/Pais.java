/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooAtletas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Pais {
    private static int cont = 1;
    private int id;
    private final Nacionalidad nombre;
    private ArrayList<Atleta> atletas;
    
    public Pais(Nacionalidad nombre)
    {
        this.id = cont;
        this.nombre = nombre;
        atletas = new ArrayList<>();
        cont++;
    }
    public int getId()
    {
        return id;
    }
    public void mostrarAtletas()
    {
        JOptionPane.showMessageDialog(null,atletas);
    }
    public void setAtleta(Atleta nuevoAtleta)
    {
        if(verificarCantidadAtletas())
        {
            JOptionPane.showMessageDialog(null,"ERROR, NO PUEDE TENER MAS DE 2 ATLETAS");
        }
        else
        {
            atletas.add(nuevoAtleta);
        }
    }
    private boolean verificarCantidadAtletas()
    {
        int cont = atletas.size();
        return cont > 2;
    }
    @Override
    public String toString()
    {
        return nombre+ " | "+atletas;
    }
    
}
