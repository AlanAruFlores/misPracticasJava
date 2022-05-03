/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava5;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    public static ArrayList<Atleta> inputAtletas(int nAtletas)
    {
        ArrayList<Atleta> array = new ArrayList <Atleta>();
        int nro;
        String nombre;
        float tiempo;
        
        for (int i = 0; i < nAtletas; i++) {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL ATLETA");
            tiempo = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL TIEMPO DEL ATLETA"));
            array.add(new Atleta(i,nombre,tiempo));         
        }
        
        return array;
    }
    public static int searchWinner(int nAtletas, ArrayList<Atleta> array)
    {
        float tiempoMenor = array.get(0).getTiempo();
        int idWinner = 0;
          for (int i = 1; i < nAtletas; i++) {
              if(array.get(i).getTiempo()< tiempoMenor)
              {
                  tiempoMenor = array.get(i).getTiempo();
                  idWinner = i;
              }
        }
        return idWinner;  
        
    }
}
