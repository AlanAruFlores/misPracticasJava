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
public class verificarAlumnos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Dadas 6 notas verificar si el alumno aprobo, escribir la cantidad de alumnos, y ver si aprobaron o condicionador o suspendidos
        Control control = new Control();
        final int notas = 6;
        int cantidadAlumnos,i,j,calificaciones=0, sumNotas=0;
        
        cantidadAlumnos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de Alumnos"));
        
        for(i=1;i<=cantidadAlumnos;i++)
        {
            for(j=1;j<=notas;j++)
            {
                calificaciones=Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota "+j+" del alumno "+i
                +" entre 1 y 10"));
                calificaciones=control.Error(calificaciones,i,j);
                sumNotas+=calificaciones; 
            }
            control.verificador(sumNotas, i);
        }
    }
    
}
/*  for(i=1;i<=6;i++)
    {
        calificacion = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la nota"+i));
        while (calificacion < 1 || calificacion >10)
        {
            calificacion = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nIngrese la nota"+i));
        }
        if(calificacion >=5)
        {
            aprobados++;
        }   
        else if(calificacion == 4)
        {
            condicionados++;
        }
        else
        {
            reprobados++;
        }
    }
    JOptionPane.showMessageDialog(null,"Cantidad de alumnos aprobados: "+aprobados+
    "\nCantidad de alumnos condicionados: "+condicionados+
    "\nCantidad de alumnos reprobados: "+reprobados));
*/
