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
public class eleccionPrecio {
    public float precio_Articulo(int i, int cantLitros,int codigo)
    {
        float precio=0;
        float precioEuro=0;
        
        while (codigo <1 || codigo>3)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("ERROR\nIngrese el codigo del Articulo "+i));
        }
        
        switch(codigo)
        {
            case 1:    
            precio = (float) cantLitros * 0.6f;
            System.out.println("Factura "+i+
            "\nCodigo del Articulo: "+codigo+
            "\nCantidad de Litro: "+cantLitros+
            "\nPrecio del Articulo: $"+precio   
            );
            break;
            case 2: 
                precio = (float) cantLitros * 3f;

                System.out.println("Factura "+i+
                "\nCodigo del Articulo: "+codigo+
                "\nCantidad de Litro: "+cantLitros+
                "\nPrecio del Articulo: $"+precio
                );
            break;
            case 3:
                precio = (float) cantLitros * 1.52f;
                precioEuro = (float) cantLitros * 1.25f;
                System.out.println("Factura "+i+
                "\nCodigo del Articulo: "+codigo+
                "\nCantidad de Litro: "+cantLitros+
                "\nPrecio del Articulo: "+precioEuro+
                " Euros"  
                 );
            break;
        }
        
        return precio;
    }
}

        /*
        Precio de Entrada.
        byte eleccion;
        float precio=0;
        float precioEuro=0;
        
        
        eleccion = Byte.parseByte(JOptionPane.showInputDialog("Digite el precio del articulo "+i
        +"\n1.. 0,6$/Litro"
        +"\n2.. 3$/Litro"
        +"\n3.. 1,25 Euros"));
        
        while (eleccion <0 || eleccion>3)
        {
        eleccion = Byte.parseByte(JOptionPane.showInputDialog("ERROR\nDigite el precio del articulo "+i
        +"\n1.. 0,6$/Litro"
        +"\n2.. 3$/Litro"
        +"\n3.. 1,25 Euros"));
        }
        
        switch(eleccion)
        {
            case 1:    
            precio = (float) cantLitros * 0.6f;
            System.out.println("Factura "+i+
            "\nCodigo del Articulo: "+codigo+
            "\nCantidad de Litro: "+cantLitros+
            "\nPrecio del Articulo: $"+precio   
            );
            break;
            case 2: 
                precio = (float) cantLitros * 3f;

                System.out.println("Factura "+i+
                "\nCodigo del Articulo: "+codigo+
                "\nCantidad de Litro: "+cantLitros+
                "\nPrecio del Articulo: $"+precio
                );
            break;
            case 3:
                precio = (float) cantLitros * 1.52f;
                precioEuro = (float) cantLitros * 1.25f;
                System.out.println("Factura "+i+
                "\nCodigo del Articulo: "+codigo+
                "\nCantidad de Litro: "+cantLitros+
                "\nPrecio del Articulo: "+precioEuro+
                " Euros"  
                 );
            break;
        }
        
        return precio;
        */