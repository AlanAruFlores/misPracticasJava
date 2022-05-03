/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String  [] args)
    {
        ArrayList<Sucursal> sucursales = new ArrayList<Sucursal>();
        int opcion ;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    sucursales.add(registrarSucursal());
                    JOptionPane.showMessageDialog(null,"SE REGISTRO CON EXITO");
                    break;
                }
                case 2:
                {
                    if(sucursales.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY NINGUNA SUCURSAL REGISTRADA");
                    }
                    else
                    {
                        mostrarSucursales(sucursales);
                    }
                    break;
                }
                case 3:
                {
                    int nro = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE LA SUCURSAL"));
                    int indice = encontrarIndiceSucursal(sucursales, nro);
                    if(indice != -1)
                    {
                        Paquete p = crearPaquete();
                        sucursales.get(indice).setPaquete(p);
                        JOptionPane.showMessageDialog(null,"TOTAL A PAGAR: $"+sucursales.get(indice).establecerPrecio(p));
                        JOptionPane.showMessageDialog(null,"CREADO CON EXITO");
                    }
                    break;
                }
                case 4:
                {
                    if(sucursales.isEmpty())
                    {
                        System.out.println("NO HAY NIGUNA SUCURSAL REGISTRADA");
                    }
                    else
                    {
                        mostrarSucursalesPaquetes(sucursales);
                    }
                    break;
                }
                case 5:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
            }
        }while(opcion != 5);
    }
    public static void mostrarSucursalesPaquetes(ArrayList<Sucursal> sucursales)
    {
        for (Sucursal s : sucursales) {
             s.mostrarPaquetes();
        }
    }
    public static int encontrarIndiceSucursal(ArrayList<Sucursal> sucursales, int nro)
    {
        int indice = -1, cont = sucursales.size();
        for (int i = 0; i < cont; i++) {
            if(sucursales.get(i).getNroSucursal() == nro)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA SUCURSAL");
        }
        return indice;
    }
    public static Paquete crearPaquete()
    {
        int peso = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PESO DEL PAQUETE EN KG"));
        int nroReferencia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE REFERENCIA"));
        int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE TU DNI"));
        Prioridad p = elegirPrioridad();
        return new Paquete(peso, nroReferencia, dni, p);
    }
    public static Prioridad elegirPrioridad()
    {
        Prioridad p = null;
        int seleccion;
        do
        {
            seleccion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA PRIORIDAD"
                + "\n[1]NIGUNA"
                + "\n[2]ALTA"
                + "\n[3]EXPRESS"));
        }while(seleccion < 1 || seleccion >3);

        
        switch(seleccion)
        {
            case 1:
            {
                p = Prioridad.NINGUNA;
                break;
            }
            case 2:
            {
                p = Prioridad.ALTA;
                break;
            }
            case 3:
            {
                p = Prioridad.EXPRESS;
                
                break;
            }
        }
        return p;
    }
    public static void mostrarSucursales(ArrayList<Sucursal> sucursales)
    {
        for (Sucursal s : sucursales) {
            System.out.println(s);
        }
    }
    public static Sucursal registrarSucursal()
    {
        String ciudad, direccion;
        direccion = JOptionPane.showInputDialog("DIGITE LA DIRECCION DE LA SUCURSAL");
        ciudad = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA CIUDAD");     
        return new Sucursal(direccion, ciudad);
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR SUCURSAL"
                    + "\n[2]VER SUCURSALES"
                    + "\n[3]CREAR PAQUETE"
                    + "\n[4]VER PAQUETES DE LAS SUCURSALES"
                    + "\n[5]SALIR"));
        }while(opcion < 1 || opcion >5);
        return opcion;
    }
}
