package P3.AOBPersegipanjang;

import java.util.Scanner;

public class ArrayObject04 {
  public static void main(String[] args) {

    Scanner sc04 = new Scanner(System.in);
    PersegiPanjang04[] ppArray = new PersegiPanjang04[3];

    for (int i = 0; i < 3; i++) {
      ppArray[i] = new PersegiPanjang04();
      System.out.println("Persegi panjang ke-" +i);
      System.out.print("Masukan panjang: ");
      ppArray[i].panjang = sc04.nextInt();
      System.out.print("Masukan lebar: ");
      ppArray[i].lebar = sc04.nextInt();
    }

    // ppArray[0] = new PersegiPanjang04();
    // ppArray[0].panjang = 110;
    // ppArray[0].lebar = 30; 
    
    // ppArray[1] = new PersegiPanjang04();
    // ppArray[1].panjang = 80;
    // ppArray[1].lebar = 40; 
    
    // ppArray[2] = new PersegiPanjang04();
    // ppArray[2].panjang = 100;
    // ppArray[2].lebar = 20; 
    

    // System.out.println("Persegi Panjang ke-0, Panjang: " + ppArray[0].panjang + ", Lebar: " + ppArray[0].lebar);
    // System.out.println("Persegi Panjang ke-1, Panjang: " + ppArray[1].panjang + ", Lebar: " + ppArray[1].lebar);
    // System.out.println("Persegi Panjang ke-2, Panjang: " + ppArray[2].panjang + ", Lebar: " + ppArray[2].lebar);


    for (int i = 0; i < 3; i++) {
      System.out.println("Persegi Panjang ke-" + i);
      System.out.println("Panjang: " + ppArray[i].panjang + ", Lebar: " + ppArray[i].lebar);

    }


 }
}
