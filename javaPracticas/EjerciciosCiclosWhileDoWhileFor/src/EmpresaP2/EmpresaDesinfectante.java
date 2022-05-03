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
public class EmpresaDesinfectante {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hacer igual al anterior ejercicio suponiendo que el precio no se introduce
        // Llamamos a la clase eleccioPrecio
        eleccionPrecio precioSelectivo = new eleccionPrecio();
        verificarMayor control = new verificarMayor();
        Control controlArticulo = new Control();
        final int articulos=5;
        int cantLitros, i, sumLitros=0,codigo;
        float precioArticulo, sumArticulo=0;

        
        for (i=1;i<=articulos;i++)
        {
            cantLitros = Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de litros que se vendio "
            + "en el Articulo "+i));
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Digite el codigo del articulo n°"+i));
            precioArticulo = precioSelectivo.precio_Articulo(i, cantLitros,codigo);

 
            sumArticulo += precioArticulo;
            
            control.verificacion(precioArticulo,i);
            System.out.println("------------------------");
            sumLitros += controlArticulo.controlCodigo(codigo, cantLitros);
            
        }
        System.out.println("Importe total de la Factura de los Articulos:$ "+sumArticulo);
        System.out.println("El total de Litros de los Articulos 1 es: "+sumLitros+" Litros");
        
        
    }
    
}
/*
//Modificaciones al ejercicio anterior.Cambio en los precios por codigo
        //1) 0,6 $/litro
        //2) 3 $/litro
        //3) 1,25 $/litro
        //Ejercicio 17: Una empresa que se dedica a la venta de desinfectantes necesita un programa para gestionar las facturas.
        //En cada factura figura: el código del artículo, la cantidad vendida en litros y el precio por litro. Se pide de 5 facturas introducidas: 
        //Facturación total, cantidad en litros vendidos del artículo 1 y cuantas facturas se emitieron de más de $600.

        int codigo,litros,litrosArt1=0,conteomayor600=0;
        float precioLitro,importeFactura=0,factT=0;

        Scanner in = new Scanner(System.in);

        for(int i=1;i<=5;i++){
            System.out.print("Articulo N#"+i+"\nIngrese el codigo del producto: "); codigo = in.nextInt();
            System.out.print("Articulo N#"+i+"\nIngrese la cantidad de litros: "); litros = in.nextInt();
            System.out.println("\n\n");

            //importeFactura =(float) litros*precioLitro;//Importe por factura

            switch (codigo) {
                case 1:
                    precioLitro = 0.6f;
                    litrosArt1 += litros;
                    importeFactura = (float)(precioLitro*litros);
                    break;
                case 2:
                    precioLitro = 3f;
                    importeFactura = (float)(precioLitro*litros);
                    break;
                case 3:
                    precioLitro = 1.25f;
                    importeFactura = (float)(precioLitro*litros);
                    break;
                default:
                    break;
            }
            

            factT += importeFactura;//Facturacion total
            if(importeFactura>600){
                conteomayor600++;
            }

        }

        System.out.println("\nResumen de ventas\n");
        System.out.println("Facturacion Total : "+factT);
        System.out.println("Cantidad de litros vendidos del articulo 1: "+litrosArt1);
        System.out.println("Cantidad de facturas que superan los $600: "+conteomayor600);
*/