package P14;

public class BinaryTreeMain04 {
  public static void main(String[] args) {
    BinaryTree04 bt = new BinaryTree04();
    
    bt.add(6);
    bt.add(4);
    bt.add(8);
    bt.add(3);
    bt.add(5);
    bt.add(7);
    bt.add(9);
    bt.add(10);
    bt.add(15);
    System.out.println("PreOrder Tranversal : ");
    bt.traversePreOrder(bt.root);
    System.out.println("");
    System.out.println("InOrder Tranversal : ");
    bt.traverseInOrder(bt.root);
    System.out.println("");
    System.out.println("PostOrder Tranversal : ");
    bt.traversePostOrder(bt.root);
    System.out.println("");
    System.out.println("Find node : " +bt.find(5));
    System.out.println("Delete Node 8");
    bt.delete(8);
    System.out.println("");
    System.out.println("PreOrder Tranversal : ");
    bt.traversePreOrder(bt.root);
    System.out.println("");
  }
}
