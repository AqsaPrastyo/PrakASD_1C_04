package P12.Tugas1;

import java.util.Scanner;

public class PasienVaksinMain {
    public static void main(String[] args) {
        PasienVaksin queue = new PasienVaksin();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah data penerima vaksin");
            System.out.println("2. Hapus data pengantri vaksin");
            System.out.println("3. Daftar penerima vaksin");
            System.out.println("4. Keluar");
            System.out.print("Pilihan: ");
            choice = scanner.nextInt();
            scanner.nextLine(); 

            switch (choice) {
                case 1:
                    System.out.print("Masukkan nomor pasien: ");
                    int number = scanner.nextInt();
                    scanner.nextLine(); 
                    System.out.print("Masukkan nama pasien: ");
                    String name = scanner.nextLine();
                    queue.addLast(number, name);
                    System.out.println(name + " berhasil ditambahkan. Sisa antrian: " + queue.getSize());
                    break;
                case 2:
                    try {
                        String removedName = queue.head.name; 
                        queue.removeFirst();
                        System.out.println(removedName + " telah selesai divaksin. Sisa antrian: " + queue.getSize());
                    } catch (Exception e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    queue.print();
                    break;
                case 4:
                    System.out.println("Keluar dari program.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (choice != 4);

        scanner.close();
    }
}

