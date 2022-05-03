/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeradores;

/**
 *
 * @author alang
 */
public class Contricante {
    private String nombre;
    private Estilo_Pelea estilo;
    
    public Contricante(String nombre, Estilo_Pelea estilo)
    {
        this.nombre = nombre;
        this.estilo = estilo;
    }
    public Estilo_Pelea getEstilo(){
        return estilo;
    }
    
    public void setFuerza(int nuevoFuerza)
    {
        estilo.setFuerza(nuevoFuerza);
    }
    public void setAgilidad(int nuevaAgilidad)
    {
        estilo.setAgilidad(nuevaAgilidad);
    }
    public int tenerFuerza()
    {
        return estilo.getFuerza();
    }
    public int tenerAgilidad()
    {
        return estilo.getAgilidad();
    }
    
    @Override
    public String toString()
    {
        return nombre+" | "+estilo+" | "+estilo.mostrarEstadisticas();
    }
}
