package P8;

import java.util.Scanner;

public class Utama04 {
    public static void main(String[] args) {
        Gudang04 gudang = new Gudang04(7);
        Scanner sc04 = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc04.nextInt();
            sc04.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukan kode barang: ");
                    int kode = sc04.nextInt();
                    sc04.nextLine();
                    System.out.println("Masukan nama barang: ");
                    String nama = sc04.nextLine();
                    System.out.println("Masukan kategori barang: ");
                    String kategori = sc04.nextLine();
                    Barang04 barangbaru = new Barang04(kode, nama, kategori);
                    gudang.tambahBarang(barangbaru);
                    break;

                case 2:
                    gudang.ambilBarang();
                    break;

                case 3:
                    gudang.tampilkanBarang();
                    break;

                case 4:
                    System.exit(0); // Mengakhiri program
                    break;

                default:
                    System.out.println("Pilihan Invalid. Coba lagi.");
                    break;
            }
        }
    }
}
