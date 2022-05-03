/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooAtletas;

/**
 *
 * @author alang
 */
public class Atleta {
    private String nombre;
    private int edad;
    //private int kmRecorridos;
    public Atleta(String nombre, int edad)
    {
        this.nombre = nombre;
        setEdad(edad);
    }
    /*
    public int getKm()
    {
        return kmRecorridos;
    }
*/
    public void setEdad(int edad)
    {
        if(verificarEdad(edad))
        {
            this.edad = -1;
        }
        else
        {
            this.edad = edad;
        }
    }

    public int getEdad() {
        return edad;
    }

    private boolean verificarEdad(int edad)
    {
        return edad <= 20;
    }
    @Override
    public String toString()
    {
        return nombre+ " | "+edad;
    }
}
