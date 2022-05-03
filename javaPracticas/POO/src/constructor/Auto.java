/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor;

/**
 *
 * @author alang
 */
public class Auto {
    String marca;
    String color;
    int km;

    //Sobrecarga de Constructores, no me aparece error porque tienen diferentes cantidades de parametros.
    public Auto(String marca, String color, int km) {
        this.marca = marca;
        this.color = color;
        this.km =  km;
    }
    public Auto(int km)
    {
        this.km=km;
    }
    //Sobrecarga de Metodos
    //Aca estos metodos son diferentes ya que tienen distinto parametros, es decir, uno tiene parametros y el otro no
    public void arrancar()
    {
        System.out.println("Mi auto "+marca+" de color "+color+" esta arrancando a unos "+km);
    }
    public void arrancar(int kmArranque)
    {
        System.out.println("Mi auto arranca a unos "+kmArranque);
    }
    
    
    
}
