/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaDesinfectantes;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Sacar la factura de 5 articulos de limpieza
        
        //LLamo a al clase controlArticulos
        controlArticulos control = new controlArticulos();
        Void imprimir = new Void();
        controlArticulo verificarCodigo = new controlArticulo();
        //Definimos Variables
        final int articulo=5;
        int cant_Litros,i,sumLitros=0;
        String codigoArticulo;
        float prec_Litro,precio,precio_Total=0;
        boolean verificar;
        
        
        for(i=1; i<=articulo;i++)
        {
            precio = 0;
            codigoArticulo = JOptionPane.showInputDialog("Ingrese el codigo del articulo "+i);
            cant_Litros = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de litros vendida del articulo "+1));
            prec_Litro = Float.parseFloat(JOptionPane.showInputDialog("Digite el precio por litro"));

            sumLitros+=verificarCodigo.control(codigoArticulo,cant_Litros);
                       
            precio = (float) cant_Litros*prec_Litro;
            precio_Total +=precio;
            verificar = control.verificar(precio);
            
            
            System.out.println("Factura "+i+
            "\nCodigo del Articulo: "+codigoArticulo+
            "\nCantidad de Litro: "+cant_Litros+
            "\nPrecio del Articulo: $"+precio    
            );
            imprimir.imprimirPantalla(verificar,i);
            System.out.println("-----------------------------------");
            
        }
        
        
        
        System.out.println("Facturacion Total: $"+precio_Total);
        System.out.println("Total de Litros del Articulo 1: "+sumLitros);
        
        
        
        
    }
    
}
