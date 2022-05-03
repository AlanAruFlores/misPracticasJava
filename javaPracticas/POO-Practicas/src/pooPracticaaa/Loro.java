/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPracticaaa;

/**
 *
 * @author alang
 */
public class Loro extends Mascota{
    private String colorPiel;
    
    public Loro(String nombre, int edad,String colorPiel)
    {
        super(nombre,edad);
        this.colorPiel = colorPiel;
                
    }
    
    @Override
    public void alimentarse()
    {
        System.out.println("ME SEMILLAS");
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | LORO";
    }
    
}
