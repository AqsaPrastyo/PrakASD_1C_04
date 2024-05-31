package Kuis2_04_1C_AqsaHerry;

public class Buku04 {
  String kodeBuku;
  String judulBuku;
  int stok;
  Node04 head;
  public Buku04(String kdBk, String JdBk, int stok){
    this.judulBuku = JdBk;
    this.kodeBuku = kdBk;
    this.stok = stok;
  }

public void DataBuku04(){
  System.out.println("=======================");
  System.out.println("Kode buku: " + kodeBuku);
  System.out.println("Judul buku: " + judulBuku);
  System.out.println("Stok: " + stok);
}





public static void main(String[] args) {
  Buku04 buku1 = new Buku04("BK-05", "Rekayasa perangkat lunak", 5);
  Buku04 buku2 = new Buku04("BK-04", "Basic Pemrograman", 3);
  Buku04 buku3 = new Buku04("BK-03","Desain Website Interaktif", 5);
  Buku04 buku4 = new Buku04("BK-02", "Merancang Basis data sederhana", 1);
  Buku04 buku5 = new Buku04("BK-01", "Algoritma Struktur data", 5);  
}





}
