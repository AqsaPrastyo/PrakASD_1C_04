package P12.Tugas1;

public class PasienVaksin {
    Node head;
    int size;

    public PasienVaksin() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int item, String name) {
        if (isEmpty()) {
            Node newNode = new Node(null, item, name, null);
            head = newNode;
        } else {
            Node newNode = new Node(null, item, name, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    public void addLast(int item, String name) {
        if (isEmpty()) {
            addFirst(item, name);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, item, name, null);
            current.next = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (size == 1) {
            head = null;
        } else {
            head = head.next;
            head.prev = null;
        }
        size--;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println(tmp.data + ". " + tmp.name);
                tmp = tmp.next;
            }
            System.out.println("\nSisa antrian: " + size);
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public int getSize() {
        return size;
    }
}
