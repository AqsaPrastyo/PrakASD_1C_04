package P10.Queue;

import java.util.Scanner;

public class QueueMain04 {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Masukan kapasitas queue: ");
    int n = sc.nextInt();

    Queue04 Q = new Queue04(n);

    int pilih;
    do {
      menu();
      pilih = sc.nextInt();
      switch (pilih) {
        case 1:
          System.out.println("Masukan data baru: ");
          int dataMasuk = sc.nextInt();
          Q.Enqueue(dataMasuk);
          break;
        case 2:
        int dataKeluar =Q.Dequeue();
        if (dataKeluar !=0) {
          System.out.println("Data yang dikeluarkan: " + dataKeluar);
        }
          break;
        case 3:
         Q.print();
          break;
        case 4:
         Q.peek();
          break;
        case 5:
         Q.clear();
          break;

        default:
          break;
      }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
  }

  public static void menu(){
    System.out.println("Masukan operasi yang diinginkan: ");
    System.out.println("1. Enqueue");
    System.out.println("2. Dequeue");
    System.out.println("3. Print");
    System.out.println("4. Peek");
    System.out.println("5. Clear");
    System.out.println("-------------------------");
  }
}
