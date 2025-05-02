/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author Lenovo
 */
public class Menampilkan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Perpustakaan perpustakaan = new Perpustakaan();
        
        boolean lanjut = true;
        while (lanjut){
            System.out.println("\nMenu");
            System.out.println("1. Tambah buku Fiksi");
            System.out.println("2. Tambah Buku Non Fiksi");
            System.out.println("3. Lihat Koleksi Buku");
            System.out.println("4. Keluar");
            System.out.print("Pilih Menu (1-4): ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();
            
            switch (pilihan){
                case 1 -> {
                   String judulFiksi, penulisFiksi, genre;
                    
                    // Validasi Judul Fiksi
                    do {
                        System.out.println("Masukkan Judul Buku Fiksi: ");
                        judulFiksi = scanner.nextLine().trim();
                        if (judulFiksi.isEmpty()) {
                            System.out.println("Judul tidak boleh kosong!");
                        }
                    } while (judulFiksi.isEmpty());
                    
                    // Validasi Penulis Fiksi
                    do {
                        System.out.println("Masukkan Penulis Buku Fiksi: ");
                        penulisFiksi = scanner.nextLine().trim();
                        if (penulisFiksi.isEmpty()) {
                            System.out.println("Penulis tidak boleh kosong!");
                        }
                    } while (penulisFiksi.isEmpty());
                    
                    // Validasi Genre
                    do {
                        System.out.println("Masukkan Genre Buku Fiksi: ");
                        genre = scanner.nextLine().trim();
                        if (genre.isEmpty()) {
                            System.out.println("Genre tidak boleh kosong!");
                        }
                    } while (genre.isEmpty());
                    
                    BukuFiksi bukufiksi = new BukuFiksi(judulFiksi, penulisFiksi, genre);
                    perpustakaan.tambahBukuFiksi(bukufiksi);
                    System.out.println("Buku Fiksi berhasil ditambahkan.");
                }
                
                case 2 -> {
                    String judulNonFiksi, penulisNonFiksi, topik;
                    
                    // Validasi Judul Non Fiksi
                    do {
                        System.out.println("Masukkan Judul Buku Non Fiksi: ");
                        judulNonFiksi = scanner.nextLine().trim();
                        if (judulNonFiksi.isEmpty()) {
                            System.out.println("Judul tidak boleh kosong!");
                        }
                    } while (judulNonFiksi.isEmpty());
                    
                    // Validasi Penulis Non Fiksi
                    do {
                        System.out.println("Masukkan Penulis Buku Non Fiksi: ");
                        penulisNonFiksi = scanner.nextLine().trim();
                        if (penulisNonFiksi.isEmpty()) {
                            System.out.println("Penulis tidak boleh kosong!");
                        }
                    } while (penulisNonFiksi.isEmpty());
                    
                    // Validasi Topik
                    do {
                        System.out.println("Masukkan Topik Buku Non Fiksi: ");
                        topik = scanner.nextLine().trim();
                        if (topik.isEmpty()) {
                            System.out.println("Topik tidak boleh kosong!");
                        }
                    } while (topik.isEmpty());
                    
                    BukuNonFiksi bukunonfiksi = new BukuNonFiksi(judulNonFiksi, penulisNonFiksi, topik);
                    perpustakaan.tambahBukuNonFiksi(bukunonfiksi);
                    System.out.println("Buku Non Fiksi berhasil ditambahkan.");
                }
                    
                case 3 -> perpustakaan.tampilankoleksi();
                    
                case 4 -> {
                    lanjut = false;
                    System.out.println("=== Terima Kasih telah menggunakan program perpustakaan ===");
                }
                    
                default -> System.out.println("Pilihan Tidak Valid. Silahkan Pilih 1-4.");
            }
        }
        
        scanner.close();
    }
    
}
