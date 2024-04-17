package P7;

import java.util.Scanner;

public class BukuMain04 {
  public static void main(String[] args) {
    
Scanner s = new Scanner(System.in);

Scanner s1 = new Scanner(System.in);

PencarianBuku04 data = new PencarianBuku04(); 
int jumBuku = 5;

Buku04 m = new Buku04(20215, "Algoritma", 2019, "Wahyuni", 5);
Buku04 m1 = new Buku04(20214, "Big Data", 2020, "Susilo", 3);
Buku04 m2 = new Buku04(20212, "Desain UI", 2021, "Supriadi", 6);
Buku04 m3 = new Buku04(20211, "Web Programing", 2022, "Pustaka Adi", 2);
Buku04 m4 =  new Buku04(20210, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);


PencarianBuku04 ListBuku = new PencarianBuku04();

ListBuku. tambah(m);
ListBuku.tambah (m1);
ListBuku.tambah(m2);
ListBuku. tambah (m3);
ListBuku.tambah(m4); 


System.out.println("-----------------------------------------------------------");

System.out.println("Masukkan data Buku secara Urut dari KodeBuku Terkecil,: ");
ListBuku.tampil();



// for (int i=0; i <jumBuku; i++) { 
//   System.out.println("---------------------------");
//   System.out.print("Kode Buku \t: ");
//   int kodeBuku= s.nextInt();
//   System.out.print("Judul buku \t: "); 
//   String judulBuku = s1.nextLine();
//   System.out.print("Tahun Terbit \t: ");
//   int tahunTerbit = s.nextInt();
//   System.out.print("Pengarang \t: "); 
//   String pengarang = s1.nextLine();
//   System.out.print("Stok  \t        : ");
//   int stok = s.nextInt();

  

//   Buku04 a = new Buku04(kodeBuku, judulBuku, tahunTerbit, pengarang, stok);
//   data.tambah(a);
//     }
    System.out.println("----------------------------------");
    System.out.println("Data keseluruhan Mahasiswa : ");

    System.out.println("----------------------------------");
    System.out.println("Data keseluruhan Buku : ");
    ListBuku.tampil();

    System.out.println("----------------------------------");
    System.out.println("----------------------------------");
    System.out.println("Pencarian Data: ");
    System.out.println("Masukan kode buku yang dicari: ");
    System.out.println("Kode buku: ");
    int cari = s.nextInt();

    System.out.println("Menggunakan Sequential Search");
    int posisi = ListBuku.FindSeqSearch(cari);
    ListBuku.TampilPosisi(cari, posisi);
    ListBuku.TampilData     (cari, posisi);

Buku04 dataBuku = ListBuku.FindBuku(cari);
if (dataBuku != null) {
    dataBuku.tampilDataBuku();
} else {
    System.out.println("Buku tidak ditemukan.");
}

System.out.println("Data buku setelah diurutkan:");
    ListBuku.tampil();



    System.out.println("Menggunakan Binary Search");
     posisi = ListBuku.FindBinarySearch(cari, 0, ListBuku.idx - 1);
    ListBuku.TampilPosisi(cari, posisi);
    ListBuku.TampilData(cari, posisi);


  }
}