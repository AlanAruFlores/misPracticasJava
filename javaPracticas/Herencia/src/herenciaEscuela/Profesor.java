/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEscuela;
import herenciaEscuela.Principal.Rango;
import herenciaEscuela.Principal.Materia;
/**
 *
 * @author alang
 */
public class Profesor extends Trabajador {
    private Materia materia;
    public Profesor(String nombre, int edad, Rango rango, Materia materia)
    {
        super(nombre, edad, rango);
        this.materia = materia;
        
    }
}
