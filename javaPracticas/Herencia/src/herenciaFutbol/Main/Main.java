/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaFutbol.Main;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import herenciaFutbol.Entidades.*;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Viaje> viajes = new ArrayList<>();
    static ArrayList<Persona> personas = new ArrayList<Persona>();
    static ArrayList<Entrenamiento> entrenamientos = new ArrayList<>();
    
    private static void definirEquipo()
    {
        personas.add(new Entrenador("Alberto","Jimenez", 30, Estrategia.TIQUI_TACA));
        personas.add(new Futbolista("Ivan", "Rosa", 20, 10, Posicion.DELANTERO));
        personas.add(new Doctor("Pepe","Gor",40,"UBA", 20));
        personas.add(new Futbolista("Luis","Cardenas", 24, 2, Posicion.DEFENSOR));
        
    }
    public static void main(String[] args) {
        definirEquipo();
        int opcion;
        do
        {
            opcion  = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    if(verificarViajes())
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY NINGUN VIAJE REGISTRADO");
                    }
                    else
                    {
                        for (Viaje viaje : viajes) {
                            viaje.mostrarInformacion();
                        }
                    }
                    break;
                }
                case 2:
                {
                    viajes.add(registrarViaje());
                    break;
                }
                case 3:
                {
                    if(verificarEntrenamientos())
                    {
                        JOptionPane.showMessageDialog(null,"NO HAY NINGUN ENTRENAMIENTO REGISTRADO");
                    }
                    else
                    {
                        for (Entrenamiento entrenamiento : entrenamientos) {
                            System.out.println(entrenamiento);
                        }
                    }
                    break;
                }
                case 4:
                {
                    Entrenamiento entrenamiento = ((Entrenador)personas.get(0)).planificarEntrenamiento();
                    entrenamientos.add(entrenamiento );
                    break;
                }
                case 5:
                {
                    mostrarJugadores();
                    break;
                }
                case 6:
                {
                    mostrarJugadores();
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL JGUADOR A CURAR SU LESION"));
                    int indice = encontrarIndice(id);
                    if(indice != -1)
                    {
                        ((Doctor)personas.get(2)).curarJugador((Futbolista)personas.get(indice));
                    }
                    break;
                }
                case 7:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
            }
                
        }while(opcion != 7);
    }
    private static int encontrarIndice(int id)
    {
        int indice = -1;
        int cont = personas.size();
        
        for (int i = 0; i < cont; i++) {
            if(personas.get(i).getId() == id && personas.get(i).getTipo().equals(TipoPersona.FUTBOLISTA))
            { 
                if(((Futbolista)(personas.get(i))).getEstado() == false)
                {
                    indice = i;
                }
                else
                {
                    JOptionPane.showMessageDialog(null,"NO SE NECESITA CURAR PORQUE ESTA BIEN");
                }

            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO AL JUGADOR");
        }
        return indice;
    }
    public static void mostrarJugadores()
    {
        for (Persona persona : personas) {
            if(persona.getTipo().equals(TipoPersona.FUTBOLISTA))
            {
                System.out.println(persona);
            }
        }
    }
    private static boolean verificarEntrenamientos()
    {
        return entrenamientos.isEmpty();
    }
    public static Viaje registrarViaje()
    {
        Pais pais = registrarPais();
        Fecha fecha = registrarFecha();
        return new Viaje(pais, fecha, personas);
    }
    private static Fecha registrarFecha()
    {
        int dia = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL DIA"));
        int mes = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL MES"));
        int año = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL AÑO"));
        
        return new Fecha(dia,mes,año);
    }
    private static Pais registrarPais()
    {
        Pais pais = null;
        Pais paises[] = Pais.values();
        int opcion;
        for (int i = 0; i < paises.length; i++) {
            System.out.println("["+(i+1)+"]"+paises[i]);
        }
        do
        {
            System.out.print("DIGITE LA OPCION: ");
            opcion = entrada.nextInt();
        }while(opcion < 1 || opcion >(paises.length));
        
        pais = paises[opcion-1];
        
        return pais;
    }
    private static boolean verificarViajes()
    {
        return viajes.isEmpty();
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]VER VIAJES"
                    + "\n[2]REGISTRAR VIAJE"
                    + "\n[3]VER ENTRENAMIENTO"
                    + "\n[4]PLANIFICAR ENTRENAMIENTO"
                    + "\n[5]ENTREVISTA"
                    + "\n[6]CURAR LESION"
                    + "\n[7]SALIR"));
            
        }while(opcion < 1 || opcion >7);
        return opcion;
    }
}
