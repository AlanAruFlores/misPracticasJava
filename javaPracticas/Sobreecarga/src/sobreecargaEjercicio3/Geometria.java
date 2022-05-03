/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sobreecargaEjercicio3;

/**
 *
 * @author alang
 */
public class Geometria {
    private int lado1;
    private int lado2;
    private int lado3;
    private int perimetro;
    
    public Geometria(int lado1, int lado2, int lado3)
    {
        setLados(lado1,lado2,lado3);
        setPerimetro(lado1,lado2,lado3);
    }
    public Geometria(int lado1, int lado2)
    {
        this(lado1,lado2,0);
    }
    
    private boolean verificarLados()
    {
        return lado1 > 0 && lado2 > 0 && lado3 == 0;
    }
    public void setLados(int lado1, int lado2, int lado3)
    {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;     
    }
    private void setPerimetro(int lado1, int lado2, int lado3)
    {
        if(verificarLados()!=true)
        {
            this.perimetro = lado1+lado2+lado3;
        }
        else
        {
            this.perimetro = (lado1*2)+(lado2*2);
        }
    }
    
    public void mostrarDatos()
    {
        if(verificarLados() != true)
        {
            System.out.println("TRIANGULO");
            System.out.println("LADO 1: "+lado1+"\nLADO 2: "+lado2+"\nLADO 3: "+lado3+"\nPERIMETRO: "+perimetro);
        }
        else
        {
            System.out.println("CUADRADO");
            System.out.println("LADO 1:"+lado1+"\nLADO 2: "+lado2+"\nPERIMETRO: "+perimetro);
        }
    }
    
}
