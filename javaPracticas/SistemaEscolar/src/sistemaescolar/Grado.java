/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolar;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Grado {
    private static int cont = 1;
    private int año;
    private ArrayList<Alumno> alumnos = new ArrayList<>();
    private Profesor profesor;
    private ArrayList<Materia> materias = new ArrayList<>();
    
    public Grado(ArrayList<Alumno> alumnos, Profesor profesor, ArrayList<Materia>materias)
    {
        this.año = cont;
        this.alumnos.addAll(alumnos);
        this.profesor = profesor;
        this.materias.addAll(materias);
        cont++;
    }
    @Override
    public String toString()
    {
        return "GRADO "+año+"\nALUMNOS: "+alumnos+"\nPROFESOR: "+profesor+"\nMATERIA: "+materias;
    }
}
