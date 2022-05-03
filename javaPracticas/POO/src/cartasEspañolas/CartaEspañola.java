/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cartasEspañolas;

/**
 *
 * @author alang
 */
public class CartaEspañola {
    
    private static int cantTotal = 0;
    private static int cont = 0;
    private int numero;
    private Tipo tipo;
    
    public CartaEspañola()
    {
        setNumero();
        CartaEspañola.cantTotal++;
        setTipo();
        
    }
    private void setNumero()
    {
        CartaEspañola.cont++;
        this.numero = CartaEspañola.cont;
        if(CartaEspañola.cont == 12)
        {
            CartaEspañola.cont = 0;
        }
    }
    private void setTipo()
    {
        if(cantTotal >0 && cantTotal<=12)
        {
            this.tipo = Tipo.BASTO;
        }
        else  if(cantTotal > 12 && cantTotal <= 24)
        {
            this.tipo = Tipo.COPAS;
        }
        else if(cantTotal > 24 && +cantTotal<=36)
        {
            this.tipo = Tipo.ESPADA;
        }
        else
        {
            this.tipo = Tipo.ORO;
        }
    }
    
    @Override
    public String toString()
    {
        return "NUMERO CARTA: "+numero+" | TIPO: "+tipo;
    }
}
