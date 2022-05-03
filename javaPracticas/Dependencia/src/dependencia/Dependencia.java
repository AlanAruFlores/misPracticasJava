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
public class Dependencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* DEPENDENCIA O USO
           Este tipo de relacion no es muy fuerte como la Asociacion ya que las clases no tendran atributo de tipo Objeto 
            sino que recibiran como parametro ese Objeto para realizar dicha accion
            Veamos este ejeemplo:
        */
        
        Documento doc = new Documento ("TItulo 1","Hola Como estas");
        Impresora impresora = new Impresora();
        impresora.encencder();
        impresora.imprimir(doc);
    }
    
}
