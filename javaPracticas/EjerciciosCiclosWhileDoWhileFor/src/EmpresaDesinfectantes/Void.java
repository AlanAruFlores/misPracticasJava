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
public class Void {
    public void imprimirPantalla(boolean verificar, int idArticulo)
    {
        
       
        if (verificar == true)
        {
            System.out.println("La factura "+idArticulo+" emite mas de $600");
        }
        else
        {
            System.out.println("La factura "+idArticulo+" no emite mas de $600");
        }
    }
}
