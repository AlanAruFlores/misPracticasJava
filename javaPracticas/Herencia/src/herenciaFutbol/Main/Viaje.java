/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaFutbol.Main;
import java.util.ArrayList;
import herenciaFutbol.Entidades.Persona;
/**
 *
 * @author alang
 */
public class Viaje {
    private static int cont=0;
    private int id;
    private Pais pais;
    private Fecha fecha;
    private ArrayList<Persona> equipo;
    public Viaje(Pais pais, Fecha fecha, ArrayList<Persona> equipo)
    {
        Viaje.cont++;
        this.id = Viaje.cont;
        this.pais = pais;
        this.fecha = fecha;
        this.equipo = new ArrayList();
        this.equipo = equipo;
    }
    private void mostrarPersonas()
    {
        System.out.println("PERSONAS DEL VIAJE:");
        for (Persona persona : equipo) {
            System.out.println(persona);
        }
    }
    public void mostrarInformacion()
    {
        System.out.println("VIAJE ID: "+id+" | DESTINO: "+pais+" | FECHA: "+fecha);
        mostrarPersonas();
    }
}
