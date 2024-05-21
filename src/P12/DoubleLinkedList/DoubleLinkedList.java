package P12.DoubleLinkedList;

public class DoubleLinkedList {
  Node head;
  int size;

  public DoubleLinkedList(){
    head = null;
    size = 0;
  }
boolean isEmpty(){
  return head == null;
}

public void addFirst(int item){
 if (isEmpty()) {
  Node newNode = new Node(null, item, null);
  head = newNode;
 } else {
  Node newNode = new Node(head, item, head);
  head.prev = newNode;
  head = newNode;
 }
 size++;
}

public void addLast(int item){
  if (isEmpty()) {
    addFirst(item);
  } else {
    Node current = head;
    while (current.next != null) {
      current = current.next;
    }
    Node newNode = new Node(current, item, null);
    current.next = newNode;
    size++;
  }
}

public  void add(int item, int index) throws Exception{
  if (isEmpty()) {
    addFirst(item);
  } else if(index < 0 || index > size ){
    throw new Exception ("Nilai indeks diluar batas");
  } else {
    Node current = head;
    int i = 0;
    while (i < index) {
      current = current.next;
      i++;
    }
    if (current.prev == null) {
      Node newNode = new Node(null, item, current);
      current.prev = newNode;
      head = newNode;
    } else {
      Node newNode = new Node(current.prev, item, current);
      newNode.prev = current.prev;
      newNode.next = current;
      current.prev.next = newNode;
      current.prev = newNode;
    }
  }
  size++;
}

public int size(){
  return size;
}

public void clear(){
  head = null;
  size = 0;
}

public void print(){
  if (!isEmpty()) {
    Node tmp = head;
    while (tmp != null) {
      System.out.println(tmp.data + "\t");
      tmp = tmp.next;
    }
    System.out.println("\nberhasil diisi");
  } else {
    System.out.println("Linked List Kosong");
  }
}


}