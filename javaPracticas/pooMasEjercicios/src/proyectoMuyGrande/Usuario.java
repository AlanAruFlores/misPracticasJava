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
public class Usuario {
    private static int cont=0;
    private int id;
    private String nombre;
    private String contraseña;
    private Tarjeta tarjeta;
    private Registro registro;
    private Carrito carrito;
    
    public Usuario(String nombre, String contraseña, Tarjeta t)
    {
        Usuario.cont++;
        id = Usuario.cont;
        this.nombre = nombre;
        this.contraseña = contraseña;
        this.tarjeta = t;
        registro = new Registro();
        carrito = new Carrito();
    }
    public String getNombre()
    {
        return nombre;
    }
    public String getContraseña()
    {
        return contraseña;
    }
    public void guardarPedidoCarrito(Pedido p)
    {
        carrito.setPedido(p);
    }
    public void verRegistro()
    {
        registro.mostrarRegistro();
    }
    public void verCarrito()
    {
        carrito.mostrarPedidos();
    }
    
    public void recargarSaldo(float dinero)
    {
        tarjeta.recargarSaldo(dinero);
    }
    public void pagarCarrito()
    {
        float precio = carrito.getPrecioTotal();
        JOptionPane.showMessageDialog(null,"COSTO A PAGAR: "+precio);
        
        boolean verificacion = tarjeta.efetuarPago(precio);
        vaciarCarrito(verificacion);
        if(verificacion == true)
        {
            JOptionPane.showMessageDialog(null,"PAGA EXITOSA CON TARJETA");           
        }
        else
        {
            JOptionPane.showMessageDialog(null,"PAGA NO EXITOSA, NO TIENE EL SALDO SUFICIENTE");
        }
    }
    private void vaciarCarrito(boolean verificacion)
    {
        if(verificacion == true)
        {
            registro.setPedidos(carrito);
            carrito.vaciarCarrito();
        }
    }
    private boolean verificarLista(ArrayList<Producto> producto)
    {
        return producto.isEmpty();
    }
    
    public String toString()
    {
        return nombre+" | CONTRASEÑA: "+contraseña+" | SALDO: "+tarjeta;
    }
}
