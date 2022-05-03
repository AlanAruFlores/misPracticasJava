/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Cliente {
    private String nombre;
    private String apellido;
    private int dni;
    private ArrayList<Cuenta> cuentas;
    
    public Cliente(String nombre , String apellido , int dni)
    {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        cuentas = new ArrayList<Cuenta>();
    }
    public int getDni()
    {
        return dni;
    }
    public void setCuenta(Cuenta c)
    {
        cuentas.add(c);
    }
    public void consultarSaldo(int indice)
    {
        System.out.println(cuentas.get(indice));
    }
    public void ingresarDinero(int indice, int dinero)
    {
        cuentas.get(indice).setSaldo(dinero, true);
    }
    public void retirarDinero (int indice, int dinero)
    {
        cuentas.get(indice).setSaldo(dinero, false);
    }
    public ArrayList<Cuenta> getCuentas()
    {
        return cuentas;
    }
    public void mostrarCuentas()
    {
        for (Cuenta c : cuentas) {
            System.out.println(c);
        }       
    }
    
    @Override
    public String toString()
    {
        return "NOMBRE: "+nombre+" | APELLIDO: "+apellido+" | DNI: "+dni+" | TOTAL CUENTAS: "+cuentas.size();
    }
}
