package P1;

import java.util.Scanner;

public class Perulangan04 {
  public static void main(String[] args) {
    Scanner input04 = new Scanner(System.in);

        System.out.print("Masukkan NIM: ");
        double nim = input04.nextDouble();

        int n = (int) (nim % 100);
        if (n < 10) {
            n += 10;
        }

        System.out.println("Nilai n: " + n);

        for (int i = 1; i <= n; i++) {
            if (i == 6 || i == 10) {
                continue;
            } else if (i % 2 == 0) {
                System.out.print(i + " ");
            } else {
                System.out.print("* ");
            }
        }

        System.out.println();
  }
}
