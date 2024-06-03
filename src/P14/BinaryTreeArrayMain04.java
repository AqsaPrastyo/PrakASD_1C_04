package P14;

public class BinaryTreeArrayMain04 {
    public static void main(String[] args) {
        BinaryTreeArray04 bta = new BinaryTreeArray04();
        int[] data = {6, 4, 8, 3, 5, 7, 9, 0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);

        System.out.println("InOrder Traversal:");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.println("PreOrder Traversal:");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.println("PostOrder Traversal:");
        bta.traversePostOrder(0);
        System.out.println();

        
        bta.add(10);
        bta.add(11);

        System.out.println("\nInOrder Traversal setelah menambahkan elements:");
        bta.traverseInOrder(0);
        System.out.println();

        System.out.println("PreOrder Traversal setelah menambahkan elements:");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.println("PostOrder Traversal setelah menambahkan elements:");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
