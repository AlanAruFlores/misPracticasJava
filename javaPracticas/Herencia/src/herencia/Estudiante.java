/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *
 * @author alang
 */
public class Estudiante extends Persona {
    private int codigo;
    private int promedio;
   
    
    public Estudiante(String nombre ,String apellido, int codigo, int promedio)
    {
        super(nombre, apellido);
        this.codigo = codigo;
        this.promedio = promedio;
    }
   
    
}
