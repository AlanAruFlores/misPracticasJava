/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojavaET37;

/**
 *
 * @author alang
 */
public class Desarrollador {
    private String nombre; 
    private int edad;
    private String lesion;
    
    public Desarrollador(String nombre, int edad, int indiceLesion)
    {
        this.nombre = nombre;
        this.edad = edad;
        setLesion(indiceLesion);
    }
    public Desarrollador(String nombre, int edad)
    {
        this(nombre,edad, 3);
    }
    
    public void setLesion(int nroLesion)
    {
        if(nroLesion == 1)
        {
            this.lesion = "CRONICA";
        }
        else if(nroLesion == 2)
        {
            this.lesion = "TRANSITORIA";
        }
        else
        {
            this.lesion = null;
        }
    }
    public String getLesion()
    {
        return lesion;
    }
    @Override
    public String toString()
    {
        String imprimir;
        if(lesion != null)
        {
            imprimir = "NOMBRE: "+nombre+" EDAD: "+edad+" ENFERMEDAD: "+lesion;
        }
        else
        {
            imprimir = "NOMBRE: "+nombre+" EDAD: "+edad;
        }
        return imprimir;
        
    }
}
