/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEmpresa;

/**
 *
 * @author alang
 */
public class Empleado {
    private String nombre;
    
    public Empleado(String nombre)
    {
        this.nombre = nombre;
    }
    
    @Override
    public String toString()
    {
        return nombre;
    }
}
