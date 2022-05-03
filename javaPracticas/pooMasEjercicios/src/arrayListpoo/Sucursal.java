/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayListpoo;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Sucursal {
    private static int cont = 0;
    private int id;
    private String nombre;
    private ArrayList<Instrumento> instrumentos;
    
    public Sucursal(String nombre)
    {
        setId();
        this.nombre = nombre;
        instrumentos = new ArrayList<Instrumento>();
    }
    private void setId()
    {
        Sucursal.cont++;
        this.id = Sucursal.cont;
    }
    public int getID()
    {
        return id;
    }
    public void setInstrumento(Instrumento inst)
    {
        instrumentos.add(inst);
    }
    public int encontrarIndice(int id)
    {
        int indice = -1;
        int cont  = instrumentos.size();
        for (int i = 0 ; i<cont; i++) {
            if(instrumentos.get(i).getID() == id)
            {
                indice = i;
            }
        }
        if(indice == -1)
        {
            JOptionPane.showMessageDialog(null,"NO SE ENCONTRO EL INSTRUMENTO");
        }
        return indice;
    }
    public void mostrarInstrumentos()
    {
        if(verificarListaVacio())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN INSTRUMENTO EN ESTA SUCURSAL");          
        }
        else
        {
            for (Instrumento i : instrumentos) {
                System.out.println(i);
            }
        }
    }
    public void mostrarXTipo(Tipo tipo)
    {
        if(verificarListaVacio())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN INSTRUMENTO EN ESTA SUCURSAL");           
        }
        else  
        {
            System.out.println("INSTRUMENTOS DE TIPO "+tipo);
            for (Instrumento instrumento : instrumentos) {
                if(instrumento.getTipo() == tipo)
                {
                    System.out.println(instrumento);
                }
            }
        }
    }
    public void mostrarPorcentajes()
    {
        if(verificarListaVacio())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN INSTRUMENTO REGISTRADO");
        }
        else
        {
            int total = calcularTotalInstrumentos();
            int contPercucion = calcularCantTipo(Tipo.PERCUCION);
            int contViento = calcularCantTipo(Tipo.VIENTO);
            int contCuerda = calcularCantTipo(Tipo.CUERDA);
            
            double porcPercucion = calcularPorcentajeTipo(contPercucion, total);
            double porcViento = calcularPorcentajeTipo(contViento, total);
            double porcCuerda= calcularPorcentajeTipo(contCuerda, total);
            
            System.out.println("CANTIDAD DE ELEMENTOS TOTALES : "+total+"(100%)"
                    + "\nPORCENTAJE PERCUCION: %"+porcPercucion+""
                    + "\nPORCENTAJE VIENTO: %"+porcViento+""
                    + "\nPORCENTAJE CUERDA: %"+porcCuerda);
        }
    }
    public void borrarInstrumento( int indice)
    {
        if(verificarListaVacio())
        {
            JOptionPane.showMessageDialog(null,"NO HAY NINGUN INSTRUMENTO REGISTRADO EN ESTA SUCURSAL");
            
        }
        else
        {
            instrumentos.remove(indice);
        }

    }
    private double calcularPorcentajeTipo(int cont, int total)
    {
        return (cont * 100) / total;
    }
    private int calcularCantTipo(Tipo tipo)
    {
        int cont = 0;
        for (int i = 0; i < calcularTotalInstrumentos(); i++) {
            if(instrumentos.get(i).getTipo() == tipo)
            {
                cont++;
            }
        }
        return cont;
    }
    private int calcularTotalInstrumentos()
    {
        return instrumentos.size();
    }
    private boolean verificarListaVacio()
    {
        return (instrumentos.isEmpty() ? true : false);
    }
    @Override
    public String toString()
    {
        return "ID: "+id+"NOMBRE: "+nombre;
    }
}
