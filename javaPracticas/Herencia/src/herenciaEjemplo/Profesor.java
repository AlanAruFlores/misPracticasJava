/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEjemplo;

/**
 *
 * @author alang
 */
public class Profesor extends Persona{
    private String materia;
    
    public Profesor(String nombre, int edad, String materia)
    {
        super(nombre, edad);
        this.materia = materia;
    }
    
    public void mostrarEstado()
    {
        System.out.println(getNombre()+" | "+getEdad()+" | "+materia);
    }
    
}
