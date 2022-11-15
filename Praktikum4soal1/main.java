
package Praktikum4soal1;

import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        String judul;
        String penulis;
        int tahun;
        
        System.out.println("Judul:");
        judul=input.nextLine();
        
        System.out.println("Penulis:");
        penulis=input.nextLine();
        
        System.out.println("Tahun Terbit:");
        tahun= input.nextInt();
                
        buku buku2=new buku(judul,penulis,tahun);
        buku2.display();
    }
}
