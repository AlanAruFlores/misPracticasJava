/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojavaET37;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Proyecto {
    private String nombre;
    private int horas_estimadas;
    private ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
    
    public Proyecto (String nombre, int horas_estimadas, ArrayList<Desarrollador>desarrolladores)
    {
        this.nombre = nombre;
        this.horas_estimadas = horas_estimadas;
        this.desarrolladores = desarrolladores;
    }
    
    public void setDessarollador(Desarrollador desarrollador)
    {
        desarrolladores.add(desarrollador);
    }
    public ArrayList <Desarrollador> getDesarrolladores()
    {
        return desarrolladores;
    }
    
    @Override
    public String toString()
    {
        return "\nNOMBRE: "+nombre+"\nHORAS FINALIZACION: "+horas_estimadas+"\nDESARROLLADORES: "+desarrolladores;
    }
}
