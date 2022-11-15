package Praktikum4soal1;

/**
 *
 * @author LENOVO
 */
public class buku {
    private String judul;
    private String penulis;
    private int tahun;
    
    public buku(String j, String p, int t){
        this.judul=j;
        this.penulis=p;
        this.tahun=t;
    
    }
    public String getJudul(){
    return judul;
    }
    public void setJudul(String judul){
    this.judul=judul;
    }
    
    public String getPenulis(){
    return penulis;
    }
    public void setPenulis(String penulis){
    this.penulis=penulis;
    }
    public int getTahun(){
    return tahun;
    }
   public void setTahun(int tahun){
    this.tahun=tahun;
   }
    
    public void display(){
        System.out.println("Detail buku:");
        System.out.println("Judul adalah " + getJudul());
        System.out.println("Penulis adalah " + getPenulis());
        System.out.println("Tahun Terbit adalah " + getTahun());
                
    }
    
    
}
