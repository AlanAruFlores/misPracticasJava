/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dependencia;

/**
 *
 * @author alang
 */
public class Impresora {
    private boolean encendida = false;
    
    public void encencder()
    {
        encendida = true;
    }
    public void apagar()
    {
        encendida = false;
    }
    
    public void imprimir(Documento doc)
    {
        if(encendida)
        {
            System.out.println("*****PRENDIDA*********"
                    + "\nIMPRIMIR DOCUMENTO: "+doc.getTitulo()+""
                    + "\n********************"
                    + "\n"+doc.getCuerpo()+""
                    + "\n********************");
        }
        else
        {
            System.out.println("ESTA APAGADA");
        }
    }
    
}
