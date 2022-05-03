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
public class Documento {
    private String titulo;
    private String cuerpo;
    
    public Documento(String titulo, String cuerpo)
    {
        this.titulo = titulo;
        this.cuerpo = cuerpo;
    }
    public String getTitulo()
    {
        return titulo;
    }
    public String getCuerpo()
    {
        return cuerpo;
    }
}
