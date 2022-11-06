package com.mycompany.js11;
/**
 *
 * @author Indah Chania 21343026
 */
public class UjiBus {
    public static void main(String args[]){
        //membuat objek busMini dari kelas bus
        Bus busMini = new Bus();
        
        //memasukan nilai jumlah penumpang dan
        //penumpang maksimal kedalam obkel busMini
        busMini.penumpang = 5;
        busMini.maxPenumpang = 15;
        
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menambahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang +5;
        //memanggil method cetak pada kelas bus
        busMini.cetak();
        
        //mengurangi jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang -2;
        //memanggil method cetak pada kelas Bus
        busMini.cetak();
        
        //menamvahkan jumlah penumpang pada busMini
        busMini.penumpang = busMini.penumpang + 8;
        busMini.cetak();
    }
}
