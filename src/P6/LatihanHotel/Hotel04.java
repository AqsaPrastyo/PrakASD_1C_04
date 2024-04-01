package P6.LatihanHotel;

public class Hotel04 {
  private String nama;
    private String kota;
    private int harga;
    private byte bintang;

    public Hotel04(String n, String k, int h, byte b) {
        nama = n;
        kota = k;
        harga = h;
        bintang = b;
    }

    public String Nama() {
        return nama;
    }

    public String Kota() {
        return kota;
    }

    public int Harga() {
        return harga;
    }

    public byte Bintang() {
        return bintang;
    }
    public String DisplayHotel() {
        return "Nama Hotel: " + nama + ", Kota: " + kota + ", Harga: " + harga + ", Bintang: " + bintang;
    }
}
