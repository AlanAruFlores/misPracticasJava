package entidades;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.HashSet;
import java.util.Set;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class JuegoVenta extends Juego {
    private static int cont;
    private int id;
    private float precio;
    private int stock;
    private boolean estado; // false;
    
    public JuegoVenta(String nombre, float precio, int stock)
    {
        super(nombre);
        JuegoVenta.cont++;
        this.id = JuegoVenta.cont;
        this.precio = precio;
        inicializarStock(stock);
       
    }
    

    public float getPrecio()
    {
        return precio;
    }
    public int getId()
    {
        return id;
    }
    private void inicializarStock(int stock)
    {
        if(verificarStock(stock))
        {
            this.stock = 0;
            this.estado=false;
        }
        else
        {
            this.stock = stock;
            this.estado = true;
        }
    }
    private void setEstado()
    {
        if(verificarStock())
        {
            this.estado = false;
        }
        else
        {
            this.estado  = true;
        }
    }
    public boolean getEstado()
    {
        return estado;
    }
    private boolean verificarStock(int stock)
    {
        return stock <= 0 ;
    }
    private boolean verificarStock()
    {
        return this.stock <= 0;
    }
    
    private boolean verificarStock2(int stock){
        return this.stock < stock;
    }
    
    public void setStock(boolean accion, int stock)
    {
        if(accion == true)
        {
            this.stock+= stock;
        }
        else
        {
            if(verificarStock2(stock))
            {
               JOptionPane.showMessageDialog(null,"ERROR");
            }
            else
            {
                this.stock -= stock;
            }

        }
        setEstado();
    }

    @Override
    public String toString() {
        return "Juego{" + "id=" + id +" nombre= "+super.toString()+" precio=" + precio + ", stock=" + stock + ", estado=" + estado + '}';
    }
    
    
}
