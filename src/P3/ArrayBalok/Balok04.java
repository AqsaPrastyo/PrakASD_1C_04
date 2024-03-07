package P3.ArrayBalok;

public class Balok04 {
  public int panjang;
  public int lebar;
  public int tinggi;

  public Balok04 (int p, int l, int t){
    panjang = p;
    lebar = l;
    tinggi = t;

  }

  public Balok04(int p, int l){
    panjang = p;
    lebar = l;
  }

  public int hitungVolume(){
    return panjang * lebar * tinggi;
  }



}
