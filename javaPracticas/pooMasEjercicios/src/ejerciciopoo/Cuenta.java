/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Cuenta {
    private int id;
    private String nombre;
    private int saldo;
    public static int cont =0;
    
    public Cuenta(String nombre)
    {
        Cuenta.cont++;
        id = cont;
        this.nombre = nombre;
        saldo = 0;
    }
    public int getID()
    {
        return id;
    }
    public void setSaldo(int dinero, boolean accion)
    {
        if(accion == true)
        {
            this.saldo += dinero;
        }
        else
        {
            if(verificarDinero(dinero))
            {
                JOptionPane.showMessageDialog(null,"ERROR, EL DINERO A RETIRAR ES MAYOR O NO ESTA DISPONIBLE");
            }
            else
            {
                this.saldo -= dinero;
                JOptionPane.showMessageDialog(null,"USTED RETIRO $"+dinero);
                
            }
        }
        
    }
    private boolean verificarDinero(int dinero)
    {
        return dinero > saldo;
    }
    public int getSaldo()
    {
        return saldo;
    }
    
    @Override
    public String toString()
    {
        return "ID:"+id+"\nNOMBRE: "+nombre+"\nSALDO: "+saldo;
    }
}
