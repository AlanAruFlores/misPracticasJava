/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEmpresa;

/**
 *
 * @author alang
 */
public class Dueño extends Empleado{
    
    public Dueño(String nombre, int edad, double sueldo)
    {
        super(nombre, edad, sueldo);
    }
    
    @Override
    public void realizarFuncion()
    {
        System.out.println("YO ME ENCARGO DE TODO");
    }
    @Override
    public String toString()
    {
        return "DUEÑO {"+super.toString()+"}";
    }
}
