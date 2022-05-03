/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerciciopoo;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
        ArrayList<Cliente> clientes = new ArrayList<Cliente>();
        
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    clientes.add(registrarCliente());
                    JOptionPane.showMessageDialog(null,"SE REGISTRO CLIENTE");
                    break;
                }
                case 2:
                {
                    int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DE LA PERSONA A AGREGAR UNA CUENTA"));
                    int indice= encontrarIndice(dni, clientes);
                    if(indice != -1)
                    {
                        Cuenta c = agregarCuenta();
                        clientes.get(indice).setCuenta(c);
                        JOptionPane.showMessageDialog(null,"SE REGISTRO LA CUENTA CORRECTAMENTE");
                        
                    }
                    break;
                }
                case 3:
                {
                    int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DE LA PERSONA"));
                    int indice = encontrarIndice(dni, clientes);
                    if(indice != -1)
                    {
                        
                        if(clientes.get(indice).getCuentas().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,"NO SE PUEDE CONSULTAR EL SALDO");
                        }
                        else
                        {
                            clientes.get(indice).mostrarCuentas();
                            int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA CUENTA A CONSULTAR SU SALDO"));
                            int indiceCuenta = encontrarIndiceCuenta(id, clientes.get(indice).getCuentas());
                            
                            if(indiceCuenta != -1)
                            {
                                clientes.get(indice).consultarSaldo(indice);
                            }
                        }
                    }
                    break;
                }
                case 4:
                {
                    int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DE LA PERSONA A INGRESAR SALDO"));
                    int indice = encontrarIndice(dni, clientes);
                    if(indice != -1)
                    {
                        
                        if(clientes.get(indice).getCuentas().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,"NO SE PUEDE INGRESAR SALDO PORQUE NO TIENE NINGUNA CUENTA");
                        }
                        else
                        {
                            clientes.get(indice).mostrarCuentas();
                            int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA CUENTA A INGRESAR SU SALDO"));
                            int indiceCuenta = encontrarIndiceCuenta(id, clientes.get(indice).getCuentas());
                            
                            if(indiceCuenta != -1)
                            {
                                int dinero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE DINERO A INGRESAR SALDO"));
                                clientes.get(indice).ingresarDinero(indiceCuenta,dinero) ;
                            }
                            
                        }
                        break;
                    }
                }
                case 5:
                {
                    int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DE LA PERSONA A RETIRAR SU SALDO"));
                    int indice = encontrarIndice(dni, clientes);
                    if(indice != -1)
                    {
                        
                        if(clientes.get(indice).getCuentas().isEmpty())
                        {
                            JOptionPane.showMessageDialog(null,"NO SE PUEDE RETIRAR SALDO PORQUE NO TIENE NIGUNA CUENTA REGISTRADA");
                        }
                        else
                        {
                            clientes.get(indice).mostrarCuentas();
                            int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DE LA CUENTA A RETIRAR SU SALDO"));
                            int indiceCuenta = encontrarIndiceCuenta(id, clientes.get(indice).getCuentas());
                            
                            if(indiceCuenta != -1)
                            {
                                int dinero = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE DINERO A RETIRAR"));
                                clientes.get(indice).retirarDinero(indiceCuenta, dinero);
                            }
                        }
                        break;
                    }
                }
                case 6:
                {
                    int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DE LA PERSONA A VER SU INFORMACION"));
                    int indice = encontrarIndice(dni , clientes);
                    if(indice != -1)
                    {
                        System.out.println(clientes.get(indice));
                    }
                    break;
                }
                case 7:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
                        
            }
        }while(opcion != 7);
    }
    public static int encontrarIndiceCuenta(int id, ArrayList<Cuenta> cuentas)
    {
        int indice = -1, cont = cuentas.size();
        for (int i = 0; i < cont; i++) {
            if(id == cuentas.get(i).getID())
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO LA CUENTA DEL CLIENTE");
        }
        return indice;
    }
    public static int encontrarIndice(int dni, ArrayList<Cliente> clientes)
    {
        int indice = -1, cont = clientes.size();
        for (int i = 0; i < cont; i++) {
            if(dni == clientes.get(i).getDni())
            {
                indice = i ;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO AL CLIENTE");
        }
        return indice;
    }
    public static Cuenta agregarCuenta()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA CUENTA");
        return new Cuenta(nombre);
    }
    public static Cliente registrarCliente()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE"); 
        String apellido  = JOptionPane.showInputDialog("DIGITE EL APELLIDO");
        int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI"));
        
        return new Cliente(nombre, apellido, dni);
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION "
                    + "\n[1]AGREGAR CLIENTE"
                    + "\n[2]AGREGAR CUENTA"
                    + "\n[3]CONSULTAR SALDO"
                    + "\n[4]INGRESAR SALDO"
                    + "\n[5]RETIRAR SALDO"
                    + "\n[6]VER INFORMACION"
                    + "\n[7]SALIR"));
        }while(opcion < 1 || opcion >7);
        return opcion;
    }
}
