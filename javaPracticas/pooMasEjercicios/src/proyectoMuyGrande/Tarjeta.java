/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMuyGrande;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Tarjeta {
    private float saldo;
    private Tipo tipo;
    
    public Tarjeta(Tipo tipo)
    {
        this.tipo = tipo;
        saldo = 0;
    }
    public float getSaldo (){return saldo;} 
    public void recargarSaldo(float dinero)
    {
        if(verificarRecarga(dinero))
        {
            JOptionPane.showMessageDialog(null,"NO SE PUDO RECARGAR");
        }
        else
        {
            this.saldo += dinero;
            JOptionPane.showMessageDialog(null,"RECARGA CON EXITO");
        }
    }
    private boolean verificarRecarga(float dinero)
    {
        return dinero <= 0;
    }
    public boolean efetuarPago(float dinero)
    {
        boolean verificacion = false;
        if(verificarDinero(dinero))
        {
            JOptionPane.showMessageDialog(null,"NO HAY SALDO SUFICIENTE");
        }
        else
        {
            this.saldo -= dinero;
            verificacion = true;
        }
        return verificacion;
    }
    private boolean verificarDinero(float dinero)
    {
        return saldo < dinero;
    }
    @Override
    public String toString()
    {
        return "SALDO: $"+saldo+" | TIPO: "+tipo;
    }
    
}
