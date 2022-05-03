/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tienda;
import javax.swing.JOptionPane;
import Tienda.Constructor.Producto;
/**
 *
 * @author alang
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
                
        Producto p1 = new Producto(1,"Papas Fritas", "Salado", "Lays", 100, 200.10f);
        Producto p2 = new Producto (2, "Spam" , "Salado", "Mac", 200, 300.10f);
        Producto p3 = new Producto (3,"Pizza","Salado","Italia", 1000, 400.50f);
        Producto p4  = new Producto (4,"Pastel", "Dulce","Australia", 100, 500.50f);
        Producto p5 = new Producto (5, "Gomitas", "Dulce", "Reino Unido", 300, 100.40f);
        
        ProductoIngreso clase = new ProductoIngreso();
        String continueProgram,confirm;
        byte opcion;
        int cantidad,stock,optionNumber;
        
        float totalPagar;
        do
        {
            JOptionPane.showMessageDialog(null,"HOLA, BIENVENIDO A LA TIENDA");
        
            opcion = Byte.parseByte(JOptionPane.showInputDialog("DIGITE A QUE SECCION QUIERE IR A COMPRAR\n[1]..Salados"
                + "[2]..Dulces"));
        
            while (opcion < 1 || opcion > 2)
            {
                opcion = Byte.parseByte(JOptionPane.showInputDialog("ERROR\nDIGITE A QUE SECTOR QUIERE IR A COMPRAR\n[1]..Salados"
                    + "[2]..Dulces"));
            }
        
            switch(opcion)
            {
                case 1:   
                {
                    optionNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite que producto va a comprar:"
                + "\n["+p1.getId()+"]"+p1.getNombre()+" PRECIO: $"+p1.getPrecio()+" STOCK: "+p1.getStock()+""
                + "\n["+p2.getId()+"]"+p2.getNombre()+" PRECIO: $"+p2.getPrecio()+" STOCK: "+p2.getStock()+""
                + "\n["+p3.getId()+"]"+p3.getNombre()+" PRECIO: $"+p3.getPrecio()+" STOCK: "+p3.getStock()+""));
            
                while(optionNumber < 1 || optionNumber >3)
                {
                    optionNumber = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nDigite que producto va a comprar:"
                        + "\n["+p1.getId()+"]"+p1.getNombre()+" PRECIO: $"+p1.getPrecio()+" STOCK: "+p1.getStock()+""
                        + "\n["+p2.getId()+"]"+p2.getNombre()+" PRECIO: $"+p2.getPrecio()+" STOCK: "+p2.getStock()+""
                        + "\n["+p3.getId()+"]"+p3.getNombre()+" PRECIO: $"+p3.getPrecio()+" STOCK: "+p3.getStock()+""));
                
                }
                switch (optionNumber)
                {
                    case 1:
                    {
                        if(p1.getStock() > 0)
                        {
                            cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que quiere comprar"));
                            if(p1.getStock() >= cantidad)
                            {
                                totalPagar=p1.getPrecio() * cantidad;
                                 p1.setStock(p1.getStock()-cantidad);
                                JOptionPane.showMessageDialog(null,"Total a pagar: "+totalPagar);break;
                            }
                            else
                            {
                                JOptionPane.showMessageDialog(null,"No hay suficiente stock");
                                confirm = JOptionPane.showInputDialog("Usted quiere comprar lo restante: "+p1.getStock()+""
                                        + "\nDigite si en caso de que quiere, por lo contrario no");
                                confirm = confirm.toUpperCase();
                                if(confirm.equals("SI"))
                                {
                                    totalPagar = p1.getStock() * p1.getPrecio();
                                    JOptionPane.showMessageDialog(null,"Total a pagar "+totalPagar);
                                }
                                break;
                                
                            }

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null,"ERROR\n No hay suficiente stock");break;
                        }
                    }
                    case 2:
                    {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que quiere comprar"));
                        totalPagar=p2.getPrecio() * cantidad;
                        stock = p2.getStock() - cantidad;
                        p2.setStock(stock);
                        JOptionPane.showMessageDialog(null,"Total a pagar: "+totalPagar);break;
                    }
                    case 3:
                    {
                        cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que quiere comprar"));
                        totalPagar=p3.getPrecio() * cantidad;
                        stock = p3.getStock() - cantidad;
                        p3.setStock(stock);
                        JOptionPane.showMessageDialog(null,"Total a pagar: "+totalPagar);break;
                    }
                
                    }
                break;
                }
                case 2:           
                {
                               optionNumber = Integer.parseInt(JOptionPane.showInputDialog("Digite que producto va a comprar:"
                   + "\n[1]"+p4.getNombre()+" PRECIO: $"+p4.getPrecio()+" STOCK: "+p4.getStock()+""
                   + "\n[2"+p5.getNombre()+" PRECIO: $"+p5.getPrecio()+" STOCK: "+p5.getStock()+""));
           
           while ( optionNumber < 1 || optionNumber < 2)
           {
                optionNumber = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nDigite que producto va a comprar:"
                   + "\n[1]"+p4.getNombre()+" PRECIO: $"+p4.getPrecio()+" STOCK: "+p4.getStock()+""
                   + "\n[2"+p5.getNombre()+" PRECIO: $"+p5.getPrecio()+" STOCK: "+p5.getStock()+""));
                
           }
           switch(optionNumber)
           {
               case 1:
               {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que quiere comprar"));
                    totalPagar=p4.getPrecio() * cantidad;
                    stock = p4.getStock() - cantidad;
                    p4.setStock(stock);
                    JOptionPane.showMessageDialog(null,"Total a pagar: "+totalPagar);break;
               }
               case 2:          
               {
                    cantidad = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que quiere comprar"));
                    totalPagar=p5.getPrecio() * cantidad;
                    stock = p5.getStock() - cantidad;
                    p5.setStock(stock);
                    JOptionPane.showMessageDialog(null,"Total a pagar: "+totalPagar); break;
               }
           }
           break;
                }
            }
            continueProgram = JOptionPane.showInputDialog("Digite si para continuar, por lo contrario digite no");
            continueProgram = continueProgram.toUpperCase();
        }while (continueProgram.equals("SI"));
        
        
    }
    
}
