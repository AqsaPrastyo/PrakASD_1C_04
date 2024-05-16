package P11.SingleLinkedList;

import P1.test1;

public class SingleLinkedList04 {
  Node04 head, tail;

  boolean isEmpty() {
    return head == null;
  }

  void print() { 
    if (!isEmpty()) {
      Node04 tmp = head;
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

  void addFirst(int input) {
    Node04 ndInput = new Node04(input, null); 
    if (isEmpty()) { 
      head = ndInput;
      tail = ndInput;
    } else {
      ndInput.next = head;
      head = ndInput;
    }
  }

  void addLast(int input) {
    Node04 ndInput = new Node04(input, null);
    if (isEmpty()) { 
      head = ndInput;
      tail = ndInput;
    } else {
      tail.next = ndInput;
      tail = ndInput;
    }
  }

  void insertAfter(int key, int input) {
    Node04 ndInput = new Node04(input, null);
    Node04 temp = head;
    while (temp != null) {
      if (temp.data == key) {
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

  void insertAt(int index, int input) {
    if (index < 0) {
      System.out.println("Index tidak valid: " + index);
      return;
    }
    if (index == 0) {
      addFirst(input);
    } else {
      Node04 temp = head;
      for (int i = 0; i < index - 1; i++) {
        if (temp != null) {
          temp = temp.next;
        } else {
          System.out.println("Index tidak valid: " + index);
          return;
        }
      }
      if (temp != null) {
        temp.next = new Node04(input, temp.next);
        if (temp.next.next == null) {
          tail = temp.next;
        }
      }
    }
  }

int getData(int index){
  Node04 temp = head;
  for (int i = 0; i < index ; i++) {
    temp = temp.next;
  }
  return temp.data;
}

int index0f(int key){
  Node04 temp = head;
  int index = 0;
  while (temp != null && temp.data != key) {
    temp = temp.next;
    index++;
  }
  if (temp == null) {
    return -1;
  } else {
    return index;
  }
}

void removeFirst(){
  if (isEmpty()) {
    System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
  } else if(head == tail){
    head = tail =null;
  } else{
    head = head.next;
  }
}

void removeLast (){
  if (isEmpty()) {
    System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
  } else if(head == tail ){
    head = tail = null;
  } else{
    Node04 temp = head;
    while (temp.next.next != null) {
      temp = temp.next;
    }
    temp.next = null;
    tail = temp.next;
  }
}

void remove(int key){
  if (isEmpty()) {
    System.out.println("Linked list masih kosong, " + "tidak dapat dihapus");
  } else {
    Node04 temp =head;
    while (temp !=null) {
      if (temp.data == key && temp == head) {
        removeFirst();
        break;
      } else if(temp.next.data == key){
        temp.next = temp.next.next;
        if (temp.next == null) {
          tail=temp;
        }
        break;
      }
      temp = temp.next;
    }
  }
}

public void removeAt (int index){
  if (index == 0) {
    removeFirst();
  } else {
    Node04 temp = head;
    for (int i = 0; i < index -1; i++) {
      temp =temp.next;
    }
    temp.next = temp.next.next;
    if (temp.next == null) {
      tail = temp;
    }
  }
}






}
