package Kuis2_04_1C_AqsaHerry;


import java.util.Scanner;

public class Main04 {
  public static void main(String[] args) throws Exception {
    Antrain04 queue = new Antrain04();
    Scanner sc = new Scanner(System.in);
    int choice;

    do {
      System.out.println("\nMenu:");
      System.out.println("1. Tambah Antrian");
      System.out.println("2. Print Antrian");
      System.out.println("3. Delete Antrian");
      System.out.println("4. Stok buku paling sedikit");
      System.out.println("5. Keluar");
      System.out.print("Pilihan: ");
      choice = sc.nextInt();
      sc.nextLine();
switch (choice) {
  case 1:
    System.out.println("Kode Anggota: ");
    String KD = sc.nextLine();
    System.out.println("Nama Anggota: ");
    String nm = sc.nextLine();
    System.out.println("NoHP: ");
    String NoHp= sc.nextLine();
    queue.addFirst04(KD, nm);
    System.out.println(nm + " berhasil ditambahkan. Sisa antrian: " + queue.getSize04());
    break;
  
  case 2:
  queue.print04();
  break;

  case 3:
  String removedName = queue.head.name; 
  queue.removeFirst04();
  System.out.println(removedName + " telah meminjam buku. Sisa antrian: " + queue.getSize04());
  break;

  case 4:
  System.out.println("Belum jadi");

  break;

  case 5:
  System.out.println("Keluar dari program");
  break;
  default:
  System.out.println("Invalid Option");
    break;
}
    } while (choice !=5);
    
  }
}
