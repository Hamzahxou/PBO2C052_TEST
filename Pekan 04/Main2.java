import java.util.Scanner;

// Class Mahasiswa (Tanpa modifier public agar bisa dalam satu file)
class Mahasiswa {
    // 1. Modifier private: Melindungi data agar tidak diakses sembarangan
    private String nim;
    private String nama;
    private String prodi;

    // 2. Constructor: Dipanggil saat objek dibuat (new Mahasiswa)
    public Mahasiswa(String nim, String nama, String prodi) {
        // 3. Keyword 'this': Merujuk pada variabel class agar tidak tertukar dengan parameter
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
    }

    // Modifier public: Agar bisa diakses oleh class Main
    public void tampilkanData() {
        System.out.println("\n--- Hasil Data Mahasiswa ---");
        System.out.println("NIM     : " + this.nim);
        System.out.println("Nama    : " + this.nama);
        System.out.println("Prodi   : " + this.prodi);
        System.out.println("----------------------------");
    }
}

// Class Utama (Harus public dan nama class sesuai nama file)
public class Main2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Input Data Mahasiswa ===");
        System.out.print("Masukkan NIM   : ");
        String inputNim = input.nextLine();
        
        System.out.print("Masukkan Nama  : ");
        String inputNama = input.nextLine();
        
        System.out.print("Masukkan Prodi : ");
        String inputProdi = input.nextLine();

        // Membuat objek menggunakan constructor
        Mahasiswa mhs = new Mahasiswa(inputNim, inputNama, inputProdi);

        // Memanggil method untuk menampilkan hasil
        mhs.tampilkanData();
        
        input.close();
    }
}
