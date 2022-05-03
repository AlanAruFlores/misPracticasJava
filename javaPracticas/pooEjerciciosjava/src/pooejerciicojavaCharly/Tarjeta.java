/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciicojavaCharly;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Tarjeta {
    private String nombreEntidadFinanciara;
    private String nombreEntidadBancaria;
    private int nroTarjeta;
    private double saldo;
    private Titular titular;
    public Tarjeta(String nombreEntidadFinanciera, String nombreEntidadBancaria, Titular titular)
    {
        this.nombreEntidadFinanciara = nombreEntidadFinanciera;
        this.nombreEntidadBancaria = nombreEntidadBancaria;
        setNroTarjeta();
        this.saldo = saldo;
        this.titular = titular;
    }
    public int getNroTarjeta()
    {
        return nroTarjeta;
    }
    public Titular getTitular()
    {
        return titular;
    }
    private void setNroTarjeta()
    {
        nroTarjeta = (int)(Math.random()*200+100);
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void pagar(double monto)
    {
        saldo -= monto;
    }
    public void recargar(double monto)
    {
        if(verificarDinero(monto))
        {
            saldo+=monto;
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ERROR, NO SE PUDO RECARGAR EL DINERO");
        }
    }
    private boolean verificarDinero(double dinero)
    {
        return dinero > 0;
    }
    @Override
    public String toString()
    {
        return nroTarjeta+" | SALDO $"+saldo+"\n";
    }
}
