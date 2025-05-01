/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Fauzul
 */
public class MhsReguler extends Mhs {
    String kelas;

    public MhsReguler(String nama, String nim, String kelas) {
        super(nama, nim);
        this.kelas = kelas;
//        this.kelas = kelas;
    }

    public void InfoMhsReguler(){
        super.InfoMhs();
        System.out.println("Kelas : " + kelas);
    }
    
    
}
