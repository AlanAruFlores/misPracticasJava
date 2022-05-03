/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tateti;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Usuario {
    private String nombre;
    private int victorias;
    private int perdidas;
    
    public Usuario(String nombre)
    {
        this.nombre = nombre;
        this.victorias = 0;
        this.perdidas = 0;
    }
    
    
    public String getNombre()
    {
        return nombre;
    }
    
    public int getVictorias()
    {
        return victorias;
    }
    public int getPerdidas()
    {
        return perdidas;
    }
    public void setVictorias(int victorias)
    {
        this.victorias += victorias;
    }
    public void setPerdidas(int perdidas)
    {
        this.perdidas += perdidas;
    }
       
    
    
    public void mostrarEstadisticas()
    {
        JOptionPane.showMessageDialog(null,"ESTADISTICA SOBRE: "+nombre+""
                + "\nVICTORIAS: "+victorias
                + "\nPERDIDAS: "+perdidas);
    }
    
}
