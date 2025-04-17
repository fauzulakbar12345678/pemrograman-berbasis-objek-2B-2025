package javaapplication12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fauzul
 */
public class MataKuliah {
    String kodeMK;
    String namaMK;
    int sks;

    public MataKuliah(String kodeMK, String namaMK, int sks) {
        this.kodeMK = kodeMK;
        this.namaMK = namaMK;
        this.sks = sks;
    }

    // Method statis untuk mengecek apakah jumlah SKS valid
    public static boolean isSKSValid(int sks) {
        return sks == 2 || sks == 3;
    }

    public String KodeMK() {
        return kodeMK;
    }

    public String NamaMK() {
        return namaMK;
    }

    public int SKS() {
        return sks;
    }

    public void Info() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + namaMK);
        System.out.println("Jumlah SKS: " + sks + (isSKSValid(sks) ? " (Valid)" : " (Tidak Valid)"));
    }

}
