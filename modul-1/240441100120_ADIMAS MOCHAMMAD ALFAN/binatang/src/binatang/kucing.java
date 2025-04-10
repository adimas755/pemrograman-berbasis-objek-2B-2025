/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package binatang;

/**
 *
 * @author Lenovo
 */
class kucing {
    String nama;
    String jenis;
    String suara;

    void Setkucing(String n, String j, String s) {
        nama = n;
        jenis = j;
        suara = s;
    }

    void Tampilkankucing() {
        System.out.println("nama: " + nama);
        System.out.println("jenis: " + jenis);
        System.out.println("suara: " + suara);
    }
}

class burung {
    String nama;
    String jenis;
    String asal;

    void Setburung(String n, String j, String a) {
        nama = n;
        jenis = j;
        asal = a;
    }

    void Tampilkanburung() {
        System.out.println("nama: " + nama);
        System.out.println("jenis: " + jenis);
        System.out.println("asal: " + asal);
    }
}

class buaya {
    String nama;
    String jenis;
    String suara;

    void Setbuaya(String n, String j, String s) {
        nama = n;
        jenis = j;
        suara = s;
    }

    void Tampilkanbuaya() {
        System.out.println("nama: " + nama);
        System.out.println("jenis: " + jenis);
        System.out.println("suara: " + suara);
    }
}