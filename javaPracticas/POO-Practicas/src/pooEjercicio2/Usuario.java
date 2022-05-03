/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooEjercicio2;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Usuario {
   private static int cont = 0 ;
   private int id;
   private String nombre;
   private String contraseña;
   private Nacionalidad nacionalidad;
   private Domicilio domicilio;
   private Tarjeta tarjeta;
   private Historial historial;
   private Carrito carrito;
                 
   public Usuario(String nombre,Nacionalidad nacionalidad, Domicilio domicilio, Tarjeta tarjeta, String cont)
   {
       setId();
       setNombre(nombre);
       this.nacionalidad = nacionalidad;
       this.domicilio = domicilio;
       this.tarjeta = tarjeta;
       this.contraseña = cont;
       historial = new Historial();
       carrito = new Carrito();
       
   }
   public void verHistorial()
   {
       historial.mostrarHistorial();
   }
   public void verCarrito()
   {
       carrito.mostrarLibros();
   }
   public void finalizarCompra(Libro l)
   {
       int cantidad = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE LIBRO A COMPRAR"));
       if(verificarCantidad(l, cantidad))
       {
           JOptionPane.showMessageDialog(null,"NO HAY STOCK DISPONIBLE");
       }
       else
       {
           l.setStock(false, cantidad);
           carrito.setLibro(l, cantidad);
           JOptionPane.showMessageDialog(null,"REALIZADO CON EXITO\nAGREGADO AL CARRITO");
       }
   }
   private boolean verificarCantidad(Libro l, int cantidad)
   {
       return l.getStock() < cantidad;
   }
   public int comprarLibro(ArrayList <Libro> libros)
   {
       int id = -1;
       if(libros.isEmpty())
       {
           JOptionPane.showMessageDialog(null,"NO HAY NINGUN LIBRO EXISTENTE POR EL MOMENTO");
       }
       else
       {
           verLibros(libros);
           id = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID A COMPRAR"));    
       }
       return id;
   }
   public void verLibros(ArrayList <Libro> libros)
   {
       for (Libro l : libros) {
           System.out.println(l);
       }
   }
   public void comprarCarrito()
   {
       if(carrito.verificarCarritoVacio() == false)
       {
           JOptionPane.showMessageDialog(null,"NO SE PUEDE COMPRAR EL CARRITO PORQUE ESTA VACIO");
       }
       else
       {
           if(verificarPago())
           {
               JOptionPane.showMessageDialog(null,"NO  HAY SALDO DISPONIBLE");
           }
           else
           {
               historial.setLibros(carrito);
               carrito.vaciarCarrito();
               tarjeta.setSaldo(false, carrito.calcularPago());
               JOptionPane.showMessageDialog(null,"COMPRADO CON EXITO");
           }
       }
   }
   public void cancelarCarrito()
   {
       cancelarCarrito();
   }
   public void recargarTarjeta()
   {
       double dinero = Double.parseDouble(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE DINERO A RECARGAR"));
       tarjeta.setSaldo(true, dinero);
   }
   private boolean verificarPago()
   {
       return carrito.calcularPago() > tarjeta.getSaldo();
   }
   
   //METODOS GETTERS Y SETTERS
   private void setId()
   {
       Usuario.cont++;
       this.id = cont;
   }
   public void setNombre(String nombre)
   {
       if(verificarNombre(nombre))
       {
           this.nombre = "Unnamed";
       }
       else
       {
           this.nombre = nombre;
       }
   }
   public String getContraseña()
   {
       return contraseña;
   }
   public String getNombre()
   {
       return nombre;
   }
   private boolean verificarNombre(String nombre)
   {
       return nombre.isEmpty() || nombre.isBlank() || nombre == null;
   }

    @Override
    public String toString() {
        return "Usuario{" + "id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", domicilio=" + domicilio + ", tarjeta=" + tarjeta + '}';
    }
   
   
}
