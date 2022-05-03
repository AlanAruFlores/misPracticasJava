/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EdadesYAltura;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class MediaEdadesyAltura {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Dadas las edades y alturas de 5 alumnos determinar el promedio de sus edades y altura
        y imprimir las cantidades de alumnos que son mayores a 18 años y miden 1.75m
        */
        Clase clase = new Clase();
        Verificador verificador = new Verificador();
        
        final int alumnos=5; 
        int i, edad, contEdad=0, contAltura=0,sumEdad=0;
        float altura, promedioEdad,promedioAltura, sumAltura=0f;
        boolean verificar=false, verificarMayores;
        
        for(i=1;i<=alumnos;i++) // i = i+1
        {
            edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la edad del alumno "+i));
            sumEdad+=edad;
            altura = Float.parseFloat(JOptionPane.showInputDialog("Ingrese la altura del alumno "+i+" en metros"));
            sumAltura+=altura;
            contEdad += clase.contador(edad);
            contAltura += clase.contadorAltura(altura);
        }
        
        promedioEdad = sumEdad / alumnos;
        promedioAltura = sumAltura / alumnos;

        verificar = verificador.verificadorEdad(contEdad);
        verificarMayores=verificador.verificadorAltura(contAltura);
        if(verificar == true && verificarMayores == true)
        {
            JOptionPane.showMessageDialog(null,"No hay edades mayores a 18 años");
            JOptionPane.showMessageDialog(null,"No hay mayores a 1.75m");
            JOptionPane.showMessageDialog(null,"Promedio Edad: "+promedioEdad);
            JOptionPane.showMessageDialog(null,"No hay mayores a 1.75m "+promedioAltura);

        }
        else
        {
            JOptionPane.showMessageDialog(null,"Promedio Edad: "+promedioEdad);
            JOptionPane.showMessageDialog(null,"Promedio Altura "+promedioAltura);
            JOptionPane.showMessageDialog(null,"Cantidad edades mayores a 18: "+contEdad);
            JOptionPane.showMessageDialog(null,"Cantidad alturas mayores a 1.75m: "+contAltura);
        }
        
        
    }
    
}
