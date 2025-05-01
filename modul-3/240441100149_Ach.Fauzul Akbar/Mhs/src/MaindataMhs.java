/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fauzul
 */
public class MaindataMhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MhsReguler mahasiswaRgl1 = new MhsReguler("Andi", "123", "4b");
        MhsReguler mahasiswaRgl2 = new MhsReguler("Budi", "345", "5a");
        
        System.out.println("=====Mahasiswa Reguler=====");
        
        mahasiswaRgl1.InfoMhsReguler();
        System.out.println();
        mahasiswaRgl2.InfoMhsReguler();
        System.out.println();
        
        System.out.println("=====Mahasiswa Beasiswa=====");
        beasiswaMhs beasiswa1 =new beasiswaMhs("Abdul", "6754", "Djarum");
        beasiswaMhs beasiswa2 = new beasiswaMhs("Doni", "9831", "KIP-K");
        
        beasiswa1.InfoBeasiswa();
        System.out.println();
        beasiswa2.InfoBeasiswa();
        System.out.println();
        
    }
    
}
