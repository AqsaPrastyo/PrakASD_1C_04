package P14;

public class BinaryTreeArrayMain04 {
 public static void main(String[] args) {
  BinaryTreeArray04 bta = new BinaryTreeArray04();
  int [] data = {6,4,8,3,5,7,9,0,0,0};
  int idxLast =6;
  bta.populateData(data, idxLast);
  System.out.println("\nInOrder Tranversal : ");
  bta.traverseInOrder(0);
  System.out.println("\n");
 } 
}