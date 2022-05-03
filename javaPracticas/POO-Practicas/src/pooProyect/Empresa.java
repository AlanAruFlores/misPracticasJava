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
public class Empresa {
    private String nombre;
    private Direccion direccion;
    private ArrayList<Curriculum> curriculums;
    private ArrayList<Persona> empleados;
    
    public Empresa(String nombre, Direccion direccion){
        this.nombre = nombre;
        this.direccion = direccion;
        this.curriculums = new ArrayList<>();
        this.empleados = new ArrayList<>();
    }
    
    public void setCurriculum(Curriculum curriculum){
        curriculums.add(curriculum);
    }
    public void mostrarCurriculums(){
        if(verificarListaVacia(curriculums)){
            JOptionPane.showMessageDialog(null,"NO MANDARON NINGUN CURRICULUMS ");
        }
        else{
            for (Curriculum curriculum : curriculums) {
                System.out.println(curriculum);
            }
        }
    }
    private boolean verificarListaVacia(ArrayList lista){
        return lista.isEmpty();
    }
    
}
