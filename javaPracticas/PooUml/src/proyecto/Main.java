/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto;
import java.util.ArrayList;
import proyecto.Entidades.*;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    static Scanner entrada= new Scanner(System.in);
    static ArrayList <Empresa> empresas = new ArrayList<>();
    
    private static void inicializarEmpresas()
    {
        empresas.add(new Empresa("Micro",202,new Direccion("Laguna",2020,20,"Alemania","Berlin")));
        empresas.get(0).setDepartamento(new Departamento(TipoDepartamento.DEPARTAMENTO_PRODUCCION,"Alema",empresas.get(0)));
    }
    public static void main(String[] args) {
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    empresas.get(0).registrarNuevoDepartamento(empresas.get(0));
                    break;
                }
                case 2:
                {
                    Departamento dep = empresas.get(0).elegirDepartamento();
                    if(dep != null)
                    {
                       empresas.get(0).registrarEmpleado(empresas.get(0), dep);
                    }
                    break;
                }
                case 3:
                {
                    Departamento dep = empresas.get(0).elegirDepartamento();
                    if(dep != null)
                    {
                        dep.mostrarEmpleados();
                    }
                    break;
                }
                case 4:
                {
                    empresas.get(0).mostrarDepartamentos();
                    break;
                }
                case 5:
                {
                    empresas.get(0).mostrarContratos();
                    break;
                }
                case 6:
                {
                    System.out.println(empresas.get(0));
                    break;
                }
                case 7:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO...");
                    break;
                }
            }
        }while(opcion !=7);
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA OPCION:"
                    + "\n[1]REGISTRAR UN DEPARTAMENTO"
                    + "\n[2]REGISTRAR UN EMPLEADO"
                    + "\n[3]MOSTRAR EMPLEADOS"
                    + "\n[4]MOSTRAR DEPARTAMENTOS"
                    + "\n[5]MOSTRAR CONTRATOS"
                    + "\n[6]MOSTRAR INFORMACION DE LA EMPRESA"
                    + "\n[7]SALIR"));
        }while(opcion < 1 || opcion >7);
        
        return opcion;
    }
    public static Direccion establecerDireccion()
    {
        String calle = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA CALLE");
        int nroCalle = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL NRO DE LA CALLE"));
        int nroPostal = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LE NRO POSTAL"));
        String localidad = JOptionPane.showInputDialog("DIGITE LA LOCALIDAD");
        String provincia = JOptionPane.showInputDialog("DIGITE LA PROVINCIA");
        return new Direccion (calle,nroCalle,nroPostal,localidad,provincia);
     }
    public static Estado establecerEstado()
    {
        Estado estado = null;
        Estado estados[] = Estado.values();
        int opcion;
        
        for (int i = 0; i < estados.length; i++) {
            System.out.println("["+(i+1)+"]"+estados[i]);
        }
        do
        {
            System.out.println("DIGITE UNA OPCION");
            opcion = entrada.nextInt();
        }while(opcion < 1 || opcion > estados.length);
       
        estado = estados[opcion-1];
        
        return estado;
    
    }
}
