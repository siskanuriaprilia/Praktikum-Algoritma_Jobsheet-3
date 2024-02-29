import java.util.Scanner;

public class Mahasiswa {
    private String nama;
    private String nim;
    private String jenisKelamin;
    private double ipk;

    public Mahasiswa(String nama, String nim, String jenisKelamin, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.jenisKelamin = jenisKelamin;
        this.ipk = ipk;
    }

    // Getter methods
    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public double getIpk() {
        return ipk;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan objek Mahasiswa
        Mahasiswa[] daftarMahasiswa = new Mahasiswa[3]; // Misalnya hanya untuk 3 mahasiswa

        // Memasukkan informasi mahasiswa menggunakan looping for
        for (int i = 0; i < daftarMahasiswa.length; i++) {
            System.out.println("Masukkan informasi mahasiswa ke-" + (i + 1) + ":");
            System.out.print("Nama: ");
            String nama = scanner.nextLine();
            System.out.print("NIM: ");
            String nim = scanner.nextLine();
            System.out.print("Jenis Kelamin: ");
            String jenisKelamin = scanner.nextLine();
            System.out.print("IPK: ");
            double ipk = scanner.nextDouble();
            scanner.nextLine(); // Membersihkan newline
            // Membuat objek Mahasiswa dan menyimpannya di dalam array
            daftarMahasiswa[i] = new Mahasiswa(nama, nim, jenisKelamin, ipk);
        }

        // Menampilkan informasi mahasiswa menggunakan foreach
        System.out.println("\nInformasi Mahasiswa:");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println("Nama: " + mahasiswa.getNama());
            System.out.println("NIM: " + mahasiswa.getNim());
            System.out.println("Jenis Kelamin: " + mahasiswa.getJenisKelamin());
            System.out.println("IPK: " + mahasiswa.getIpk());
            System.out.println();
        }

        // Menghitung rata-rata IPK
        double totalIpk = 0;
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            totalIpk += mahasiswa.getIpk();
        }
        double rataRataIpk = totalIpk / daftarMahasiswa.length;
        System.out.println("Rata-rata IPK: " + rataRataIpk);
    }
}