package P15;

import java.util.Scanner;

public class GraphMain04 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    GraphMatrik04 gdg = new GraphMatrik04(4);
    Graph04 gedung  = new Graph04(6);
    gedung.addEdge(0, 1, 50, true);
    gedung.addEdge(0, 2, 100, true);
    gedung.addEdge(1, 3, 70, true);
    gedung.addEdge(2, 3, 40, true);
    gedung.addEdge(3, 4, 60, true);
    gedung.addEdge(4, 5, 80, true);
    try {
      gedung.degree(0);
    } catch (Exception e) {
      
      e.printStackTrace();
    }
    try {
      gedung.printGraph();
    } catch (Exception e) {
      
      e.printStackTrace();
    }

    try {
      gedung.removeEdge(1, 3);
    } catch (Exception e) {
      
      e.printStackTrace();
    }
    try {
      gedung.printGraph();
    } catch (Exception e) {
      
      e.printStackTrace();
    }
    System.out.print("Masukan gedung asal: ");
    int asal = scanner.nextInt();

    System.out.print("Masukan gedung tujuan: ");
    int tujuan = scanner.nextInt();

    if (gedung.isAdjascent(asal, tujuan)) {
      System.out.println("Gedung " + (char)('A' + asal) + " dan Gedung " + (char)('A' + tujuan) + " bertetangga");
    } else {
      System.out.println("Gedung " + (char)('A' + asal) + " dan Gedung " + (char)('A' + tujuan) + " tidak bertetangga");
    }

gdg.makeedge(0, 1, 50);
gdg.makeedge(1, 0, 60);
gdg.makeedge(1, 2, 70);
gdg.makeedge(2, 1, 80);
gdg.makeedge(2, 3, 40);
gdg.makeedge(3, 0, 90);
try {
  gdg.printGraph();
} catch (Exception e) {
  e.printStackTrace();
}
System.out.println("Hasil setelah penghapusan edge");
gdg.removeEdge(2, 1);
try {
  gdg.printGraph();
} catch (Exception e) {
  e.printStackTrace();
}

    scanner.close();
  }
  
}
