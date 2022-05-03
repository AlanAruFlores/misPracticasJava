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
public class VerificadorNumeros {
    public void Promedio()
    {
        Condicional condicion = new Condicional();
        float positivos=0, negativos = 0f, promedio = 0f, promedioNegativo = 0f,numero;
        int i, cont = 0, contNegativo=0,contCeros=0;
        for(i=1;i<=10;i++)
        {
            numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero "+i));
            if (numero > 0)
            {
                cont ++;
                positivos += numero;
            }
            else 
            if(numero<0)
            {
                contNegativo++;
                negativos += numero;
            }
        
            else
            {
                contCeros ++;

            }


        }
        condicion.Condicion(cont,contNegativo,contCeros, positivos,negativos);

                
    }
}
