/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEscolar;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Escuela e4 = new Escuela ("UTN");
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            
            switch(opcion)
            {
                case 1:
                {
                    rellenarEstudiante(e4);
                    break;
                }
                case 2:
                {
                    rellenarProfesor(e4);
                    break;
                }
                case 3:
                {
                     e4.mostrarPersonas();
                     break;
                }
                case 4:
                {
                    JOptionPane.showMessageDialog(null,"Saliendo");
                    break;
                }
            }
            
        }while(opcion != 4);
               
        
    }
    
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR ALUMNOS"
                    + "\n[2]REGISTRAR PROFESORES"
                    + "\n[3]MOSTRAR PERSONAS"
                    + "\n[4]SALIR"));
        }while(opcion < 1 || opcion >4);
        
        return opcion;
    }
    public static void rellenarEstudiante(Escuela e)
    {
        String nombre , apellido;
        int edad , promedio;
        
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        apellido = JOptionPane.showInputDialog("DIGITE EL APELLIDO");
        edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        promedio = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL PROMEDIO"));
        
        e.registarEstudiante(nombre , apellido, edad, promedio);
    }
    public static void rellenarProfesor(Escuela e)
    {
        String nombre, apellido;
        int edad;
        Materia materia;
        
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        apellido = JOptionPane.showInputDialog("DIGITE EL APELLIDO");
        edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        materia = seleccionarMateria();
        
        e.registrarProfesor(nombre, apellido, edad, materia);
    }
    private static Materia seleccionarMateria()
    {
        Materia m3 =null;
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]"+Materia.LENCUA+""
                    + "\n[2]"+Materia.MATEMATICA+""
                    + "\n[3]"+Materia.INGLES+""
                    + "\n[4]"+Materia.PROGRAMACION));
        }while(opcion < 1 || opcion >4);
        
        switch(opcion)
        {
            case 1:
            {
                m3 = Materia.LENCUA;
                break;
            }
            case 2:
            {
                m3 = Materia.MATEMATICA;
                break;
            }
            case 3:
            {
                m3 = Materia.INGLES;
                break;
            }
            case 4:
            {
                m3 = Materia.PROGRAMACION;
                break;
            }
            
             
            
        }
        
        return m3;
    }
}
