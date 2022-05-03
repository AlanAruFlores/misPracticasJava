/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordEjercicio;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Main {
    static Password listaContraseñas[];
    static boolean listaFuertes[];
    
    
    public static void main(String[] args) {
        char letra = 200;
        System.out.println(letra);
        int longArray = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA LONGITUD DEL ARRAY"));
        listaContraseñas = new Password[longArray];
        listaFuertes = new boolean [longArray]; 

        generarContraseñas();
        almacenandoTipoSeguridad();
        mostrarContraseñas();
       
    }
    
    
    static void generarContraseñas(){
        for (int i = 0; i < listaContraseñas.length; i++) {
            boolean digitoSinDefecto = verificarDefecto();
            if(digitoSinDefecto){
                int longitud = Integer.parseInt(JOptionPane.showInputDialog("DIGITE LA CANTIDAD DE ENTEROS"));
                listaContraseñas[i] = new Password(longitud);
            }
            else{
                listaContraseñas[i] = new Password();
            }
        }
    }
    static void almacenandoTipoSeguridad(){
        for (int i = 0; i < listaFuertes.length; i++) {
            listaFuertes[i] = listaContraseñas[i].esFuerte();
        }
    }
    static void mostrarContraseñas(){ 
        for (Password contraseña : listaContraseñas) {
            System.out.println(contraseña);
        }
    }
    static boolean verificarDefecto(){
        boolean digitoXDefecto = false;
        String afirmar = JOptionPane.showInputDialog("DIGITE SI LA CONTRASEÑA TENDRA DIGITOS. "
                + "\nNO"
                + "\nSI");
        if(afirmar.equalsIgnoreCase("SI")){
            digitoXDefecto=true;
        }
        return digitoXDefecto;
    }
    
}
