/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.manusia;

/**
 *
 * @author Lenovo
 */
public class Manusia {
    String nama;
    int umur;
    String alamat;
    
    void isivariabel(String namaManusia, int umurManusia, String alamatManusia){
        nama = namaManusia;
        umur = umurManusia;
        alamat = alamatManusia;
    }
    
    void printmanusia(){
        System.out.println(" nama = " + nama);
        System.out.println(" umur = " + umur);
        System.out.println(" alamat = " + alamat);
    }
    
    void berjalan(){
        System.out.println(nama + " sedang berjalan");
    }
    
    void berlari() {
        System.out.println(nama + " sedang berlari");
    }
}
