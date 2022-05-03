/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;

/**
 *
 * @author alang
 */
public class DiseñadorGrafico extends Empleado {
    private String programa;
    
    public DiseñadorGrafico(String nombre, int edad, double sueldo, String programa)
    {
       super(nombre,edad,sueldo);
       this.programa = programa;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | UTILIZA EL PROGRAMA: "+programa;
    }
}
