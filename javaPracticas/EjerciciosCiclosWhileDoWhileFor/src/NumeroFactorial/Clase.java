/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NumeroFactorial;

/**
 *
 * @author alang
 */
public class Clase {
    public int NumeroFactorial(int i, int numero)
    {
        int factorial=1;
        for(i=1; i<=numero; i++)
        {
            factorial*=i;
                    
        }
        return factorial;
    }
}
