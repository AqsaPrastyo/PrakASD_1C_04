package P3.ArrayBalok;

public class sgArray04 {
  public static void main(String[] args) {
    
Segitiga04[] sgArray04 = new Segitiga04[4];

    sgArray04[0] = new Segitiga04(10, 4);
    sgArray04[1] = new Segitiga04(20, 10);
    sgArray04[2] = new Segitiga04(15, 6);
    sgArray04[3] = new Segitiga04(25, 10);

    for (int i = 0; i < sgArray04.length; i++) {
      System.out.println("Segitiga ke-" + (i + 1 ) );
      System.out.println("Alas: " + sgArray04[i].alas);
      System.out.println("Tinggi: " + sgArray04[i].tinggi);

      sgArray04[i].hitungLuas();
      sgArray04[i].hitungKeliling();

      System.out.println(); 
  }



  }
}
