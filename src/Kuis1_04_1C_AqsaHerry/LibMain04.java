package Kuis1_04_1C_AqsaHerry;

import java.util.Scanner;

public class LibMain04 {

 public static void main(String[] args) {
  Scanner scStr04 = new Scanner(System.in);
  Scanner scInt04 = new Scanner(System.in);

Book04[] buku04 = new Book04[100];

boolean kembali = true;
while (kembali) {
  System.out.println("========== JTI Libary ==========");
  System.out.println("Menu:");
  System.out.println("1. Input data buku \n2. Display data \n3. Kurangi stok \n4. Peminjaman \n5. Exit");
  System.out.print("Pilih menu: ");
  int pilih = scInt04.nextInt();

  switch (pilih) {
    case 1:
      int storange = 0;
      do {
        System.out.print("Masukan kode buku: ");
        String kodeBuku04 = scStr04.nextLine();
        System.out.print("Masukan judul buku: ");
        String judulBuku04 = scStr04.nextLine();
        System.out.print("Masukan pengarang: ");
        String pengarang04 = scStr04.nextLine();
        System.out.print("Masukan tahun terbit: ");
        int tahunTerbit04 = scInt04.nextInt();
        System.out.print("Masukan stok: ");
        int stok = scInt04.nextInt();

        buku04[storange] = new Book04(kodeBuku04, judulBuku04, pengarang04, tahunTerbit04, stok);
        storange++;



        System.out.println("Apakah ingin input lagi? (y/t)");
      char input = scStr04.next().charAt(0);
      if (input == 't') {
          break;
      }

         scStr04.nextLine();
      } while (true);
      break;
    case 2:

      boolean kosong = true;

      for (int i = 0; i < buku04.length; i++) {
        if (buku04[i] != null) {
            buku04[i].displayData(); 
            System.out.println("=====================================");
            kosong = false;
        }
    }

    if (kosong) {
      System.out.println("Belum ada data buku yang masuk! ");
    }
boolean kembaliKeMenu = false;
do {
  System.out.println("Apakah ingin kembali ke menu? : ");
  char kemb = scStr04.next().charAt(0);
  if (kemb == 'y') {
    kembaliKeMenu = true;
  }else if (kemb == 'n') {
    kembaliKeMenu = false;
    kembali = false;
    break;
  }
} while (!kembaliKeMenu);
break;

case 3:
System.out.println("Kurangi stok karena rusak");
System.out.print("Input kode buku: ");
String namaKode = scStr04.nextLine();
System.out.print("Jumlah rusak: ");
int rusak = scInt04.nextInt();
scStr04.nextLine();
boolean kodediTemukan = false;


for (Book04 book04 : buku04) {
  if (book04 != null && book04.rekodeBuku().equalsIgnoreCase(namaKode)) {
    kodediTemukan = true;
  }
}
boolean kembaliKeMenu2 = false;
do {
  System.out.println("Apakah ingin kembali ke menu? : ");
  char kemb = scStr04.next().charAt(0);
  if (kemb == 'y') {
    kembaliKeMenu = true;
  }else if (kemb == 'n') {
    kembaliKeMenu = false;
    kembali = false;
    break;
  }
} while (!kembaliKeMenu2);

break;
case 4:
System.out.println("Under Construction!");



case 5:
 kembali = false;
    default:
      break;
  }
}

 }
}
