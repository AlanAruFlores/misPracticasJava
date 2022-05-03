/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetepoo;

/**
 *
 * @author alang
 */
public class Tarjeta {
    private static int cont = 0 ;
    private int nroTarjeta;
    private Entidad_Financiera entidad;
    private Persona titular;
    private double saldo;
    
    public Tarjeta(Entidad_Financiera entidad, Persona titular)
    {
        Tarjeta.cont++;
        nroTarjeta = Tarjeta.cont;
        this.entidad = entidad;
        this.titular = titular;
        saldo = 0;
    }
    
    public void setSaldo(double dinero , boolean accion)
    {
        if(accion == true)
        {
            if(verificarSaldo(dinero))
            {
                this.saldo  += dinero;
            }
        }
        else
        {
            if(verificarMonto(dinero)!= true)
            {
                this.saldo -=dinero;
            }
           
        }
       
    }
    private boolean verificarMonto(double monto)
    {
        return saldo < monto;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public Persona getTitular()
    {
        return titular;
    }
    private boolean verificarSaldo(double dinero)
    {
        return dinero > 0 ;
    }
}
