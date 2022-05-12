/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEscolar;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Aula {
    private boolean estaDisponible;
    private ArrayList personas;
    
    public Aula(ArrayList<Persona> personas){
        this.personas = new ArrayList<>();
        this.personas.addAll(personas);
    }
    
    public void verificarDisponibilidad(){
        
    }
    private boolean verificarRequerimientos(){
        
    }
    
}
