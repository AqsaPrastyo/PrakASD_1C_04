package P1;

import java.util.Scanner;

public class PraktikumFungsi04 {
  
  private static final int[][] STOCK_BUNGA = {
    {10, 5, 15, 7},
    {6, 11, 9, 12},
    {2, 10, 10, 5},
    {5, 7, 12, 9}
};

private static final int[] HARGA_BUNGA = {
    75000, 50000, 60000, 10000
};

private static final int[] PENGURANGAN_STOCK_CABANG_4 = {
    -1, -2, 0, -5
};

public static void main(String[] args) {
    for (int i = 0; i < STOCK_BUNGA.length; i++) {
        int totalPendapatan = 0;
        for (int j = 0; j < STOCK_BUNGA[i].length; j++) {
            totalPendapatan += STOCK_BUNGA[i][j] * HARGA_BUNGA[j];
        }
        System.out.println("Cabang " + (i + 1) + ": Rp" + totalPendapatan);
    }

    System.out.println("\nStok awal cabang 4:");
    for (int i = 0; i < STOCK_BUNGA[3].length; i++) {
        System.out.println(getNamaBunga(i) + ": " + STOCK_BUNGA[3][i]);
    }

    System.out.println("\nPengurangan stok cabang 4:");
    for (int i = 0; i < PENGURANGAN_STOCK_CABANG_4.length; i++) {
        System.out.println(getNamaBunga(i) + ": " + PENGURANGAN_STOCK_CABANG_4[i]);
    }

    System.out.println("\nStok akhir cabang 4:");
    for (int i = 0; i < STOCK_BUNGA[3].length; i++) {
        int stokAkhir = STOCK_BUNGA[3][i] + PENGURANGAN_STOCK_CABANG_4[i];
        System.out.println(getNamaBunga(i) + ": " + stokAkhir);
    }
}

private static String getNamaBunga(int index) {
    switch (index) {
        case 0:
            return "Aglonema";
        case 1:
            return "Keladi";
        case 2:
            return "Alocasia";
        case 3:
            return "Mawar";
        default:
            return "";
    }


  }
}
