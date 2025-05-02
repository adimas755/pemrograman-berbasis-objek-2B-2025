/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Lenovo
 */
public class BukuNonFiksi extends Buku{
    String topik;
    
    public BukuNonFiksi(String judul, String penulis, String topik){
        super(judul,penulis);
        this.topik = topik;
    }
    
    @Override
    public void info(){
        super.info();
        System.out.println("Topik : " + topik);
    }
}
