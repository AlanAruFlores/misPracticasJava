/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaproyectovuelo;
import herenciaproyectovuelo.entidades.*;
import java.awt.Window;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class HerenciaProyectoVuelo {

    static Scanner entrada = new Scanner(System.in);
    static ArrayList<Aeropuerto> aeropuertos = new ArrayList<>();
   
    private static void rellenarArrays()
    {
        aeropuertos.add(new AeropuertoPublico("AEROPUERTO 1",new Domicilio("KK",Nacionalidad.PARAGUAY),3000));
        aeropuertos.add(new AeropuertoPublico("AEROPUERTO 7",new Domicilio("KL",Nacionalidad.BRASIL),4000));
        aeropuertos.add(new AeropuertoPrivado("AEROPUERTO 77",new Domicilio("L",Nacionalidad.PERU)));
        aeropuertos.add(new AeropuertoPrivado("AEROPUERTO 777",new Domicilio("LL",Nacionalidad.ARGENTINA)));
        
        ((AeropuertoPrivado) aeropuertos.get(3)).setEmpresas(new EmpresaPatrocinador("CALCO"));
        ((AeropuertoPrivado) aeropuertos.get(2)).setEmpresas(new EmpresaPatrocinador("CLARIN"));
        
        aeropuertos.get(0).setCompañia(new Compañia("LASSOBRAS1"));
        aeropuertos.get(1).setCompañia(new Compañia("LASSOBRAS7"));
        aeropuertos.get(2).setCompañia(new Compañia("LASSOBRAS77"));
        aeropuertos.get(3).setCompañia(new Compañia("LASSOBRAS777"));

        aeropuertos.get(3).getCompañias().get(0).setVuelo(new Vuelo("MIAMI","LAS VEGAS", 3000, 30));

       
    }
    public static void main(String[] args) {
        rellenarArrays();
        int opcion;
        
        do
        {
            opcion = digitarOpcion();
            
            switch(opcion)
            {
                case 1:
                {
                    consultarAeropuertos();
                    break;
                }
                case 2:
                {
                    consultarAeropuertos();
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL AEROPUERTO"));
                    int indice = encontrarIndice(id);
                    if(indice != -1)
                    {
                        mostrarAeropuerto(indice);
                    }
                    break;
                }
                case 3:
                {
                    consultarAeropuertos();
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL AEROPUERTO"));
                    int indice = encontrarIndice(id);
                    if(indice != -1)
                    {
                        aeropuertos.get(indice).mostrarCompañias();
                    }
                    break;
                }
                case 4:
                {
                    consultarAeropuertos();
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL AEROPUERTO"));
                    int indice = encontrarIndice(id);
                    if(indice != -1)
                    {
                        aeropuertos.get(indice).mostrarCompañia();
                    }
                    break;
                }
                case 5:
                {
                    
                    ArrayList<Vuelo>vuelos = getVuelos();
                    String ciudadOrigen = JOptionPane.showInputDialog("DIGITE LA CIUDAD DE ORIGEN");
                    String ciudadDestino = JOptionPane.showInputDialog("DIGITE LA CIUDAD DE DESTINO");
                    
                    ciudadOrigen = ciudadOrigen.toUpperCase();
                    ciudadDestino = ciudadDestino.toUpperCase();
                    
                    
                    encontrarVuelos(ciudadOrigen, ciudadDestino, vuelos);
                    break;
                }
                case 6:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO.......");
                }
            }
        }while(opcion !=6);
    }
    static void encontrarVuelos(String ciudadOrigen, String ciudadDestino, ArrayList<Vuelo> vuelos)
    {
        int cont = vuelos.size();
        boolean resultados = false;
        for (int i = 0; i < cont; i++) {
            if(vuelos.get(i).getciudadOrigen().contains(ciudadOrigen))
            {
                if(vuelos.get(i).getCiudadDestino().contains(ciudadDestino))
                {
                    System.out.println(vuelos.get(i));
                    resultados = true;
                }
            }
        }
        if(resultados == false)
        {
            System.out.println("NO HAY RESULTADOS");
        }
    }
    static ArrayList<Vuelo> getVuelos()
    {
        ArrayList<Vuelo>vuelos = new ArrayList<>();
        int cont = aeropuertos.size();
        for (int i = 0; i < cont; i++) {
            for (int j = 0; j < aeropuertos.get(i).getCompañias().size(); j++) {
                vuelos.addAll(aeropuertos.get(i).getCompañias().get(j).getVuelos());
            }
        }
        return vuelos;
    }
    static void mostrarAeropuerto(int indice)
    {
        if(aeropuertos.get(indice).getTipo().equals(TipoAeropuerto.PUBLICO))
        {
            AeropuertoPublico aeropuertoSeleccionado = ((AeropuertoPublico) aeropuertos.get(indice));
            aeropuertoSeleccionado.mostrarDineroGubernamental();

        }
        else
        {
            AeropuertoPrivado aeropuertoSeleccionado = ((AeropuertoPrivado)aeropuertos.get(indice));
            aeropuertoSeleccionado.mostrarEmpresas();
        }
    }
    static void consultarAeropuertos()
    {
        int i = 1;
        
        do
        {
            TipoAeropuerto tipo = TipoAeropuerto.PUBLICO;
            if(i  == 2)
            {
                tipo = TipoAeropuerto.PRIVADO;
            }
            System.out.println("AEROPUERTOS: "+tipo+"S");
            for (Aeropuerto aeropuerto : aeropuertos) {
                if(aeropuerto.getTipo().equals(tipo))
                {
                    System.out.println(aeropuerto);
                }
            }
            System.out.println("---------------------");
            
            i++;
        }while(i<=2);
               
    }
    static int encontrarIndice(int id)
    {
        int indice = -1 , cont = aeropuertos.size();
        for (int i = 0; i < cont; i++) {
            if(aeropuertos.get(i).getId()==id){
                indice = i;
            }
        }
        if(indice == -1){
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL AEROPUERTO");
        }
        return indice;
    }
    static int digitarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
            + "\n[1]CONSULTAR AEROPUERTOS"
            + "\n[2]CONSULTAR UN AEROPUERTO"
            + "\n[3]CONSULTAR COMPAÑIAS"
            + "\n[4]VER VUELOS DE UNA COMPAÑIA"
            + "\n[5]MOSTRAR VUELOS DESDE Y HASTA DESTINO"
            + "\n[6]SALIR"));
            
        }while(opcion < 1 || opcion >6);
        return opcion;
    }
    
}
