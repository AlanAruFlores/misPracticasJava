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
public class EmpresaPatrocinador {
    private String nombre;
    
    public EmpresaPatrocinador(String nombre)
    {
        this.nombre = nombre;
    }
    
    @Override
    public String toString()
    {
        return "EMPRESA PATROCINADORA: "+nombre;
    }
    
}
