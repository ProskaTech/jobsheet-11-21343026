package com.mycompany.js11;

/**
 *
 * @author Indah Chania 21343026
 */
public class Employ extends Person{
    private String noKaryawan;
    
    public Employ (String noKaryawan, String name, int age){
        super(name, age);
        this.noKaryawan = noKaryawan;
    }
    
    public void info(){
        System.out.println("No. karyawan : " +this.noKaryawan);
        super.info();
    }
}
