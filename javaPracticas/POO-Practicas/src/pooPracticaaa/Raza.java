/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPracticaaa;

/**
 *
 * @author alang
 */
public enum Raza {
    PITBULL(100),
    DOBERMAN(88); // public static final Raza DOBERMAN = new DOBERMAN();
    
    private int fuerzaMandibula;
    
    private Raza(int fuerzaMandibula)
    {
        this.fuerzaMandibula = fuerzaMandibula;
    }
    public int getFuerzaMandibula()
    {
        return fuerzaMandibula;
    }
}
