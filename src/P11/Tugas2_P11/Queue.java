package P11.Tugas2_P11;

public class Queue {
  Node head, tail;

  public Queue() {
      this.head = this.tail = null;
  }

  boolean isEmpty() {
      return head == null;
  }

  void enqueue(Mahasiswa mahasiswa) {
      Node newNode = new Node(mahasiswa, null);
      if (this.tail == null) {
          this.head = this.tail = newNode;
          return;
      }
      this.tail.next = newNode;
      this.tail = newNode;
  }

  Mahasiswa dequeue() {
      if (isEmpty()) {
          return null;
      }
      Node temp = this.head;
      this.head = this.head.next;
      if (this.head == null) {
          this.tail = null;
      }
      return temp.data;
  }

  void printQueue() {
      if (isEmpty()) {
          System.out.println("Antrian kosong");
          return;
      }
      Node temp = head;
      System.out.println("Isi Antrian:");
      while (temp != null) {
          System.out.print(temp.data + " -> ");
          temp = temp.next;
      }
      System.out.println("null");
  }
}
