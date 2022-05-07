/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooElectrodomesticos;

/**
 *
 * @author alang
 */
public class Lavadora extends Electrodomestico{
    public static int CARGA_DEFECTO = 5;
    private int carga;
    
    public Lavadora(){
        super();
        this.carga = CARGA_DEFECTO;
    }
    public Lavadora(double precioBase, int pesoKg){
        super(precioBase, pesoKg);
        this.carga=CARGA_DEFECTO;
    }
    public Lavadora(double precioBase, int pesoKg, Letra letra, Color color, int carga){
        super(precioBase, pesoKg, letra, color);
        this.carga = carga;
    }
    
    public int getCarga(){
        return carga;
    }
    
    @Override
    public double calcularPrecioFinal(){
        return super.calcularPrecioFinal() + calcularCarga();
    }
    public double calcularCarga(){
        double precio  = 0;
        if(this.carga>30){
            precio = 50;
        }
        return precio;
    }
    
    
    @Override
    public void mostrarPrecioFinal(){
        System.out.println(this);
        System.out.println("EL PRECIO FINAL ES: "+calcularPrecioFinal());
    }
    @Override
    public String toString(){
        return super.toString()+" | CARGA: "+this.carga+" | LAVADORA";
    }
    
}
