/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPracticaaa;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Veterinaria {
    private String nombre;
    private ArrayList<Mascota>mascotas;
    private Domicilio domicilio; 
    
    public Veterinaria(String nombre, Domicilio domicilio)
    {
        this.nombre = nombre;
        this.domicilio = domicilio;
        mascotas = new ArrayList<>();
    }
    
    
    public void mostrarRazaMasFuerte()
    {
        
        if(verificarMascotas())
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        else{
            Raza razas[] = Raza.values();
            Raza razaMasFuerte = razas[0];
            int razaPoderosa = razas[0].getFuerzaMandibula();

            for (int i = 0; i < razas.length; i++) {
                if(razaPoderosa < razas[i+1].getFuerzaMandibula())
                {
                    razaPoderosa = razas[i+1].getFuerzaMandibula();
                    razaMasFuerte = razas[i+1];
                }
            }

            for (Mascota mascota : mascotas) {
                if(mascota instanceof Perro){
                    if(((Perro) mascota).getRaza()==razaMasFuerte){
                        System.out.println(mascota);
                    }
                }
            }
        }
    }
    public void mostrarMascotasXTipo(int opcion) {
        if (opcion == 1)
            for (Mascota mascota : mascotas) {
                if (mascota instanceof Loro) {
                    System.out.println(mascota);
                }
            }
        else
            for (Mascota mascota : mascotas) {
                if (mascota instanceof Perro) {
                    System.out.println(mascota);
                }
            }
    }
    public void setMascota(Mascota m)
    {
        mascotas.add(m);
    }
    
    public void mostrarMascotas()
    {
        if(verificarMascotas())
        {
            JOptionPane.showMessageDialog(null,"ESTA VACIO");
        }
        else
        {
            for (Mascota mascota : mascotas) {
                System.out.println(mascota);
            }
        }
    }
    
    private boolean verificarMascotas()
    {
        return mascotas.isEmpty();
    }
    
    @Override
    public String toString()
    {
        return nombre+" | Direccion: "+domicilio;
    }
}
