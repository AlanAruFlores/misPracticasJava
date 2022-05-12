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
public abstract class Persona {
    private String nombre;
    private int edad;
    private Sexo sexo;
    
    public Persona(String nombre, int edad , Sexo sexo){
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }
    
    protected abstract void setPrecencia();
    
    @Override
    public String toString(){
        return this.nombre +" | "+this.edad+" | "+this.sexo;
    }
}
