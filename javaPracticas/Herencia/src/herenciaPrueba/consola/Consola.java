/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaPrueba.consola;

/**
 *
 * @author alang
 */
public class Consola {
    private String nombre;
    private int almacenamiento;
    private int gbRam;
    private float precio;
    
    public String getNombre(){
        return nombre; 
    }
    public void setNombre(String nombre)
    {
        if(verificarNombre(nombre))
        {
            this.nombre = "Unnamed";
        }
        else
        {
            this.nombre = nombre;
        }
    }
    public void setAlmacenamiento(int almacenamiento)
    {
        if(verificarCantidadAlmacenamiento(almacenamiento))
        {
           this.almacenamiento = 200; 
        }
        else
        {
            this.almacenamiento = almacenamiento;
        }
    }
    private boolean verificarCantidadAlmacenamiento(int almacenamiento)
    {
        return almacenamiento  <= 100;
    }
    private boolean verificarNombre(String nombre)
    {
        return nombre == null;
    }
    @Override
    public String toString()
    {
        return "Consola";
    }
    
}
