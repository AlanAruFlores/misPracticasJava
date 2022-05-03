/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase_MetodosFinales;

/**
 *
 * @author alang
 */
public class Jefe extends Empleado{
    private String funcion;
    
    public Jefe(String nombre, int dni, double sueldo, String funcion)
    {
        super(nombre,dni,sueldo);
        this.funcion = funcion;
    }
    
    public void verFuncion()
    {
        System.out.println(funcion);
    }
}
