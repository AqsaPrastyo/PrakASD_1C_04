package P11.AqsaHerryTugas_P11;

public class TugasMain {
  public static void main(String[] args) {
    LinkedList linkedList = new LinkedList();

    
    Mahasiswa mahasiswa1 = new Mahasiswa("123", "John");
    Mahasiswa mahasiswa2 = new Mahasiswa("456", "Jane");
    Mahasiswa mahasiswa3 = new Mahasiswa("789", "Doe");
    linkedList.addLast(mahasiswa1);
    linkedList.addLast(mahasiswa2);
    linkedList.addFirst(mahasiswa3);
    linkedList.print();
    Mahasiswa mahasiswaBaru = new Mahasiswa("101", "Alice");
    linkedList.insertAfter(mahasiswa2, mahasiswaBaru);
    linkedList.print();
    Mahasiswa mahasiswaBaru2 = new Mahasiswa("202", "Bob");
    linkedList.insertAt(2, mahasiswaBaru2);
    linkedList.print();
  }
}
