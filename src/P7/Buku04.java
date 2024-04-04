package P7;

public class Buku04 {
  int kodeBuku;
  String judulBuku;
  int tahunTerbit;
  String pengarang;
  int stok;

  public Buku04(int kodeBuku, String judulBuku, int tahunTerbit, String pengarang, int stok){
    this.kodeBuku = kodeBuku; 
    this.judulBuku = judulBuku;
    this.tahunTerbit = tahunTerbit;
    this.pengarang = pengarang;
    this.stok = stok; 
    
  }

  public void tampilDataBuku (){
    System.out.println("=======================");
    System.out.println("Kode buku: " + kodeBuku);
    System.out.println("Judul buku: " + judulBuku);
    System.out.println("Tahun terbit: " + tahunTerbit);
    System.out.println("Pengarang: " + pengarang);
    System.out.println("Stok: " + stok);
    
    }







}
