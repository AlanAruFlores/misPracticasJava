/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passwordEjercicio;

/**
 *
 * @author alang
 */
public class Password {
   
    
    static String [] caracteres = {"A","a","B","b","C","c","D","d","E","e","F","f","G","g","H","h","I","i","J","j"
    ,"K","k","1","2","L","l","M","m","N","n","V","v","Q","q","3","4","5","6","7","8","9","0"};
    
    private int longitud;
    private String contraseña;
    
    public Password(int longitud){
        this.longitud = longitud;
        Password.generarContraseña(this);
    }
    public Password(){
        this(8);
    }
    public boolean esFuerte(){ 
        int cantMayus=0, cantMinus=0, cantDigitos=0;
        for (int i = 0; i < contraseña.length(); i++) {
            if(Character.isUpperCase(contraseña.charAt(i))){
                cantMayus++;
            }
            if(Character.isLowerCase(contraseña.charAt(i))){
                cantMinus++;
            }
            if(Character.isDigit(contraseña.charAt(i))){
                cantDigitos++;
            }
        }
        
        return cantMayus > 2 && cantMinus > 1 && cantDigitos >5;
    }
    public int getLongitud(){
        return longitud;
    }
    public void setContraseña(String nuevaContraseña){
        this.contraseña = nuevaContraseña;
    }
    public String getContraseña(){
        return contraseña;
    }
    
    private static int generarNumeroAleatorio(){
        return (int)(Math.random()*41+0);
    }
    private static void generarContraseña(Password pass){
        int numAleatorio = 0;
        String contraseñaNueva="";
        for (int i = 0; i < pass.getLongitud(); i++) {
            numAleatorio = generarNumeroAleatorio();
            contraseñaNueva+=caracteres[numAleatorio];
        }
        pass.setContraseña(contraseñaNueva);
    }
    
    @Override
    public String toString()
    {
        return "LONGITUD: "+this.longitud+" | CONTRASEÑA: "+this.contraseña+" | ES FUERTE: "+this.esFuerte();
    }
    
}
