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
public class Estudiante extends Persona{
    private int calificacionActual;
    private boolean hacerNovillo;
    
    public Estudiante(String nombre, int edad, Sexo sexo, int calificacionActual){
        super(nombre,edad,sexo);
        setCalificacion(calificacionActual);
        setPrecencia();   
    }
    
    @Override
    protected void setPrecencia(){
        if(Main.generarNumeroAleatorio(1,2) == 2){
            this.hacerNovillo = true;
        }
    }
    public boolean getPrecencia(){
        return  this.hacerNovillo;
    }
    private void setCalificacion(int calificacion){
        if(verificarCalificacion(calificacion))
            this.calificacionActual = calificacion;
        else
            this.calificacionActual = Main.generarNumeroAleatorio(0,10);
    }
    

    private boolean verificarCalificacion(int calificacion){ 
        return calificacion >=0 && calificacion <=10;
    }
    
    
    @Override
    public String toString(){
        return super.toString() +" | PRECENCIA: "+this.hacerNovillo+" | CALIFICACION: "+this.calificacionActual; 
    }
    
}