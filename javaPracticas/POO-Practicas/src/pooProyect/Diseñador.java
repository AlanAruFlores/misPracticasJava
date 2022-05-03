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
public class Diseñador extends Persona{
    private ArrayList<ProgramaPhotoshop> programas;
    
    public Diseñador(String nombre, int edad, ArrayList<ProgramaPhotoshop>programas, Direccion direccion){
        super(nombre,edad, direccion);
        this.programas.addAll(programas);
    }
    @Override
    public void crearCurriculum(){
        String descripcion = JOptionPane.showInputDialog(null,"ESCRIBA UNA DESCRIPCION DEL CURRICULUM");
        setCurriculum(new Curriculum(toString(),descripcion));
    }
    
    @Override
    public void enviarCurriculum(){
        
    }
    
    @Override
    public String toString(){
        return super.toString()+"\nPROGRAMAS: "+programas+" | DISEÑADOR";
    }
    
}
