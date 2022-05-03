/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EmpresaP2;

/**
 *
 * @author alang
 */
public class verificarMayor {
    public void verificacion(float precioArticulo,int idArticulo)
    {
        if(precioArticulo > 600)
        {
            System.out.println("La factura "+idArticulo+" emite mas de $600");
        }
        else
        {
            System.out.println("La factura "+idArticulo+" no emite mas de $600");
        }
    }
    
}
