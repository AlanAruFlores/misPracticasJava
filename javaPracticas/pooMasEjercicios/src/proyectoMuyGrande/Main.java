/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoMuyGrande;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JOptionPane;
import java.util.Scanner;
/**
 *
 * @author alang
 */
public class Main {
    
 
    public static void main(String [] args)
    {
        ArrayList <Producto> productos = new ArrayList<Producto>();
        ArrayList<Usuario> usuarios = new ArrayList<>();
        int opcion;
        do
        {
            opcion = ingresarOpcion();
            switch(opcion)
            {
                case 1:
                {
                    usuarios.add(registrarUsuario());
                    break;
                }
                case 2:
                {
                    int indice;
                    Scanner entrada = new Scanner(System.in);
                    String nombre , contraseña;
                    System.out.println("NOMBRE: ");
                    nombre = entrada.nextLine();
                    System.out.println("CONTRASEÑA: ");
                    contraseña = entrada.nextLine();
                    indice = encontrarIndiceUsuario(nombre, contraseña, usuarios);
                    
                    if(indice != -1)
                    {
                        mostrarMenuUsuario(usuarios.get(indice), productos);
                    }
                    break;
                }
                case 3:
                {
                    mostrarMenuAdministrador(usuarios, productos);
                    break;
                }
                case 4:
                {
                    mostrarMensaje("SALIENDO");
                }
            }
        }while(opcion !=4);
        
    }
    
