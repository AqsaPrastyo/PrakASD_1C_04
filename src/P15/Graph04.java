package P15;

public class Graph04 {
  int vertex;
  DoubleLinkedlist04 list[];

  public Graph04(int v) {
    vertex = v;
    list = new DoubleLinkedlist04[v];
    for (int i = 0; i < v; i++) {
      list[i] = new DoubleLinkedlist04();
    }
  }

  public void addEdge(int asal,  int tujuan, int jarak,boolean directed) {
    if (directed) {
      list[asal].addFirst(tujuan, jarak);
    } else {
      list[tujuan].addFirst(asal, jarak);
    }
    
    
  }

    public void degree(int asal) throws Exception {
      if (list[asal].isEmpty()) {
        throw new Exception("Linked list kosong");
      }
      int totalIn = 0;
      for (int i = 0; i < vertex; i++) {
        for (int j = 0; j < list[i].size(); j++) {
          if (list[i].get(j) == asal) {
            totalIn++;
          }
        }
      }
      int totalOut = list[asal].size();
      System.out.println("InDegree dari gedung " + (char)('A' + asal) + ": " + totalIn);
      System.out.println("OutDegree dari gedung " + (char)('A' + asal) + ": " + totalOut);
      System.out.println("Degree dari gedung " + (char)('A' + asal) + ": " + (totalIn + totalOut));
    }

  public void removeEdge(int asal, int tujuan) throws Exception {
    list[asal].remove(tujuan);
    list[tujuan].remove(asal);
  }

  public void removeAllEdge() {
    for (int i = 0; i < vertex; i++) {
      list[i].clear();
    }
    System.out.println("Graph berhasil dikosongkan");
  }

  public void printGraph() throws Exception {
    for (int i = 0; i < vertex; i++) {
      if (list[i].size() > 0) {
        System.out.print("Gedung " + (char)('A' + i) + " terhubung dengan ");
        for (int j = 0; j < list[i].size(); j++) {
          System.out.print((char)('A' + list[i].get(j)) + " (" + list[i].getjarak(j) + "m), ");
        }
        System.out.println();
      }
    }
    System.out.println();
  }

public boolean isAdjascent(int asal, int tujuan){
for (int i = 0; i < list[asal].size(); i++) {
  try {
    if (list[asal].get(i) == tujuan) {
      return true;
    }
  } catch (Exception e) {
    e.printStackTrace();
  }
}
return false;
}

}
