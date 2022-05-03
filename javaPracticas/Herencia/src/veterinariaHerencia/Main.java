/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package veterinariaHerencia;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        Veterinario veterinario = new Veterinario("EvaVet");
        int opcion;
        
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    veterinario.mostrarTodosAnimales();
                    break;
                           
                }
                case 2:
                { 
                    int opcionAnimal = ingresarOpcionMascota();
                    veterinario.setAnimal(ingresarAnimal(opcionAnimal));
                    break;
                    
                }
                case 3:
                {
                    TipoAnimal tipo = registrarTipo();
                    veterinario.mostrarUnAnimal(tipo);
                    break;
                }
                default:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                }
                        
            }
        }while(opcion != 4);
    }
    public static Animal ingresarAnimal(int opcion)
    {
        Animal a = null;
        String nombre = JOptionPane.showInputDialog("DIGITE SU NOMBRE");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD"));
        String colorPiel = JOptionPane.showInputDialog("DIGITE SU COLOR DE PIEL");
        
        if(opcion == 1)
        {
            a = new Gato(nombre,edad,colorPiel);
        }
        else{
            RazaPerro raza = seleccionarRaza();
            a  = new Perro(nombre,edad,colorPiel,raza);
        }
        
        return a;
        
    }
    private static RazaPerro seleccionarRaza()
    {
        
        //Array 0,1,2,3,4,5,6,7
        //razas[0] = PITBULL
        //razas[1] = PASTOR_ALEMAN
        
        RazaPerro raza = null;
        RazaPerro razas[] = RazaPerro.values();
        int opcion;
        
        for (int i = 0; i < razas.length; i++) {
            System.out.println("["+(i+1)+"]"+razas[i]);
        }
        do
        {
            System.out.print("DIGITE UNA OPCION: ");
            opcion = entrada.nextInt(); 
        }while(opcion < 1 || opcion > (razas.length+1));
            
        raza = razas[opcion - 1 ];
        return raza;
    }
    public static int ingresarOpcionMascota()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]GATO"
                    + "\n[2]PERRO"));
        }while(opcion < 1 || opcion >2);
        return opcion;
    }
    public static TipoAnimal registrarTipo()
    {
        int opcion;
        TipoAnimal tipoAnimal= null;
        TipoAnimal tipo[] = TipoAnimal.values();
        
        for (int i = 0; i < tipo.length; i++) {
            System.out.println("["+(i+1)+"]"+tipo[i]);
        }
        do
        {
            System.out.println("DIGITE UNA OPCION: ");
            opcion = entrada.nextInt();
        }while(opcion < 1 || opcion > (tipo.length+1));
        
        tipoAnimal = tipo[opcion-1];
        return tipoAnimal;
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]VER ANIMALES"
                    + "\n[2]REGISTRAR ANIMALES"
                    + "\n[3]VER ANIMALES DE UN TIPO"
                    + "\n[4]SALIR" ));
        }while(opcion <1 || opcion >4);
        return opcion;
    }
    
}
