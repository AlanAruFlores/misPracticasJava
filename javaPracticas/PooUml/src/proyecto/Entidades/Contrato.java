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
public class Contrato {
    private Empleado empleado;
    private Empresa empresa;
    
    
    public Contrato(Empleado empleado, Empresa empresa)
    {
        this.empleado = empleado;
        this.empresa = empresa;
    }
    
    @Override
    public String toString()
    {
        return "INFORMACION EMPLEADO: "+empleado+"\nINFORMACION DE LA EMPRESA: "+empresa;
    }
    
   
}
