package P12.Tugas2;

import java.util.Scanner;

public class DaftarFilmMain {
    public static void main(String[] args) throws Exception {
        DaftarFilm daftarFilm = new DaftarFilm();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah data awal");
            System.out.println("2. Tambah data akhir");
            System.out.println("3. Tambah data pada index tertentu");
            System.out.println("4. Hapus data pertama");
            System.out.println("5. Hapus data terakhir");
            System.out.println("6. Hapus data pada index tertentu");
            System.out.println("7. Cetak");
            System.out.println("8. Cari id film");
            System.out.println("9. Urut data rating film - DESC");
            System.out.println("10. Keluar");
            System.out.print("Pilih: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan ID: ");
                    int id1 = scanner.nextInt();
                    System.out.print("Masukkan Judul: ");
                    scanner.nextLine();
                    String judul1 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating1 = scanner.nextDouble();
                    daftarFilm.addFirst(id1, judul1, rating1);
                    break;
                case 2:
                    System.out.print("Masukkan ID: ");
                    int id2 = scanner.nextInt();
                    System.out.print("Masukkan Judul: ");
                    scanner.nextLine();
                    String judul2 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating2 = scanner.nextDouble();
                    daftarFilm.addLast(id2, judul2, rating2);
                    break;
                case 3:
                    System.out.print("Masukkan Index: ");
                    int index3 = scanner.nextInt();
                    System.out.print("Masukkan ID: ");
                    int id3 = scanner.nextInt();
                    System.out.print("Masukkan Judul: ");
                    scanner.nextLine();
                    String judul3 = scanner.nextLine();
                    System.out.print("Masukkan Rating: ");
                    double rating3 = scanner.nextDouble();
                    daftarFilm.add(id3, judul3, rating3, index3);
                    break;
                case 4:
                    daftarFilm.removeFirst();
                    break;
                case 5:
                    daftarFilm.removeLast();
                    break;
                case 6:
                    System.out.print("Masukkan Index: ");
                    int index6 = scanner.nextInt();
                    daftarFilm.remove(index6);
                    break;
                case 7:
                    daftarFilm.print();
                    break;
                case 8:
                    System.out.print("Masukkan ID: ");
                    int id8 = scanner.nextInt();
                    daftarFilm.cariIdFilm(id8);
                    break;
                case 9:
                    daftarFilm.urutDataRatingDesc();
                    break;
                case 10:
                    System.out.println("Keluar");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
            }
        } while (pilihan != 10);
    }
}

