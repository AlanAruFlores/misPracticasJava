/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyecto;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main ( String [] args)
    {
       Empresa emp = new Empresa("ORANGE");
       int opcion;
       
       do
       {
           opcion = ingresarOpcion();
           switch(opcion)
           {
               case 1:
               {
                   Proyecto p = emp.registrarProyecto();
                   emp.setProyecto(p);
                   break;
               }
               case 2:
               {
                   emp.mostrarProyectos();
                   break;
               }
               case 3:
               {
                   emp.mostrarProyectos();
                   int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL PROYECTO A ENCONTRAR"));
                   int indice = emp.encontrarIndiceProyecto(id);
                   if(indice != -1)
                   {
                       entrarMenu(emp.seleccionarProyecto(indice));
                      
                   }
                   break;
               }
               case 4:
               {
                   JOptionPane.showMessageDialog(null,"SALIENDO....");
                   JOptionPane.showMessageDialog(null,"GRACIAS POR LA VISITA");
               }
           }
       }while(opcion != 4);
       
    }
    public static void entrarMenu(Proyecto p)
    {
        int opcion;
        
        do
        {
            opcion = ingresarOpcionMenu();
            switch(opcion)
            {
                case 1:
                {
                    Integrante integrante = p.registrarIntegrante();
                    p.setIntegrante(integrante);
                    break;
                }
                case 2:
                {
                    Nivel nivel = ingresarNivel();
                    p.mostrarIntegranteXnivel(nivel);
                    break;
                }
                case 3:
                {
                    int id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL INTEGRANTE"));
                    int indice = p.encontrarIndiceIntegrante(id);
                    if(indice == -1)
                    {
                        p.borrarIntegrante(indice);
                        
                    }
                    break;
                }
                case 4:
                {
                    p.mostrarIntegrantes();
                    break;
                }
                case 5:
                {
                    JOptionPane.showMessageDialog(null,"SALIENDO....");
                    break;
                }
            }
        }while(opcion != 5);
           
        
    }
    public static int ingresarOpcionMenu()
    {
        int opcion ;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR INTEGRANTE"
                    + "\n[2]MOSTRAR INTEGRANTE X NIVEL"
                    + "\n[3]BORRAR INTEGRANTE"
                    + "\n[4]MOSTRAR INTEGRANTES"
                    + "\n[5]SALIR"));
        }while(opcion < 1 || opcion >5);
        return opcion;
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]REGISTRAR PROYECTO"
                    + "\n[2]VER PROYECTOS"
                    + "\n[3]ENTRAR PROYECTO"
                    + "\n[4]SALIR"));
        }while(opcion < 1 || opcion >4);
        
        return opcion;
    }
    public static Nivel ingresarNivel()
    {
        int opcion;
        Nivel nivel=null;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]"+Nivel.JUNIOR+""
                    + "\n[2]"+Nivel.SEMISENIOR+""
                    + "\n[3]"+Nivel.SENIOR));
        }while(opcion < 1 || opcion >3);
        switch(opcion)
        {
            case 1:
            {
                nivel = Nivel.JUNIOR;
                break;
            }
            case 2:
            {
                nivel = Nivel.SEMISENIOR;
                break;
            }
            case 3:
            {
                nivel = Nivel.SENIOR;
                break;
            }
        }
        return nivel;
    }
}
