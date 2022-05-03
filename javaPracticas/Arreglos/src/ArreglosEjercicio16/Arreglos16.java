/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArreglosEjercicio16;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Arreglos16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Desarrollar  una aplicacion que nos ayude a gestionar las notas de 5 alumnos, hacer 3 grupos donde cada uno
        sera el numero de trimestre y ademas sacar la media por cada grupo y la media de alumno N pedida por el usuario.
        Posicion N por cada alumno
        */
        //Llamamos a la clase "Class"
        
        Class clss = new Class();
        
        
        int groupStudents1[], groupStudents2[], groupStudents3[];
        int k = 0,j=1, acumGroup=0, optionStudent,sumNotes=0;
        float mediaGroup1=0,mediaGroup2=0,mediaGroup3=0, mediaStudent;
        groupStudents1 = new int [5];
        groupStudents2 = new int [5];
        groupStudents3 = new int [5];
        
        while(k<groupStudents1.length)
        {
            groupStudents1[k]=clss.inputNumbers(k,j);
            acumGroup+=groupStudents1[k];
            k++;
        }
        mediaGroup1 = (float) acumGroup/k;
        acumGroup = 0;
        j++;
        k=0;
        while(k<groupStudents2.length)
        {
            groupStudents2[k] = clss.inputNumbers(k, j);
            acumGroup +=groupStudents2[k];
            k++;
        }
        mediaGroup2 = (float) acumGroup / k;
        acumGroup = 0;
        j++;
        k=0;
        while(k<groupStudents3.length)
        {
            groupStudents3[k] = clss.inputNumbers(k, j);
            acumGroup += groupStudents3[k];
            k++;
        }
        mediaGroup3 = (float) acumGroup / k;
        
        do
        {
            optionStudent = Integer.parseInt(JOptionPane.showInputDialog("Ingrese al alumno que quiera ver su promedio"
                + "entre (1 y 5)"));
            if(optionStudent<1 && optionStudent>5)
            {
                JOptionPane.showMessageDialog(null,"ERROR");
            }
        
        }while(optionStudent<1 || optionStudent>5);
        
        optionStudent--;
        k=0;
        while(k<5 && k < optionStudent)
        {
            k++;
        }
        
        if(k == optionStudent)
        {
           sumNotes = groupStudents1[k]  + groupStudents2[k] + groupStudents3[k];
           mediaStudent = sumNotes/3;
            System.out.println("El promedio del alumno "+(optionStudent+1)+" es: "+mediaStudent);
           
        }
        
        
        
        
        
        /*       int[] alumnos = new int[5];
        int nota, posalumno;
        int primer=0, segundo=0, tercer=0;
        
        for(int i=0;i<5;i++){
            nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las notas del "
                    + "primer trimestre del alumno "+(i+1)+" :"));
            alumnos[i] += nota;
            primer += nota;
            nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las notas del "
                    + "segundo trimestre del alumno "+(i+1)+" :"));
            alumnos[i] += nota;
            segundo += nota;
            nota=Integer.parseInt(JOptionPane.showInputDialog("Ingrese las notas del "
                    + "tercer trimestre del alumno "+(i+1)+" :"));
            alumnos[i] += nota;
            tercer += nota;
        }
        
        posalumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la posición(1-5) del "
                + "alumno que desea saber su media : "));
        
        JOptionPane.showMessageDialog(null, "La media del primer trimestre es: "+(primer/5)+" \n"
                + "La media del segundo trimestre es: "+(segundo/5)+" \n"
                + "La media del tercer trimestre es: "+(tercer/5)+" ");
        
        JOptionPane.showMessageDialog(null, "La media del alumno en la "
                + "posicion "+(posalumno)+" es : "+(alumnos[posalumno-1]/3));
        
    }
   */
        
        
    }
    
}
