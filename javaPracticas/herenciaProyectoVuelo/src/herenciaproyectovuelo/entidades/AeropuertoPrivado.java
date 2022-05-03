/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaproyectovuelo.entidades;
import java.util.ArrayList;
import javax.swing.JOptionPane;    

/**
 *
 * @author alang
 */
public final class AeropuertoPrivado extends Aeropuerto {
    private ArrayList<EmpresaPatrocinador> empresas;
    
    public AeropuertoPrivado(String nombre, Domicilio domicilio)
    {
        super(nombre, domicilio, TipoAeropuerto.PRIVADO);
        this.empresas = new ArrayList<>();
    }
    
    public void setEmpresas(EmpresaPatrocinador empresa)
    {
        this.empresas.add(empresa);
    }
    public void mostrarEmpresas()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUNA EMPRESA REGISTRADA");
        }
        else
        {
            for (EmpresaPatrocinador empresa : empresas) {
                System.out.println(empresa);
            }
        }
    }
    private boolean verificarLista()
    {
        return empresas.isEmpty();
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | AEROPUERTO PRIVADO";
    }
    
    
}
