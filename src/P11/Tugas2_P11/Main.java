package P11.Tugas2_P11;

public class Main {
  public static void main(String[] args) {
      Queue antrian = new Queue();

      Mahasiswa m1 = new Mahasiswa("123", "John");
      Mahasiswa m2 = new Mahasiswa("456", "Jane");
      Mahasiswa m3 = new Mahasiswa("789", "Doe");

      antrian.enqueue(m1);
      antrian.enqueue(m2);
      antrian.enqueue(m3);

      
      antrian.printQueue();

      
      Mahasiswa keluar = antrian.dequeue();
      System.out.println("Mahasiswa keluar: " + keluar);

      
      antrian.printQueue();
  }
}
