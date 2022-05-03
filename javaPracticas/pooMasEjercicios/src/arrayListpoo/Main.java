/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListpoo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
        Fabrica f = new Fabrica("Fabrica de Instrumentos");
        int opcion;
        
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                     f.setSucursal(registrarSucursal());
                     JOptionPane.showMessageDialog(null,"REGISTRADO CON EXITO");
                     break;
                }
                case 2:
                {
                    f.mostrarSucursales();
                    break;
                }
                case 3:
                {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA SUCURSAL PARA EJECUTAR SUS METODOS"));
                    int indice = f.encontrarIndice(id);
                    if(indice != -1)
                    {
                        mostrarMas(f.seleccionarSucursal(indice));
                    }
                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO..");
                    break;
                }
            }
        }while(opcion != 4);
    }

    public static void mostrarMas(Sucursal s)
    {
        int opcion;
        do
        {
           opcion  = ingresarOpcionVerMas();
        
           switch(opcion)
           {
               case 1:
               {
                   s.setInstrumento(registrarInstrumento());
                   JOptionPane.showMessageDialog(null,"SE ESTABLECIO CON EXITO EL INSTRUMENTO");
                   break;
               }
               case 2:
               {
                   s.mostrarInstrumentos();
                   break;
               }
               case 3:
               {
                   int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL INSTRUMENTO A BORRAR"));
                   int indice = s.encontrarIndice(id);
                   
                   if(indice != -1)
                   {
                       s.borrarInstrumento(indice);
                       JOptionPane.showMessageDialog(null,"SE BORRO CON EXITO");
                   }
                   break;
               }
               case 4:
               {
                   Tipo tipo = elegirTipo();
                   s.mostrarXTipo(tipo);
                   break;
               }
               case 5:
               {
                   s.mostrarPorcentajes();
                   break;
               }
               case 6:
               {
                   JOptionPane.showMessageDialog(null,"SALIENDO....");
               }
           }
        } while(opcion != 6);
    }
    public static Instrumento registrarInstrumento()
    {
        float precio = Float.parseFloat(JOptionPane.showInputDialog("DIGITE EL PRECIO DEL INSTRUMENTO"));
        Tipo tipo = elegirTipo();
        
        return new Instrumento(precio, tipo);
    }
    public static Tipo elegirTipo()
    {
        int opcion;
        Tipo tipo = null;
        do
        {
          opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UN TIPO:"
                  + "\n[1]"+Tipo.PERCUCION+""
                  + "\n[2]"+Tipo.VIENTO+""
                  + "\n[3]"+Tipo.CUERDA));  
        }while(opcion < 1 || opcion >3);
        
        switch(opcion)
        {
            case 1:
            {
                tipo = Tipo.PERCUCION;
                break;
            }
            case 2:
            {
                tipo = Tipo.VIENTO;
                break;
            }
            case 3:
            {
                tipo = Tipo.CUERDA;
                break;
            }
        }
        return tipo;
    }
    public static int ingresarOpcionVerMas()
    {
        int opcion;
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]REGISTRAR INSTRUMENTO"
                + "\n[2]VER INSTRUMENTOS"
                + "\n[3]BORRAR INSTRUMENTO"
                + "\n[4]VER INSTRUMENTO X TIPO"
                + "\n[5]VER PORCENTAJES"
                + "\n[6]SALIR"));
        }while(opcion < 1 || opcion >6);
        return opcion;

    }
    public static Sucursal registrarSucursal()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE LE NOMBRE DE LA SUCURSAL");
        return new Sucursal(nombre);
    }
    public static int ingresarOpcion(){
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]REGISTRAR SUCURSAL"
                + "\n[2]MOSTRAR SUCURSALES"
                + "\n[3]VER MAS."
                + "\n[4]SALIR"));
        }while(opcion < 1 || opcion >4);
      return opcion;
    }
}
