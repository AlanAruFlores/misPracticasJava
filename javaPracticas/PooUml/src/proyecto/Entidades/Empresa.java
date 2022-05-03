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
public class Empresa {
    static Scanner entrada= new Scanner(System.in);
    private String nombre;
    private int cif;
    private ArrayList<Departamento> departamentos;
    private ArrayList<Contrato> contratos;
    private Direccion direccion; 
    
    public Empresa(String nombre, int cif, Direccion direccion)
    {
        this.nombre = nombre;
        this.cif = cif;
        this.direccion = direccion;
        departamentos = new ArrayList<>();
        contratos = new ArrayList<>();
    }
    
    public void registrarEmpleado(Empresa empresa, Departamento dep)
    {
        int dni = Integer.parseInt(JOptionPane.showInputDialog("DIGITE SU DNI"));
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL EMPLEADO");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL EMPLEADO"));
        Estado estado = Main.establecerEstado();
        double sueldo = Double.parseDouble(JOptionPane.showInputDialog("DIGITE EL SUELDO"));
        String categoria = JOptionPane.showInputDialog("DIGITE LA CATEGORIA DE LA PERSONA");
        Direccion direccion = Main.establecerDireccion();
        
        Empleado empleado = new Empleado(dni,nombre,edad,estado,sueldo,categoria,direccion,dep);
        setContrato(new Contrato(empleado, empresa));
        dep.setEmpleado(empleado);
    }
    public Departamento elegirDepartamento()
    {
        Departamento departamento = null;
        mostrarDepartamentos();
        int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID"));
        int indice = encontrarIndiceDepartamento(id);
        
        if(indice != -1)
        {
            departamento = departamentos.get(indice);
        }
        return departamento;
    }
    private int encontrarIndiceDepartamento(int id)
    {
        int indice = 1, cont = departamentos.size();
        
        for (int i = 0; i < cont; i++) {
            if(departamentos.get(i).getId() == id)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL ID");
        }
        return indice;
    }
    
    public void registrarNuevoDepartamento(Empresa empresa)
    {
        TipoDepartamento tipo = elegirTipoDepartamento();
        String localizacion = JOptionPane.showInputDialog("DIGITE LA LOCALIZACION DEL DEPARTAMENTO");
        
        setDepartamento(new Departamento(tipo,localizacion,empresa));
    }
    public TipoDepartamento elegirTipoDepartamento()
    {
        int opcion;
        TipoDepartamento tipo = null;
        TipoDepartamento [] tipos = TipoDepartamento.values();
        for (int i = 0; i < tipos.length; i++) {
            System.out.println("["+(i+1)+"]"+tipos[i]);
        }
        do
        {
            System.out.println("DIGITE UNA OPCION");
            opcion = entrada.nextInt();
        }while(opcion < 1 || opcion >tipos.length);
        
        tipo = tipos[opcion-1];
        return tipo;
    }   
    public ArrayList <Departamento> getDepartamentos(){
        return departamentos;
    }
    public void setContrato(Contrato contrato)
    {
        contratos.add(contrato);
    }
    public void mostrarContratos()
    {
       if(verificarLista(contratos))
       {
           JOptionPane.showMessageDialog(null,"NO HAY NINGUN CONTRATO");
       }
       else
       {
           for (Contrato contrato : contratos) {
               System.out.println(contrato);
           }
       }
    }
    public void setDepartamento(Departamento departamento){
        departamentos.add(departamento);
    }
    
    public void mostrarDepartamentos()
    {
        if(verificarLista(departamentos))
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN DEPARTAMENTO REGISTRADO");
        }
        else{
            for (Departamento departamento : departamentos) {
                System.out.println(departamento);
            }
        }
    }
    private boolean verificarLista(ArrayList lista)
    {
        return  lista.isEmpty();
    }
    
    @Override
    public String toString()
    {
        return "NOMBRE: "+nombre+" | CIF: "+cif;
    }
    
}
