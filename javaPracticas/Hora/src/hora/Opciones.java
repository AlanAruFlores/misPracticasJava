/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Opciones {
    
    public void Configuracion()
    {
        
        //Llamamos a mla clase Scanner
        Scanner entrada = new Scanner(System.in);
        //Definir Variables
        int hora, minutos;
        
        hora = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora"));
        minutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la hora"));
        VerHora(hora,minutos);

        
    }
    public void VerHora(int hora, int minutos)
    {
        int nanosegundos=0, seg=0,i = 1;
        do
        {
            nanosegundos++;
            if(nanosegundos>=1000000000)
            {
                nanosegundos=0;
                seg++;
                
                minutos=Minutos(minutos,seg);
                hora=Hora(hora,minutos);
                seg=Segundos(seg);
            }
        }while(i==1);
    }
    public int Minutos(int minutos,int seg)
    {
        if(seg == 60)
        {
            
            return ++minutos;
        }
        else
        {
            return minutos;
        }
    }
    public int Hora(int hora, int minutos)
    {
        if(minutos == 60)
        {
            return hora++;
        }
        else
        {
            return hora;
        }
    }
    public int Segundos(int seg)
    {
        if(seg==60)
        {
            seg = 0;
            return seg;
        }
        else
        {
            return seg;
        }
    }
    
    
}
