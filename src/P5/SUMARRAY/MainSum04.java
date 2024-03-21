package P5.SUMARRAY;

import java.util.Scanner;

public class MainSum04 {
  public static void main(String[] args) {
    Scanner sc04 = new Scanner(System.in);

    System.out.println("------------------------");
    System.out.println("Program menghitung keuntungan total (satuan juta. misal 5.9 )");
    System.out.print("Masukan jumlah bulan: ");
    int elm = sc04.nextInt();

    Sum04 sm = new Sum04(elm);
    System.out.println("============================");
    for (int i = 0; i < sm.elemen; i++) {
      System.out.println("Masukan untung bulan ke - "+(i+1)+" = ");
      sm.keuntungan[i] = sc04.nextDouble();
    }

    System.out.println("==============================");
    System.out.println("Algoritma Brute Force");
    System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalBF(sm.keuntungan));
    System.out.println("==============================");
    System.out.println("Algoritma Divide Conquer");
    System.out.println("Total keuntungan perusahaan selama " + sm.elemen + " bulan adalah = " + sm.totalDC(sm.keuntungan, 0, sm.elemen-1));
  }
}
