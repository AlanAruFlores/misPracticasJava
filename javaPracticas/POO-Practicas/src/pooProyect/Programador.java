/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyect;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Programador extends Persona{
    private ArrayList<LenguajesProgramacion> lenguajes;
    
    public Programador(String nombre, int edad, ArrayList<LenguajesProgramacion>lenguajes, Direccion direccion){
        super(nombre, edad, direccion);
        this.lenguajes.addAll(lenguajes);
    }
    
    @Override
    public void crearCurriculum(){
        String descripcion = JOptionPane.showInputDialog("DIGITE UNA DESCRIPCION");
        setCurriculum(new Curriculum(toString(),descripcion));
    }
    @Override 
    public void enviarCurriculum(){
      
    }
    @Override
    public String toString(){
        return super.toString()+" | LENGUAJES: "+lenguajes+" | PROGRAMADOR";
    }
    
}
