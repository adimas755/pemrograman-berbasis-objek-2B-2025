/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mahasiswa;

/**
 *
 * @author Lenovo
 */
public class Mahasiswa {
    String nama;
    String nim;
    String prodi;
    String alamat;
    
    public void isinama(String namaMahasiswa){
        nama = namaMahasiswa;
        
    }
        
    public void isinim(String nimMahasiswa){
        nim = nimMahasiswa;
        
    }
    
    public void isiprodi(String prodiMahasiswa){
        prodi = prodiMahasiswa;
        
    }
    
    public void isialamat(String alamatMahasiswa){
        alamat = alamatMahasiswa;
        
    }
    
    void tampilanmhs(){
        System.out.println(" nama = " + nama);
        System.out.println(" nim = " + nim);
        System.out.println(" prodi = " + prodi);
        System.out.println(" alamat = " + alamat);
    }
}