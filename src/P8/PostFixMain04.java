package P8;

import java.util.Scanner;

public class PostFixMain04 {
  public static void main(String[] args) {
    Scanner sc04 = new Scanner(System.in);
    String P, Q;
    System.out.println("Masukan ekspresi matematika (infix): ");
    Q = sc04.nextLine();
    Q = Q.trim();
    Q = Q + ")";

int total = Q.length();

PostFix04 post = new PostFix04(total);
P = post.konversi(Q);
System.out.println("Postfix: " + P);
  }
}
