/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayList;

/**
 *
 * @author Lenovo
 */
public class Perpustakaan {
    ArrayList<BukuFiksi> koleksiFiksi;
    ArrayList<BukuNonFiksi> koleksiNonFiksi;
    
    public Perpustakaan(){
        koleksiFiksi = new ArrayList<>();
        koleksiNonFiksi = new ArrayList<>();
    }
    
    public void tambahBukuFiksi(BukuFiksi buku){
        koleksiFiksi.add(buku);
    }
    
    public void tambahBukuNonFiksi(BukuNonFiksi buku){
        koleksiNonFiksi.add(buku);
    }
    
    public void tampilankoleksi(){
        System.out.println("==== KOLEKSI BUKU FIKSI ====");
        if (koleksiFiksi.isEmpty()){
            System.out.println("Belum ada buku Fiksi");
        }else{
            for (BukuFiksi buku : koleksiFiksi){
                buku.info();
                System.out.println();
            }
        }
        
        
        System.out.println("==== KOLEKSI BUKU NON FIKSI ====");
        if (koleksiNonFiksi.isEmpty()){
            System.out.println("Belum ada buku Non Fiksi");
        }else{
            for (BukuNonFiksi buku : koleksiNonFiksi){
                buku.info();
                System.out.println();
            }
        }
        
    }
}
