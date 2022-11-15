/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Praktikum4soal2;

/**
 *
 * @author LENOVO
 */
public class Komik extends Buku{
   
    private final int volume;
    private final String sinopsis;
    String KomikDetail;
    
    public Komik(String j,String p,String t,int v,String s){
    this.judul=j;
    this.penulis=p;
    this.tahun=Integer.valueOf(t);
    this.volume=v;
    this.sinopsis=s;
    
    }     
    
    public String getKomikDetail() {
        return  "\nData yang baru diinputkan adalah \nSebuah novel bergenre " + volume + " dengan judul \""+ judul
                +"\". Novel tersebut ditulis oleh " + penulis + " dan diterbitkan pada tahun " + tahun + "\nSinopsis : " + sinopsis;
    }    

    
    

}
