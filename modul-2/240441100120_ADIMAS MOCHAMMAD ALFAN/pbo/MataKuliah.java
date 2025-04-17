/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

public class MataKuliah {
    private String nama;
    private int sks;

    public MataKuliah(String kode, String nama, int sks) {
        if (!cekValidSKS(sks)) {
            throw new IllegalArgumentException("SKS tidak valid (harus 2 atau 3).");
        }
        this.nama = nama;
        this.sks = sks;
    }

    public String getNama() {
        return nama;
    }

    public int getSks() {
        return sks;
    }

    public static boolean cekValidSKS(int sks) {
        return sks == 2 || sks == 3;
    }
}
