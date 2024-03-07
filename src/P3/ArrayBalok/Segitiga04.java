package P3.ArrayBalok;

public class Segitiga04 {
  public int tinggi;
  public int alas;


  public Segitiga04(int a, int t){

    alas = a;
    tinggi = t;


  }


  void hitungLuas (){
    double Luas =   0.5 * alas * tinggi;
    System.out.println("Luas segitiga: " + Luas);

  }
  
  void hitungKeliling(){
    double sisiMiring = Math.sqrt((alas * alas) + (tinggi * tinggi));
    double keliling = alas + tinggi + sisiMiring;
    System.out.println("Keliling segitiga: " + keliling);



  }


}
