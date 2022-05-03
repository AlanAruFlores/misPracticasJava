/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegoAjedrez;

/**
 *
 * @author alang
 */
public abstract class Usuario {
    private String nombre;
    private int victorias;
    private int perdidas;
    private String signo;
    public Usuario(String nombre)
    {
        this.nombre = nombre;
        this.victorias = 0;
        this.perdidas = 0 ;
    }
    
    public String getNombre()
    {
        return nombre;
    }
    public void setSigno(String signo)
    {
        this.signo = signo;
    }
    public String getSigno()
    {
        return signo;
    }
    public void setVictoria()
    {
        victorias++;
    }
    public void setPerdidas()
    {
        perdidas++;
    }
    
    public abstract void establecerLetra();
    public abstract int elegirPosicion();
    
    @Override
    public String toString()
    {
        return "NOMBRE USUARIO : "+nombre+"\nVICTORIAS: "+victorias+"\nPERDIDAS: "+perdidas;
    }
    
}
