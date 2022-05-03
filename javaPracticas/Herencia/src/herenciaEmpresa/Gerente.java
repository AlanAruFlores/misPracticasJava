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
public class Gerente extends Empleado {
    private Departamento dep;
    
    public Gerente(String nombre, int edad, double sueldo, Departamento dep)
    {
        super(nombre, edad, sueldo);
        this.dep = dep;
    }
    
    @Override
    public void realizarFuncion()
    {
        System.out.println("ESTOY ADMINISTRANDO");
    }
    @Override
    public String toString()
    {
        return "GERENTE : "+dep+"{"+super.toString()+"}";
    }
    
}
