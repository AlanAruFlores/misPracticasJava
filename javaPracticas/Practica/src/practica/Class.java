/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Class {
    
    
    public  int sumarNumeros(int nro , int nro2)
    {
        int suma = nro + nro2;
        return suma;
    }
    public int restarNumeros(int nro,int nro2)
    {
        int resta  = nro - nro2;
        return resta;
    }
    public int multiplicarNumeros(int nro,int nro2)
    {
        int multiplicacion  = nro * nro2;
        return multiplicacion;
    }
    
    public  int dividirNumeros(int nro , int nro2)
    {
        int division = nro / nro2;
        return division;
    }
    
    public boolean verificar(String volverInicio, boolean verificador)
    {
        volverInicio = volverInicio.toUpperCase();
        
        if(volverInicio.equals("SI"))
        {
            verificador = true;
            return verificador;
        }
        else
        {
            return false;
        }
    }
    public byte elegirOpcionAritmetica()
    {
        byte opcion = Byte.parseByte(JOptionPane.showInputDialog("Indique que tipo de operacion aritmetica quiere hacer"
                + "\n1..Suma"
                + "\n2..Resta"
                + "\n3..Multiplicacion"
                + "\n4..Division")); 
        
        while(opcion <1 || opcion >4)
            {
            opcion = Byte.parseByte(JOptionPane.showInputDialog("ERROR,\nIndique que tipo de operacion aritmetica quiere hacer"
                    + "\n1..Suma"
                    + "\n2..Resta"
                    + "\n3..Multiplicacion"
                    + "\n4..Division"
                    + "\n5..Mostrar tabla de Multiplicacion"));
            }
        return opcion;
    }
    
}
