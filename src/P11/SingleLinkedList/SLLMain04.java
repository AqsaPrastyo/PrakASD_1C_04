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

    System.out.println("Data pada index ke-1=" +singLL.getData(1));
    System.out.println("Data 3 berada pada index ke-" +singLL.index0f(760));
    singLL.remove(999);
    singLL.print();
    singLL.removeAt(0);
    singLL.print();
    singLL.removeFirst();
    singLL.print();
    singLL.removeLast();
    singLL.print();
  }
}
