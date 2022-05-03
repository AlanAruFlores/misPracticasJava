/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excepcion;
import java.util.Scanner;
import java.io.*;
import javax.swing.JOptionPane;

 /**
 *
 * @author alang.
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    
    //Java nos obliga a evitar excepciones verificadas, para solucionar esto  usamos throws o try catch
    public static void cargarArchivo(String ruta) throws FileNotFoundException,IOException
    {
       FileReader file = new FileReader(ruta);
       BufferedReader bufered = new BufferedReader(file);
       String cadena;
       
       while((cadena = bufered.readLine()) != null)
       {
           System.out.println(cadena);
       }
    }
    
    public static void leerArchivo(String ruta) //throws FileNotFoundException, IOException
    {
        try
        {
            cargarArchivo(ruta);
        }
        
        catch(FileNotFoundException ex)
        {
            JOptionPane.showMessageDialog(null,"ERROR, NO SE ENCONTRO EL ARCHIVO TXT");
        }
        
        catch(IOException ex)
        {
            JOptionPane.showMessageDialog(null,"ERROR");
        }
        //Opcional
        finally
        {
            JOptionPane.showMessageDialog(null,"Programa Terminado");
        }
        
    }
    public static void main(String[] args) {
        String ruta  = JOptionPane.showInputDialog("DIGITE LA RUTA DEL ARCHIVO A CARGAR");
        
        leerArchivo(ruta);
        
    }

}
