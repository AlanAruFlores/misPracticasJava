/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio2;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Empresa emp = new Empresa("EthEmprise");
        int opcion;
        
        do
        {
            opcion = ingresarOpcion();
            
            switch(opcion)
            {
                case 1:
                {
                    emp.añadirEmpleado();
                    break;
                }
                case 2:
                {
                    emp.mostrarEmpleados();
                    break;
                }
                case 3:
                {
                    emp.removerEmpleado();
                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO........");
                    break;
                }
            }
        }while(opcion !=4);
    }
    public static int ingresarOpcion()
    {
        int opcion ;
        do
        {
             opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]AÑADIR EMPLEADO"
                + "\n[2]VER EMPLEADOS"
                + "\n[3]ELIMINAR EMPLEADOS"
                + "\n[4]SALIR"));
            if(opcion < 1 || opcion >4)
            {
                JOptionPane.showMessageDialog(null,"OPCION INCORREECTA");
            }
        }while(opcion < 1 || opcion > 4);
                
        return opcion;
    }
}
