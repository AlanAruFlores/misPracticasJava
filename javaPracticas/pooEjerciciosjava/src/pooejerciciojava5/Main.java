/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava5;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        ArrayList<Atleta> array = new ArrayList<Atleta>();
        int nAtletas, idWinner =0;
        
        do
        {
            nAtletas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE ATLETAS"));
        }while(nAtletas<=0);
      
        array.addAll(Class.inputAtletas(nAtletas));
        
        idWinner = Class.searchWinner(nAtletas, array);
        
        System.out.println("GANADOR");
        array.get(idWinner).mostrarAtleta();
        
    }
}
