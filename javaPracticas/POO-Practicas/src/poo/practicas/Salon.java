/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.practicas;
import java.util.ArrayList;
/**
 *
 * @author alang
 */

public class Salon
{
    private static int cont = 0 ;
    private String materia;
    private int id;
    private ArrayList<Alumno> alumnos;
    
    public Salon ( String materia)
    {
        alumnos = new ArrayList<Alumno>();
        Salon.cont++;
        this.materia = materia;
        this.id = cont;
    }
    public int getID()
    {
        return id;
    }
    public void setAlumno(Alumno alumno)
    {
        alumnos.add(alumno);
    }
    @Override
    public String toString()
    {
        return "ID SALON: "+id+" | MATERIA: "+materia+" ALUMNO: "+alumnos;
    }
}
    

