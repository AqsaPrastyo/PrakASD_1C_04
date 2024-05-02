package P10.Nasabah;

import java.util.Scanner;

public class NasabahQueueMain04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Masukan kapasitas queue: ");
    int jumlah = sc.nextInt();

    NasabahQueue04 antri = new NasabahQueue04(jumlah);

    int pilih;
    do {
      menu();
      pilih = sc.nextInt();
      sc.nextLine();
      switch (pilih) {
        case 1:
          System.out.print("No rekening: ");
          String norek = sc.nextLine();
          System.out.print("Nama: ");
          String nama = sc.nextLine();
          System.out.print("alamat: ");
          String alamat = sc.nextLine();
          System.out.print("Umur: ");
          int umur = sc.nextInt();
          System.out.print("Saldo: ");
          double saldo = sc.nextDouble();
          Nasabah04 nb = new Nasabah04(norek, nama, alamat, umur, saldo);
          sc.nextLine();
          antri.Enqueue(nb);
          break;
        case 2:
        Nasabah04 data = antri.Dequeue();
        if (!"".equals(data.norek) && !"".equals(data.nama) 
        && !"".equals(data.alamat) && !"".equals(data.umur) && !"".equals(data.saldo)) {
          break;
        }
          
        case 3:
         antri.peek();
         
          break;
        case 4:
         antri.print();
          break;
        case 5:
         antri.peekRear();
          break;

        default:
          break;
      }
    } while (pilih == 1 || pilih == 2 || pilih == 3 || pilih == 4 || pilih == 5);
  }

  public static void menu(){
    System.out.println("Masukan operasi yang diinginkan: ");
    System.out.println("1. Antrian Baru");
    System.out.println("2. Antrian Keluar");
    System.out.println("3. Cek antrian terdepan");
    System.out.println("4. Cek semua antrian");
    System.out.println("5. Cek antrian dari belakang");
    System.out.println("-------------------------");
  }
}
