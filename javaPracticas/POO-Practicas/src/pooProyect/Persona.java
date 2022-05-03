/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyect;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public abstract class Persona{
    private int id;
    private final String nombre;
    private final int edad;
    private Curriculum curriculum;
    private Direccion direccion;
    private static int cont = 0;
    
    public Persona(String nombre, int edad, Direccion direccion){
        this.id = ++Persona.cont;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion = direccion;
        curriculum = null;
    }
    
    public String getNombre(){return nombre;}
    public int getEdad(){return edad;}
    
    protected void setCurriculum(Curriculum curriculum){
        this.curriculum = curriculum;
    }
    public Curriculum getCurriculum(){
        return curriculum;
    }
    
    
    public abstract void crearCurriculum();
    public abstract void enviarCurriculum();
    
    public void verCurriculum(){
        if(verificarCurriculum()){
            JOptionPane.showMessageDialog(null,"NO HAY NIGUN CURRICULUM REGISTRADO");
        }
        else{
            System.out.println(this.curriculum);
        }
    }
    private boolean verificarCurriculum(){
        return curriculum == null;
    }
    
    @Override
    public String toString(){
        return "ID: "+this.id+"\nNOMBRE: "+this.nombre+"\nEDAD: "+this.edad;
    }
    
}
