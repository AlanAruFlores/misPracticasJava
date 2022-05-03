/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojavaET37;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String []args )
    {
        Cooperativa cooperativa;
        Proyecto proyecto;
        ArrayList<Proyecto> proyectos = new ArrayList<>();
        ArrayList<Desarrollador> desarrolladores=new ArrayList<>();
        
        String nombre;
        int cod_cooperativa, nProyectos, opcion, salir = 0 ;
        
        nombre = JOptionPane.showInputDialog("INGRESE EL NOMBRE DE LA COOPERATIVA");
        cod_cooperativa = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL CODIGO DE COOPERATIVA"));
        cooperativa = new Cooperativa(cod_cooperativa,nombre);
        
        nProyectos = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE PROYECTOS"));
        
        for (int i = 0; i < nProyectos ; i++) {
            
            proyecto = createProyect();
            cooperativa.setProyecto(proyecto);
            proyectos.add(proyecto);
        }
  
        for (int i = 0; i < nProyectos; i++) {
            desarrolladores.addAll(proyectos.get(i).getDesarrolladores());
        }
        
        do
        {
            opcion = inputOption();
            switch(opcion)
            {
                case 1:
                {
                    System.out.println(cooperativa);break;
                }
                case 2:
                {
                    System.out.println(proyectos);break;
                }
                case 3:
                {

                    System.out.println(desarrolladores);break;
                }
                case 4:
                {
                    int contDesarrolladores = desarrolladores.size();
                    for (int i = 0; i < contDesarrolladores; i++) {
                        if(desarrolladores.get(i).getLesion() != null)
                        {
                            System.out.println(desarrolladores.get(i));
                        }
                    }
                    break;
                }
                case 5:
                {
                    salir = 1;
                }
            }
        }while(salir != 1);
    }
    public static int inputOption()
    {
        int opcion ;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]VER LA COOPERATIVA"
                    + "\n[2]VER PROYECTOS"
                    + "\n[3]VER DESARROLLADORES"
                    + "\n[4]VER HISTORIAL DE LESIONES"
                    + "\n[5]SALIR"));
        }while(opcion < 1 || opcion >5);
        
        return opcion;
        
    }
    public static Proyecto createProyect()
    {
        ArrayList<Desarrollador> desarrolladores = new ArrayList<>();
        
        Proyecto proyecto;
        String nombre, nombreDesarrollador;
        int horas, nDesarrolladores, edadDesarrollador, indiceLesion;
        
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PROYECTO");
        horas = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE HORAS ESTIMADAS"));
        nDesarrolladores = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE DESARROLLADORES"));
        
        for (int i = 0; i < nDesarrolladores; i++) {
            nombreDesarrollador = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL DESARROLLADOR");
            edadDesarrollador = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU EDAD"));
            indiceLesion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA LESION"
                    + "[1]CRONICA"
                    + "[2}TRANSITORIA"
                    +" [3]NINGUNA"));
            if(indiceLesion == 1 || indiceLesion == 2)
            {
                desarrolladores.add(new Desarrollador(nombreDesarrollador, edadDesarrollador, indiceLesion));
            }
            desarrolladores.add(new Desarrollador(nombreDesarrollador, edadDesarrollador));          
        }
        proyecto = new Proyecto(nombre,horas, desarrolladores);
        
        return proyecto;
    }
}
