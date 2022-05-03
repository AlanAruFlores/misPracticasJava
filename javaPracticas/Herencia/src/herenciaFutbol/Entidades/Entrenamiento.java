/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaFutbol.Entidades;
import herenciaFutbol.Main.Fecha;
/**
 *
 * @author alang
 */
public class Entrenamiento {
    private static int cont = 0;
    private int id;
    private Fecha fecha;
    
    public Entrenamiento(Fecha fecha)
    {
        Entrenamiento.cont++;
        id = Entrenamiento.cont;
        this.fecha = fecha;
    }

    @Override
    public String toString()
    {
        return "ENTRENAMIENTO "+id+" | FECHA: "+fecha;
    }
}
