
package herenciaEscuela.Principal;
import herenciaEscuela.Trabajador;
import herenciaEscuela.Director;
import herenciaEscuela.Profesor;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class Escuela
{
    private String nombreEscuela;
    private ArrayList<Trabajador> empleados;
    
    public Escuela(String nombreEscuela)
    {
        this.nombreEscuela = nombreEscuela;
        this.empleados = new ArrayList<>();
    }
    
    public void registrarEmpleado()    
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL EMPLEADO");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL EMPLEADO"));
        Rango rango = registrarRango();
        
        if(rango == Rango.PROFESOR)
        {
            Materia materia = registrarMateria();
            setEmpleados(new Profesor(nombre,edad,rango, materia));
        }
        else
        {
            setEmpleados(new Director(nombre,edad,rango));
        }
    }
    private Rango registrarRango()
    {
        Scanner entrada = new Scanner(System.in);
        Rango rangos[] = Rango.values();
        Rango rango = null;
        int opcion;
        do
        {
            for (int i = 0; i < rangos.length; i++) {
                System.out.println("["+(i+1)+"]"+rangos[i]);
            }
            System.out.print("DIGITE UNA OPCION: ");
            opcion = entrada.nextInt();
        }while(opcion < 1 || opcion > (rangos.length+1));
           
        
        rango = rangos[opcion-1];
        
        return rango;
    }
    private Materia registrarMateria(){
        Scanner entrada = new Scanner(System.in);
        Materia materias[] = Materia.values();
        Materia materia = null;
        int opcion;
        
        do
        {
            for (int i = 0; i < materias.length; i++) {
                System.out.println("["+(i+1)+"]"+materias[i]);
            }
            System.out.print("DIGITE UNA OPCION");
            opcion = entrada.nextInt();
        }while(opcion < 1 || opcion>(materias.length+1));

        materia = materias[opcion-1];
        return materia;
    }
    public void setEmpleados(Trabajador t)
    {
        this.empleados.add(t);
    }
    public void mostrarEmpleados()
    {
        if(verificarEmpleados())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN EMPLEADO REGISTRADO");
        }
        else
        {
            for (Trabajador empleado : empleados) {
                System.out.println(empleado);
            }
        }
    }
    private boolean verificarEmpleados()
    {
        return empleados.isEmpty();
    }
    
    
}