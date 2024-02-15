package P1;

import java.util.Scanner;

/**
 * Pemilihan04
 */
public class Pemilihan04 {
 public static void main(String[] args) {
  Scanner input04 = new Scanner(System.in);

  System.out.print("Masukkan nilai tugas: ");
  double nilaiTugas = input04.nextDouble();
  System.out.print("Masukkan nilai kuis: ");
  double nilaiKuis = input04.nextDouble();
  System.out.print("Masukkan nilai UTS: ");
  double nilaiUTS = input04.nextDouble();
  System.out.print("Masukkan nilai UAS: ");
  double nilaiUAS = input04.nextDouble();

  if (nilaiTugas < 0 || nilaiTugas > 100 ||
          nilaiKuis < 0 || nilaiKuis > 100 ||
          nilaiUTS < 0 || nilaiUTS > 100 ||
          nilaiUAS < 0 || nilaiUAS > 100) {
      System.out.println("Nilai tidak valid!");
      return;
  }

  double nilaiAkhir = (0.2 * nilaiTugas) + (0.2 * nilaiKuis) + (0.3 * nilaiUTS) + (0.3 * nilaiUAS);

  String nilaiHuruf;
  if (nilaiAkhir >= 80) {
      nilaiHuruf = "A";
  } else if (nilaiAkhir >= 73) {
      nilaiHuruf = "B+";
  } else if (nilaiAkhir >= 65) {
      nilaiHuruf = "B";
  } else if (nilaiAkhir >= 60) {
      nilaiHuruf = "C+";
  } else if (nilaiAkhir >= 50) {
      nilaiHuruf = "C";
  } else if (nilaiAkhir >= 39) {
      nilaiHuruf = "D";
  } else {
      nilaiHuruf = "E";
  }

  String keterangan;
  if (nilaiHuruf.equals("A") || nilaiHuruf.equals("B+") || nilaiHuruf.equals("B") ||
          nilaiHuruf.equals("C+") || nilaiHuruf.equals("C")) {
      keterangan = "LULUS";
  } else {
      keterangan = "TIDAK LULUS";
  }

  System.out.println("=====================");
  System.out.println("Nilai akhir: " + nilaiAkhir);
  System.out.println("Nilai huruf: " + nilaiHuruf);
  System.out.println("Keterangan: " + keterangan);
 }
  
}