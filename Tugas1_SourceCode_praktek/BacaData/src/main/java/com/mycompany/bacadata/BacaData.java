/*Putri Adelia A
 * 13020210226
 * B1
 *Hari/Tgl: Jumat, 10 Maret 2023
 *Waktu   : 11:46 PM*/

package com.mycompany.bacadata;
import java.util.Scanner;

/* contoh membaca integer menggunakan Class Scanner */
public class BacaData {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /* Kamus */
        int a;
        Scanner masukan;
        /* Program */
        System.out.print("Contoh membaca dan menulis, ketik nilai integer: \n");
        masukan = new Scanner(System.in);
        a = masukan.nextInt(); /* coba ketik : Apa akibatnya ? */
        System.out.print("Nilai yang dibaca : "+ a);
        
    }
}
