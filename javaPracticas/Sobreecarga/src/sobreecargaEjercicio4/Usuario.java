/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio4;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Usuario {
    private String CBU;
    private String nombre;
    private String apellido;
    private int dni;
    private double saldo;
    
    public Usuario(String nombre, String apellido, int dni)
    {
        this.CBU = setCBU();
        setNombre(nombre);
        setApellido(apellido);
        setDni(dni);
        this.saldo = 0;
    }
    public Usuario (String nombre , int dni)
    {
        this(nombre,null,dni);
    }
    
    
    private boolean verificarSaldo(double dinero)
    {
        return saldo>dinero;
    }
    public void extractMoney(double dinero)
    {
        if(verificarSaldo(dinero)== true)
        {
            saldo -= dinero;
            JOptionPane.showMessageDialog(null,"USTED RETIRO "+dinero);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ERROR, NO PUEDE RETIRAR ESA CANTIDAD DE DINERO");
        }
    }
    public void setSaldo(double dinero){
        if(dinero >= 0)
        {
            saldo += dinero;
            JOptionPane.showMessageDialog(null,"SALDO ESTABLECIDO");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"ERROR");
        }
    }
    private String setCBU()
    {
        return "304A023SD";
    }
    public void setNombre(String nombre)
    {
        this.nombre = nombre;
    }
    public void setApellido(String apellido)
    {
        if(apellido != null)
        {
            this.apellido = apellido;
        }
        else
        {
            this.apellido = "SIN APELLIDO";
        }
    }
    private void setDni(int dni)
    {
        this.dni = dni;
    }
    
    public void mostrarDatos()
    {
        
        System.out.println(" | "+CBU+" | "+nombre+" | "+apellido+" | "+saldo+" | "+dni);

    }
    
}
