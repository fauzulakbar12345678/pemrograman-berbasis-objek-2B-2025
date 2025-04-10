/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package datamhs;

import java.util.Scanner;

class Mhs {
    String nama;
    String nim;
    String alamat;
    String prodi;

    
    Mhs(String n, String nm, String a, String p) {
        nama = n;
        nim = nm;
        alamat = a;
        prodi = p;
    }

    public void tampilkan() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Alamat: " + alamat);
        System.out.println("Prodi: " + prodi);
    }
}

public class DataMhs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        
        System.out.println("Masukkan nama mahasiswa 1:");
        String nama1 = input.nextLine();
        System.out.println("Masukkan NIM mahasiswa 1:");
        String nim1 = input.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa 1:");
        String alamat1 = input.nextLine();
        System.out.println("Masukkan Prodi Mahasiswa 1:");
        String prodi1 = input.nextLine();
        Mhs mhs1 = new Mhs(nama1, nim1, alamat1, prodi1);
        

        
        System.out.println("Masukkan nama mahasiswa 2:");
        String nama2 = input.nextLine(); 
        System.out.println("Masukkan NIM mahasiswa 2:");
        String nim2 = input.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa 2:");
        String alamat2 = input.nextLine();
        System.out.println("Masukkan Prodi Mahasiswa 2:");
        String prodi2 = input.nextLine();
        Mhs mhs2 = new Mhs(nama2, nim2, alamat2, prodi2);
//        

        
        System.out.println("Masukkan nama mahasiswa 3:");
        String nama3 = input.nextLine();
        System.out.println("Masukkan NIM mahasiswa 3:");
        String nim3 = input.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa 3:");
        String alamat3 = input.nextLine();
        System.out.println("Masukkan Prodi Mahasiswa 3:");
        String prodi3 = input.nextLine();
        Mhs mhs3 = new Mhs(nama3, nim3, alamat3, prodi3);
//        


        System.out.println("Data Mahasiswa:");
        System.out.println("===========");
        mhs1.tampilkan();
        System.out.println("===========");
        mhs2.tampilkan();
        System.out.println("===========");
        mhs3.tampilkan();
        System.out.println("===========");


    }
}