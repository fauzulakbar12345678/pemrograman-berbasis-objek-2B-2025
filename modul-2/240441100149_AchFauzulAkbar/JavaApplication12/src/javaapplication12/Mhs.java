package javaapplication12;

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
    String jurusan;
    String daftarmatkul="";
    
    static int jumlahMhs=0;
public Mhs(String nama, String nim, String jurusan){
    if(validNim(nim)){
        throw new IllegalArgumentException("Nim tidak Valid");
}
        this.nama=nama;
        this.nim=nim;
        this.jurusan=jurusan;
    
        jumlahMhs++;
    }
    

public void tambahMatkul(String matakuliah){
    if(daftarmatkul.isEmpty()){
        daftarmatkul = matakuliah;
    
    }else{
        daftarmatkul +=", " + matakuliah;
    }
}
public void info(){
    if(nim != null){
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("jurusan: " + jurusan);
        System.out.println("Mata kuliah: " + daftarmatkul);
    }
}
public static int jumlahMhs(){
    return jumlahMhs;
}


public static boolean validNim(String nim){
   return nim.startsWith("23") && nim.length()==10;
}

 
}


