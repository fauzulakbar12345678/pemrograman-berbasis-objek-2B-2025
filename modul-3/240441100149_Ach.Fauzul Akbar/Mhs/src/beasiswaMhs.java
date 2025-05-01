/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fauzul
 */
public class beasiswaMhs extends Mhs {
    String jenisBeasiswa;

    public beasiswaMhs(String nama, String nim, String jenisBeasiswa) {
        super(nama, nim);
        this.jenisBeasiswa = jenisBeasiswa;
    }
    
    public void InfoBeasiswa(){
        super.InfoMhs();
        System.out.println("Jenis Beasiswa : " + jenisBeasiswa);
        
    }
    
    
}
