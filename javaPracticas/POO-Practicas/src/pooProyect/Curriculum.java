/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooProyect;

/**
 *
 * @author alang
 */
public class Curriculum {
    private String infoPersona;
    private String descripcion;
    
    public Curriculum(String infoPersona , String descripcion){
        setDescripcion(descripcion);
        this.infoPersona = infoPersona;
        
    }
    public void setDescripcion(String descripcion){
        if(verificarDescripcionVacia(descripcion)){
            this.descripcion = "DESCRIPCION VACIA";
        }
        else{
            this.descripcion = descripcion;
        }
    }
    private boolean verificarDescripcionVacia(String descripcion){
        return descripcion ==null || descripcion.isEmpty() || descripcion.isBlank();
    }
}
