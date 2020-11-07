/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan34.kalkulator;

import java.util.Scanner;
/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung operasi 
 *                     penjumlahan,pengurangan,perkalian,pembagian,dan hasil sisa.
 */
public class PBOIF210119058Latihan34KALKULATOR {

    /**
     * @param args the command line arguments
     */
   
    
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       
        Kalkulator kalkulator = new Kalkulator();
        
        System.out.println("====Aplikasi Kalkulator Bilangan====");
        System.out.print("Masukkan Angka ke-1 : ");
        kalkulator.value1 = scanner.nextDouble();
        System.out.print("Masukkan Angka ke-2 : ");
        kalkulator.value2 = scanner.nextDouble();
        
        double tambah = kalkulator.tambahBilangan();
        double kurang = kalkulator.kurangBilangan();
        double kali = kalkulator.kaliBilangan();
        double bagi = kalkulator.bagiBilangan();
        double sisa = kalkulator.sisaBilangan();
        
        System.out.println("Hasil Pertambahan : " + tambah);
        System.out.println("Hasil Pengurangan : " + kurang);
        System.out.println("Hasil Perkalian : " + kali);
        System.out.println("Hasil Pembagian : " + bagi);
        System.out.println("Hasil Sisa : " + sisa);
        
        
    }
    
}
