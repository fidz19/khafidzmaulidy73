// Class Mahasiswa
class Mahasiswa {
    String nama;
    String nim;
    int umur;
    
    // Method untuk mengisi data
    public void isiData(String nama, String nim, int umur) {
        this.nama = nama;
        this.nim = nim;
        this.umur = umur;
    }
    
    // Method untuk menampilkan data
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIM: " + nim);
        System.out.println("Umur: " + umur + " tahun");
        System.out.println("-------------------");
    }
    
    // Method untuk belajar
    public void belajar(String mataKuliah) {
        System.out.println(nama + " sedang belajar " + mataKuliah);
    }
}

// Class utama
public class Main {
    public static void main(String[] args) {
        System.out.println("=== DATA MAHASISWA ===\n");
        
        // Membuat objek mahasiswa pertama
        Mahasiswa mhs1 = new Mahasiswa();
        mhs1.isiData("Budi Santoso", "12345", 20);
        mhs1.tampilkanData();
        mhs1.belajar("Pemrograman Java");
        
        System.out.println();
        
        // Membuat objek mahasiswa kedua
        Mahasiswa mhs2 = new Mahasiswa();
        mhs2.isiData("Siti Aminah", "12346", 19);
        mhs2.tampilkanData();
        mhs2.belajar("Basis Data");
    }
}
