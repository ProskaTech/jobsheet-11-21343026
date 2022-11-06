
package com.mycompany.js11;

/**
 *
 * @author Indah Chania 21343026
 */
public class B extends A {
    private int b;
    
    public void setB(int nilai){
        b = nilai;
    }
    
    private int getB(){
        return b;
    }
    //melakukan override terhadap method tampilkanNilai()
    //yang terhadap pada kelas A
    public void tampilkanNilai(){
        super.tampilkanNilai();
        System.out.println("Nilai b = " +getB());
    }
}
