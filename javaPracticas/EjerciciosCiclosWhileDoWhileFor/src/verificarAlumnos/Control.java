/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package verificarAlumnos;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Control {
    public int Error(int calificacion,int i, int j)
    {
        while(calificacion < 1 || calificacion > 10)
        {
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("ERROR"
            +"\nIngrese la nota "+j+" del alumno "+i));
        }
        return calificacion;
    }
    public void verificador(int sumNotas, int i)
    {
        float promedio;
        promedio=(float)sumNotas/6;
        
        if(promedio >=5)
        {
            JOptionPane.showMessageDialog(null,"El alumno "+i+" aprobo ya que su promedio es: "+promedio);
        }
        else 
            if(promedio  > 3 || promedio <5)
            {
                JOptionPane.showMessageDialog(null,"El alumno "+i+" esta condicionado ya que su promedio es: "+promedio);
            }
        else
            {
                JOptionPane.showMessageDialog(null,"El alumno "+i+" esta suspendido ya que su promedio es: "+promedio);
            }
    }
}
