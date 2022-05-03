package herenciaEscuela.Principal;
        
public enum Rango
{
    DIRECTOR("DIRECTOR",8000),
    PROFESOR("PROFESOR",4000);
    
    
    private String nombre;
    private double sueldo;
    
    
    private Rango(String nombre, double sueldo)
    {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }
    
    @Override
    public String toString()
    {
        return "RANGO: "+nombre+" | SUELDO: $"+sueldo;
    }
}