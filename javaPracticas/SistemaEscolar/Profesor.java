/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SistemaEscolar;

/**
 *
 * @author alang
 */
public class Profesor extends Persona{
    private boolean precenciaActual;
    private Materia materia;
    
    public Profesor(String nombre, int edad, Sexo sexo, Materia materia){
        super(nombre, edad, sexo);
        this.materia = materia;
        setPrecencia();
    }
    @Override
    public void setPrecencia(){
        if(Main.generarNumeroAleatorio(1, 2) == 2)
            this.precenciaActual = true;
    }
    @Override
    public String toString(){
        return super.toString() + " | PRECENCIAL: "+this.precenciaActual+" | MATERIA: "+this.materia;
    }
}
