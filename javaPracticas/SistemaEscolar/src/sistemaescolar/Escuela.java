/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolar;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Escuela {
    private String nombre;
    private String direccion;
    private int distrito;
    private ArrayList<Grado> grados = new ArrayList<>();
    
    public Escuela(String nombre, String direccion , int distrito, ArrayList<Grado>grados)
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.distrito = distrito;
        this.grados.addAll(grados);
    }
    
    @Override
    public String toString()
    {
        return "ESCUELA\nNombre: "+nombre+"\nDireccion: "+direccion+"\nDistrito: "+distrito+"Grados: "+grados+"";
    }
}
