/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooArrayList;

/**
 *
 * @author alang
 */
public class Cuenta {
    
    private String name;
    private String password;
    private String nationality;
    private float pay;
    public Cuenta(String name, String password, String nationality)
    {
        this.name = name;
        this.password= password;
        this.nationality = nationality;
        this.pay = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }
    
    public void setPay(float pay)
    {
        this.pay+=pay;
    }
    public void showAccount ()
    {
        System.out.println("--------------------------");
        System.out.println("|TU CUENTA ");
        System.out.println("|NOMBRE: "+name);
        System.out.println("|NACIONALIDAD: "+nationality);
        System.out.println("|GASTO AL MOMENTO: $"+pay);
    }
    
    
}
