/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mahasiswa;

/**
 *
 * @author Lenovo
 */
import java.util.Scanner;

public class MahasiswaBeraksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Mahasiswa[] mahasiswakeep = new Mahasiswa[3];
        
        for (int i = 0; i < 3; i++){
            mahasiswakeep[i] = new Mahasiswa();
            System.out.println("masukkan data mahasiswa ke- " + (i + 1) + "=" );
            
            System.out.print(" nama = ");
            mahasiswakeep[i].isinama(input.nextLine());
            
            System.out.print(" nim = ");
            mahasiswakeep[i].isinim(input.nextLine());
            
            System.out.print(" prodi = ");
            mahasiswakeep[i].isiprodi(input.nextLine());
            
            System.out.print(" alamat = ");
            mahasiswakeep[i].isialamat(input.nextLine());
            
            System.out.println();
        }
        System.out.println(" Data Mahasiswa = ");
        for (Mahasiswa mahasiswa :  mahasiswakeep){
            mahasiswa.tampilanmhs();
        }
        
        input.close();
    }
    
}
