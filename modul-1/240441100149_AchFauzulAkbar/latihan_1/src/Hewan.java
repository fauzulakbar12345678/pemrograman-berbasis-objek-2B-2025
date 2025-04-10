/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
class ular{

    ular(String par, String par1) {
    }
    String nama;
    String jenis;
    
    void kucing(String n, String j){
        String nama = n;
        String jenis = j;
    }
    
    void suara(){
        System.out.println(nama + "bersuara ssss");
    }
    
    void info(){
        System.out.println("Ular: " + nama);
        System.out.println("Jenis: " + jenis);
        
    }

}

class kerbau{

    kerbau(String par, String par1) {
    }
    String nama;
    String jenis;
    
    void kerbau(String n, String j){
        String nama = n;
        String jenis = j;
    }
    void suara(){
        System.out.println(nama + "bersuara: moooo");
    
    }
    void info(){
        System.out.println("Kerbau: " + nama);
        System.out.println("Jenis: " + jenis);
    }

}

class kucing{

    kucing(String par, String par1) {
    }
    String nama;
    String jenis;
    
    void kucing(String n, String j){
        String nama= n;
        String jenis = j;
    }
    
    void suara(){
        System.out.println(nama + "bersuara: meong");
    }
    
    void info(){
        System.out.println("Kucing: " + nama);
        System.out.println("Jenis: " + jenis);
    }


}

public class Hewan {
    public static void main(String[] args) {
        for (int i = 1; i < 3; i++){
            ular ulr = new ular("Ular " + i, "Jenis " + i);
            ulr.suara();
            ulr.info();
        }

        for(int i = 1; i < 3; i++){
            kerbau kbr = new kerbau("Kerbau " + i, "Jenis " + i);
            kbr.suara();
            kbr.info();
        }

        for(int i = 1; i < 3; i++){
            kucing kc = new kucing("Kucing " + i, "Jenis " + i);
            kc.suara();
            kc.info();
        }
    }
}
        

