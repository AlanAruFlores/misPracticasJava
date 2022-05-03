/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hora;
import javax.swing.JOptionPane;
/**
 * 
 *
 * @author alang
 */
public class Hora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
        // Crear la Hora de un reloj en JAVA
        Opciones opciones = new Opciones();
        
        int opcion,hora=0,minuto=0,seg=0;
        boolean verificador=false;
        char letra = 'k';
        
        do
        {
            
            opcion = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO\n"
            +"Seleccione alguna opcion:"
            +"\n[1]COMPRA"
            +"\n[2]HISTORIAL"
            +"\n[3]CONFIGURACION"
            +"\n[4]Ver Hora"
            +"\n[5]SALIR"));
            
            switch(opcion)
            {
                case 1:
                {
                    
                }
                case 2:
                {
                
                }
                case 3:
                {
                    opciones.Configuracion();
                    verificador=true;
                    break;
                }
                case 4:
                {
                    hora = opciones.Hora(hora, minuto);
                    minuto = opciones.Minutos(minuto, seg);
                    seg =  opciones.Segundos(seg);
                
                  JOptionPane.showMessageDialog(null,"La hora es: "+hora+":"+minuto+":"+seg);
                  verificador = true;
                  break;
                  
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"Gracias por su atencion");
                    verificador=false;
                }
            }
            if(verificador == true)
            {
                letra = JOptionPane.showInputDialog("¿Desea volver al inicio del algoritmo?. Ingrese s (si) o n (no)").charAt(0);
            }
        }while(letra == 's');
        
    }

    
}
