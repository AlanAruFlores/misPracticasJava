/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooPractica;
import javax.swing.JOptionPane;
/**
 *
 * @author alang
 */
public class Fabrica extends ComercioAutos{
 
    public Fabrica(String nombre)
    {
        super(nombre);
    }
    
    public void crearNuevoVehiculo()
    {
        String marca = JOptionPane.showInputDialog("DIGITE LA MARCA") ;
        String modelo = JOptionPane.showInputDialog("DIGITE EL MODELO") ;
        String patente = JOptionPane.showInputDialog("DIGITE EL PATENTE");
        
        int opcion;
        do
        {
            opcion = Integer.parseInt(JOptionPane.showInputDialog("DIGITE UNA OPCION"
                + "\n[1]AUTO"
                + "\n[2]MOTO")); 
        }while(opcion < 1 || opcion >2);

        
        Vehiculo vehiculoNuevo = null;
        if(opcion == 1)
        {
          boolean aireAcondicionado = Boolean.parseBoolean(JOptionPane.showInputDialog("DIGITE SI TIENE AIRE")) ;
          vehiculoNuevo = new Auto(marca,modelo,patente, aireAcondicionado);
        }
        else
        {
            boolean radio = Boolean.parseBoolean(JOptionPane.showInputDialog("DIGITE SI TIENE RADIO"));
            vehiculoNuevo  = new Moto(marca,modelo,patente, radio);
        }
        
        setVehiculo(vehiculoNuevo);
        
    }
    public void enviarVehiculosFabricados(Sucursal sucursal)
    {
        if(verificarVehiculos())
        {
            JOptionPane.showMessageDialog(null,"NO SE PUEDE ENVIAR NINGUN VEHICULO PORQUE ESTA VACIO");
        }
        else
        {
            for (Vehiculo vehiculo : vehiculos) {
                sucursal.setVehiculo(vehiculo);
            }
            vehiculos.clear();
            JOptionPane.showMessageDialog(null,"VEHICULOS ENVIADOS CON EXITO");
        }
    }
    @Override
    public String toString()
    {
        return super.toString()+" | FABRICA";
    }
}
