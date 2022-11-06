
package com.mycompany.js11;

/**
 *
 * @author Indah Chania 21343026
 */
public class Latihan1_Inheritance {
    private int a = 10;
    
    protected void terprotek(){
        System.out.println("Method ini hanya untuk anaknya");
    }
    
    public void info(){
        System.out.println("a = " + a);
        System.out.println("Dipanggil pada = " + this.getClass().getName());
    }
}
