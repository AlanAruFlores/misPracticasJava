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
public abstract class Electrodomestico {
    private double precioBase;
    private int pesoKg;
    private Letra letra;
    private Color color;
    
    public Electrodomestico(){
        this(100, 5, null,null);
    }
    public Electrodomestico (double precioBase, int pesoKg){
        this(precioBase, pesoKg, null, null);
    }
    public Electrodomestico(double precioBase, int pesoKg, Letra letra, Color color){
        this.precioBase = precioBase;
        this.pesoKg = pesoKg;
        comprobarConsumoEnergetico(letra);
        comprobarColor(color);
    }
    
    public void comprobarConsumoEnergetico(Letra letra){
        if(letra == null)
            this.letra = Letra.F;
        else
            this.letra = letra;
    }
    public void comprobarColor(Color color){
        if(color == null)
            this.color = Color.BLANCO;
        else
            this.color = color;   
    }
    public double calcularPrecioFinal(){
        return this.precioBase + this.letra.getPrecio()+calcularTamaño();
    }
   
    private double calcularTamaño(){
        double precio = 0;
        if(this.pesoKg > 0 && this.pesoKg <=19){
            precio = 10;
        }
        else{
            if(this.pesoKg >= 20 && pesoKg <= 49){
                precio = 50;
            }
            if(this.pesoKg >= 50 && this.pesoKg<= 79){
                precio = 80;
            }
            if(this.pesoKg > 80){
                precio = 100;
            }
        }
        return precio;
    }
    public double getPrecio(){
        return this.precioBase;
    }
    
    public abstract void mostrarPrecioFinal();
    
    @Override
    public String toString(){
        return "PRECIO BASE: "+this.precioBase+" | PESO KG: "+this.pesoKg+" | Color: "+this.color+" | Letra: "+this.letra;
    }
}
