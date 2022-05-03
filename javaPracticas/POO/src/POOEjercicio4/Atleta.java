/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio4;

/**
 *
 * @author alang
 */
public class Atleta {
    private int nroAtleta;
    private final String nombre;
    private float tiempo;
    
    public Atleta(int nroAtleta, String nombre, float tiempo)
    {
        this.nroAtleta = nroAtleta;
        this.nombre = nombre;
        this.tiempo = tiempo;
    }
    public float getTiempo()
    {
        return tiempo;
    }
    
    public void mostrarDatos()
    {
        System.out.println("ATLETA GANADOR");
        System.out.println("Numero: "+nroAtleta);
        System.out.println("Nombre: "+nombre);
        System.out.println("Tiempo (minutos): "+tiempo);
    }
    
}
