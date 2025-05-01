package perputakaan;

import java.util.Scanner;
import java.util.ArrayList;

class Buku{
    String judul;
    String penulis;
    
    public Buku(String judul, String penulis){
        this.judul = judul;
        this.penulis = penulis;
    
    }
    
    public void infoBuku(){
        System.out.println("Judul Buku : " + judul);
        System.out.println("Penulis Buku : " + penulis);
    }

}

class BukuFiksi extends Buku{
    String genre;
    
    public BukuFiksi(String judul, String penulis, String genre) {
        super(judul, penulis);
        this.genre = genre;
    }
    
    public void infoBukuFiksi(){
        super.infoBuku();
        System.out.println("Genre Buku : " + genre);
    }
    
    
}

class BukuNonFiksi extends Buku{
    String topik;

    public BukuNonFiksi(String judul, String penulis, String topik) {
        super(judul, penulis);
        this.topik = topik;
    }
    
    public void infoBukuNonFiksi(){
        super.infoBuku();
        System.out.println("Topik Buku : " + topik);
    }
    
    

}

class perpustakaan{
    ArrayList<BukuFiksi> koleksiF = new ArrayList<>();
    ArrayList<BukuNonFiksi> koleksiNF = new ArrayList<>();
    
    void tambahBukuFiksi(BukuFiksi b){
        koleksiF.add(b);
    }
    
    void tambahBukuNonFiksi(BukuNonFiksi bnf){
        koleksiNF.add(bnf);
    }
    
    void tampilkanSm(){
        System.out.println("=====Buku Fiksi=====");
        for(BukuFiksi b : koleksiF){
            b.infoBukuFiksi();
            System.out.println();
        }
        
        System.out.println("=====Buku Non Fiksi=====");
        for(BukuNonFiksi bnf : koleksiNF){
            bnf.infoBukuNonFiksi();
            System.out.println();
        }
    }

}

public class Perputakaan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        perpustakaan p = new perpustakaan();
        
        System.out.println("Masukkan jumlah Buku Fiksi");
        int jumlahF = input.nextInt();
        input.nextLine();
        
        for(int i=0;i<jumlahF;i++){
            System.out.println("\n Buku Fiksi ke-" + (i+1));
            System.out.println("Masukkan Judul Buku : ");
            String judul = input.nextLine();
            System.out.println("Masukkan nama penulis : ");
            String nama = input.nextLine();
            System.out.println("Masukkan Genre : ");
            String genre = input.nextLine();
            
            p.tambahBukuFiksi(new BukuFiksi(judul, nama, genre));
            
//            input.nextLine();
        }
        System.out.println("Masukkan jumlah Buku Non-Fiksi");
        int jumlahNF= input.nextInt();
        input.nextLine();
        
        for(int i = 0; i<jumlahNF; i++){
            System.out.println("\n Buku Non fiksi ke- " + (i+1));
            System.out.println("Masukkan Judul Buku : ");
            String judul = input.nextLine();
            System.out.println("Masukkan Penulis : ");
            String nama = input.nextLine();
            System.out.println("Masukkan Topik : ");
            String topik = input.nextLine();
            
            p.tambahBukuNonFiksi(new BukuNonFiksi(judul, nama, topik));
        }
        
//      
        
        p.tampilkanSm();
        
        
    }
    
}
