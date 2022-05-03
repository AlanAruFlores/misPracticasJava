/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooArrayList;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static int contElements = 0;
    public static float payProduct = 0;
    public static void main ( String [] args)
    {
        
        String continueProgram, passwordAdministrador = "administrador12345", password;
        boolean execution = false, exit = false, accountCreate = false;
        byte option , optionAdministrador, optionUser;
        String createAccount;
        
        
        
        ArrayList <Producto> products = new ArrayList<Producto>();
        ArrayList <Cuenta> accounts = new ArrayList <Cuenta>();
        accounts.ensureCapacity(1);
        do
        {
            option = Byte.parseByte(JOptionPane.showInputDialog("BIENVENIDO A LA FACTURACION DE MERCADO"
                    + "\nSELECCIONE SI ERES:"
                    + "\n[1]USUARIO"
                    + "\n[2]ADMINISTRADOR"
                    + "\n[3]SALIR"));
            Administrador.error(option);
        
        
            switch(option)
            {
                //En proceso
                case 1:
                {
                    
                    if(accountCreate == false)
                    {
                        createAccount = JOptionPane.showInputDialog("NO TIENE CUENTA, POR LO TANTO NO PODRA ACCEDER"
                                + "\n¿DESEA CREARSE UploopNA CUENTA? DIGITE SI / NO");
                        createAccount = createAccount.toUpperCase();
                        if(createAccount.equals("SI")){
                            VistaUsuario.createNewAccount(accounts);
                            accountCreate  = true;
                        }  
                    }
                    else{
                        System.out.println("-----------------VISTA DEL USUARIO--------------------");
                        accounts.get(0).showAccount();
                        optionUser = VistaUsuario.showMenuOptions(accounts);
                        VistaUsuario.verification(optionUser, accounts, products);
                        
                    }
                    break;
                }
                //Terminado
                case 2: 
                {
                    password = JOptionPane.showInputDialog("DIGITE LA CONTRASEÑA DEL ADMINISTRADOR:"
                            + "\n ATENCION: SENSIBLE A MAY y MIN ");
                    
                    if(password.equals(passwordAdministrador))
                    {
                        optionAdministrador = Administrador.ejecutarMenu();
                        Administrador.goToSection(products, optionAdministrador,execution);
                    }
                    else
                    {
                        JOptionPane.showMessageDialog (null,"ERROR, ACCESO NEGADO");
                    }
                    break;
                }
                case 3:
                    exit = true;break;
            }
            
        }
        while(exit != true);
        
    }
}
