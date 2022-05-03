/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEscuela.Principal;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Escuela escuela = new Escuela("Naval");
        
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    escuela.registrarEmpleado();
                    break;
                }
                case 2:
                {
                    escuela.mostrarEmpleados();
                    break;
                }
                case 3:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
            }
        }while(opcion != 3);
        
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR TRABAJADOR"
                    + "\n[2]VER EMPLEADOS"
                    + "\n[3]SALIR"));
            if(opcion < 1 || opcion >3)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        }while(opcion < 1 || opcion >3);
        return opcion;
    }
}
