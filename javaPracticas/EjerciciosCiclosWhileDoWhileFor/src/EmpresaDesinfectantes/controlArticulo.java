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
public class controlArticulo {
    public int control(String codigo, int cant_Litros)
    {
        int sumLitros=0;
        if("1".equals(codigo))
        {
            sumLitros +=cant_Litros;
            return sumLitros;
        }
        else
        {
            return 0;
        }
        
    }
}
