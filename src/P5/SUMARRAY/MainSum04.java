package P5.SUMARRAY;

import java.util.Scanner;

public class MainSum04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("------------------------");
    System.out.println("Program menghitung keuntungan total perusahaan (satuan juta. misal 5.9 )");

    
    System.out.print("Masukan jumlah perusahaan: ");
    int JmlPerusahaan = sc.nextInt();
    sc.nextLine(); 

    
    Sum04[] perusahaan = new Sum04[JmlPerusahaan];

    
    for (int i = 0; i < JmlPerusahaan; i++) {
      System.out.println("============================");
      System.out.println("Perusahaan " + (i + 1));
      System.out.print("Masukan jumlah bulan: ");
      int bulan = sc.nextInt();
      sc.nextLine(); 
      perusahaan[i] = new Sum04(bulan);

      for (int j = 0; j < perusahaan[i].elemen; j++) {
        System.out.println("Masukan untung bulan ke - " + (j + 1) + " = ");
        perusahaan[i].keuntungan[j] = sc.nextDouble();
      }
    }

    
    System.out.println("==============================");
    System.out.println("Total Keuntungan setiap Perusahaan");
    for (int i = 0; i < JmlPerusahaan; i++) {
      System.out.println("==============================");
      System.out.println("Perusahaan " + (i + 1));
      System.out.println("Algoritma Brute Force");
      System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalBF(perusahaan[i].keuntungan));
      System.out.println("Algoritma Divide Conquer");
      System.out.println("Total keuntungan perusahaan selama " + perusahaan[i].elemen + " bulan adalah = " + perusahaan[i].totalDC(perusahaan[i].keuntungan, 0, perusahaan[i].elemen - 1));
    }
  }
}
