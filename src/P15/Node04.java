package P15;

public class Node04 {
    int data, jarak;
    Node04 prev, next;

    Node04(Node04 prev, int data, int jarak, Node04 next) {
        this.prev = prev;
        this.data = data;
        this.jarak = jarak;
        this.next = next;
    }

    public int getJarak() {
        return jarak;
    }

    public void setJarak(int jarak) {
        this.jarak = jarak;
    }
}
