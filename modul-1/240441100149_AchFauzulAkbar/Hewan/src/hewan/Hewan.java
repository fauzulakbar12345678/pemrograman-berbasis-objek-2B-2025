/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hewan;

class ular{
    String nama;
    String jenis;
    
   ular(String n, String j){
       nama = n;
       jenis = j;
   
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
    String nama;
    String jenis;
    
    kerbau(String n, String j){
         nama = n;
         jenis = j;
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
    String nama;
    String jenis;
    
    kucing(String n, String j){
         nama= n;
         jenis = j;
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
        for (int i = 1; i <= 3; i++){
            ular ulr = new ular("asep ", "cobra " );
            ulr.suara();
            ulr.info();
        }

        for(int i = 1; i <= 3; i++){
            kerbau kbr = new kerbau("soyo " , "jantan " );
            kbr.suara();
            kbr.info();
        }

        for(int i = 1; i <= 3; i++){
            kucing kc = new kucing("kilo " , "anggora "  );
            kc.suara();
            kc.info();
        }
    }
}
    

