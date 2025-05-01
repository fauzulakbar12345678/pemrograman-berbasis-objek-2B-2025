/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fauzul
 */
public class Mhs {
    String nama;
    String nim;
    
    public Mhs(String nama, String nim){
        this.nama = nama;
        this.nim = nim;
    }
    
    public void InfoMhs(){
        System.out.println("Nama : " + nama);
        System.out.println("NIM : " + nim);
    }
}
