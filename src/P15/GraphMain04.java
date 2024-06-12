package P15;

import java.util.Scanner;

public class GraphMain04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        GraphMatrik04 gdg = new GraphMatrik04(4);
        Graph04 gedung = new Graph04(6);

        // gedung.addEdge(0, 1, 50, true);
        // gedung.addEdge(0, 2, 100, true);
        // gedung.addEdge(1, 3, 70, true);
        // gedung.addEdge(2, 3, 40, true);
        // gedung.addEdge(3, 4, 60, true);
        // gedung.addEdge(4, 5, 80, true);

        // try {
        //     gedung.degree(0);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // try {
        //     gedung.printGraph();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // try {
        //     gedung.removeEdge(1, 3);
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // try {
        //     gedung.printGraph();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // System.out.print("Masukkan gedung asal: ");
        // int asal = scanner.nextInt();

        // System.out.print("Masukkan gedung tujuan: ");
        // int tujuan = scanner.nextInt();

        // if (gedung.isAdjascent(asal, tujuan)) {
        //     System.out.println("Gedung " + (char)('A' + asal) + " dan Gedung " + (char)('A' + tujuan) + " bertetangga");
        // } else {
        //     System.out.println("Gedung " + (char)('A' + asal) + " dan Gedung " + (char)('A' + tujuan) + " tidak bertetangga");
        // }

        // gdg.makeedge(0, 1, 50);
        // gdg.makeedge(1, 0, 60);
        // gdg.makeedge(1, 2, 70);
        // gdg.makeedge(2, 1, 80);
        // gdg.makeedge(2, 3, 40);
        // gdg.makeedge(3, 0, 90);

        // try {
        //     gdg.printGraph();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // System.out.println("Hasil setelah penghapusan edge");
        // gdg.removeEdge(2, 1);
        // try {
        //     gdg.printGraph();
        // } catch (Exception e) {
        //     e.printStackTrace();
        // }
        // System.out.print("Masukkan node untuk menghitung degree (0 - " + (gdg.vertex - 1) + "): ");
        // int node = scanner.nextInt();
        // gdg.degree(node);

        boolean running = true;

        while (running) {
            System.out.println("Menu:");
            System.out.println("1. Add Edge");
            System.out.println("2. Remove Edge");
            System.out.println("3. Degree");
            System.out.println("4. Print Graph");
            System.out.println("5. Cek Edge");
            System.out.println("6. Update Jarak");
            System.out.println("7. Exit");
            System.out.print("Pilih menu: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Masukkan gedung asal: ");
                    int asalAdd = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanAdd = scanner.nextInt();
                    System.out.print("Masukkan jarak: ");
                    int jarak = scanner.nextInt();
                    System.out.print("Apakah directed? (true/false): ");
                    boolean directed = scanner.nextBoolean();
                    gedung.addEdge(asalAdd, tujuanAdd, jarak, directed);
                    System.out.println("Edge ditambahkan.\n");
                    break;
                case 2:
                    System.out.print("Masukkan gedung asal: ");
                    int asalRemove = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanRemove = scanner.nextInt();
                    try {
                        gedung.removeEdge(asalRemove, tujuanRemove);
                        System.out.println("Edge dihapus.\n");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    System.out.print("Masukkan gedung: ");
                    int gedungDegree = scanner.nextInt();
                    try {
                        gedung.degree(gedungDegree);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 4:
                    try {
                        gedung.printGraph();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    break;
                case 5:
                    System.out.print("Masukkan gedung asal: ");
                    int asalCek = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanCek = scanner.nextInt();
                    if (gedung.isAdjacent(asalCek, tujuanCek)) {
                        System.out.println("Gedung " + (char)('A' + asalCek) + " dan Gedung " + (char)('A' + tujuanCek) + " bertetangga\n");
                    } else {
                        System.out.println("Gedung " + (char)('A' + asalCek) + " dan Gedung " + (char)('A' + tujuanCek) + " tidak bertetangga\n");
                    }
                    break;
                case 6:
                    System.out.print("Masukkan gedung asal: ");
                    int asalUpdate = scanner.nextInt();
                    System.out.print("Masukkan gedung tujuan: ");
                    int tujuanUpdate = scanner.nextInt();
                    System.out.print("Masukkan jarak baru: ");
                    int newJarak = scanner.nextInt();
                    gedung.updateJarak(asalUpdate, tujuanUpdate, newJarak);
                    System.out.println("Jarak antara gedung " + (char)('A' + asalUpdate) + " dan gedung " + (char)('A' + tujuanUpdate) + " berhasil diupdate.\n");
                    break;
                case 7:
                    running = false;
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.\n");
                    break;
            }
        }
        scanner.close();
    }
}
