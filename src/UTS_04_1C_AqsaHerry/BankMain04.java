package UTS_04_1C_AqsaHerry;

import java.util.Scanner;

public class BankMain04 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Scanner scStr = new Scanner(System.in);
    Scanner scInt = new Scanner(System.in);

    BankOP04 data = new BankOP04();
    
Bank04 listRek = new Bank04("16030927 3084", "Wallace", "Mei Mei", "082-458-264-3263", "Wallace@gmai.com");
Bank04 listRek1 = new Bank04("16100617 0573", "Darius", "Susanti", "081-375-843-0547", "darius@pt.org");
Bank04 listRek2 = new Bank04("16240401 2243", "Fuller", "Rosalia", "085-556-712-7062", "fuller@mail.com");
Bank04 listRek3 = new Bank04("16270525 0112", "Maria", "Krabela", "082-267-223-0234", "maria@gmail.com");
Bank04 listRek4 = new Bank04("16101617 2416", "Gery", "Fatimah", "083-683-416-8323", "gery@gery.com");

    data.tambah04(listRek);
    data.tambah04(listRek1);
    data.tambah04(listRek2);
    data.tambah04(listRek3);
    data.tambah04(listRek4);


StakTransaksi04 stk = new StakTransaksi04();

Transaksi04 Trs = new Transaksi04("Tr005", "16101617 2416", 500000, 200000, 700000, "23-04-2024", "Kredit");
Transaksi04 Trs1 = new Transaksi04("Tr004", "16270525 0112", 500000, 0, 0, null, null);
Transaksi04 Trs2 = new Transaksi04(null, null, 0, 0, 0, null, null);
Transaksi04 Trs3 = new Transaksi04(null, null, 0, 0, 0, null, null);
Transaksi04 Trs4 = new Transaksi04(null, null, 0, 0, 0, null, null);

















while (true) {
  System.out.println("\nMenu");
  System.out.println("1. Data Norek");
  System.out.println("2. Data transaksi");
  System.out.println("3. Search Data");
  System.out.println("4. Display min/max Saldo");
  System.out.println("5. Sort Data");
  System.out.println("6. Exit");
  System.out.print("Chose Mensu (1-6): ");
  int pilihan = scInt.nextInt();

switch (pilihan) {
  case 1:
    data.tampil04();
    
    break;
  case 2:
    
    break;
  case 3:
    
    break;
  case 4:
    
    break;
  case 5:
    
    break;
  case 6:
    System.exit(0);
    break;
         
  default:
  System.out.println("Invalid");
    break;
}



}

  }
}
