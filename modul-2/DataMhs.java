package pemrograman-berbasis-objek-2B-2025.modul-2;

class Mhs{
    String nama;
    String nim;
    String jurusan;
    String matkul;

    static int jumlahMhs = 0;
    static int jumlahMatkul = 0;

    public Mhs(String nama, String nim, String jurusan, String matkul){
        if(nimSah(nim)){
            this.nama = nama;
            this.nim = nim;
            this.jurusan = jurusan;
            this.matkul = matkul;

            jumlahMhs++;
            jumlahMatkul++;
        }else{
            System.out.println("NIM tidak valid");
            this.nama = null;
        }
}
}
    public void cetakInfo(){
        if(nama != null){
            System.out.println("Nama : " + nama);
            System.out.println("NIM : " + nim);
            System.out.println("Jurusan : " + jurusan);
            System.out.println("Mata Kuliah : " + matkul);
    }else{
        System.out.println("Data tidak lengkap");
    }
    }

class matkul{
    String namaMatkul;
    String sks;
    String dosen;
    static int jumlahMatkul = 0;

    public matkul(String namaMatkul, String sks, String dosen){
        if(namaMatkulSah(namaMatkul)){
            this.namaMatkul = namaMatkul;
            this.sks = sks;
            this.dosen = dosen;
            jumlahMatkul++;

    }else{
        System.out.println("Nama Mata Kuliah tidak valid");
    }

    public void cetakInfo(){
        System.out.println("Nama Mata Kuliah : " + namaMatkul);
        System.out.println("SKS : " + sks);
        System.out.println("Dosen : " + dosen);
    }
}
}

class kampus{
    String namaKampus;
    String alamatKampus;

    public kampus(String namaKampus, String alamatKampus){
        if(namaKampusSah(namaKampus)){
            this.namaKampus = namaKampus;
            this.alamatKampus = alamatKampus;
        }else{
            System.out.println("Nama Kampus tidak valid");
        }
    }

    public void cetakInfo(){
        System.out.println("Nama Kampus : " + namaKampus);
        System.out.println("Alamat Kampus : " + alamatKampus);
    }
}




public class DataMhs {
    public static void main(String[] args) {
       Mhs mhs1 = new Mhs("Rizki", "234567890009", "Sistem Informasi")
       Mhs mhs2 = new Mhs("Rozak", "234567890056", "Sistem Informasi")
       Mhs mhs3= new Mhs("Rizal", "234567890052", "Sistem Informasi")
       Mhs mhs4 = new Mhs("ucul", "234567890055", "Sistem Informasi")
       Mhs mhs5 = new Mhs("Abdul", "2345678900167", "Sistem Informasi")
       Mhs mhs6 = new Mhs("ucup", "234567890008", "Sistem Informasi")

       matkul m1 = new matkul("Pemrograman Web", 3, "Bapak Ridho")
       matkul m2 = new matkul("Pemrograman Objek", 4, "Bapak Rudianto")
       matkul m3 = new matkul("Pengantar Basis Data", 3, "Bapak Syaiful")
       matkul m4 = new matkul("Agama Islam", 2, "Bapak H. Ridwan")
       matkul m4 = new matkul("Analisa Proses Bisnis", 2, "Ibu Sri Wahyuni")
       matkul m5 = new matkul("E-Businies Dan E-Commers", 2, "Ibu Anik")
       matkul m6 = new matkul("Desain Manajemen Jaringa", 3, "Bapak Ali")
       matkul m7 = new matkul("Bhs Inggris", 2, "Ibu unik")
       matkul m8 = new matkul("kewarganegaraan", 2, "Bapak Taufik")

       kampus kampus1 = new kampus("Universitas Budi Luhur", "Jl.Gatot")

       mhs1.cetakInfo();
       mhs2.cetakInfo();
       mhs3.cetakInfo();
       mhs4.cetakInfo();
       mhs5.cetakInfo();
       mhs6.cetakInfo();

       m1.cetakInfo();
       m2.cetakInfo();
       m3.cetakInfo();
       m4.cetakInfo();
       m5.cetakInfo();
       m6.cetakInfo();
       m7.cetakInfo();
       m8.cetakInfo();

       kampus1.cetakInfo();



       
    }
}
