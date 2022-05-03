/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava8;

/**
 *
 * @author alang
 */
public class Cuenta {
    private int nroCuenta;
    private double saldo;
    
    public Cuenta(int nroCuenta, double saldo)
    {
        this.nroCuenta = nroCuenta;
        this.saldo = saldo;
    }
    public int getNroCuenta()
    {
        return nroCuenta;
    }
    public double getSaldo()
    {
        return saldo;
    }
    public void ingresarSaldo(double dinero)
    {
        saldo+=dinero;
    }
    
    public void retirarDinero(double dinero)
    {   
        if(dinero <= saldo)
        {
            saldo-=dinero;
        }
        else
        {
            System.out.println("SALDO INSUFICIENTE");
        }
    }
    
}
