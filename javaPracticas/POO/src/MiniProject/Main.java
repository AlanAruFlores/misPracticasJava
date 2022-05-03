/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MiniProject;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main (String [] args)
    {
        ArrayList<Cuenta> arrayCuentas = new ArrayList <Cuenta>();
        Cuenta account;
        int optionNumber = Class.optionNumber();
        int cont =0;
        boolean accountExist = false, exitProgram = false;
        
        do
        {
            switch( optionNumber )
            {
                case 1:
                {
                    account = Class.inputAccounts();
                    arrayCuentas.add(account);
                    accountExist = true;

                }
                case 2:
                {
                    cont = arrayCuentas.size();
                    if(cont == 0)
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY CUENTAS REGISTRADAS");
                    }
                    else
                    {
                        System.out.println("NOMBRE | MAIL | SALDO | PAIS");
                        for (int i = 0; i < cont; i++) {
                            arrayCuentas.get(i).mostrarCuenta();
                        }
                    }
                }
                case 3:
                {
                    if(accountExist != true)
                    {
                        JOptionPane.showMessageDialog(null,"NO EXISTE NINGUNA CUENTA");
                    }
                    else
                    {
                        Class.depositarCuenta(arrayCuentas);
                    }
                }
                case 4:
                {
                    Class.extraerMoney(arrayCuentas);
                }
                case 5:
                {
                    exitProgram = true;

                }
            }
        }while(exitProgram != true);
    }
}
