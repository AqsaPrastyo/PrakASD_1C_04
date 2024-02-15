package P1;

import java.util.Scanner;

public class Tugas204 {
   static Scanner input = new Scanner(System.in);
   public static void main(String[] args) {
       int pilihan;
       do {
           menu();
           pilihan = input.nextInt();

           switch (pilihan) {
               case 1:
                   hitungKecepatan();
                   break;
               case 2:
                   hitungJarakKm();
                   break;
               case 3:
                   hitungWaktu();
                   break;
               case 4:
                   System.out.println("Terima kasih telah menggunakan program ini!");
                   break;
               default:
                   System.out.println("Pilihan tidak valid!");
           }
       } while (pilihan != 4);
   }

   static void menu() {
       System.out.println("=============================");
       System.out.println("Program Menghitung Kecepatan, Jarak, dan Waktu");
       System.out.println("=============================");
       System.out.println("1. Hitung Kecepatan");
       System.out.println("2. Hitung Jarak (Km)");
       System.out.println("3. Hitung Waktu");
       System.out.println("4. Keluar");
       System.out.println("=============================");
       System.out.print("Masukkan pilihan Anda (1-4): ");
   }

   static void hitungKecepatan() {
       System.out.print("Masukkan jarak (meter): ");
       double jarak = input.nextDouble();
       System.out.print("Masukkan waktu (sekon): ");
       double waktu = input.nextDouble();

       double kecepatan = jarak / waktu;

       System.out.println("Kecepatan: " + kecepatan + " meter/sekon");
   }

   static void hitungJarakKm() {
       System.out.print("Masukkan kecepatan (meter/sekon): ");
       double kecepatan = input.nextDouble();
       System.out.print("Masukkan waktu (sekon): ");
       double waktu = input.nextDouble();

       double jarakMeter = kecepatan * waktu;
       double jarakKm = jarakMeter / 1000;

       System.out.println("Jarak: " + jarakKm + " kilometer");
   }

   static void hitungWaktu() {
       System.out.print("Masukkan kecepatan (meter/sekon): ");
       double kecepatan = input.nextDouble();
       System.out.print("Masukkan jarak (meter): ");
       double jarak = input.nextDouble();

       double waktu = jarak / kecepatan;

       System.out.println("Waktu: " + waktu + " detik");
   }
}
