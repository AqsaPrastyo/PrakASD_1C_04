package P3.ArrayBalok;

public class BangunMain04 {
  public static void main(String[] args) {
  

    Segitiga04 sg1 = new Segitiga04(5, 10);
    Segitiga04 sg2 = new Segitiga04(10, 15);
    Segitiga04 sg3 = new Segitiga04(15, 20);

    Persegipanjang04 pp1 = new Persegipanjang04(5, 10);
    Persegipanjang04 pp2 = new Persegipanjang04(2, 8);
    Persegipanjang04 pp3 = new Persegipanjang04(10, 15);

    Segitiga04[ ] s = new Segitiga04[3];
    Persegipanjang04 [] p = new Persegipanjang04[3];


      s[0] = sg1;
      s[1] = sg2;
      s[2] = sg3;
      p[0] = pp1;
      p[1] = pp2;
      p[2] = pp3;

BangunDatar04 bd = new BangunDatar04();
bd.tambahSgt(s);
bd.tambahPp(p);
bd.tampilBangunDatar();








  }
}
