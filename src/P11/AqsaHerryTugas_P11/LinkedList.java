package P11.AqsaHerryTugas_P11;

public class LinkedList {
  Node head, tail;

  boolean isEmpty() {
    return head == null;
  }

  void print() { 
    if (!isEmpty()) {
      Node tmp = head;
      System.out.println("Isi Linked List");
      while (tmp != null) {
        System.out.print(tmp.data + "\t");
        tmp = tmp.next;
      }
      System.out.println("");
    } else {
      System.out.println("Linked List kosong");
    }
  }

  void addFirst(Mahasiswa input) {
    Node ndInput = new Node(input, null); 
    if (isEmpty()) { 
      head = ndInput;
      tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
  }

  void addLast(Mahasiswa input) {
    Node ndInput = new Node(input, null);
    if (isEmpty()) { 
      head = ndInput;
      tail = ndInput;
    } else {
      tail.next = ndInput;
      tail = ndInput;
    }
  }

  void insertAfter(Mahasiswa key, Mahasiswa input) {
    Node ndInput = new Node(input, null);
    Node temp = head;
    while (temp != null) {
      if (temp.data.equals(key)) {
        ndInput.next = temp.next; 
        temp.next = ndInput;
        if (ndInput.next == null) {
          tail = ndInput;
        }
        break;
      }
      temp = temp.next;
    }
  }

  void insertAt(int index, Mahasiswa input) {
    if (index < 0) {
      System.out.println("Index tidak valid: " + index);
      return;
    }
    if (index == 0) {
      addFirst(input);
    } else {
      Node temp = head;
      for (int i = 0; i < index - 1; i++) {
        if (temp != null) {
          temp = temp.next;
        } else {
          System.out.println("Index tidak valid: " + index);
          return;
        }
      }
      if (temp != null) {
        temp.next = new Node(input, temp.next);
        if (temp.next.next == null) {
          tail = temp.next;
        }
      }
    }
  } 
}
