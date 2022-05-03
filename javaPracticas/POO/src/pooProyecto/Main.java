/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**3
 *
 * @author alang
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Empresa> empresas = new ArrayList<Empresa>();
    private static void establecerValores()
    {
        empresas.add(new Empresa("Unlam",new Domicilio("Calle",1023)));
        empresas.add(new Empresa("Utn",new Domicilio("Calle2",1234)));
        empresas.add(new Empresa("Uk",new Domicilio("Calle3",123444)));
        empresas.add(new Empresa("Emprise", new Domicilio("Calle4",12345678)));       
        
        
    }
    public static void main(String[] args) {
        
        establecerValores();
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            
            switch(opcion)
            {
                case 1:
                {
                    mostrarEmpresas();
                    break;
                }
                case 2:
                {
                    Empresa empresa = ingresarOpcionEmpresa();
                    int option= ingresarOpcionTipoEmpleado();
                    
                    empresa.mostrarTipoEmpleado(option);
                    break;
                }
                case 3:
                {
                    Empresa empresa = ingresarOpcionEmpresa();
                    empresa.mostrarEmpleados();
                    break;
                }
                case 4:
                {
                    int optionTipoEmpleadoSeleccionar = seleccionarRegistro();
                    Empleado empleado = null;
                    if(optionTipoEmpleadoSeleccionar == 1){
                        empleado = registrarDiseñador();
                    }
                    else
                    {
                        empleado = registrarProgramador();
                    }
                    Empresa empresa = ingresarOpcionEmpresa();
                    
                    empresa.setEmpleado(empleado);
                    break;
                }
            }
                        
                    
        }while(true);
    }
    public static int seleccionarRegistro()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]DISEÑADOR"
                    + "\n[2]PROGRAMADOR"));
        }while(opcion <1 || opcion >2);
        return opcion;
    }
    public static DiseñadorGrafico registrarDiseñador()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        double sueldo  = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL SUELDO"));
        String programa = JOptionPane.showInputDialog("DIGITE EL PROGRAMA QUE UTILIZA");
        
        return new DiseñadorGrafico(nombre,edad,sueldo, programa);
    }
    public static Programador registrarProgramador()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE");
        int edad  = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        Experiencia experiencia =  seleccionarExperiencia();

        return new Programador(nombre,edad,experiencia);
    }
    public static Experiencia seleccionarExperiencia()
    {
        Experiencia experiencia = null;
        Experiencia experiencias[] = Experiencia.values();
        int opcion;
        for (int i = 0; i < experiencias.length; i++) {
            System.out.println("["+(i+1)+"]"+experiencias[i]);
        }
        do
        {
            System.out.println("DIGITE UNA OPCION");
            opcion = entrada.nextInt();
            
        }while(opcion < 1 || opcion > experiencias.length);
        
        experiencia = experiencias[opcion -1];
        return experiencia;
    }
    public static Empresa ingresarOpcionEmpresa()
    {
        int opcion;
        mostrarEmpresas();
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"));
        }while(opcion < 1 || opcion >4);
        
        Empresa empresa = empresas.get(opcion-1);
        
        return empresa;
    }
    public static int ingresarOpcionTipoEmpleado()
    {
        int opcion = 0;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("\n[1]DISEÑADOR"
                    + "\n[2]PROGRAMADOR"));
        }while(opcion < 1 || opcion >2);
        
        return opcion;
    }
    public static void mostrarEmpresas()
    {
        int id = 0;
        System.out.println("-------------------------------------");
        for (Empresa empresa : empresas) {
            id++;
            System.out.println("["+id+"]"+empresa);
        }
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]VER EMPRESA"
                    + "\n[2]MOSTRAR UN TIPO"
                    + "\n[3]MOSTRAR TODO"
                    + "\n[4]AGREGAR EMPLEADO"));
        }while(opcion < 1 || opcion >4);
        return opcion;
    }
}
