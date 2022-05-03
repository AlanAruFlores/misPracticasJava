/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEscolar;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Escuela {
    private String nombre;
    ArrayList<Persona> personas;
    
    public Escuela(String nombre)
    {
        this.nombre = nombre;
        this.personas = new ArrayList<Persona>();
    }
    
    public void registarEstudiante(String nombre , String apellido ,int edad, int promedio)
    {
        setPersona(new Estudiante(nombre,apellido,edad,promedio));
    }
    public void registrarProfesor(String nombre , String apellido , int edad, Materia materia)
    {
        setPersona(new Profesor(nombre,apellido,edad,materia));
    }
    public void setPersona(Persona p)
    {
        personas.add(p);
    }
    public void mostrarPersonas()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }
        else
        {
            for (Persona persona : personas) {
                System.out.println(persona);
            }
        }
    }
    private boolean verificarLista()
    {
        return personas.isEmpty();
    }
    @Override
    public String toString()
    {
        return "NOMBRE DE LA ESCUELA: "+nombre;
    }
}
