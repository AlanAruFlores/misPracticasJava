/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaproyectovuelo.entidades;

/**
 *
 * @author alang
 */
public final class AeropuertoPublico extends Aeropuerto {
    private double dineroGubernamental;
    
    public AeropuertoPublico(String nombre, Domicilio domicilio, double dineroGubernamental)
    {
         super(nombre,domicilio,TipoAeropuerto.PUBLICO);
         this.dineroGubernamental = dineroGubernamental;
    }
    
    public void mostrarDineroGubernamental()
    {
        System.out.println("DINERO GUBERNAMENTAL: $"+dineroGubernamental);;
    }
    
    @Override
    public String toString()
    {
        return super.toString() + " | AEROPUERTO PUBLICO";
                
    }
}
