/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEscolar;

/**
 *
 * @author alang
 */
public class Profesor extends Persona {
    private static int cont=0;
    private int codProfesor;
    private Materia materia;
    
    public Profesor(String nombre, String apellido, int edad, Materia materia)
    {
        super(nombre , apellido , edad);
        this.materia = materia;
        setCodProfesor();
    }
    private void setCodProfesor()
    {
        Profesor.cont++;
        codProfesor = Profesor.cont;
    }
    @Override
    public String toString()
    {
        return "CODIGO PROFESOR: "+codProfesor+" | NOMBRE: "+nombre+" | APELLIDO: "+apellido+" | EDAD: "+edad;
    }
}
