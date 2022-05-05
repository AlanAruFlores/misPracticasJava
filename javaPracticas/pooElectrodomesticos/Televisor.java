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
public class Televisor extends Electrodomestico {
    static int RESOLUCION_DEFECTO = 20;
    static boolean SINTONIZADOR_DEFECTO = false;
    
    private int resolucion;
    private boolean tieneSintonizador;
    
    public Televisor(){
        super();
        this.resolucion = RESOLUCION_DEFECTO;
        this.tieneSintonizador = SINTONIZADOR_DEFECTO;
    }
    public Televisor(double precioBase, int pesoKg){
        super(precioBase,pesoKg);
        this.resolucion = RESOLUCION_DEFECTO;
        this.tieneSintonizador = SINTONIZADOR_DEFECTO;
    }
    public Televisor(double precioBase,int pesoKg, Color color, Letra letra, int resolucion, boolean tieneSintonizador){
        super(precioBase, pesoKg,letra,color);
        this.resolucion = RESOLUCION_DEFECTO;
        this.tieneSintonizador = SINTONIZADOR_DEFECTO;
    }
    
    @Override
    public double calcularPrecioFinal(){
        return super.calcularPrecioFinal() + calcularAumento();
    }
    private double calcularAumento(){
        double precio = 0;
        if(this.resolucion>40){
            precio += super.getPrecio() * 0.3;
        }
        if(this.tieneSintonizador){
            precio += 50;
        }
        return precio;
    }
    
}
