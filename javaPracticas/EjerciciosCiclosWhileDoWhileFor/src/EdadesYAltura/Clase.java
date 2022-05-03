/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdadesYAltura;

/**
 *
 * @author alang
 */
public class Clase 
{
    public int contador(int edad)
    {
        int contMayores=0;
        
        if(edad > 18)
        {
            contMayores++;
            return contMayores;
        }
        else
        {
            return 0;
        }
        
    }
    public int contadorAltura(float altura)
    {
        int contMayoresAlturas=0;
        if(altura > 1.75f)
        {
            contMayoresAlturas++;
            return contMayoresAlturas;
        }
        else
        {
            return 0;
        }
    }
}
