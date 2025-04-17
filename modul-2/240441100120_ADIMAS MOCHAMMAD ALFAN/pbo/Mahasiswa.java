package pbo;
import java.util.ArrayList;

public class Mahasiswa {
    String nama;
    String nim;
    String jurusan;
    ArrayList<MataKuliah> matkulDiambil;
    private static int jumlahMahasiswa = 0;

    public Mahasiswa(String nama, String nim, String jurusan) {
        this.nama = nama;
        this.nim = nim;
        this.jurusan = jurusan;
        this.matkulDiambil = new ArrayList<>();
        jumlahMahasiswa++;
    }

    public void tambahMatkul(MataKuliah mk) {
        matkulDiambil.add(mk);
    }

    public static int getJumlahMahasiswa() {
        return jumlahMahasiswa;
    }

    public boolean isValidNIM() {
        return nim != null && nim.length() == 10 && nim.startsWith("23") && nim.matches("\\d+");
    }

    public void tampilkanBiodata() {
        System.out.println("==== DATA MAHASISWA ====");
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Jurusan: " + jurusan);
        System.out.println("Status NIM: " + (isValidNIM() ? "VALID" : "TIDAK VALID"));
        System.out.println("Mata Kuliah yang diambil:");
        for (MataKuliah mk : matkulDiambil) {
            System.out.println("- " + mk.getNama());
        }
        System.out.println("Status: Sukses\n");
    }
}
