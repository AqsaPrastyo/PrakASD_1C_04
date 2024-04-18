package P8;

import java.util.Scanner;

public class Utama04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);
        Gudang04 gudang = null;
        int kapasitas = 0;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah barang");
            System.out.println("2. Ambil barang");
            System.out.println("3. Tampilkan tumpukan barang");
            System.out.println("4. Tentukan kapasitas gudang");
            System.out.println("5. Lihat barang teratas");
            System.out.println("6. Lihat barang terbawah");
            System.out.println("7. Cari barang berdasarkan nama");
            System.out.println("8. Keluar");
            System.out.print("Pilih operasi: ");
            int pilihan = sc04.nextInt();
            sc04.nextLine();
        
            switch (pilihan) {
                case 1:
                    if (gudang == null) {
                        System.out.println("Gudang belum ditentukan. Tentukan kapasitas gudang terlebih dahulu.");
                        break;
                    }
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
                    if (gudang == null) {
                        System.out.println("Gudang belum ditentukan. Tentukan kapasitas gudang terlebih dahulu.");
                        break;
                    }
                    gudang.ambilBarang();
                    break;
        
                case 3:
                    if (gudang == null) {
                        System.out.println("Gudang belum ditentukan. Tentukan kapasitas gudang terlebih dahulu.");
                        break;
                    }
                    gudang.tampilkanBarang();
                    break;
        
                case 4:
                    System.out.println("Masukkan kapasitas gudang: ");
                    kapasitas = sc04.nextInt();
                    gudang = new Gudang04(kapasitas);
                    System.out.println("Kapasitas gudang telah ditentukan.");
                    break;
        
                case 5:
                    if (gudang == null) {
                        System.out.println("Gudang belum ditentukan. Tentukan kapasitas gudang terlebih dahulu.");
                        break;
                    }
                    gudang.liatBarangTeratas();
                    break;
        
                case 6:
                    if (gudang == null) {
                        System.out.println("Gudang belum ditentukan. Tentukan kapasitas gudang terlebih dahulu.");
                        break;
                    }
                    gudang.lihatBarangTerbawah();
                    break;
        
                case 7:
                    if (gudang == null) {
                        System.out.println("Gudang belum ditentukan. Tentukan kapasitas gudang terlebih dahulu.");
                        break;
                    }
                    System.out.println("Masukkan nama barang yang ingin dicari: ");
                    String namaBarang = sc04.nextLine();
                    gudang.cariBarang(namaBarang);
                    break;
        
                case 8:
                    System.exit(0);
                    break;
        
                default:
                    System.out.println("Pilihan Invalid. Coba lagi.");
                    break;
            }
        }        
    }
}
