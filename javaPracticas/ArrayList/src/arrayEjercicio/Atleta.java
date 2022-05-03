/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayEjercicio;

/**
 *
 * @author alang
 */
public class Atleta {
    private String nombre;
    private String nacionalidad;
    private int minutos;
    private static int contId=1;
    
    public Atleta (String nombre ,String nacionalidad)
    {
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
        this.minutos = (int) (Math.random()*10+1);
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getNacionalidad()
    {
        return nacionalidad;
    }
    public int getMinutos()
    {
        return minutos;
    }
    
    public void mostrarDatos(int i)
    {
        System.out.println((i+1)+" | "+nombre+" | "+nacionalidad+" | "+minutos);
    }
    
    
}
