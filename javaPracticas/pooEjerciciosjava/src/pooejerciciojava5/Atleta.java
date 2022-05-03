/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava5;

/**
 *
 * @author alang
 */
public class Atleta {
    private int nro;
    private final String nombre;
    private float tiempo;
    
    public Atleta(int nro, String nombre, float tiempo)
    {
        this.nro = nro;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    
    public float getTiempo()
    {
        return tiempo;
    }
    
    public void mostrarAtleta()
    {
        System.out.println("NUMERO DEL ATLETA: "+nro);
        System.out.println("NOMBRE DEL ATLETA: "+nombre);
        System.out.println("TIEMPO: "+tiempo+"m");
    }
    
}
