package P10;

public class Queue04 {
  Pembeli04[] antrian;
  int front;
  int rear;
  int size;
  int max;

  Queue04(int n){
    max = n;
    antrian = new Pembeli04[max];
    size = 0;
    front = rear = -1;
  }

  public boolean isEmpty04(){
    return size == 0;
  }

  public boolean isFull04(){
    return size == max;
  }

  public void Enqueue(Pembeli04 dt){
    if (isFull04()) {
      System.out.println("Queue sudah penuh!");
      System.exit(0);
    } else {
      if (isEmpty04()) {
        front = rear = 0;
      } else {
        if (rear == max -1) {
          rear = 0;
        } else {
          rear++;
        }
      }
      antrian[rear] = dt;
      size++;
    }
  }

  public Pembeli04 Dequeue(){
    Pembeli04 dt = null;
    if (isEmpty04()) {
      System.out.println("Queue masih kosong!");
      System.exit(0);
    } else {
      dt = antrian[front];
      size--;
      if (isEmpty04()) {
        front = rear = -1;
      } else {
        if (front == max -1) {
          front = 0;
        } else {
          front++;
        }
      }
    }
    return dt;
  }

  public void print(){
    if (isEmpty04()) {
      System.out.println("Queue masih kosong!");
    } else {
      int i = front;
      while (i != rear) {
        System.out.println(antrian[i] + " ");
        i = (i + 1) % max;
      }
      System.out.println(antrian[i] + " ");
      System.out.println("Jumlah elemen = " + size);
    }
  }

  public void peek(){
    if (!isEmpty04()) {
      System.out.println("Elemen terdepan: " + antrian[front]);
    } else {
      System.out.println("Queue masih kosong!");
    }
  }

  public void peekRear() {
    if (!isEmpty04()) {
      System.out.println("Elemen terbelakang: " + antrian[rear]);
    } else {
      System.out.println("Queue masih kosong!");
    }
  }

  public void peekPosition(String nama) {
    boolean found = false;
    int posisi = -1;
    for (int i = front; i != rear; i = (i + 1) % max) {
      if (antrian[i].nama.equalsIgnoreCase(nama)) {
        found = true;
        posisi = i;
        break;
      }
    }
    if (antrian[rear].nama.equalsIgnoreCase(nama)) {
      found = true;
      posisi = rear;
    }
    if (found) {
      System.out.println("Pembeli dengan nama " + nama + " berada di posisi antrian ke-" + (posisi - front + 1));
    } else {
      System.out.println("Pembeli dengan nama " + nama + " tidak ditemukan dalam antrian.");
    }
  }

  public void daftarPembeli() {
    if (isEmpty04()) {
      System.out.println("Queue masih kosong!");
    } else {
      System.out.println("Daftar pembeli dalam antrian:");
      int i = front;
      while (i != rear) {
        System.out.println(antrian[i]);
        i = (i + 1) % max;
      }
      System.out.println(antrian[i]);
    }
  }
}
