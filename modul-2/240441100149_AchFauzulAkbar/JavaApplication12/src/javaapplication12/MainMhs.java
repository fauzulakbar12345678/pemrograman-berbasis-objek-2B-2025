package javaapplication12;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Fauzul
 */
public class MainMhs {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("===========");
       Mhs mhs1 = new Mhs("rosak", "230331100152", "SI");
       mhs1.tambahMatkul("PBO");
       mhs1.tambahMatkul("PBW");
       mhs1.tambahMatkul("PBD");
       mhs1.tambahMatkul("APB");
       mhs1.info();
       System.out.println("===========");
       Mhs mhs2 = new Mhs("Iqbal", "230331100151", "SI");
       mhs2.tambahMatkul("PBO");
       mhs2.tambahMatkul("PBW");
       mhs2.tambahMatkul("PBD");
       mhs2.tambahMatkul("APB");
       mhs2.info();
       System.out.println("===========");
       Mhs mhs3 = new Mhs("Riska", "230331100150", "SI");
       mhs3.tambahMatkul("PBO");
       mhs3.tambahMatkul("PBW");
       mhs3.tambahMatkul("PBD");
       mhs3.tambahMatkul("APB");
       mhs3.info();
       System.out.println("==========");
       Mhs mhs4 = new Mhs("abdul", "230331100167", "SI");
       mhs4.tambahMatkul("PBO");
       mhs4.tambahMatkul("PBW");
       mhs4.tambahMatkul("PBD");
       mhs4.tambahMatkul("APB");
       mhs4.info();
       
       Mhs mhs5 = new Mhs("nofal", "230331100158", "SI");
       mhs5.tambahMatkul("PBO");
       mhs5.tambahMatkul("PBW");
       mhs5.tambahMatkul("PBD");
       mhs5.tambahMatkul("APB");
       mhs5.info();
        System.out.println("===========");
       Mhs mhs6 = new Mhs("picol", "230331100156", "SI");
       mhs6.tambahMatkul("PBO");
       mhs6.tambahMatkul("PBW");
       mhs6.tambahMatkul("PBD");
       mhs6.tambahMatkul("APB");
       mhs6.info();
       
        System.out.println("Jumlah mahasiswa: " + Mhs.jumlahMhs);
        
        MataKuliah mk1 = new MataKuliah("SI123", "Pemrograman Java", 3);
        MataKuliah mk2 = new MataKuliah("TI456", "C#", 6);
        MataKuliah mk3 = new MataKuliah("TI456", "PYTHON", 2);
        MataKuliah mk4 = new MataKuliah("TI456", "E-BISNIS", 9);
        MataKuliah mk5 = new MataKuliah("TI456", "APB", 11);
        MataKuliah mk6 = new MataKuliah("TI456", "PDB", 5);
        MataKuliah mk7 = new MataKuliah("TI456", "PBW", 4);
        MataKuliah mk8 = new MataKuliah("TI456", "PBO", 4);

        mk1.Info();
        System.out.println("==========");
        mk2.Info();
        System.out.println("==========");
        mk3.Info();
        System.out.println("==========");
        mk4.Info();
        System.out.println("==========");
        mk5.Info();
        System.out.println("==========");
        mk6.Info();
        System.out.println("==========");
        mk7.Info();
        System.out.println("==========");
        mk8.Info();

        System.out.println("\nCek SKS secara statis:");
        System.out.println("SKS 2 valid? " + MataKuliah.isSKSValid(2));
        System.out.println("SKS 3 valid? " + MataKuliah.isSKSValid(3));
        System.out.println("SKS 1 valid? " + MataKuliah.isSKSValid(1));
        System.out.println("SKS 4 valid? " + MataKuliah.isSKSValid(4));
        System.out.println("SKS 4 valid? " + MataKuliah.isSKSValid(5));
        System.out.println("SKS 4 valid? " + MataKuliah.isSKSValid(11));
        System.out.println("SKS 4 valid? " + MataKuliah.isSKSValid(9));
        System.out.println("SKS 4 valid? " + MataKuliah.isSKSValid(6));
        
        
        String nama = "Universitas abal";
        String alamat = "Jl. pemuda bar";
        if(kampus.NamaKampus(nama)){
            kampus k1 = new kampus(nama, alamat);
            kampus.totalMhs = 15000;
            k1.infoKampus();
        }else{
            System.out.println("Nama kampus Tidak Valid");
        }
    }
    
}
