package P10.Nasabah;

public class NasabahQueue04 {
  Nasabah04[] data;
  int rear;
  int front;
  int size;
  int max;

public NasabahQueue04(int n){
  max = n;
  data = new Nasabah04[max];
  size = 0;
  front = rear = -1;
}

public boolean isEmpty04(){
  if (size == 0) {
    return true;
  } else {
    return false;
  }
}


public boolean isFull04(){
  if (size == max) {
    return true;
  } else {
    return false;
  }
}

public void peek(){
    if (!isEmpty04()) {
      System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
    } else {
      System.out.println("Queue masih kosong!");
    }
}

public void print(){
  if (isEmpty04()) {
    System.out.println("Queue masih kosong!");
  } else {
    int i = front;
    while (i != rear) {
      System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
      i = (i + 1) % max;
    }
    System.out.println("Elemen terdepan: " + data[front].norek + " " + data[front].nama + " "
                    + data[front].alamat + " " + data[front].umur + " " + data[front].saldo);
    System.out.println("Jumlah elemen = " + size);
  }
}

public void clear(){
  if (!isEmpty04()) {
    front = rear = -1;
    size = 0;
    System.out.println("Queue berhasil dikosongkan");
  } else {
    System.out.println("Queue masih kosong!");
  }
}

public void Enqueue(Nasabah04 dt){
if (isFull04()) {
  System.out.println("Queue sudah penuh!");
  System.exit(0);
  // throw new NullPointerException("Enqueue operation is called on empty queue.");
} else {
  if (isEmpty04()) {
    front = rear = 0;
  } else {
    if (rear == max -1) {
      rear =0;
    } else {
      rear++;
      }
    }
    data[rear]= dt;
    size++;
  }
}

public Nasabah04 Dequeue(){
  Nasabah04 dt = new Nasabah04(null, null, null, max, front) ;
    if (isEmpty04()) {
      System.out.println("Queue masih kosong!");
      System.exit(0);
      // throw new NullPointerException("deQueue operation is called on empty queue.");
    } else {
      dt = data[front];
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

public void peekRear() {
  if (!isEmpty04()) {
      System.out.println("Elemen terbelakang: " + data[rear].norek + " " + data[rear].nama + " "
              + data[rear].alamat + " " + data[rear].umur + " " + data[rear].saldo);
  } else {
      System.out.println("Queue masih kosong!");
  }
}


}
