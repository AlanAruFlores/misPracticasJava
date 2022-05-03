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
public class Futbolista extends Persona{
    private int dorsal;
    private Posicion posicion;
    private boolean estado;
    
    public Futbolista(String nombre, String apellido, int edad, int dorsal, Posicion posicion)
    {
        super(nombre, apellido, edad, TipoPersona.FUTBOLISTA);
        this.dorsal = dorsal;
        this.posicion = posicion;
        setEstado();
    }
    public boolean getEstado()
    {
        return estado;
    }
    private void setEstado()
    {
        int num = numeroAleatorio();
        
        if(num  == 1)
        {
            this.estado = false;
        }
        else
        {
            this.estado = true;
        }
                
    }
    private int numeroAleatorio()
    {
        return (int)(Math.random()*2+1);
    }
    
    public void curar()
    {
        this.estado = true;
    }
    
    @Override
    public String toString()
    {
        return super.toString()+" | DORSAL : "+dorsal+" | POSICION: "+posicion+" | ESTADO: "+estado;
    }
   
    
}
