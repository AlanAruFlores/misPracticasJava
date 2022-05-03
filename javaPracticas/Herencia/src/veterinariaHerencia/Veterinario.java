/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaHerencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Veterinario {
    private ArrayList<Animal> animales;
    private String nombre;
    
    public Veterinario(String nombre)
    {
        animales = new ArrayList<Animal>();
        this.nombre = nombre;
    }
    
    public void setAnimal(Animal a)
    {
        animales.add(a);
        JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");  
    }
    public void mostrarTodosAnimales()
    {
        if(verificarAnimales())
        {
            JOptionPane.showMessageDialog(null,"NO SE REGISTRO NINGUN ANIMAL");
        }
        else
        {
            for (Animal animal : animales) {
                System.out.println(animal);
            }
        }

    }
    public void mostrarUnAnimal(TipoAnimal tipo)
    {
        
        if(verificarAnimales())
        {
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }
        else
        {
            for (Animal animal: animales) {
                if(animal.getTipoAnimal().equals(tipo))
                {
                    System.out.println(animal);
                }
            }
        }

    }
    private boolean verificarAnimales()
    {
        return animales.isEmpty();
    }
    
    @Override
    public String toString(){
        return "NOMBRE VETERINARIO: "+nombre;
    }
    
}
