/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejerciciosjava;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Cuadrilatero {
    private int lado1;
    private int lado2;
    private double area;
    private int perimetro;
    
    public Cuadrilatero(int lado1, int lado2)
    {
        setLado1(lado1);
        setLado2(lado2);
        setPerimetroAndArea(lado1,lado2);
    }
    public Cuadrilatero(int lado1)
    {
        this(lado1,0);
    }
    
    
    
    public void setLado1(int lado1)
    {
        this.lado1 = lado1;
    }
    public void setLado2(int lado2)
    {
        this.lado2 = lado2;
    }
    
    
    private boolean verificarLado(int lado1, int lado2)
    {
        return lado1 <=0 || lado2 <0;
    }
    
    private void setPerimetroAndArea(int lado1, int lado2)
    {
        if(verificarLado(lado1,lado2) != true)
        {
            if(lado2 == 0)
            {
                perimetro = lado1 * 4;
                area = lado1 * lado1;
            }
            else
            {
                perimetro = (lado1 + lado2) * 2;
                area = lado1*lado2;
            }
            
        }
        else
        {
            JOptionPane.showMessageDialog(null,"EL PERIMETRO y EL AREA NO SE PUEDE CALCULAR DEBIDO A SUS LADOS");
            
        }
    }
    
    public void mostrarDatos()
    {
        if(verificarLado(lado1,lado2))
        {
                System.out.println("NO SE MOSTRARA SU INFORMACION POR LADOS IRRONEOS");
        }
        else
            if(lado2 == 0)
        {
            System.out.println("CUADRADO"
                    + "\nLado1: "+lado1
                    + "\nLado2: "+lado2
                    + "\nPerimetro: "+perimetro+""
                    + "\nArea: "+area);
        }
        else
            {
                System.out.println("CUADRIALETRO:"
                        + "\nLado1:" +lado1
                        + "\nLado2:"+lado2
                        + "\nPerimetro: "+perimetro
                        + "\nArea: "+area);
                
            }

    }
    
}
