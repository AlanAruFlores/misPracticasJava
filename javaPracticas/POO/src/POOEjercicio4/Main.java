/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        int id,contAtletas,idGanador=0;
        String nombre;
        float tiempo, tiempoGanador=0;
        
        
        contAtletas = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el nro de atletas que concurso"));
        Atleta atletas[] = new Atleta[contAtletas];
        
        for(int i = 0 ; i < atletas.length; i++)
        {
            id = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el id del atleta "+(i+1)));
            nombre = JOptionPane.showInputDialog("Ingrese el nombre del atleta "+(i+1));
            tiempo = Float. parseFloat(JOptionPane.showInputDialog("Ingrese el tiempo (minutos) del atleta "+(i+1)));
            
            if(i == 0)
            {
                tiempoGanador = tiempo;
                idGanador = i;
            }
            else
            {
                if(tiempoGanador > tiempo)
                {
                    tiempoGanador = tiempo;
                    idGanador = i;
                }
            }
           
            
            atletas[i] = new Atleta(id,nombre,tiempo);           
        }
        
        System.out.println("INFORMACION DEL GANADOR");
        atletas[idGanador].mostrarDatos();
        
        
              
    }
}
