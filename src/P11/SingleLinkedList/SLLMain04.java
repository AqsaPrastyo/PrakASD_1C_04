package P11.SingleLinkedList;

public class SLLMain04 {
  public static void main(String[] args) {
    SingleLinkedList04 singLL = new SingleLinkedList04();
    singLL.print();
    singLL.addFirst (890);
    singLL.print();
    singLL.addLast(760);
    singLL.print();
    singLL.addFirst(700);
    singLL.print();
    singLL.insertAfter (700, 999);
    singLL.print();
    singLL.insertAfter (890, 833);
    singLL.print();
  }
}
