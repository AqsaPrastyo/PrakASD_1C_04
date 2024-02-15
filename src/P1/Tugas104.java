package P1;

import java.util.Scanner;

public class Tugas104 {
  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        String[][] kota = {
            {"Banten"},
            {"Jakarta"},
            {"Bandung"},
            {"Cirebon"},
            {"Bogor"},
            {"Pekalongan"},
            {"Semarang"},
            {"Surabaya"},
            {"Malang"},
            {"Tegal"},
        };
        System.out.print("Masukkan kode plat nomor: ");
        char kodePlat = scanner.next().charAt(0);

        int index = -1;
        for (int i = 0; i < kode.length; i++) {
            if (kodePlat == kode[i]) {
                index = i;
                break;
            }
        }

        // Menampilkan nama kota
        if (index != -1) {
            System.out.println("Nama kota: " + kota[index][0]);
        } else {
            System.out.println("Kode plat nomor tidak ditemukan.");
        }
    }
}
