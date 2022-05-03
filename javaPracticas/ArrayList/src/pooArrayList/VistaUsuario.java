/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooArrayList;
import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class VistaUsuario {
 
    
    public static void createNewAccount(ArrayList <Cuenta> accounts)
    {
        Scanner input = new Scanner(System.in);
        String name, password, nationality; 
        
        System.out.println("--------------------------");
        System.out.println("|REGISTRE SU NUEVA CUENTA:");
        System.out.print("|NOMBRE: ");
        name = input.next();
        System.out.print("|CONTRASEÑA: ");
        password = input.next();
        System.out.print("|NACIONALIDAD: ");        
        nationality = input.next();
        System.out.println("---------------------------");
        
        name= name.toUpperCase();
        nationality = nationality.toUpperCase();
       
        accounts.add(new Cuenta(name,password,nationality));
        
    }
    
    
    public static byte showMenuOptions(ArrayList <Cuenta> accounts) 
    {
       byte option; 
       System.out.println("BIENVINIDO "+accounts.get(0).getName()+"\nPOR FAVOR, SELECCIONE A QUE SECCION IR A COMPRAR"); 
       option = Byte.parseByte(JOptionPane.showInputDialog("[1]LACTEOS"
               + "\n[2] CARNES"
               + "\n[3] VOLVER"));
       while ( option < 1 || option >3)
       {
           option=Byte.parseByte(JOptionPane.showInputDialog("ERROR\n[1]LACTEOS\n[2]CARNES\n[3]VOLVER"));
       }
       return option;
    
    
    }
    
    
  
    public static void verification(byte option,  ArrayList<Cuenta> account, ArrayList <Producto> products)
    {
        
        if(option == 1)
        {
            String typeProduct = "LACTEO";
            if( Main.contElements == 0)
            {
                System.out.println("PRODUCTOS LACTEOS VACIO");
                JOptionPane.showMessageDialog(null,"PRODUCTOS NO DISPONIBLES");
            }
            else
            {
                for (int i  = 0 ; i < Main.contElements; i ++)
                {
                    if(products.get(i).getTipo().contains(typeProduct))
                    {
                        products.get(i).showObject();
                    }
                }
                selectProduct(products,typeProduct, account);
                
            }
        }
        else if(option == 2)
        {
            String typeProduct = "CARNE";
            if( Main.contElements == 0)
            {
                System.out.println("PRODUCTOS CARNES VACIO");
                JOptionPane.showMessageDialog(null,"PRODUCTOS NO DISPONIBLES");
            }
            else
            {
                for (int i  = 0 ; i < Main.contElements; i++)
                {
                    if(products.get(i).getTipo().equals(typeProduct))
                    {
                        products.get(i).showObject();
                    }
                }
                selectProduct(products, typeProduct, account);
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null,"VOLVIENDO...");
        }
        
    }
    
    
    public static void selectProduct(ArrayList <Producto> products, String typeProduct, ArrayList<Cuenta> account)
    {
        Scanner input = new Scanner(System.in);
        byte option;
        int idSelect=0;
        boolean exist = false;
        float pay=0;
        String continueProgram;
        
        do
        {
            System.out.print("SELECCIONE UNA OPCION (ID): ");
            option = input.nextByte();
        
            for(int i=0 ; i < Main.contElements; i++)
            {
                if(option == products.get(i).getId() && products.get(i).getTipo().equals(typeProduct))
                {
                    exist = true;
                    idSelect = i;
                }
            }
            if(exist == true)
            {
                pay = payProduct(products, idSelect);
                account.get(0).setPay(pay);
                JOptionPane.showMessageDialog(null,"TOTAL A PAGAR: $"+pay);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"ERROR\n PRODUCTO NO EXISTENTE");
            }
            continueProgram = JOptionPane.showInputDialog("DESEA VOLVER A INGRESAR UNA OPCION\n DIGITE SI / NO ");
            
        }while(continueProgram.equals("SI"));
        
    }
    
    
    public static float payProduct(ArrayList<Producto> products, int idSelect)
    {
        short cantidad, Zero=0;
        String confirmPay;
        float payAccount=0;
        do
        {
            cantidad = Short.parseShort(JOptionPane.showInputDialog("DIGITE LA CANTIDAD A COMPRAR"));
            if(cantidad < 0)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }while(cantidad < 0);
        
        if(cantidad > products.get(idSelect).getStock()){
            confirmPay = JOptionPane.showInputDialog("USTED SE HA EXCEDIDO DEL STOCK PERO SI QUIERE PUEDE COMPRAR TODO EL STOCK"
                    + "RESTANTE. DIGITE SI / NO"
                    + "\nINFORMACION PRODUCTO:"
                    + "\nNOMBRE: "+products.get(idSelect).getNombre()
                    + "\nTIPO: "+products.get(idSelect).getTipo()
                    + "\nSTOCK: "+products.get(idSelect).getStock()
                    + "\nPRECIO C/UNO: $"+products.get(idSelect).getPrecio()
                    + "\nPRECIO TOTAL: $"+(products.get(idSelect).getPrecio() * products.get(idSelect).getStock()));
           confirmPay = confirmPay.toUpperCase();
           if(confirmPay.equals("SI"))
           {
              JOptionPane.showMessageDialog(null,"COMPRA EXITOSA");
              products.get(idSelect).setStock(Zero);
              payAccount = products.get(idSelect).getPrecio() * products.get(idSelect).getStock(); 
           }
           else
           {
               JOptionPane.showMessageDialog(null,"COMPRA NEGADA");
               payAccount = 0;
           }
          
        }
        else
        {
            payAccount = cantidad * products.get(idSelect).getPrecio();
            int setStock1 = products.get(idSelect).getStock() - cantidad;
            short set = (short) setStock1;
            products.get(idSelect).setStock(set);
        }
        
        return payAccount;
    }
}
