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
/*final si ponemos final en una clase significa que esta no extendera sus propiedades a otras clases
esto puede ser un medio de seguridad*/

    public class Empleado {
    private String nombre;
    private final int dni;
    private double sueldo;
    
    public Empleado(String nombre, int dni, double sueldo)
    {
        this.nombre = nombre ; 
        this.sueldo = sueldo;
        this.dni = dni;
    }
    
    
    
    //si el metodo tiene un final, significa que no podra ser sobreescrito por sus clases hijas
    public void verFuncion()
    {
        System.out.println("MI FUNCION ES TRABAJAR");
    }
    /* EL DNI AL SER UN ATRIBUTO FINAL NO SE PUEDE MODIFICAR SU VALOR INICIAL;
    public void setDni(int dni)
    {
        this.dni = dni;
    }
*/
    
    
    
}
