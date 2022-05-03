/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sistemaescolar;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class SistemaEscolar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Escuela escuela;
        ArrayList<Grado> grados = new ArrayList<>();
        int salir = 0;
        escuela = createEscuela(grados);
        int opcion;
        
        do
        {


                opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                        + "[1]VER LA ESCUELA"
                        + "[2]SALIR"));

            switch(opcion)
            {
                case 1:
                {
                    System.out.println(escuela);break;
                }
                case 2:
                {
                    salir = 1;break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"SE EQUIVOCO DE OPCION");
                }

            }
        }while(salir != 1);
    }
    public static Escuela createEscuela(ArrayList<Grado> grados)
    {
        Escuela escuela;
        String nombre_Escuela, direccion;
        int distrito, nGrados;
        nombre_Escuela = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA ESCUELA");
        direccion = JOptionPane.showInputDialog("DIGITE LA DIRECCION DE LA ESCUELA");
        distrito = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DISTRITO DE LA ESCUELA"));
        
        nGrados = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE GRADOS"));
        for (int i = 0; i < nGrados; i++) {
            grados.add(createGrado(i));
        }

        
        escuela = new Escuela(nombre_Escuela, direccion, distrito, grados);
        return escuela;
        
    }
    public static Grado createGrado( int k)
    {
        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.clear();
        
        Grado gradoNuevo;
        Profesor profesor;
        ArrayList<Materia> materias = new ArrayList<>();
        materias.clear();
        
        int nAlumnos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE CANTIDAD DE ALUMNOS"));
        int dni,edad,dni_Profesor, edad_Profesor, nMaterias;
        String nombre, nombre_Profesor, nombre_Materia;
        
        //Agregarmos Estado a los Alumnos del grado
        for (int i = 0; i <  nAlumnos; i++) {
            nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL ALUMNO "+(i+1)+" DEL GRADO"+(k+1));
            dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DEL ALUMNO "+(i+1)+" DEL GRADO"+(k+1)));
            edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL ALUMNO "+(i+1)+" DEL GRADO"+(k+1)));
            alumnos.add(new Alumno(dni,nombre,edad));
        }
        //Rellenamos datos del profesor de determinado Grado
        dni_Profesor = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DNI DEL PROFESOR ENCARGADO DEL GRADO"+(k+1)));
        nombre_Profesor = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PROFESOR ENCARGADO DEL GRADO "+(k+1));
        edad_Profesor = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL PROFESOR ENCARGADO DEL GRADO"+(k+1)));
        profesor = new Profesor(dni_Profesor, nombre_Profesor, edad_Profesor);
        
        //Agregar Materias
        
        nMaterias = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE MATERIAS PARA EL GRADO "+(k+1)));
        
        for (int i = 0; i < nMaterias; i++) {
            nombre_Materia =JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA MATERIA "+(i+1));
            materias.add(new Materia(nombre_Materia));
        }
        
        gradoNuevo = new Grado(alumnos, profesor, materias);
        
        return gradoNuevo;
        
    }
    
}
