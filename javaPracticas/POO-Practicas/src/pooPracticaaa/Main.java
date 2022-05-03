/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPracticaaa;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    
    static Scanner entrada = new Scanner(System.in);
    static Veterinaria veterinario = new Veterinaria ("Vet", new Domicilio("Laguna",123));
    
    public static void main(String[] args) {
        int opcion=0;
        do
        {
            try {
               opcion = ejercutarProyecto();
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "NO SE PUEDE INGRESAR UNA CADENA DE TEXTO");
            }
            
        }while(opcion != 6);
        
    }
    public static int ejercutarProyecto()
    {
        int opcion;
         do{
             opcion = ingresarOpcion();
             switch(opcion)
             {
                 case 1:
                 {
                     veterinario.mostrarMascotas();
                     break;
                 }
                 case 2:
                 {
                     registrarMascota();
                     break;
                 }
                 case 3:
                 {
                     System.out.println(veterinario);
                     break;
                 }
                 case 4:{
                    
                     veterinario.mostrarRazaMasFuerte();
                     break;
                 }
                 case 5:{
                     int opcionTipo;
                     do{
                        opcionTipo = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                              + "\n[1]LORO"
                              + "\n[2]PERRO"));
                     }while(opcionTipo < 1 || opcionTipo >2);

                     veterinario.mostrarMascotasXTipo(opcionTipo);
                     break;
                 }
                 case 6:
                 {
                     JOptionPane.showMessageDialog(null,"SALIENDO");
                 }
             }
         }while (opcion != 6);
         
         return opcion;
    }
    public static void registrarMascota()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DE LA MASCOTA");
        int edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL USUARIO"));
        int opcionMascota = ingresarOpcionMascota();
        Mascota mascota = null;
        
        if(opcionMascota==1){
            String colorPiel = JOptionPane.showInputDialog("DIGITE EL COLOR DE LA PIEL DEL LORO");
            mascota = new Loro(nombre,edad,colorPiel);
        }
        else{
           Raza raza = elegirRaza();
           mascota = new Perro(nombre,edad,raza);
        }
        
        veterinario.setMascota(mascota);
    }
    private static Raza elegirRaza()
    {
        Raza raza  =null;
        Raza razas[] = Raza.values();
        int opcion;
        
        for (int i = 0; i < razas.length; i++) {
            System.out.println("["+(i+1)+"]"+razas[i]);
        }
        do{
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"));
        }while(opcion < 1 || opcion >(razas.length));
        
        raza = razas[opcion-1];
        
        return raza;
    }
    private static int ingresarOpcionMascota()
    {
        int tipoMascota;
        do{
            tipoMascota = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]LORO"
                    + "\n[2]PERRO"));
        }while(tipoMascota < 1 || tipoMascota >2);
        
        return tipoMascota;
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]VER MASCOTAS"
                    + "\n[2]REGISTRAR MASCOTA"
                    + "\n[3]VER VETERINARIA"
                    + "\n[4]VER RAZA DE PERRO MAS FUERTE"
                    + "\n[5]VER MASCOTA DE UN TIPO"
                    + "\n[6}SALIR"));
        }while(opcion <1 || opcion >6);
        return opcion;
    }
}
