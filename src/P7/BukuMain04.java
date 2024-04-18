package P7;

import java.util.Scanner;

public class BukuMain04 {
  public static void main(String[] args) {
    
Scanner s = new Scanner(System.in);

Scanner s1 = new Scanner(System.in);

Scanner input = new Scanner(System.in);

    PencarianBuku04 data = new PencarianBuku04();
    int jumlahBuku = 5;

    Buku04 buku1 = new Buku04("20215", "Algoritma", 2019, "Wahyuni", 5);
    Buku04 buku2 = new Buku04("20214", "Big Data", 2020, "Susilo", 3);
    Buku04 buku3 = new Buku04("20212", "Desain UI", 2021, "Supriadi", 6);
    Buku04 buku4 = new Buku04("20211", "Web Programing", 2022, "Pustaka Adi", 2);
    Buku04 buku5 = new Buku04("20210", "Etika Mahasiswa", 2023, "Darmawan Adi", 1);

    data.tambah(buku1);
    data.tambah(buku2);
    data.tambah(buku3);
    data.tambah(buku4);
    data.tambah(buku5);

    System.out.println("-----------------------------------------------------------");
    System.out.println("Data keseluruhan Buku : ");
    data.tampil();
    System.out.println("-----------------------------------------------------------");

    System.out.println("Pencarian Data Berdasarkan Kode Buku: ");
    System.out.print("Masukkan kode buku yang dicari: ");
    String kodeCari = input.nextLine();

    int posisiKode = data.findKodeBukuSeqSearch(kodeCari);
    if (posisiKode != -1) {
      data.listBk[posisiKode].tampilDataBuku();
    } else {
      System.out.println("Buku dengan kode " + kodeCari + " tidak ditemukan.");
    }

    System.out.println("-----------------------------------------------------------");

    System.out.println("Pencarian Data Berdasarkan Judul Buku: ");
    System.out.print("Masukkan judul buku yang dicari: ");
    String judulCari = input.nextLine();

    int posisiJudul = data.findJudulBukuSeqSearch(judulCari);
    if (posisiJudul != -1) {
      data.listBk[posisiJudul].tampilDataBuku();
    } else {
      System.out.println("Buku dengan judul '" + judulCari + "' tidak ditemukan.");
    }
  }
}