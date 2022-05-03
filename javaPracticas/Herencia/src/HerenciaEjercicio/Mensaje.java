/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio;

/**
 *
 * @author alang
 */
public class Mensaje {
    private String tema;
    private String cuerpo;
    private String receptor;
    public Mensaje(String tema, String cuerpo, String receptor)
    {
        this.tema = tema;
        this.cuerpo = cuerpo;
        this.receptor = receptor;
    }
    
    @Override
    public String toString(){
        return "TEMA: "+tema+"\n------------\n"+cuerpo+"\n--------------\nESCRITO POR : "+receptor;
    }
}
