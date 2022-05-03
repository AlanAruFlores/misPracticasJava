/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author alang
 */
public class ProgramadorAlumno implements Programador, Alumno {
    
    @Override
    public void hablar()
    {
        System.out.println("HABLALNDO...");
    }
    @Override
    public void correr()
    {
        System.out.println("CORRIENDO...");
    }
    @Override
    public void estudiar()
    {
        System.out.println("ESTUDIANDO...");
    }
    @Override
    public void programar()
    {
        System.out.println("PROGRAMANDO....");
    }
   

}
