package P2.PenjualanBuku;

public class Buku04 {
  /**
   * InnerBuku04
   */
  
  
    String Judul, Pengarang;
    int Halaman, Stok, Harga;

    void TampilkanInformasi (){
      System.out.println("Judul " + Judul);
      System.out.println("Pengarang " + Pengarang);
      System.out.println("Jumlah halaman " + Halaman);
      System.out.println("Sisa stok " + Stok);
      System.out.println("Harga Rp " + Harga);
    }

    void Terjual(int jml){
      Stok -= jml;
    }

    void restock(int jml){
      Stok += jml;
    }

    void Gantiharga(int hrg){
      Harga = hrg;
    }







  
}
