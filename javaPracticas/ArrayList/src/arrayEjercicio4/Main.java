/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayEjercicio4;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        //Desarollar un programa, donde el usuario al comprar un objeto, tenga su historial de esta
        
        ArrayList <String> historialProduct = new ArrayList <String> ();
        ArrayList <Integer> historialCont  = new ArrayList <Integer> ();
        ArrayList <Integer> historialPay = new ArrayList <Integer>();
        
        String productName [] = {"PAPAS FRITAS", "CUATES", "CIFRUIT"};
        int option,contProduct, payProduct, cont=0, payTotal = 0;
        String continueProgram = "";
        do
        {
            do
            {
                option = Integer.parseInt(JOptionPane.showInputDialog("BIENVENIDO AL MERCADO"
                        + "\n DIGITE QUE ACCION VA A SER: "
                        + "\n [1] COMPRAR "
                        + "\n [2] VER CARRITO"
                        + "\n [3] SALIR"));
                if( option < 1 || option >3)
                {
                    JOptionPane.showMessageDialog(null,"ERROR");
                }
            }while (option < 1 || option >3);
        
            switch(option)
            {
                case 1:
                    String addProduct;
                    int product;
                    do   
                    {
                        product = Integer.parseInt(JOptionPane.showInputDialog("DIGITE QUE PRODUCTO VA A COMPRAR"
                            + "\n[1] PAPAS FRITAS | PRECIO [$200]"
                            + "\n[2] CUATES | PRECIO [$150]"
                            + "\n[3] CIFRUIT | PRECIO [$300]"));
                        if(product < 1 || product >3)
                        {
                            JOptionPane.showMessageDialog(null,"ERROR");
                        }
                    }while(product<1 || product >3);
                
                    cont++;
                    contProduct = Main.selectProduct(product);
                    payProduct = Main.payProduct(product, contProduct);
                    //Pedimos al usuario si desea añadir el producto
                    addProduct = JOptionPane.showInputDialog("DESEA AÑADIR EL PRODUCTO A SU CARRITO DE COMPRA"
                            + "\nDIGITE SI / NO"
                            + "\nINFORMACION DEL PRODUCTO:"
                            + "\nPRODCUT: "+productName[product-1]
                            + "\nCANTIDAD: "+contProduct
                            + "\nPRECIO A PAGAR: "+payProduct);
                    addProduct = addProduct.toUpperCase();
                    if(addProduct.equals("SI"))
                    {
                        payTotal += payProduct;
                        historialProduct.add(productName[product-1]);
                        historialCont.add(contProduct);
                        historialPay.add(payProduct);
                        JOptionPane.showMessageDialog(null,"PRODUCTO AGREGADO AL CARRITO EXITOSAMENTE");
                    }
                    else
                    {
                        JOptionPane.showMessageDialog(null,"PRODUCTO NO AGREGADO AL CARRITO");
                    }
                    break;
                
                case 2:
                    if(historialProduct.size() == 0)
                    {
                        System.out.println("HISTORIAL VACIO");
                    }
                    else
                    {
                        System.out.println("---------------------------------------------");
                        System.out.println("CARRITO DE COMPRA: ");
                        System.out.println("NOMBRE   |  CANTIDAD |  PRECIO");
                        for( int i  = 0 ; i < cont ; i++)
                        {
                            System.out.println(""+historialProduct.get(i)+" | "+historialCont.get(i)+ " | "+historialPay.get(i));
                        }
                    
                        System.out.println("TOTAL A PAGAR: $"+payTotal);
                    }
                    break;
                case 3:
                    String payMyProducts ;
                    if(historialProduct.size() == 0)
                    {
                        JOptionPane.showMessageDialog(null,"SALIENDO...");
                    }
                    else   
                    {
                        payMyProducts = JOptionPane.showInputDialog("SI DESEA SALIR..."
                            + "\n¿QUIERE ANTES COMPRAR SUS PRODUCTOS GUARDADOS EN EL CARRITO?"
                            + "\nDIGITE SI / NO "
                            + "\nTOTAL A PAGAR: "+payTotal);
                        payMyProducts = payMyProducts.toUpperCase();
                        Main.payVerification(payMyProducts);
                    }
                    
                    break;                
            }

        }while(option !=3);    
        
        JOptionPane.showMessageDialog(null,"GRACIAS");
        
    }
    
    //Metodo Seleccionar Producto
    public static int selectProduct(int product)
    {
        int contProduct=0;
            switch(product)
            {
                case 1:
                    contProduct = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE COMPRAR PAPAS"));break;
                case 2:
                    contProduct = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE COMPRAR CUATES"));break;
                case 3:
                    contProduct = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE COMPRAR CIFRUIT"));break;
            }
        return contProduct;
    }
    //Metodo Pagar Producto
    public static int payProduct (int product, int contProduct)
    {
        int payTotal=0;
        
        switch (product)
        {
            case 1:
                payTotal = contProduct * 200;break;
            case 2:
                payTotal = contProduct * 150;break;
            case 3: 
                payTotal = contProduct * 300;break;
        }
        return payTotal;
    }
    public static void payVerification(String payMyProducts)
    {
        if(payMyProducts.equals("SI"))
        {
            JOptionPane.showMessageDialog(null,"PAGO EXITOSO");
        }
        else
        {
            JOptionPane.showMessageDialog(null,"PAGO NO EXITOSO");
        }
    }
    
}
