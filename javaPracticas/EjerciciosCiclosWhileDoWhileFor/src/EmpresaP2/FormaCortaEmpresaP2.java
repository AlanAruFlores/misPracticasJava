/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaP2;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class FormaCortaEmpresaP2 {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int codigo, cantLitrosArt1=0,cantLitros;
        float precioArts, Euros, sumPrecios=0, contMayor600=0;
        for(int i=1; i<=5;i++){
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del Articulo"));
            if (codigo <1 || codigo>3){ 
                JOptionPane.showMessageDialog(null,"El codigo del articulo es Incorrecto");break;
            }          
            cantLitros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad que se vendio del articulo "+i));
            if(codigo == 1){
                precioArts = (float) cantLitros * 0.6f;
                cantLitrosArt1+=cantLitros;
                System.out.println("Factura "+i+
                "\nCodigo del Articulo: "+codigo+
                "\nCantidad de Litro: "+cantLitros+
                "\nPrecio del Articulo: $"+precioArts+
                "\n--------------------------------"
            );
            }
            else if(codigo==2){
                precioArts =(float) cantLitros * 3.0f;
                System.out.println("Factura "+i+
                "\nCodigo del Articulo: "+codigo+
                "\nCantidad de Litro: "+cantLitros+
                "\nPrecio del Articulo: $"+precioArts+
                "\n-----------------------------------"
            );
            }
            else{
                Euros = (float) cantLitros * 1.25f;
                precioArts = (float) cantLitros * 1.52f;
                System.out.println("Factura "+i+
                "\nCodigo del Articulo: "+codigo+
                "\nCantidad de Litro: "+cantLitros+
                "\nPrecio del Articulo: "+Euros+" Euros"+
                "\n-----------------------------------"
            );
            }
            sumPrecios+=precioArts;
            if(precioArts > 600){
                contMayor600++;
            }
        }
        System.out.println("Importe total de Factura: $"+sumPrecios);
        System.out.println("Cantidad de litros del Articulo 1: "+cantLitrosArt1);    
        System.out.println("Cantidad de Articulos mayores a 600$: "+contMayor600);    
    }
}
