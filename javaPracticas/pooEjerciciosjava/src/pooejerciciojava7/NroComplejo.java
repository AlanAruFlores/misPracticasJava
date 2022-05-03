/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciojava7;

/**
 *
 * @author alang
 */
public class NroComplejo {
    private int n;
    private int i;
    
    public NroComplejo(int n , int i )
    {
        this.i = i;
        this.n = n;
    }
    
    public int getI()
    {
        return i;
    }
    public int getN()
    {
        return n;
    }
    public NroComplejo sumarNrosComplejos(NroComplejo c)
    {
        NroComplejo suma = new NroComplejo(n+c.getN(),i+c.getI());
        return suma;
    }
    
    public NroComplejo multiplicarNrosComplejos(NroComplejo c)
    {
        NroComplejo multiplicacion = new NroComplejo((n*c.getN())-(i*c.getI()),(n*c.getI())+(i*getN()));
        return multiplicacion;
    }
    public boolean verificarIgualdad (NroComplejo c)
    {
        boolean igualdad = false;
        if(n == c.getN())
        {

            if(i == c.getI())
            {
                igualdad = true;
            }
            
            else
            {
                igualdad = false;
            }
            
        }
        return igualdad;
    }
    public NroComplejo multiplicarXEntero(int entero)
    {
        NroComplejo mult = new NroComplejo (n * entero , i * entero);
        return mult;
    }
    
    public void mostrarComplejo ()
    {
        System.out.println(""+n+" + "+i+"i");
    }
}   
    
