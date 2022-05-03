/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo.practicas;
import java.util.ArrayList;
import javax.swing.JOptionPane;
//import pooAtletas.Atleta;
/**
 *
 * @author alang
 */
public class POOPracticas {

    /**
     * @param args the command line arguments
*/
    public static void main(String [] args)  
    {
        ArrayList<Salon> salones =  new ArrayList<Salon>();
        
        int opcion;
        
        do
        {
            opcion = ingresarOpcion();
            
            switch(opcion)
            {
                case 1:
                {
                    salones.add(registrarSalon());
                    JOptionPane.showMessageDialog(null,"SE REGISTRO EXITOSAMENTE");
                    break;
                }
                case 2:
                {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL SALON "));
                    int indice = encontrarIndice(id, salones);
                    if(indice != -1)
                    {
                        salones.get(indice).setAlumno(registrarAlumno());
                        JOptionPane.showMessageDialog(null,"ALUMNO REGISTRADO CON EXITO");
                    }
                    break;
                }
                case 3:
                {
                    if(salones.isEmpty())
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY NINGUN SALON REGISTRADO");
                    }
                    else
                    {
                        System.out.println("SALONES");
                        mostrarSalones(salones);
                    }

                    break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO");
                }
            }
        }while(opcion != 4);
    }
    public static void mostrarSalones(ArrayList<Salon> salones)
    {
        for (Salon s: salones) {
            System.out.println(s);
        }
    }
    public static int encontrarIndice(int id, ArrayList<Salon> salones)
    {
        int indice = -1;
        int cont = salones.size();
        for (int i = 0; i < cont; i++) {
            if(id == salones.get(i).getID())
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL SALON");
        }
        return indice;
    }
    public static Alumno registrarAlumno()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL ALUMNO");
        return new Alumno(nombre);
    }
    public static Salon registrarSalon()
    {
        String materia;
        materia = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA MATERIA DEL SALON");
        return new Salon(materia);
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "[1]REGISTRAR SALON"
                    + "[2]REGISTRAR ALUMNO"
                    + "[3]MOSTRAR SALONES"
                    + "[4]SALIR"));
        }while(opcion < 1 || opcion >4);
        return opcion;
    }
}
