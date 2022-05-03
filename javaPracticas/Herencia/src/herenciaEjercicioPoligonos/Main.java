/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herenciaEjercicioPoligonos;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        int opcion;
        
        opcion = ingresarOpcion();
        
        switch(opcion)
        {
            case 1:
            {
                int lados [] = ladosRectangulo();
                Poligonos rectangulo = new Rectangulo(lados[0], lados[1]);
                rectangulo.mostrarArea();
                break;
            }
            case 2:
            {
                int lados[] = ladosTriangulo();
                Poligonos triangulo = new Triangulo(lados[0], lados[1], lados[2]);
                triangulo.mostrarArea();
                break;
            }
            case 3:
            {
                JOptionPane.showMessageDialog(null,"SALIENDO");
            }
        }
    }
    
    static int [] ladosTriangulo()
    {
        int lados[] = new int [3];
        for (int i = 0; i < lados.length; i++) {
            lados[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL LADO "+(i+1)));
        }
        return lados;
    }
    static int [] ladosRectangulo()
    {
        boolean agregarPalabra = false;
        int lados[]  = new int [2];
        
        for (int i = 0; i < lados.length; i++) {
            if(agregarPalabra != false)
            {
                lados[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LOS OTROS 2 LADOS IGUALES(ALTURA)"));
            }
            else
            {
                lados[i] = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LOS 2 LADOS IGUALES(BASE)"));
            }
            agregarPalabra = true;
        }
        return lados;
    }
    static int ingresarOpcion()
    {
        int opcion;     
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                    + "\n[1]RECTANGULO"
                    + "\n[2]TRIANGULO"
                    + "\n[3]SALIR"));
        }while(opcion < 1 || opcion >3);
        return opcion;
    }
}
