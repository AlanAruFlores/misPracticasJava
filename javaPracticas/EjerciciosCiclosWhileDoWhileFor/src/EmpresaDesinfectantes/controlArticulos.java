/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaDesinfectantes;

/**
 *
 * @author alang
 */
public class controlArticulos {
    
    public boolean verificar(float precio)
    {
        if(precio > 600.00)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    
}
