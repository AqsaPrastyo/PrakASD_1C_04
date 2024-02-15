package P1;

import java.util.Scanner;

public class Array04 {
  public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
 String MK[] = {"Pancasila", "Konsep Teknologi Informasi", "Critical Thinking dan Problem Solving", 
                "Matematika Dasar", "Bahasa Inggris 1", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", 
                "Keselamatan dan Kesehatan Kerja" };

    double nilaiMK[] = new double[MK.length];
    String nilaiHuruf[] = new String[MK.length];
    double bobotNilai[] = new double[MK.length];
    double ip = 0;

    for (int i = 0; i < MK.length; i++) {
      System.out.print("Masukan nilai angka untuk MK " + MK[i] + " : ");
      nilaiMK[i]= input.nextDouble();
      if (nilaiMK[i] < 0 || nilaiMK[i] >100) {
        System.out.println("Nilai lebih");
      }
    }
    for (int i = 0; i < MK.length; i++) {
      if (nilaiMK[i] > 80 && nilaiMK[i] <= 100) {
        nilaiHuruf[i] = "A";
        bobotNilai[i] = 4;
    } else if (nilaiMK[i] > 73 && nilaiMK[i] <= 80) {
        nilaiHuruf[i] = "B+";
        bobotNilai[i] = 3.5;
    } else if (nilaiMK[i] > 65 && nilaiMK[i] <= 73) {
        nilaiHuruf[i] = "B";
        bobotNilai[i] = 3;
    } else if (nilaiMK[i] > 60 && nilaiMK[i] <= 65) {
        nilaiHuruf[i] = "C+";
        bobotNilai[i] = 2.5;
    } else if (nilaiMK[i] > 50 && nilaiMK[i] <= 60) {
        nilaiHuruf[i] = "C";
        bobotNilai[i] = 2;
    } else if (nilaiMK[i] > 39 && nilaiMK[i] <= 50) {
        nilaiHuruf[i] = "D";
        bobotNilai[i] = 1;
    } else if (nilaiMK[i] > 0 && nilaiMK[i] <= 39) {
        nilaiHuruf[i] = "E";
        bobotNilai[i] = 0;
    }
    }

    System.out.println("Hasil konversi nilai");
    System.out.printf("|%-50s| %-10s| %-10s| %-10s| %n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");


    for (int i = 0; i < bobotNilai.length; i++) {
      System.out.printf("|%-50s| %-10s| %-10s| %-10s| %n", MK[i],  nilaiMK[i], nilaiHuruf[i], bobotNilai[i]);
      ip = bobotNilai[i]++;
    }System.out.printf("IP : %-2.2f", ip);
  }
}
