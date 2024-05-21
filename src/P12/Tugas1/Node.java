package P12.Tugas1;

public class Node {
  int data;
  String name;
  Node prev, next;

  Node(Node prev, int data, String name, Node next) {
      this.data = data;
      this.name = name;
      this.next = next;
      this.prev = prev;
  }
}

