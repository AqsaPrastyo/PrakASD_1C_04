package P5;

import java.util.Scanner;

public class MainFaktorial04 {
  public static void main(String[] args) {
    
Scanner sc04 = new Scanner(System.in);

System.out.println("---------------------");
System.out.print("Masukan jumlah elemen: ");
int iJml = sc04.nextInt();



Faktorial04[] fk = new Faktorial04[iJml];
  for (int i = 0; i < iJml; i++) {
    fk[i] = new Faktorial04();
    System.out.println("Masukan nilai data ke-" +(i+1) + ":");
    int iNilai = sc04.nextInt(); 
    fk[i].nilai = iNilai;
  
  }

System.out.println("HASIL - BRUTE FORCE");
for (int i = 0; i < iJml; i++) {
  System.out.println("Hasil perhitungan faktorial menggunakan Brute Force adalah " + fk[i].faktorialBF(fk[i].nilai));
}
System.out.println("HASIL - DIVIDE AND CONQUER");
for (int i = 0; i < iJml; i++) {
  System.out.println("Hasil perhitungan faktorial menggunakan Divide and Conquer adalah " + fk[i].faktoriaDC(fk[i].nilai));
}






  }
}
