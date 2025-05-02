/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class Tampilan {
    public static void main(String[] args) {
        System.out.println("==== DATA MAHASISWA REGULER ====");
        Mahasiswa reguler1 = new MahasiswaReguler("Bejo","240441100001","TI-2A");
        Mahasiswa reguler2 = new MahasiswaReguler("Benjo","240441100002","TI-2B");
        
        reguler1.infoMahasiswa();
        System.out.println();
        reguler2.infoMahasiswa();
        System.out.println();
        
        System.out.println("==== DATA MAHASISWA BEASISWA ====");
        Mahasiswa beasiswa1 = new MahasiswaBeasiswa("Lila","240441100003","Beasiswa prestasi");
        Mahasiswa beasiswa2 = new MahasiswaBeasiswa("Linda","240441100004","Beasiswa Bidikmisi");
        
        beasiswa1.infoMahasiswa();
        System.out.println();
        beasiswa2.infoMahasiswa();
        System.out.println();
    }
}
