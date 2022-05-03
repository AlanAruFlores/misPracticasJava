/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.Entidades;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;
import proyecto.Main;
/**
 *
 * @author alang
 */
public class Departamento {
    static Scanner entrada = new Scanner(System.in);
    private static int cont = 0;
    private int id;
    private TipoDepartamento tipo;
    private String localizacion;
    private Empresa empresa;
    private ArrayList<Empleado> empleados;
    
    
    public Departamento(TipoDepartamento tipo, String localizacion, Empresa empresa)
    {
        this.id = ++Departamento.cont;
        this.tipo = tipo;
        this.localizacion = localizacion;
        this.empleados = new ArrayList<>();
        this.empresa = empresa;
    }
    

    
    
    public void setEmpleado(Empleado emp)
    {
        this.empleados.add(emp);
    }
    public int getId()
    {
        return id;
    }
    public void mostrarEmpleados()
    {
        if(verificarEmpleados())
        {
            JOptionPane.showMessageDialog(null,"LA LISTA ESTA VACIA");
        }
        else
        {
            for (Empleado empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
    private boolean verificarEmpleados()
    {
        return empleados.isEmpty();
    }
     
    @Override
    public String toString()
    {
        return "ID: "+id+"TIPO:"+tipo+" | LOCALIZACION: "+localizacion+" | EMPRESA: "+empresa; 
    }
}
