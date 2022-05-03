/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    static ArrayList<Contricante> participantes = new ArrayList<>();
    
    private static void setContricantes()
    {
        Contricante l1 = new Contricante("Kale", Estilo_Pelea.BOXEO);
        Contricante l2 = new Contricante("Cristian", Estilo_Pelea.KARATE);
        participantes.add(l1);
        participantes.add(l2);
    }
    public static void main(String[] args) {
      
        setContricantes();
        
        Contricante ganadorFuerza = null;
        Contricante ganadorAgilidad = null;
        
        participantes.get(0).setFuerza(300);
        System.out.println(participantes.get(0));
        System.out.println(participantes.get(1));
        
        
        
        ganadorFuerza=seleccionarGanadorFuerza();
        ganadorAgilidad = seleccionarGanadorAgilidad(); 
        System.out.println("GANADOR EN FUERZA: "+ganadorFuerza);
        
        System.out.println("GANADOR EN AGILIDAD: "+ganadorAgilidad);
    }
    public static Contricante seleccionarGanadorAgilidad()
    {
        int cont = participantes.size();
        Contricante ganador = participantes.get(0);
        
        for (int i = 0; i < cont; i++) {
            if(ganador.tenerAgilidad() < participantes.get(i).tenerAgilidad())
            {
                ganador = participantes.get(i);
            }
        }
        
        return ganador;
    }
    public static Contricante seleccionarGanadorFuerza()
    {
        int cont  = participantes.size();
        Contricante ganador = participantes.get(0);
        for (int i = 1; i < cont; i++) {
            if(ganador.tenerFuerza() < participantes.get(i).tenerFuerza())
            {
                ganador = participantes.get(i);
            }
        }
        return ganador;
    }
}
