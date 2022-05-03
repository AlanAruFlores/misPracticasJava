/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MediaPositivosNegativosyCeros;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Condicional {
    
    public void Condicion(int cont, int contNegativo,int contCeros, float positivos, float negativos)    
    {
        float promedio, promedioNegativo;
        if(cont == 0)
        {
            promedioNegativo = negativos / contNegativo;
            JOptionPane.showMessageDialog(null,"No se puede sacar la media de los numeros positivos");
            JOptionPane.showMessageDialog(null,"El promedio de los numeros negativos es: "+promedioNegativo);
            JOptionPane.showMessageDialog(null,"La cantidad de numeros ceros es: "+contCeros);
        }
        else
            if(contNegativo == 0)
            {
                promedio = positivos / cont;
                JOptionPane.showMessageDialog(null,"No se puede sacar la media de los numeros negativos");
                JOptionPane.showMessageDialog(null,"El promedio de los numeros positivos es: "+promedio);
                JOptionPane.showMessageDialog(null,"La cantidad de numeros ceros es: "+contCeros);
            }
        else         
            {
                promedio = positivos / cont;
                promedioNegativo = negativos / contNegativo;
                JOptionPane.showMessageDialog(null,"El promedio de los numeros positivos es: "+promedio);
                JOptionPane.showMessageDialog(null,"El promedio de los numeros negativos es: "+promedioNegativo);
                JOptionPane.showMessageDialog(null,"La cantidad de numeros ceros es: "+contCeros);
            }
    }
}
