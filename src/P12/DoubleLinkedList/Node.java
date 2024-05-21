package P12.DoubleLinkedList;

public class Node {
  int data;
  Node prev, next;
  Node(Node prev, int data, Node next){
    this.data = data;
    this.next = next;
    this.prev = prev;
  }
}
