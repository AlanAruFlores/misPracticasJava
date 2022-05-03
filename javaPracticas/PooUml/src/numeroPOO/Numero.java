
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroPOO;

/**
 *
 * @author alang
 */
public class Numero {
    private Integer[] numero;
    private int cantidadDigitos;
    
    public Numero(String numero)
    {
        setCantidadDigitos(numero);
        this.numero = new Integer[this.cantidadDigitos];
        setNumeros(numero);
    }
    private void setNumeros(String numero)
    {
        for (int i = 0; i < this.numero.length; i++) {
           Integer num = Integer.parseInt(String.valueOf(numero.charAt(i)));
           this.numero[i] = num;
        }
    }
    private void setCantidadDigitos(String numero)
    {
       this.cantidadDigitos = numero.length();
    }
    
    public int getCantidadDigitos(){
        return cantidadDigitos;
    }
    
    public int calcularSumaDigitos()
    {
        int acum = 0 ;
        for (int i = 0; i < this.cantidadDigitos; i++) {
            acum += numero[i];
        }
        return acum;
    }
    public int calcularProductoDigitos()
    {
        int acum = 1;
        for (int i = 0; i < this.cantidadDigitos; i++) {
            acum*= numero[i];
        }
        return acum;
    }
    public int calcularDigitoDerecho()
    {
        return numero[this.cantidadDigitos - 1];
    }
    public int calcularDigitoIzquiedo()
    {
        return numero[0];
    }
    public int getDigitoMayor()
    {
        int numMayor = numero[0];
        for (int i = 1; i < this.cantidadDigitos; i++) {
            if(numero[i] > numMayor)
            {
                numMayor = numero[i];
            }
        }
        return numMayor;
    }
    public int getDigitoMenor()
    {
        int numMenor = numero[0];
        
        for (int i = 1; i < this.cantidadDigitos; i++) {
            if(numMenor > numero[i])
            {
                numMenor = numero[i];
            }
        }
        return numMenor;
    }
    
    public void mostrarNumeroInvertido()
    {
        int m= 0;
        String [] cadena = new String[this.cantidadDigitos];
        for (int i = this.cantidadDigitos-1; i >=0; i--) {
            cadena [m] = numero[i].toString();
            System.out.print(cadena[m]);
            m++;
        }
        System.out.println("");
        
    }
}
