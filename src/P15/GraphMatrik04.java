package P15;

public class GraphMatrik04 {
    int vertex;
    int[][] matriks;

    public GraphMatrik04(int v) {
        vertex = v;
        matriks = new int[v][v];
        for (int i = 0; i < v; i++) {
            for (int j = 0; j < v; j++) {
                matriks[i][j] = -1;
            }
        }
    }

    public void makeedge(int asal, int tujuan, int jarak) {
        matriks[asal][tujuan] = jarak;
    }

    public void removeEdge(int asal, int tujuan) {
        matriks[asal][tujuan] = -1;
    }

    public void printGraph() {
        for (int i = 0; i < vertex; i++) {
            System.out.print("Gedung " + (char) ('A' + i) + ": ");
            for (int j = 0; j < vertex; j++) {
                if (matriks[i][j] != -1) {
                    System.out.print("Gedung " + (char) ('A' + j) + " (" + matriks[i][j] + " m), ");
                }
            }
            System.out.println();
        }
    }

    public int outDegree(int node) {
        int degree = 0;
        for (int j = 0; j < vertex; j++) {
            if (matriks[node][j] != -1) {
                degree++;
            }
        }
        return degree;
    }

    public int inDegree(int node) {
        int degree = 0;
        for (int i = 0; i < vertex; i++) {
            if (matriks[i][node] != -1) {
                degree++;
            }
        }
        return degree;
    }

    public void degree(int node) {
        int out = outDegree(node);
        int in = inDegree(node);
        System.out.println("Out Degree dari gedung " + (char) ('A' + node) + ": " + out);
        System.out.println("In Degree dari gedung " + (char) ('A' + node) + ": " + in);
        System.out.println("Degree dari gedung " + (char) ('A' + node) + ": " + (out + in));
    }
}
