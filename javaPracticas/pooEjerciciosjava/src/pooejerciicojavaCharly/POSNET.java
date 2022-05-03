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
public class POSNET {
    
    private boolean efectuarPago(Tarjeta tarjeta, double monto)
    {
        return tarjeta.getSaldo() > monto;
    }
    public void recibirTicket(Tarjeta tarjeta, double monto, int cantCuotas)
    {
        String nombreApellido;
        double montoTotal, montoXCuota;
        if(efectuarPago(tarjeta,monto))
        {
            nombreApellido = getNombreApellido(tarjeta);
            montoXCuota = retornarMontoCuotas(monto, cantCuotas);
            montoTotal = retornarMontoTotal(cantCuotas, montoXCuota);

            System.out.println("**********TICKET***********"
                    + "\nNOMBRE Y APELLIDO: "+nombreApellido+""
                    + "\nMONTO TOTAL: $"+montoTotal+""
                    + "\nMONTO X CUOTA: $"+montoXCuota+""
                    +"\n*****************************");
            
            tarjeta.pagar(montoTotal);
        }
        else
        {
            JOptionPane.showMessageDialog(null,"NO TIENE SUFICIENTE SALDO");
        }
    }
    private String getNombreApellido(Tarjeta tarjeta)
    {
        Titular titular = tarjeta.getTitular();
        return titular.getNombre()+" "+titular.getApellido();
    }
    private double retornarMontoTotal( int cantCuotas, double montoXCuota)
    {
        double montoTotal = montoXCuota * cantCuotas;
        return montoTotal;
    }
    private double retornarMontoCuotas( double monto ,int cantCuotas)
    {
        double montoCuotas;
        double montoxCuota;
        int porcentaje;
        
        if(cantCuotas == 1)
        {
            montoCuotas = monto / cantCuotas;
            montoxCuota = montoCuotas;
        }
        else
        {
            porcentaje = cantCuotas * 3;
            montoCuotas = monto / cantCuotas;
            montoxCuota = montoCuotas + ((monto * porcentaje)/100);
        }

        return montoxCuota;
    }
    
    
}
