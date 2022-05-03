/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooAtletas;
import javax.swing.JOptionPane;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args)
    {
        ArrayList<Pais> paises = new ArrayList<Pais>();
        int opcion, exitProgram = -1;
        
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    paises.add(crearPais());
                    break;
                }
                case 2:
                {
                    if(paises.isEmpty() != true)
                    {
                        Atleta nuevoAtleta = agregarParticipante();
                        int indice;
                        int idEncontrar = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL PAIS"));
                        indice = encontrarIdPais(idEncontrar, paises);

                        if(indice != -1)
                        {
                            paises.get(indice).setAtleta(nuevoAtleta);
                        }
                    }
                    break;
                }
                case 3:
                {
                    for(Pais p : paises)
                    {
                        JOptionPane.showMessageDialog(null,p);
                    }
                    break;
                }
                case 4:
                {
                    int idEncontrar = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL PAIS A BUSCAR"));
                    int indice = encontrarIdPais(idEncontrar, paises);
                    if(indice != -1)
                    {
                        paises.get(indice).mostrarAtletas();
                    }
                    break;
                }
                case 5:
                {

                }
            }
        }while(exitProgram != 1);

        

        
    }
    public static int encontrarIdPais(int id, ArrayList<Pais> paises)
    {
        int indice= -1 , cont = paises.size();
        for (int i = 0; i < cont; i++) {
            if(paises.get(i).getId() == id)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL ID ");
            
        }
        return indice;
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION "
                    + "\n[1] INGRESAR PAIS"
                    + "\n[2] INGRESAR PARTICIPANTE"
                    + "\n[3]MOSTRAR TODO"
                    + "\n[4]MOSTRA PARTICIPANTES DE UN PAIS"
                    + "\n[5]SALIR"));
        }while(opcion < 1 || opcion > 5);
                
        return opcion;
    }
    public static Atleta agregarParticipante()
    {
        String nombre;
        int edad;
        nombre = JOptionPane.showInputDialog("DIGITE EL NOMBRE DEL PARTICIPANTE ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA EDAD DEL PARTICIPANTE"));
        
        return new Atleta(nombre, edad);
    }
    public static Pais crearPais()
    {
        Nacionalidad nombre = null;
        int opcion;
        
        opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]"+Nacionalidad.ARGENTINA+""
                + "\n[2]"+Nacionalidad.CHILE+""
                + "\n[3]"+Nacionalidad.COLOMBIA+""
                + "\n[4]"+Nacionalidad.PERU+""
                + "\n[5]"+Nacionalidad.RUSIA));
                
        switch(opcion)
        {
            case 1:
            {
                nombre = Nacionalidad.ARGENTINA;
                break;
            }
            case 2:
            {
                nombre = Nacionalidad.CHILE;
                break;
            }
            case 3:
            {
                nombre = Nacionalidad.COLOMBIA;
                break;
            }
            case 4:
            {
                nombre = Nacionalidad.PERU;
                break;
            }
            case 5:
            {
                nombre = Nacionalidad.RUSIA;
                break;
            }
        }
       
        return new Pais(nombre);
    }
    
}

