/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciicojavaCharly;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static int indiceTarjeta(ArrayList<Tarjeta> tarjetas, int nroTarjeta)
    {
        int cont = tarjetas.size(), indice = -1;
        for (int i = 0; i < cont; i++) {
            if(nroTarjeta == tarjetas.get(i).getNroTarjeta()){
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"TARJETA NO EXISTENTE ENCONTRADA");
        }
        return indice;
    }
    public static void main(String [] args)
    {
        ArrayList<Tarjeta> tarjetas = new ArrayList<>();
        Titular titular;
        POSNET posnet = new POSNET();
        Scanner entrada = new Scanner(System.in);
        
        int dni, telefono, opccion, cantCuotas, nroTarjeta, indiceTarjeta;
        String nombre, apellido, mail;
        double pagar, dinero;
        
        dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI"));
        nombre = JOptionPane.showInputDialog("DIGITE SU NOMBRE");
        apellido = JOptionPane.showInputDialog("DIGITE SU APELLIDO");
        telefono = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL TELEFONO"));
        mail = JOptionPane.showInputDialog("DIGITE EL MAIL");
        titular = new Titular (dni,nombre,apellido,telefono, mail);
        
        do
        {
            System.out.println("[1]CREAR NUEVA TARJETA"
                    + "\n[2]PAGAR PRODUCTO"
                    + "\n[3]VER SALDO"
                    + "\n[4]INGRESAR SALDO"
                    + "\n[5]SALIR");
            opccion = entrada.nextInt();
            
            switch(opccion)
            {
                case 1:
                {
                    tarjetas.add(crearTarjeta(titular));
                    break;
                }
                case 2:
                {
                    pagar = Double.parseDouble(JOptionPane.showInputDialog("DIGITE LO CANTIDAD QUE QUIERE PAGAR"));
                    cantCuotas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE CUOTAS PARA PAGARLO"));
                    System.out.println("CON QUE TARJETA QUIERE PAGARLO: "+tarjetas);
                    nroTarjeta = entrada.nextInt();
                    indiceTarjeta = indiceTarjeta(tarjetas,nroTarjeta);
                    
                    if(indiceTarjeta != -1)
                    {
                        posnet.recibirTicket(tarjetas.get(indiceTarjeta), pagar, cantCuotas);
                    }
                    break;
                }
                case 3:
                {
                    System.out.println("QUE TARJETA QUIERE SABER SU SALDO");
                    System.out.println(tarjetas);
                    nroTarjeta=entrada.nextInt();
                    indiceTarjeta = indiceTarjeta (tarjetas,nroTarjeta);
                    if(indiceTarjeta != -1)
                    {
                        System.out.println("EL SALDO ES: "+tarjetas.get(indiceTarjeta).getSaldo());
                    }
                    break;
                }
                case 4:
                {
                    System.out.println("QUE TARJETA QUIERE INGRESAR SALDO");
                    System.out.println(tarjetas);
                    nroTarjeta=entrada.nextInt();
                    indiceTarjeta = indiceTarjeta (tarjetas,nroTarjeta);
                    if(indiceTarjeta != -1)
                    {
                        
                        dinero = Double.parseDouble(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE DINERO A INGRESAR"));
                        tarjetas.get(indiceTarjeta).recargar(dinero);
                    }

                    break;
                }
                case 5:
                {
                    JOptionPane.showMessageDialog(null,"GRACIAS POR VISITAR");break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"ERROR");
                }
            }
        }while(opccion != 5);
        
    }
    public static Tarjeta crearTarjeta(Titular titular)
    {
        Tarjeta tarjeta;
        short selectFinanciera;
        String nombreFinanciera, nombreBancaria;
        
        do
        {
            selectFinanciera =Short.parseShort(JOptionPane.showInputDialog("SELECCIONE ENTIDAD FINANCIERA"
                    + "\n[1]BIRZA "
                    + "\n[2]CASTER MARD"));
        }while(selectFinanciera < 1 || selectFinanciera>2);
        if(selectFinanciera == 1)
        {
            nombreFinanciera = "BIRZA";
        }
        else
        {
            nombreFinanciera = "CASTER MARD";
        }
        nombreBancaria = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL BANCO");
        tarjeta = new Tarjeta(nombreFinanciera, nombreBancaria, titular);
        return tarjeta;
    }
}
