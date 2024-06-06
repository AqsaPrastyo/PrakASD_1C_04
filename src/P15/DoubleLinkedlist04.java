package P15;

public class DoubleLinkedlist04 {
  Node04 head;
  int size;

  public DoubleLinkedlist04() {
    head = null;
    size = 0;
  }

  public int size() {
    return size;
  }
  
  public void clear() {
    head = null;
    size = 0;
  }

  boolean isEmpty() {
    return head == null;
  }

  public void addFirst(int item, int jarak) {
    if (isEmpty()) {
      head = new Node04(null, item, jarak, null);
    } else {
      Node04 newNode = new Node04(null, item, jarak, head);
      head.prev = newNode;
      head = newNode;
    }
    size++;
  }

  public int getjarak(int index) throws Exception {
    if (isEmpty() || index >= size) {
      throw new Exception("Linked list kosong atau indeks di luar batas");
    }
    Node04 tmp = head;
    for (int i = 0; i < index; i++) {
      tmp = tmp.next;
    }
    return tmp.jarak;
  }

  public void remove(int index) {
    Node04 current = head;
    while (current != null) {
      if (current.data == index) {
        if (current.prev != null) {
          current.prev.next = current.next;
        } else {
          head = current.next;
        }
        if (current.next != null) {
          current.next.prev = current.prev;
        }
        size--;  
        break;
      }
      current = current.next;
    }
  }

  public int get(int index) throws Exception {
    if (isEmpty() || index >= size) {
      throw new Exception("Linked list kosong atau indeks di luar batas");
    }
    Node04 tmp = head;
    for (int i = 0; i < index; i++) {
      if (tmp == null) {
        throw new Exception("Indeks di luar batas");
      }
      tmp = tmp.next;
    }
    return tmp.data;
  }
}
