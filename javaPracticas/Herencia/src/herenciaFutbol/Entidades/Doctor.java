/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaFutbol.Entidades;

/**
 *
 * @author alang
 */
public class Doctor extends Persona{
    private String titulacion;
    private int años;
    
    public Doctor(String nombre, String apellido, int edad, String titulacion, int años)
    {
        super(nombre, apellido, edad, TipoPersona.DOCTOR);
        this.titulacion = titulacion;
        this.años = años;
    }
    
    public void curarJugador(Futbolista futbolista){
        futbolista.curar();
    }
    @Override
    public String toString()
    {
        return super.toString()+" | TITULACION : "+titulacion+" | AÑOS DE EXPERIENCIA"+años;
    }

}
