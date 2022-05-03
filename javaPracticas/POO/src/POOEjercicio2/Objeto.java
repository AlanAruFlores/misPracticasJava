/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package POOEjercicio2;

/**
 *
 * @author alang
 */
public class Objeto {
    private int nombre;

    public Objeto(int nombre)
    {
        this.nombre = nombre;
    }
    
    public int getMovimientoY(int movimiento, int movimientoY)
    {
        int movY = movimientoY;
        if(movimiento  != 1)
        {
            movY++;
        }
        else
        {
            movY--;
        }
        return movY;
    }
    public int getMovimientoX(int movimiento, int movimientoX)
    {
        int movX= movimientoX;
        if(movimiento == 2)
        {
            movX--;
        }
        else
        {
            movX++;
        }
        return movX;
    }
    
    public int getNombre()
    {
        return nombre;
    }
    
    
    
    
}
/*
package ClasesYObjetos;

public class Posicion {
    //Atributos
    private int ejeX;
    private int ejeY;
    //Metodos
    //Constructor
    public Posicion(int ejeX, int ejeY){
        this.ejeX = ejeX;
        this.ejeY = ejeY;
    }
    //Mover hacia arriba
    public void moverArriba(){
        ejeY += 1;
        System.out.println("DIRECCION HACIA ADELANTE");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia abajo
    public void moverAbajo(){
        ejeY -= 1;
        System.out.println("DIRECCION HACIA ABAJO");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia derecha
    public void moverDerecha(){
        ejeX += 1;
        System.out.println("DIRECCION HACIA DERECHA");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Mover hacia arriba
    public void moverIzquierda(){
        ejeX -= 1;
        System.out.println("DIRECCION HACIA IZQUIERDA");
        System.out.println("POSICION: ("+ejeX+","+ejeY+")");
    }
    //Getter posicion X
    public int getEjeX(){
        return ejeX;
    }
    //Getter posicion Y
    public int getEjeY(){
        return ejeY;
    }
}

Clase main: 

package ClasesYObjetos;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args){
        //Variable
        char proximoMov = '0';
        //Crear objeto con cordenadas iniciales x=0, y=0
        Posicion objeto = new Posicion(0,0);
        System.out.println("POSICION INICIAL: ("+objeto.getEjeX()+","+objeto.getEjeY()+")");
        while(proximoMov != 'E'){
            //Identificar el proximo movimiento
            do {                
                proximoMov = Character.toUpperCase(JOptionPane.showInputDialog("Ingrese el siguiente movimiento"+"\n"+"W-Adelante\n"+"S-Atras\n"+"A-Izquierda\n"+"D-Derecha\n"+"E-Salir\n ").charAt(0));
            } while ((proximoMov !='W')||(proximoMov !='A')||(proximoMov !='S')||(proximoMov !='D')||(proximoMov !='E'));
            //Realizar el movimiento
            switch(proximoMov){
                case 'W': 
                    objeto.moverArriba();
                    break;
                case 'S':
                    objeto.moverAbajo();
                    break;
                case 'A':
                    objeto.moverIzquierda();
                    break;
                case 'D': 
                    objeto.moverDerecha();
                    break;
                case 'E':
                    System.out.println("Gracias por jugar!");
                    break;
                default: 
                    System.out.println("Movimiento no reconocido");
                    break;
            }
        }
    }
}
*/