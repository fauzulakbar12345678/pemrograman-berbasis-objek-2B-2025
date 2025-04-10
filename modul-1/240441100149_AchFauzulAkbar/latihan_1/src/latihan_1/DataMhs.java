/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihan_1;

import java.util.Scanner;

class Mhs{
    String nama;
    String nim;
    String alamat;
    String prodi;
    
    public void DataMhs(String n, String nm, String a, String p){
        nama = n;
        nim = nm;
        alamat = a;
        prodi = p;
    }
    
    public void tampilkan(){
        System.out.println("Nama " + nama);
        System.out.println("Nim " + nim);
        System.out.println("Alamat " + alamat);
        System.out.println("Prodi " + prodi);
    }

}

public class DataMhs {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Masukkan nama mahasiswa 1");
        String nama1 = input.nextLine();
        System.out.println("Masukkan nim mahasiswa 1");
        String nim1 = input.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa 1");
        String alamat1 = input.nextLine();
        System.out.println("Masukkan Prodi Mahasiswa 1");
        String prodi1 = input.nextLine();
        Mahasiswa mhs1 = new Mahasiswa(nama1, nim1, prodi1, alamat1);
        System.out.println();
        
         System.out.println("Masukkan nama mahasiswa 2");
        String nama2 = input.nextLine();
        System.out.println("Masukkan nim mahasiswa 2");
        String nim2 = input.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa 2");
        String alamat2 = input.nextLine();
        System.out.println("Masukkan Prodi Mahasiswa 2");
        String prodi2 = input.nextLine();
        Mahasiswa mhs2 = new Mahasiswa(nama2, nim2, prodi2, alamat2);
        System.out.println();
        
         System.out.println("Masukkan nama mahasiswa 3");
        String nama3 = input.nextLine();
        System.out.println("Masukkan nim mahasiswa 3");
        String nim3 = input.nextLine();
        System.out.println("Masukkan Alamat Mahasiswa 3");
        String alamat3 = input.nextLine();
        System.out.println("Masukkan Prodi Mahasiswa 3");
        String prodi3 = input.nextLine();
        Mahasiswa mhs3 = new Mahasiswa(nama3, nim3, prodi3, alamat3);
        System.out.println();
        
        System.out.println("Data mhs");
        mhs1.tampilkan();
        mhs2.tampilkan();
        mhs3.tampilkan();
        
        
        
        
        
    }
}
