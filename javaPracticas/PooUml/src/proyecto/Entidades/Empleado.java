/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Entidades;

/**
 *
 * @author alang
 */
public class Empleado extends Persona {
    private double sueldo;
    private String categoria;
    private Direccion direccion;
    private Departamento departamento;
    
    public Empleado(int dni, String nombre, int edad, Estado estado, double sueldo, String categoria, Direccion direccion,
            Departamento departamento)
    {
        super(dni,nombre,edad,estado);
        this.sueldo = sueldo;
        this.categoria = categoria;
        this.direccion = direccion;
        this.departamento = departamento;
    }
    
    @Override
    public void mostrarDireccion()
    {
        System.out.println(direccion);
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | SUELDO: $"+sueldo+" | CATEGORIA: "+categoria+" | DEPARTAMENTO: "+departamento;
    }
}
