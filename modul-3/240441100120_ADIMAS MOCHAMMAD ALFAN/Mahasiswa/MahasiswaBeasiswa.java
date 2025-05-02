/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class MahasiswaBeasiswa extends Mahasiswa{
    String joinBeasiswa;
    
    public MahasiswaBeasiswa(String nama, String nim, String joinBeasiswa){
        super(nama,nim);
        this.joinBeasiswa = joinBeasiswa;
    }
    
    @Override
    public void infoMahasiswa(){
        super.infoMahasiswa();
        System.out.println("Jenis Beasiswa : " + joinBeasiswa);
    }
}
