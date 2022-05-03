/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaHerencia;

/**
 *
 * @author alang
 */
public class Perro extends Animal{
    private RazaPerro raza;
    
    public Perro(String nombre, int edad, String colorPiel, RazaPerro raza)
    {
        super(nombre, edad, colorPiel,TipoAnimal.PERRO);
        this.raza= raza;
    }
    @Override
    public String toString()
    {
        return super.toString() +" | RAZA: "+raza;
    }
}
