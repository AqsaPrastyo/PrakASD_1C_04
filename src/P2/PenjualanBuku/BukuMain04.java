package P2.PenjualanBuku;

public class BukuMain04 {
  public static void main(String[] args) {
    
    Buku04 bk1 = new Buku04();

    bk1.Judul = "Today Ends Tomorrow Comes";
    bk1.Pengarang = "Denanda Pratiwi";
    bk1.Halaman = 198;
    bk1.Stok = 2;
    bk1.Harga = 71000;

    bk1.TampilkanInformasi();
    bk1.Terjual(1);
    bk1.Gantiharga(60000);
    bk1.TampilkanInformasi();
  }
}
