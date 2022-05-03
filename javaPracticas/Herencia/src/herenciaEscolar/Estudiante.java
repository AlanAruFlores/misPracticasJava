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
public class Estudiante extends Persona{
    private static int cont = 0;
    private int codEstudiante;
    private int promedio;
    
    public Estudiante(String nombre, String apellido, int edad, int promedio)
    {
        super(nombre , apellido, edad);
        this.promedio = promedio;
        setCodEstudiante();
    }
    private void setCodEstudiante()
    {
        Estudiante.cont++;
        codEstudiante = Estudiante.cont;
    }
    @Override
    public String toString()
    {
        return "CODIGO ESTUDIANTE: "+codEstudiante+" | NOMBRE: "+nombre+" | APELLIDO: "+apellido+" | EDAD: "+edad;
    }
}
