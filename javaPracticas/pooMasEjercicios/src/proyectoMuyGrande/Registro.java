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
public class Registro {
    private ArrayList<Pedido> pedidos;
    
    public Registro()
    {
        pedidos = new ArrayList<>();
    }
    
    public void setPedidos(Carrito c)
    {
        pedidos.addAll(c.getPedidos());
    }
    public void mostrarRegistro()
    {
        if(verificarLista())
        {
            JOptionPane.showMessageDialog(null,"REGISTRO VACIO");
        }
        else
        {
            for (Pedido pedido : pedidos) {
                System.out.println(pedido);
            }
        }
    }
    private boolean verificarLista()
    {
        return pedidos.isEmpty();
    }
}
