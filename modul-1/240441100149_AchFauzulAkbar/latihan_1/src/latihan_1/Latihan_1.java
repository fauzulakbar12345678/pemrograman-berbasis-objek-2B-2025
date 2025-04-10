/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package latihan_1;

class Oreng{
    String nama;
    int umur;
    String alamat;
    
    public Oreng(String n, int u, String a){
        nama = n;
        umur = u;
        alamat = a;
        
    }
    
    void lari(){
        System.out.println(nama + " Sedang berlari");
    }
    
    void jalan(){
        System.out.println(nama + " Sedang berjalan");
    }
    
    void tampilkan(){
        System.out.println("Nama: " + nama + "\n" +
                "Umur: " + umur + "\n"+ 
                "Alamat: " + alamat);
    }
}



public class Latihan_1 {
    
    
    public static void main(String[] args) {
        Oreng oreng1 = new Oreng("Andi", 19, "Sukabumi");
        Oreng oreng2 = new Oreng("Sarep", 25, "Jakarta");
        Oreng oreng3 = new Oreng("Suip", 20, "Sumatra");
        Oreng oreng4 = new Oreng("Dini", 30, "Sukabumi");
        Oreng oreng5 = new Oreng("Andi", 19, "Papua");
        
        oreng1.tampilkan();
        oreng1.jalan();
        oreng1.lari();
        
        oreng2.tampilkan();
        oreng2.jalan();
        oreng2.lari();
        
        oreng3.tampilkan();
        oreng3.jalan();
        oreng3.lari();
        
        oreng4.tampilkan(); 
        oreng4.jalan();
        oreng4.lari();
        
        oreng5.tampilkan();
        oreng5.jalan();
        oreng5.lari();
    }
    
}
