package P12.Tugas2;

public class DaftarFilm {
  Node head;
    int size;

    public DaftarFilm() {
        head = null;
        size = 0;
    }

    boolean isEmpty() {
        return head == null;
    }

    public void addFirst(int id, String judul, double rating) {
        Node newNode = new Node(null, id, judul, rating, head);
        if (!isEmpty()) {
            head.prev = newNode;
        }
        head = newNode;
        size++;
    }

    public void addLast(int id, String judul, double rating) {
        if (isEmpty()) {
            addFirst(id, judul, rating);
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            Node newNode = new Node(current, id, judul, rating, null);
            current.next = newNode;
            size++;
        }
    }

    public void add(int id, String judul, double rating, int index) throws Exception {
        if (index < 0 || index > size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (isEmpty() || index == 0) {
            addFirst(id, judul, rating);
        } else if (index == size) {
            addLast(id, judul, rating);
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            Node newNode = new Node(current.prev, id, judul, rating, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    public void removeFirst() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else {
            head = head.next;
            if (head != null) {
                head.prev = null;
            }
            size--;
        }
    }

    public void removeLast() throws Exception {
        if (isEmpty()) {
            throw new Exception("Linked list masih kosong, tidak dapat dihapus");
        } else if (head.next == null) {
            head = null;
            size--;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.prev.next = null;
            size--;
        }
    }

    public void remove(int index) throws Exception {
        if (isEmpty() || index >= size) {
            throw new Exception("Nilai indeks di luar batas");
        } else if (index == 0) {
            removeFirst();
        } else if (index == size - 1) {
            removeLast();
        } else {
            Node current = head;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            current.prev.next = current.next;
            current.next.prev = current.prev;
            size--;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                System.out.println("ID: " + tmp.id + ", Judul: " + tmp.judul + ", Rating: " + tmp.rating);
                tmp = tmp.next;
            }
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void cariIdFilm(int id) {
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.id == id) {
                System.out.println("Data ID Film: " + id + " berada di node ke-" + index);
                System.out.println("Identitas:");
                System.out.println("Id Film: " + current.id);
                System.out.println("Judul: " + current.judul);
                System.out.println("IMDB Rating: " + current.rating);
                return;
            }
            current = current.next;
            index++;
        }
        System.out.println("Film dengan ID " + id + " tidak ditemukan.");
    }

    public void urutDataRatingDesc() {
        if (size < 2) {
            return;
        }
        boolean tukar;
        do {
            Node current = head;
            Node next = head.next;
            tukar = false;
            while (next != null) {
                if (current.rating < next.rating) {
                    double tempRating = current.rating;
                    current.rating = next.rating;
                    next.rating = tempRating;

                    int tempId = current.id;
                    current.id = next.id;
                    next.id = tempId;

                    String tempJudul = current.judul;
                    current.judul = next.judul;
                    next.judul = tempJudul;

                    tukar = true;
                }
                current = next;
                next = next.next;
            }
        } while (tukar);
    }
}
