package P14;

public class BinaryTree04 {
  Node04 root;

  public BinaryTree04() {
    root = null;
  }

  boolean isEmpty() {
    return root == null;
  }

  
  void rekursif(int data) {
    root = rekursif(root, data);
  }

  private Node04 rekursif(Node04 current, int data) {
    if (current == null) {
      return new Node04(data);
    }

    if (data < current.data) {
      current.left = rekursif(current.left, data);
    } else if (data > current.data) {
      current.right = rekursif(current.right, data);
    } // data already exists
    return current;
  }

  boolean find(int data) {
    Node04 current = root;
    while (current != null) {
      if (data == current.data) {
        return true;
      } else if (data < current.data) {
        current = current.left;
      } else {
        current = current.right;
      }
    }
    return false;
  }

  void traversePreOrder(Node04 node) {
    if (node != null) {
      System.out.print(" " + node.data);
      traversePreOrder(node.left);
      traversePreOrder(node.right);
    }
  }

  void traverseInOrder(Node04 node) {
    if (node != null) {
      traverseInOrder(node.left);
      System.out.print(" " + node.data);
      traverseInOrder(node.right);
    }
  }

  void traversePostOrder(Node04 node) {
    if (node != null) {
      traversePostOrder(node.left);
      traversePostOrder(node.right);
      System.out.print(" " + node.data);
    }
  }

  Node04 getSuccessor(Node04 delNode) {
    Node04 successorParent = delNode;
    Node04 successor = delNode;
    Node04 current = delNode.right;

    while (current != null) {
      successorParent = successor;
      successor = current;
      current = current.left;
    }

    if (successor != delNode.right) {
      successorParent.left = successor.right;
      successor.right = delNode.right;
    }

    return successor;
  }

  void delete(int data) {
    Node04 parent = root;
    Node04 current = root;
    boolean isLeftChild = false;

    while (current != null && current.data != data) {
      parent = current;
      if (data < current.data) {
        isLeftChild = true;
        current = current.left;
      } else {
        isLeftChild = false;
        current = current.right;
      }
    }

    if (current == null) {
      System.out.println("Couldn't find data!");
      return;
    }

    // No children
    if (current.left == null && current.right == null) {
      if (current == root) {
        root = null;
      } else if (isLeftChild) {
        parent.left = null;
      } else {
        parent.right = null;
      }
    } 
    // One child (right)
    else if (current.left == null) {
      if (current == root) {
        root = current.right;
      } else if (isLeftChild) {
        parent.left = current.right;
      } else {
        parent.right = current.right;
      }
    } 
    // One child (left)
    else if (current.right == null) {
      if (current == root) {
        root = current.left;
      } else if (isLeftChild) {
        parent.left = current.left;
      } else {
        parent.right = current.left;
      }
    } 
    // Two children
    else {
      Node04 successor = getSuccessor(current);
      if (current == root) {
        root = successor;
      } else if (isLeftChild) {
        parent.left = successor;
      } else {
        parent.right = successor;
      }
      successor.left = current.left;
    }
  }

  
  int findMin() {
    if (isEmpty()) {
      throw new IllegalStateException("Treenya kosong");
    }
    Node04 current = root;
    while (current.left != null) {
      current = current.left;
    }
    return current.data;
  }

  
  int findMax() {
    if (isEmpty()) {
      throw new IllegalStateException("Treenya kosong");
    }
    Node04 current = root;
    while (current.right != null) {
      current = current.right;
    }
    return current.data;
  }

  
  void printLeaf() {
    printLeaf(root);
  }

  private void printLeaf(Node04 node) {
    if (node == null) {
      return;
    }
    if (node.left == null && node.right == null) {
      System.out.print(" " + node.data);
    }
    printLeaf(node.left);
    printLeaf(node.right);
  }

  
  int hitungDaun() {
    return hitungDaun(root);
  }

  private int hitungDaun(Node04 node) {
    if (node == null) {
      return 0;
    }
    if (node.left == null && node.right == null) {
      return 1;
    }
    return hitungDaun(node.left) + hitungDaun(node.right);
  }
}
