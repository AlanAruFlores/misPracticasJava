/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1;
import java.util.ArrayList;
/**
 *
 * @author alang
 */
public class Sucursal {
    private int id;
    private ArrayList<Auto> autos;
    private static int cont = 0;
    private float ganancias;
    public Sucursal()
    {
        setGanancias();
        cont++;
        id = Sucursal.cont;
        autos = new ArrayList<Auto>();
    }
  
    public int getId()
    {
        return id;
    }
    public float getGanancias()
    {
        return ganancias;
    }
    private void setGanancias()
    {
        ganancias = (float)(Math.random()*10000+5000);
    }
    public void setAuto(Auto a)
    {
        autos.add(a);
    }
    public void mostrarAutos()
    {
        System.out.println("SUCURSAL "+id);
        for (Auto a : autos) {
            System.out.println(a);
        }
    }
    @Override
    public String toString()
    {
        return "SUCURSAL "+id+" | GANANCIAS: $"+ganancias;
    }
}
