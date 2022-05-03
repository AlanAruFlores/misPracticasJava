/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaFutbol.Entidades;
import herenciaFutbol.Main.Fecha;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Entrenador extends Persona {
    private Estrategia estrategia;
    
    public Entrenador(String nombre, String apellido, int edad, Estrategia estrategia)
    {
        super(nombre, apellido, edad, TipoPersona.ENTRENADOR);
        this.estrategia = estrategia;
    }
    public Entrenamiento planificarEntrenamiento()
    {
        Fecha fecha = definirFecha();
        return new Entrenamiento(fecha);
    }
    private Fecha definirFecha()
    {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DIA"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL MES"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL AÑO"));
        
        return new Fecha(dia,mes,año);
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | ESTRATEGIA : "+estrategia;
    }
}
