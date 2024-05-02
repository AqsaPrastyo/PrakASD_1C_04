package P10;

import java.util.Scanner;

public class PembeliMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukan kapasitas queue: ");
        int jumlah = sc.nextInt();

        Queue04 antri = new Queue04(jumlah);

        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            sc.nextLine();
            switch (pilih) {
                case 1:
                    System.out.print("Nama: ");
                    String nama = sc.nextLine();
                    System.out.print("Nomor HP: ");
                    int noHp = Integer.parseInt(sc.nextLine());
                    Pembeli04 pembeli = new Pembeli04(nama, noHp);
                    antri.Enqueue(pembeli);
                    break;
                case 2:
                    Pembeli04 data = antri.Dequeue();
                    if (data != null) {
                        System.out.println("Antrian yang keluar: " + data.nama + " " + data.noHp);
                    }
                    break;
                case 3:
                    antri.peek();
                    break;
                case 4:
                    antri.print();
                    break;
                case 5:
                    antri.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan nama pembeli yang ingin dicek posisinya: ");
                    String namaPembeli = sc.nextLine();
                    antri.peekPosition(namaPembeli);
                    break;
                case 7:
                    antri.daftarPembeli();
                    break;
                default:
                    break;
            }
        } while (pilih >= 1 && pilih <= 7);
    }

    public static void menu(){
        System.out.println("Masukan operasi yang diinginkan: ");
        System.out.println("1. Antrian Baru");
        System.out.println("2. Antrian Keluar");
        System.out.println("3. Cek antrian terdepan");
        System.out.println("4. Cek semua antrian");
        System.out.println("5. Cek antrian dari belakang");
        System.out.println("6. Cek posisi pembeli berdasarkan nama");
        System.out.println("7. Daftar pembeli dalam antrian");
        System.out.println("-------------------------");
    }
}
