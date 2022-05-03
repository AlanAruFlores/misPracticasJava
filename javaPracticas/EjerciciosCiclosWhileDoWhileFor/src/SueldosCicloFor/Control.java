/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SueldosCicloFor;

/**
 *
 * @author alang
 */
public class Control {
    public float sueldoNuevo(float sueldo, float sueldoMaximo)
    {

        if(sueldo > sueldoMaximo)
        {
            return sueldo;
        }
        else
        {
            return sueldoMaximo;
        }
    }
}
