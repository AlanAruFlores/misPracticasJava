/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetepoo;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class POSNET {
    
    public void efectuarPago(Tarjeta tarjeta, double monto , int cantCuotas)
    {
        if(verificarMonto(tarjeta, monto))
        {
            Ticket t;
            tarjeta.setSaldo(monto, false);
            
            int porcentaje = calcularPorcentaje(cantCuotas);
            
            double montoTotal = calcularMontoTotal(monto , porcentaje);
            double montoXcuota = montoTotal / cantCuotas;
            t = generarTicket(tarjeta , montoTotal , montoXcuota);
            
            JOptionPane.showMessageDialog(null,"PAGO CON EXITO");
            System.out.println("INFORMACION DEL TICKET: ");
            System.out.println(t);
        }else
        {
            JOptionPane.showMessageDialog(null,"NO SE PUDO EFECTUAR EL PAGO DEBIDO AL SALDO QUE CONTIENE LA  TARJETA");
        }
    }
    private boolean verificarMonto(Tarjeta tarjeta, double monto)
    {
        return tarjeta.getSaldo() >= monto;
    }
    private double calcularMontoTotal(double monto, int porcentaje)
    {
        double montoTotal = monto + ((monto * porcentaje) / 100);
        return montoTotal;
    }
    private int calcularPorcentaje(int cuotas)
    {
        int porcentaje = 0 ;
        if(cuotas > 1)
        {
            for (int i = 1; i < cuotas; i++) {
                porcentaje +=3;
            }
        }
        return porcentaje;
    }
    private Ticket generarTicket(Tarjeta t, double montoTotal , double montoXcuota)
    {
        return new Ticket(t.getTitular() , montoTotal, montoXcuota);
    }
}
