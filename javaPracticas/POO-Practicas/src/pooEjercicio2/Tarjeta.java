/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Tarjeta {
    private double saldo;
    private Entidad_Bancaria entidad;
    
    public Tarjeta(Entidad_Bancaria entidad)
    {
        this.saldo = 0;
        this.entidad = entidad;
    }
    
    public void setSaldo(boolean accion,double dinero)
    {
        if(accion == true)
        {
            this.saldo += dinero;
        }
        else
        {
            this.saldo-= dinero;
        }
    }
    public double getSaldo()
    {
        return saldo;
    }
    private boolean verificarSaldo(double dinero)
    {
        return dinero > this.saldo;
    }
    @Override
    public String toString()
    {
        return "TARJETA: "+entidad+" | SALDO: $"+saldo;
    }
}
