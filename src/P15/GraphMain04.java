package P15;

public class GraphMain04 {
  public static void main(String[] args) {
    Graph04 gedung  = new Graph04(6);
    gedung.addEdge(0, 1, 50, true);
    gedung.addEdge(0, 2, 100, true);
    gedung.addEdge(1, 3, 70, true);
    gedung.addEdge(2, 3, 40, true);
    gedung.addEdge(3, 4, 60, true);
    gedung.addEdge(4, 5, 80, true);
    try {
      gedung.degree(0);
    } catch (Exception e) {
      
      e.printStackTrace();
    }
    try {
      gedung.printGraph();
    } catch (Exception e) {
      
      e.printStackTrace();
    }

    try {
      gedung.removeEdge(1, 3);
    } catch (Exception e) {
      
      e.printStackTrace();
    }
    try {
      gedung.printGraph();
    } catch (Exception e) {
      
      e.printStackTrace();
    }
  }
  
}
