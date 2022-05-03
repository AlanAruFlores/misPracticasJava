/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package numeroPOO;

/**
 *
 * @author alang
 */
public class Main {
    public static void main(String[] args) {
        Numero num = new Numero("1234");
        /*
        String numero = "1234";
        String numIndex = String.valueOf(numero.charAt(0));
        int numeroConvertido = Integer.parseInt(numIndex);
        System.out.println(numeroConvertido);
        */
        System.out.println("CANTIDAD DE DIGITOS: "+num.getCantidadDigitos());
        System.out.println("SUMA DE SUS DIGITOS: "+num.calcularSumaDigitos());
        System.out.println("PRODUCTO DE SUS DIGITOS: "+num.calcularProductoDigitos());
        System.out.println("DIGITO DERECHO: "+num.calcularDigitoDerecho());
        System.out.println("DIGITO IZQUIEDO: "+num.calcularDigitoIzquiedo());
        System.out.println("DIGITO MAYOR: "+num.getDigitoMayor());
        System.out.println("DIGITO MENOR: "+num.getDigitoMenor());
        num.mostrarNumeroInvertido();
    }
}
