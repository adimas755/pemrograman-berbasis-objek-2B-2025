/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package binatang;

/**
 *
 * @author Lenovo
 */
public class binatangtampilan {
    public static void main(String[] args) {
//      array berisi data yang dipanggil dengan index
        String[] namakucing = {"Meli", "britis", "gemi"};
        String[] jeniskucing = {"anggora", "merangau", "cina"};
        String[] suarakucing = {"miyauuu", "mi mi yauuu", "miyaw miyaw"};

        String[] namaburung = {"Rio", "satria", "sia"};
        String[] jenisburung = {"beo", "mini", "tekukur"};
        String[] asalburung = {"sumsel", "riau", "Jawa"};

        String[] namabuaya = {"josa", "bubub", "bina"};
        String[] jenisbuaya = {"cewek", "cowok", "muara"};
        String[] suarabuaya = {"halo sayang", "udah makan belum?", "rawrrr"};

        System.out.println("=== Hewan Kucing ===");
        for (int i = 0; i < 3; i++) {
            kucing k = new kucing();
            k.Setkucing(namakucing[i], jeniskucing[i], suarakucing[i]);
            System.out.println("Kucing " + (i + 1));
            k.Tampilkankucing();
            System.out.println();
        }

        System.out.println("=== Hewan Burung ===");
        for (int i = 0; i < 3; i++) {
            burung b = new burung();
            b.Setburung(namaburung[i], jenisburung[i], asalburung[i]);
            System.out.println("Burung " + (i + 1));
            b.Tampilkanburung();
            System.out.println();
        }

        System.out.println("=== Hewan Buaya ===");
        for (int i = 0; i < 3; i++) {
            buaya bu = new buaya();
            bu.Setbuaya(namabuaya[i], jenisbuaya[i], suarabuaya[i]);
            System.out.println("Buaya " + (i + 1));
            bu.Tampilkanbuaya();
            System.out.println();
        }
    }
}
