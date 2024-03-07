package P3.Mahasiswa;

import java.util.Scanner;

public class mahasiswaMain04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Mahasiswa04[] mahasiswas = new Mahasiswa04[3];

    for (int i = 0; i < mahasiswas.length; i++) {
        System.out.println("Masukkan data mahasiswa ke- " + (i + 1));
        System.out.print("Masukkan nama : ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan nim : ");
        String nim = scanner.nextLine();
        System.out.print("Masukkan jenis kelamin (L/P) : ");
        char jenisKelamin = scanner.next().charAt(0);
        System.out.print("Masukkan IPK : ");
        double ipk = scanner.nextDouble();
        scanner.nextLine(); 

        mahasiswas[i] = new Mahasiswa04(nama, nim, jenisKelamin, ipk);
    }
    for (int i = 0; i < mahasiswas.length; i++) {
        System.out.println("Data Mahasiswa ke-" + (i + 1));
        System.out.println("Nama : " + mahasiswas[i].Nama());
        System.out.println("NIM : " + mahasiswas[i].Nim());
        System.out.println("Jenis kelamin : " + mahasiswas[i].JenisKelamin());
        System.out.println("Nilai IPK : " + mahasiswas[i].Ipk());
        System.out.println();
    }

double rataRataIPK = hitungRataRataIPK(mahasiswas);
System.out.println("Rata-rata IPK : " + rataRataIPK);


tampilkanMahasiswaTerbesar(mahasiswas);
}


private static double hitungRataRataIPK(Mahasiswa04[] mahasiswas) {
double totalIPK = 0;

for (Mahasiswa04 mahasiswa : mahasiswas) {
    totalIPK += mahasiswa.Ipk();
}

return totalIPK / mahasiswas.length;
}


private static void tampilkanMahasiswaTerbesar(Mahasiswa04[] mahasiswas) {
Mahasiswa04 mahasiswaTerbesar = mahasiswas[0];

for (Mahasiswa04 mahasiswa : mahasiswas) {
    if (mahasiswa.Ipk() > mahasiswaTerbesar.Ipk()) {
        mahasiswaTerbesar = mahasiswa;
    }
}

System.out.println("Mahasiswa dengan IPK terbesar:");
System.out.println("Nama : " + mahasiswaTerbesar.Nama());
System.out.println("NIM : " + mahasiswaTerbesar.Nim());
System.out.println("Jenis kelamin : " + mahasiswaTerbesar.JenisKelamin());
System.out.println("Nilai IPK : " + mahasiswaTerbesar.Ipk());




}

}
