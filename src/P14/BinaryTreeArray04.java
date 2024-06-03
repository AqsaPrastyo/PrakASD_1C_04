package P14;

public class BinaryTreeArray04 {
    int[] data;
    int idxLast;

    public BinaryTreeArray04() {
        data = new int[10];
        idxLast = -1;
    }

    void populateData(int[] data, int idxLast) {
        this.data = data;
        this.idxLast = idxLast;
    }

    void add(int value) {
        if (idxLast < data.length - 1) {
            idxLast++;
            data[idxLast] = value;
        } else {
            System.out.println("Tree is full");
        }
    }

    void traverseInOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traverseInOrder(2 * idxStart + 1); 
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " "); 
            }
            traverseInOrder(2 * idxStart + 2); 
        }
    }

    void traversePreOrder(int idxStart) {
        if (idxStart <= idxLast) {
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " "); 
            }
            traversePreOrder(2 * idxStart + 1); 
            traversePreOrder(2 * idxStart + 2); 
        }
    }

    void traversePostOrder(int idxStart) {
        if (idxStart <= idxLast) {
            traversePostOrder(2 * idxStart + 1); 
            traversePostOrder(2 * idxStart + 2); 
            if (data[idxStart] != 0) {
                System.out.print(data[idxStart] + " "); 
            }
        }
    }
}
