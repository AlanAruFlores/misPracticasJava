/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaproyectovuelo.entidades;
import herenciaproyectovuelo.Nacionalidad;
/**
 *
 * @author alang
 */
public class Domicilio {
    private String ciudad;
    private Nacionalidad pais;
    
    public Domicilio (String ciudad, Nacionalidad pais)
    {
        this.ciudad = ciudad;
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Domicilio{" + "ciudad=" + ciudad + ", pais=" + pais + '}';
    }
    
    
}
