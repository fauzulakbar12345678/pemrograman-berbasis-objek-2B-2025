package javaapplication12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fauzul
 */
public class kampus {
    String nama;
    String alamat;
    
    static int totalMhs = 0;
    
public kampus(String nama, String alamat){
    this.nama = nama;
    this.alamat = alamat;
}
public void infoKampus(){
    System.out.println("Nama Kampus: " + nama);
    System.out.println("Alamat Kampus: " + alamat);
    System.out.println("Total Mahaiswa: " + totalMhs);
}
public static boolean NamaKampus(String nama){
    return !nama.matches(".*\\d.*");
}
public static void tambahMhs(int jumlah){
    totalMhs += jumlah;
}
}