    //METODOS ADMINISTRADOR
    public static void mostrarMenuAdministrador(ArrayList<Usuario> usuarios, ArrayList<Producto> productos){
        int opcion;
        do
        {
            opcion = ingresarOpcionAdministrador();
            switch(opcion)
            {
                case 1:
                {
                    mostrarUsuarios(usuarios);
                    break;
                }
                case 2:
                {
                    mostrarProductos(productos);
                    break;
                }
                case 3:
                {
                    productos.add(registrarProducto());
                    break;
                }
                case 4:
                {
                    mostrarMensaje("SALIENDO....");
                }
            }
        }while(opcion != 4);
       
                 
    }
    public static Producto registrarProducto()
    {
        String nombre = inputString("DIGITE EL NOMBRE");
        float precio = inputFloat("DIGITE EL PRECIO");
        int stock = inputInt("DIGITE EL STOCK");
        return new Producto(nombre, precio , stock);
    }
    public static void mostrarProdcutos(ArrayList<Producto> productos)
    {
        if(verificarListaProductos(productos))
        {
            mostrarMensaje("NO HAY NINGUN PRODUCTO REGISTRADO");
        }
        else{
            System.out.println("----PRODUCTOS----");
            for (Producto producto : productos) {
                System.out.println(producto);
            }
        }
    }
    private static boolean verificarListaProductos(ArrayList<Producto>productos)
    {
        return productos.isEmpty();
    }
    public static void mostrarUsuarios(ArrayList<Usuario>users)
    {
        if(verificarListaUsuario(users))
        {
            mostrarMensaje("NO HAY NADA EN LA LISTA");
        }
        else
        {
            System.out.println("----USUARIOS----");
            for (Usuario user : users) {
                System.out.println(user);
            }
        }
    }
    private static boolean verificarListaUsuario(ArrayList<Usuario>lista)
    {
        return lista.isEmpty();
    }
    public static int ingresarOpcionAdministrador()
    {
        int opcion;
        do
        {
            opcion = inputInt("DIGITE UNA OPCION \n[1]MOSTRAR USUARIOS\n[2]MOSTRAR PRODUCTOS\n[3]REGISTRAR PRODUCTOS\n[4]SALIR");
            
            
        }while(opcion<1 || opcion >4);
        return opcion;
    }
    
    
    //METODOS SECUNDARIOS
    public static void mostrarMenuUsuario(Usuario user, ArrayList<Producto> productos)
    {
        int opcion;
        do
        {
            opcion = ingresarOpcionUsuario();
            
            switch(opcion)
            {
                case 1:
                {
                    int id, indice, cantidad;
                    if(productos.isEmpty()== false)
                    {                   
                        mostrarProductos(productos);
                        id = inputInt("DIGITE EL ID DEL PRODUCTO");
                        indice= encontrarIndiceProducto(id, productos);
                        if(indice != -1)
                        {
                            cantidad = inputInt("DIGITE LA CANTIDAD DE PRODUCTOS A COMPRAR");
                            if(cantidad > productos.get(indice).getStock())
                            {
                                JOptionPane.showMessageDialog(null,"NO SE EXCEDER DE LA CANTIDAD YA ESTABLECIDA");
                            }
                            else
                            {
                                Pedido p = new Pedido(productos.get(indice), cantidad);
                                user.guardarPedidoCarrito(p);
                                productos.get(indice).setStock(productos.get(indice).getStock() - cantidad);
                                mostrarMensaje("SE GUARDO CON EXITO EL PRODUCTO EN EL CARRITO");
                            }
                        }
                    }
                    else
                    {
                        mostrarMensaje("NO HAY DISPONIBLE NINGUN PRODUCTO");
                    }
                    break;
                }
                case 2:
                {
                    user.verCarrito();
                    break;
                }
                case 3:
                {
                    user.verRegistro();
                    break;
                }
                case 4:
                {
                    float dinero  = inputFloat("DIGITE LA CANTIDAD DE DINERO A RECARGAR LA TARJETA"); 
                    user.recargarSaldo(dinero);
                    break;
                }
                case 5:
                {
                    System.out.println(user);
                    break;
                }
                case 6:
                {
                    user.pagarCarrito();
                    break;
                }
                case 7:
                {
                    mostrarMensaje("SALIENDO");
                }
            }
        }while(opcion != 7);
        
    }
    public static int encontrarIndiceProducto(int id, ArrayList<Producto> productos)
    {
        int cont = productos.size();
        int indice = -1;
        for (int i = 0; i < cont; i++) {
            if(id == productos.get(i).getId())
            {
                if(productos.get(i).getEstado() == Estado.DISPONIBLE)
                {
                    indice = i;
                }
            } 
        }
        if(indice == -1)
        {
            mostrarMensaje("NO SE PUDO ENCONTRAR EL PRODUCTO O NO ESTA DISPONIBLE");
        }
        
        return indice;
    }
    public static int ingresarOpcionUsuario()
    {
        int opcion;
        do
        {
            opcion = inputInt("DIGITE UNA OPCION: \n[1]COMPRAR PRODUCTO\n[2]VER CARRITO\n[3]VER REGISTRO"
                    + "\n[4]RECARGAR TARJETA\n[5]VER INFORMACION\n[6]PAGAR CARRITO\n[7]SALIR");
            
        }while(opcion < 1 || opcion >7);
        return opcion;
    }
    public static void mostrarProductos(ArrayList<Producto> productos)
    {
        for (Producto producto : productos) {
            System.out.println(producto);
        }
    }
    private static boolean verificarLista(ArrayList<Producto> productos)
    {
        return productos.isEmpty();
    }
    //METODOS PRINCIPALES
    public static int encontrarIndiceUsuario(String nombre, String contraseña, ArrayList<Usuario> usuarios)
    {
        int indice = -1, cont = usuarios.size();
        
        for (int i = 0; i < cont; i++) {
            if(nombre.equals(usuarios.get(i).getNombre()) && contraseña.equals(usuarios.get(i).getContraseña()))
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
           mostrarMensaje("NO SE ENCONTRO EL USUARIO");
        }
        return indice;
    }
    public static Usuario registrarUsuario()
    {
        String nombre = inputString("DIGITE EL NOMBRE");
        String contraseña = inputString("DIGITE LA CONTRASEÑA");
        Tarjeta t = registrarTarjeta();
        
        return new Usuario (nombre, contraseña, t);
    }
    public static Tarjeta registrarTarjeta()
    {
        Tipo tipo =null;
        int opcion;
                
        do
        {
            opcion = inputInt("DIGITE UNA OPCION:\n[1]"+Tipo.MASTERCARD+"\n[2]"+Tipo.NACION);
        }while(opcion< 1 || opcion >2);
        
        switch (opcion)
        {
            case 1:
            {
                tipo = Tipo.MASTERCARD;
            }
            case 2:
            {
                tipo = Tipo.NACION;
            }
        }
        return new Tarjeta(tipo);
    }
    public static int ingresarOpcion()
    {
        int opcion;
        do
        {
            opcion = inputInt("DIGITE UNA OPCION\n[1]CREAR USUARIO\n[2]LOGIN\n[3]ADMINISTRACION\n[4]SALIR");
        }while(opcion < 1 || opcion >4);
        
            
        return opcion;
    }
    public static Producto agregarProducto()
    {
       String nombre = inputString("INGRESE EL NOMBRE");
       int stock = inputInt("DIGITE EL STOCK");
       float precio = inputFloat("DIGITE EL PRECIO");
       
       return new Producto( nombre, precio ,stock);
    }
    
    
    
    
    //METODOS PARA ENTRADA / SALIDA DATOS
    public static void mostrarMensaje(String contenido)
    {
        JOptionPane.showMessageDialog(null,contenido);
    }
    public static String inputString(String contenido)
    {
        return JOptionPane.showInputDialog(contenido);
    }
    public static int inputInt(String contenido)
    {
        return Integer.parseInt(JOptionPane.showInputDialog(contenido));
    }
    public static float inputFloat(String contenido)
    {
        return Float.parseFloat(JOptionPane.showInputDialog(contenido));
    }
    
}
