/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pbo;

public class Main {
    public static void main(String[] args) {
        Kampus kampus = new Kampus("Universitas Trunojoyo Madura", "Jl. Telang. 1");

        MataKuliah mk1 = new MataKuliah("MK001", "PBO", 3);
        MataKuliah mk2 = new MataKuliah("MK002", "Basis Data", 3);
        MataKuliah mk3 = new MataKuliah("MK003", "Matematika", 2);
        MataKuliah mk4 = new MataKuliah("MK004", "Web", 3);

        Mahasiswa mhs1 = new Mahasiswa("Jaya", "2345677634", "SI");
        mhs1.tambahMatkul(mk1);
        mhs1.tambahMatkul(mk2);
        mhs1.tambahMatkul(mk3);
        mhs1.tambahMatkul(mk4);

        Mahasiswa mhs2 = new Mahasiswa("Somali", "2322334455", "SI");
        mhs2.tambahMatkul(mk1);
        mhs2.tambahMatkul(mk2);
        mhs2.tambahMatkul(mk3);
        mhs2.tambahMatkul(mk4);
        
        Mahasiswa mhs3 = new Mahasiswa("Jumrosali", "2344557788", "SI");
        mhs3.tambahMatkul(mk1);
        mhs3.tambahMatkul(mk2);
        mhs3.tambahMatkul(mk3);
        mhs3.tambahMatkul(mk4);
        
        Mahasiswa mhs4 = new Mahasiswa("Ambada", "2399885544", "SI");
        mhs4.tambahMatkul(mk1);
        mhs4.tambahMatkul(mk2);
        mhs4.tambahMatkul(mk4);
        mhs4.tambahMatkul(mk4);
        
        Mahasiswa mhs5 = new Mahasiswa("radri", "2488665544", "SI");
        mhs5.tambahMatkul(mk1);
        mhs5.tambahMatkul(mk2);
        mhs5.tambahMatkul(mk4);
        mhs5.tambahMatkul(mk4);
        
        Mahasiswa mhs6 = new Mahasiswa("salome", "2388768899", "SI");
        mhs6.tambahMatkul(mk1);
        mhs6.tambahMatkul(mk2);
        mhs6.tambahMatkul(mk4);
        mhs6.tambahMatkul(mk4);
        
        Mahasiswa[] daftarMahasiswa = {mhs1, mhs2,mhs3,mhs4,mhs5,mhs6};

        for (Mahasiswa m : daftarMahasiswa) {
            m.tampilkanBiodata();
        }

        Kampus.setTotalMahasiswa(Mahasiswa.getJumlahMahasiswa());
        kampus.tampilkanInfoKampus();
    }
}