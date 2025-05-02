/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MahasiswaReguler extends Mahasiswa {
    String kelas;
    
    public MahasiswaReguler(String nama, String nim, String kelas){
        super(nama,nim);
        this.kelas = kelas;
    }
    
    @Override
    public void infoMahasiswa() {
        super.infoMahasiswa();
        System.out.println("Kelas : " + kelas);
    }
}
