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
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private Cuenta cuenta[];
    
    public Cliente(String nombre, String apellido ,int dni, Cuenta cuenta[])
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.cuenta = cuenta;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public String getApellido()
    {
        return apellido;
    }
    public int getDni()
    {
        return dni;
    }
    
    
    public double consultarSaldo(int n)
    {
        return cuenta[n].getSaldo();
    }
    public void ingresarDinero(int n, double cantidadDinero)
    {
        cuenta[n].ingresarSaldo(cantidadDinero);
    }
    public void retirarDinero(int n , double cantidadDinero)
    {
        cuenta[n].retirarDinero(cantidadDinero);
    }
    public void mostrarCuentas()
    {
        for (int i = 0; i < cuenta.length; i++) {
            System.out.println("CUENTA "+(i+1)+""
                    + "NRO CUENTA: "+cuenta[i].getNroCuenta()+"");
        }
    }
           
}
