/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import entidades.Juego;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import entidades.*;
/**
 *
 * @author alang
 */
public class Usuario {
    private static int cont = 0;
    private int id;
    private String nombre; 
    private String contraseña;
    private String mail;
    private ArrayList<JuegoComprado> juegos;
    public Usuario(String mail, String contraseña)
    {
        Usuario.cont++;
        juegos = new ArrayList<JuegoComprado>();
        this.id = cont;
        this.contraseña = contraseña;
        this.mail = mail; 
        inicialzarNombre();
    }
    
    public void comprarJuegos(ArrayList<JuegoVenta> juegosVenta)
    {
        int opcion;
        for (JuegoVenta juegoVenta : juegosVenta) {
            System.out.println(juegoVenta);
        }
        opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE EL ID DEL JUEGO"));
        int indice = encontrarIndiceJuego(opcion, juegosVenta);
        if(indice != -1)
        {
            int stock = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD A COMPRAR"));
            juegosVenta.get(indice).setStock(false, stock);
            if(juegosVenta.get(indice).getStock()>=stock)
            {
                float importe = juegosVenta.get(indice).getPrecio() * stock;
                setJuego(new JuegoComprado(juegosVenta.get(indice).getNombre(), stock));
                JOptionPane.showMessageDialog(null,"IMPORTE A PAGAR: "+importe);           
            }
        }
        
    }
    private int encontrarIndiceJuego(int id, ArrayList<JuegoVenta> juegos)
    {
        int indice = -1 , cont = juegos.size();
        for (int i = 0; i < cont; i++) {
            if(juegos.get(i).getId() == id && juegos.get(i).getEstado() == true)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL JUEGO O NO ESTA DISPONIBLE");
        }
        return indice;
    }
    
    
    
    
    
    public String getNombre()
    {
        return nombre;
    }
    public String getContraseña(){
        return contraseña;
    }
    
    public void setJuego(JuegoComprado juego)
    {
        juegos.add(juego);
    }
    public void setMail(String mail)
    {
        if(verificarMail(mail))
        {
            JOptionPane.showMessageDialog(null,"ERROR");
        }
        else
        {
            this.mail = mail;
        }
    }
    private boolean verificarMail(String mail)
    {
        return mail == null || mail.isBlank() || mail.isEmpty() ;
    }
    private void inicialzarNombre()
    {
        String nombre = JOptionPane.showInputDialog("DIGITE SU NOMBRE: ");
        
        if(verificarNombre(nombre))
        {
            this.nombre = "USER"+Usuario.cont;
        }
        else
        {
            this.nombre = nombre;
        }
    }
    private boolean verificarNombre(String nombre)
    {
        return nombre.isEmpty() || nombre.isBlank() || nombre == null;
    }
    
    @Override
    public String toString()
    {
        return nombre+" | "+mail;
    }

}
