/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HerenciaEjercicio2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Empresa {
    private ArrayList<Empleado> empleados;
    private String nombre;
    
    public Empresa(String nombre)
    {
        this.nombre =  nombre;
        empleados = new ArrayList<Empleado>();
    }
    public void añadirEmpleado()
    {
        Empleado emp = null;
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL EMPLEADO");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL EMPLEADO"));
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL SUELDO DEL EMPLEADO"));
        Dni dni = registrarDni(nombre);
        emp = new Empleado(nombre, edad, sueldo, dni);
        
        setEmpleado(emp);
        JOptionPane.showMessageDialog(null,"EMPLEADO REGISTRADO CON EXITO");
    }
    private Dni registrarDni(String Nombre)
    {
        String nombre = Nombre;
        Genero g = registrarGenero();
        Pais p = registrarPais();
        
        return new Dni(nombre, g, p);
        
    }
    private Genero registrarGenero()
    {
        int opcion;
        Genero g = null;
        Genero [] generos = Genero.values();
        for (int i = 0; i < generos.length; i++) {
            System.out.println("["+(i+1)+"] "+generos[i]);
        }
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"));
        }while (opcion < 1 || opcion > (generos.length+1));
        
        g=generos[opcion-1];
        return g;
    }
    private Pais registrarPais()
    {
        int opcion;
        Pais p = null;
        Pais [] paises = Pais.values();
        
        for (int i = 0; i < paises.length; i++) {
            System.out.println("["+(i+1)+"]"+paises[i]);
        }
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"));
        }while(opcion < 1 || opcion > paises.length + 1);
        p = paises[opcion - 1];
        return p;
    }
    public void mostrarEmpleados()
    {
        if(verificarEmpleados())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN EMPLEADO REGISTRADO");
        }
        else
        {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
    public void removerEmpleado()
    {
        if(verificarEmpleados())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NIGNUN EMPLEADO REGISTRADO");
        }
        else
        {
            mostrarEmpleados();
            int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL EMPLEADO"));
            int indice = verificarEmpleadoExistente(id);
            if(indice != -1)
            {
                empleados.remove(indice);
                JOptionPane.showMessageDialog(null,"EMPLEADO ELIMINADO CON EXITO");
            }
        }
    }
    private int verificarEmpleadoExistente(int id)
    {
        int cont = empleados.size(), indice = -1;
        for (int i = 0; i < cont; i++) {
            if(id == empleados.get(i).getId())
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL EMPLEADO");
        }
        return indice;
    }
    public void setEmpleado(Empleado emp)
    {
        empleados.add(emp);
    }

    
    
    private boolean verificarEmpleados()
    {
        return empleados.isEmpty();
    }
}
