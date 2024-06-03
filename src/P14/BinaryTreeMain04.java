package P14;

public class BinaryTreeMain04 {
  public static void main(String[] args) {
    BinaryTree04 bt = new BinaryTree04();

    bt.rekursif(6);
    bt.rekursif(4);
    bt.rekursif(8);
    bt.rekursif(3);
    bt.rekursif(5);
    bt.rekursif(7);
    bt.rekursif(9);
    bt.rekursif(10);
    bt.rekursif(15);

    System.out.println("PreOrder Traversal:");
    bt.traversePreOrder(bt.root);
    System.out.println("");

    System.out.println("InOrder Traversal:");
    bt.traverseInOrder(bt.root);
    System.out.println("");

    System.out.println("PostOrder Traversal:");
    bt.traversePostOrder(bt.root);
    System.out.println("");

    System.out.println("Find node 5: " + bt.find(5));

    System.out.println("Delete Node 8");
    bt.delete(8);
    System.out.println("");

    System.out.println("PreOrder Traversal after deletion:");
    bt.traversePreOrder(bt.root);
    System.out.println("");

    System.out.println("Minimum value in the tree: " + bt.findMin());
    System.out.println("Maximum value in the tree: " + bt.findMax());

    System.out.print("Leaf nodes in the tree:");
    bt.printLeaf();
    System.out.println("");

    System.out.println("Number of leaf nodes in the tree: " + bt.hitungDaun());
  }
}
