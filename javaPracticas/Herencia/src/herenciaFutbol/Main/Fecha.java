/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaFutbol.Main;

/**
 *
 * @author alang
 */
public class Fecha {
    private int dia;
    private int mes;
    private int año;
    
    public Fecha(int dia, int mes, int año)
    {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
    }
    
    @Override
    public String toString()
    {
        return dia+"/"+mes+"/"+año;
    }
    
}
