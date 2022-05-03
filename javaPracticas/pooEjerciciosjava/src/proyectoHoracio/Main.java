/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoHoracio;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        Scanner entrada= new Scanner(System.in);
        
        ArrayList<Caballero> arrayCaballeros = new ArrayList<>();
        ArrayList<Caballero> arrayCaballerosAñosLuz  = new ArrayList<>();
                
        int opcion, indiceMayor, cont, contPrecoz = 0, salir = 0;
        double porcentaje, porcentajePrecoz;
        
        do
        {      
            System.out.println("DIGITE UNA OPCION"
                    + "\n[1]INGRESE UN CABALLERO"
                    + "\n[2]MOSTRAR AL POSIBLE HADES"
                    + "\n[3]VER CONSTALACIONES"
                    + "\n[4]VER PRECOZES"
                    + "\n[5]SALIR");
            opcion = entrada.nextInt();

            switch(opcion)
            {
                case 1:
                {
                    arrayCaballeros.add(ingresarCaballero());
                    break;
                }
                case 2:
                {
                    indiceMayor = indicePosibleHades(arrayCaballeros);
                    System.out.println("POSIBLE HADES:");
                    arrayCaballeros.get(indiceMayor).mostrarCaballero();
                    break;
                }
                case 3:
                {
                   arrayCaballerosAñosLuz.addAll(constelacionAñosLuz(arrayCaballeros));
                   cont = arrayCaballerosAñosLuz.size();
                   for (int i = 0; i < cont; i++) {
                       arrayCaballerosAñosLuz.get(i).mostrarCaballero();
                   }
                   break;
                }
                case 4:
                {
                    cont = arrayCaballeros.size();
                    for (int i = 0; i < cont; i++) {
                        if(arrayCaballeros.get(i).getPrecoz() == true)
                        {
                            contPrecoz++;
                        }
                    }
                    porcentaje = (1*100) / cont;
                    porcentajePrecoz = porcentaje * contPrecoz;

                    System.out.println("PORCENTAJE DE PRECOZES: "+porcentajePrecoz+"%");
                    break;
                }
                case 5:
                {
                    salir = 1;break;
                }
                default:
                {
                    System.out.println("ERROR");
                }

            }
        }while(salir != 1);
            
            
        
        
    }
    public static ArrayList<Caballero> constelacionAñosLuz(ArrayList<Caballero> caballeros)
    {
        int cont = caballeros.size();
        ArrayList <Caballero> caballerosAñosLuz = new ArrayList<>();
        
        for (int i = 0; i < cont; i++) {
            if(caballeros.get(i).getConstelacion().getCercano() == true)
            {
                caballerosAñosLuz.add(caballeros.get(i));
            }
        }
        
        return caballerosAñosLuz;
    }
        
    
    public static int indicePosibleHades(ArrayList <Caballero> caballeros)
    {
        int indice = -1, cont = caballeros.size();
        int valorMaldadInicial = caballeros.get(0).getNivelMaldad();
        
        for (int i = 0; i < cont; i++) {
            if(caballeros.get(i).getNivelMaldad()>=valorMaldadInicial)
            {
                indice = i;
            }
        }
        
        return indice;
        
    }
    public static Caballero ingresarCaballero()
    {
        Scanner entrada = new Scanner(System.in);
        
        String nombre;
        int edad, nivelMaldad, añosArmadura;
        Constelacion constelacion; 
        Caballero caballero;
        
        System.out.println("INGRESE NOMBRE");
        nombre = entrada.nextLine();
        System.out.println("INGRESE LA EDAD");
        edad = entrada.nextInt();
        System.out.println("INGRESE A QUE EDAD LE DIO LA ARMADURA");
        añosArmadura = entrada.nextInt();
        System.out.println("INGRESE NIVEL MALDAD");
        nivelMaldad = entrada.nextInt();
        
        constelacion = ingresarConstelacion();
        
        caballero = new Caballero(nombre, edad, nivelMaldad,añosArmadura, constelacion);
        
        return caballero;
        
    }
    public static Constelacion ingresarConstelacion()
    {
        Scanner entrada = new Scanner(System.in);
        Constelacion constelacion;
        
        int distancia, selectOpcion;
        boolean bandaCeleste;
        
        System.out.println("DIGITE LA DISTANCIA");
        distancia = entrada.nextInt();
        
        System.out.println("BANDA CELESTE"
                + "\n[1]SI"
                + "\n[2]NO");
        selectOpcion = entrada.nextInt();
        
        if(selectOpcion == 1)
        {
            bandaCeleste = true;
        }
        else
        {
            bandaCeleste = false;
        }
        constelacion = new Constelacion(distancia,bandaCeleste);
        
        return constelacion;
        
    }
    
    
}
