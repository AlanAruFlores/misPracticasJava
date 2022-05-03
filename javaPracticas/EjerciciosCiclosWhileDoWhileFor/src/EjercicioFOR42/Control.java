/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EjercicioFOR42;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Control {
    
    public int contSuspenso(int notas)
    {
        if(notas <= 3 )
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }
    public int Error(int notas, int i)
    {
        while (notas < 1 || notas >10)
        {           
            notas = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nDigite la nota "+i+" del alumno "+i));
        }
        return notas;
    }
}
