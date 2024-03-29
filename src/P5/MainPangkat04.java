package P5;

import java.util.Scanner;

public class MainPangkat04 {
    public static void main(String[] args) {
        Scanner sc04 = new Scanner(System.in);

        System.out.println("----------------------");
        System.out.print("Masukan jumlah elemen yang dihitung: ");
        int iLmn = sc04.nextInt();

        Pangkat04[] png = new Pangkat04[iLmn];
        for (int i = 0; i < png.length; i++) {
            png[i] = new Pangkat04();
            System.out.println("Masukan nilai yang hendak dipangkatkan: ");
            png[i].nilai = sc04.nextInt(); 
            System.out.println("Masukan nilai pemangkat: ");
            png[i].pangkat = sc04.nextInt(); 

        }

        System.out.println("Pilih Metode Penghitungan Pangkat:");
        System.out.println("1. Brute Force");
        System.out.println("2. Divide and Conquer");
        System.out.print("Masukkan pilihan Anda: ");
        int Pilih = sc04.nextInt();

 switch (Pilih) {
  case 1:
  System.out.println("HASIL PANGKAT - BRUTE FORCE");
  for (int i = 0; i < iLmn; i++) {
      System.out.println(
              "Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " +
                      png[i].pangkatBF(png[i].nilai, png[i].pangkat)
      );
  }
    break;
  case 2:
  System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
  for (int i = 0; i < iLmn; i++) {
      System.out.println(
              "Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " +
                      png[i].pangkatDC(png[i].nilai, png[i].pangkat)
      );
  }
    break;
  default:
   System.out.println("pilihan tidak");
    break;
 }
        // System.out.println("HASIL PANGKAT - BRUTE FORCE");
        // for (int i = 0; i < iLmn; i++) {
        //     System.out.println(
        //             "Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " +
        //                     png[i].pangkatBF(png[i].nilai, png[i].pangkat)
        //     );
        // }

        // System.out.println("HASIL PANGKAT - DIVIDE CONQUER");
        // for (int i = 0; i < iLmn; i++) {
        //     System.out.println(
        //             "Hasil dari " + png[i].nilai + " pangkat " + png[i].pangkat + " adalah " +
        //                     png[i].pangkatDC(png[i].nilai, png[i].pangkat)
        //     );
        // }
    }
}

