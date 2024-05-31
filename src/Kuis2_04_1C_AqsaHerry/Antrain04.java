package Kuis2_04_1C_AqsaHerry;

public class Antrain04 {

  Anggota04 peminjam;
  int noAntrian;
  Node04 head;
  int size;
  public Antrain04(){
    head = null;
    size = 0;
  }

  boolean isEmpty04() {
    return head == null;
}

  public void addFirst04(String item, String name) {
    if (isEmpty04()) {
        Node04 newNode = new Node04(null, size, name, null);
        head = newNode;
    } else {
        Node04 newNode = new Node04(null, size, name, null);
        head.prev = newNode;
        head = newNode;
    }
    size++;
}

public void print04() {
  if (!isEmpty04()) {
      Node04 tmp = head;
      while (tmp != null) {
          System.out.println(tmp.data + ". " + tmp.name);
          tmp = tmp.next;
      }
      System.out.println("\nSisa antrian: " + size);
  } else {
      System.out.println("Linked List Kosong");
  }
}

public int getSize04() {
  return size;
}

public void removeFirst04() throws Exception {
  if (isEmpty04()) {
      throw new Exception("Linked list masih kosong, tidak dapat dihapus");
  } else {
      head = head.next;
      if (head != null) {
          head.prev = null;
      }
      size--;
  }
}

}
