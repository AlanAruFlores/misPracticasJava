/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;

/**
 *
 * @author alang
 */
public class Integrante {
    private int id;
    private String nombre;
    private Nivel nivel;
    private static int cont = 0;
    
    public Integrante(String nombre , Nivel nivel)
    {
        setNombre(nombre);
        this.nivel = nivel;
        setID();
    }
    private void setID()
    {
        Integrante.cont++;
        id = Integrante.cont;
    }
    public int getID()
    {
        return id;
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre.toUpperCase();
    }
    public Nivel getNivel()
    {
        return nivel;
    }
    public String toString()
    {
        return "NOMBRE: "+nombre+" | NIVEL: "+nivel;
    }
    
}
