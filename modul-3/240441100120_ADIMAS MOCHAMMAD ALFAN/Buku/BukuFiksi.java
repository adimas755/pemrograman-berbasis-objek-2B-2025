/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class BukuFiksi extends Buku{
    String genre;
    
    public BukuFiksi(String judul, String penulis, String genre){
        super(judul,penulis);
        this.genre = genre;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Genre : " + genre);
    }
}
