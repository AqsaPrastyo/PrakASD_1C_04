package P3.ArrayBalok;

public class BangunDatar04 {
  
    Segitiga04[] segitiga04s;
    Persegipanjang04[] persegipanjang04s;
    

  void tambahSgt(Segitiga04[] segitiga04){
      this.segitiga04s=segitiga04;
  }  


  void tambahPp(Persegipanjang04[] persegipanjang04){
    this.persegipanjang04s=persegipanjang04;
}  

void tampilBangunDatar(){
  for (int i = 0; i < persegipanjang04s.length; i++) {
    System.out.println("Persegi panjang " +(i+1));
    System.out.println("panjang " + persegipanjang04s[i].lebar);
    System.out.println("panjang " + persegipanjang04s[i].panjang);

    System.out.println("====================================");

  for (int j = 0; j < segitiga04s.length; j++) {
    System.out.println("Segitiga " + (j+1));
    System.out.println("alas " + segitiga04s[j].alas);
    System.out.println("tinggi " + segitiga04s[j].tinggi);
  }

  }
}



  
}
