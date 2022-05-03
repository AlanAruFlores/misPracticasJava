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
public class Cooperativa {
    private int cod_Cooperativa;
    private String nombre;
    private ArrayList<Proyecto> proyectos;
    
    
    public Cooperativa(int cod_Cooperativa, String nombre)
    {
        this.cod_Cooperativa = cod_Cooperativa;
        this.nombre = nombre;
        proyectos = new ArrayList<>();
    }

    
    public void setProyecto(Proyecto proyecto)
    {
        proyectos.add(proyecto);
    }
    
    @Override
    public String toString()
    {
        return cod_Cooperativa + "\nNombre: "+nombre+" \nProyectos: "+proyectos;
    }
}
