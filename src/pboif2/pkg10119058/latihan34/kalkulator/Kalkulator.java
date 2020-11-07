/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119058.latihan34.kalkulator;

/**
 *
 * @author
 * NAMA     : Caraka Muhamad Rahman
 * KELAS    : PBOIF2
 * NIM      : 10119058
 * Deskripsi Program : Program ini berisi program untuk menghitung operasi 
 *                     penjumlahan,pengurangan,perkalian,pembagian,dan hasil sisa.
 */
public class Kalkulator {
    public double value1, value2;
   
   
    
    
    public double tambahBilangan() {
         return value1 + value2;
    }
    public double kurangBilangan() {
       return value1 - value2;
    }
    public double kaliBilangan() {
        return value1*value2;
    }
    public double bagiBilangan() {
       return value1/value2;
    }
    public double sisaBilangan() {
        return value1 % value2;
    }
    
}
