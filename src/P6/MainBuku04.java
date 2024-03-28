package P6;

import java.util.Scanner;

public class MainBuku04 {
  public static void main(String[] args) {
    Scanner sc04 = new Scanner(System.in);
Buku04 m = new Buku04(20215, "Algoritma", 2019, "Wahyuni", 5);
Buku04 m1 = new Buku04(20214, "Big Data", 2020, "Susilo", 3);
Buku04 m2 = new Buku04(20212, "Desain UI", 2021, "Supriadi", 6);
Buku04 m3 = new Buku04(20211, "Web Programing", 2022, "Pustaka Adi", 2);
Buku04 m4 =  new Buku04(20211, "Etika Mahasiswa", 2023, "Darmawan Adi", 1);


DaftarBuku04 ListBuku = new DaftarBuku04();

ListBuku.tambah(m);
ListBuku.tambah(m1); 
ListBuku. tambah(m2);
ListBuku.tambah (m3);
ListBuku. tambah (m4);

System.out.println("========================");
System.out.println("Data sebelum diurutkan");
ListBuku.tampil();

System.out.println("=========================");
System.out.println("Data setelah diurutkan secara Asc berdasarkan stock");
ListBuku.bubbleSort();
ListBuku.tampil();


  }
}
