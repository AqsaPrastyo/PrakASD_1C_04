package P2.PenjualanBuku;

public class BukuMain04 {
  public static void main(String[] args) {
    
    Buku04 bk1 = new Buku04();
    Buku04 bk2 = new Buku04("Self reward", "Maheera Ayesha", 160, 29, 59000);
    Buku04 BukuHerry = new Buku04("TemanTapi?", "Candra wahaya", 256, 7, 67000);

    bk1.Judul = "Today Ends Tomorrow Comes";
    bk1.Pengarang = "Denanda Pratiwi";
    bk1.Halaman = 198;
    bk1.Stok = 2;
    bk1.Harga = 71000;

    bk1.TampilkanInformasi();
    bk1.Terjual(1);
    bk1.Gantiharga(60000);
    bk1.TampilkanInformasi();

    // bk2.Judul = "How to train your dragon";
    // bk2.Pengarang = "Cressida Cowell";
    // bk2.Halaman = 432;
    // bk2.Stok = 0;
    // bk2.Harga = 275000;

    // bk2.TampilkanInformasi();
    bk2.Terjual(11);
    bk2.TampilkanInformasi();

    BukuHerry.TampilkanInformasi();
    



  }
}
