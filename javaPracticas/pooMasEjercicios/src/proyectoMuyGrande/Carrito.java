/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMuyGrande;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Carrito {
    private float precioTotal;
    private ArrayList<Pedido> pedidos;
    
    public Carrito()
    {
        pedidos = new ArrayList<>();
        precioTotal = 0;
    }
    public void setPedido(Pedido p)
    {
        pedidos.add(p);
        setPrecioTotal(p.getPrecio());
    }
    public ArrayList<Pedido> getPedidos()
    {
        return pedidos;
    }
    private void setPrecioTotal(float dinero)
    {
        precioTotal += dinero;
    }
    public float getPrecioTotal(){return precioTotal;}
    
    public void vaciarCarrito()
    {
        pedidos.clear();
        precioTotal = 0;
    }
    
    public void mostrarPedidos()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NADA AUN EN EL CARRITO");
        }
        else
        {
            System.out.println("-----CARRITO-----");
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
            System.out.println("PRECIO A PAGAR: $"+precioTotal);
        }
    }
    private boolean verificarLista()
    {
        return pedidos.isEmpty();
    }
}
