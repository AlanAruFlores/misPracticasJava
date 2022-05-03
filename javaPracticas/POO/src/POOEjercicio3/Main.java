/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio3;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    public static void main(String [] args)
    {
        String modelo, marca;
        int contAutos;
        float precio, precioMayor=0; 
        int contMayor=0;
        
        contAutos = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de autos "));
        Auto autos[] = new Auto[contAutos];
        for(int i = 0 ; i <contAutos;i++)
        {
            modelo = JOptionPane.showInputDialog("Ingrese el modelo del auto "+(i+1));
            marca = JOptionPane.showInputDialog("Ingrese  la marca del auto "+(i+1));
            precio = Float.parseFloat(JOptionPane.showInputDialog("Ingrese el precio del auto "+(i+1)));
            autos[i] = new Auto(modelo,marca,precio);
        }
        for(int i = 0 ; i<autos.length;i++)
        {
            if(autos[i].getPrecio()>precioMayor)
            {
                contMayor = i+1;
                precioMayor = autos[i].getPrecio();
            }
        }
        
        for(int i = 0; i< autos.length;i++)
        {
            autos[i].mostrarAuto();
            System.out.println("------------------------------------");
        }
        
        System.out.println("El auto con mayor precio es el nro: "+contMayor);
    }
}
