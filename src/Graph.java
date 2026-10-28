public class Graph {
    private int vertices;
    private int[][] adjacency_mat;

    Graph(int vertices) {
        this.vertices = vertices;
        this.adjacency_mat = new int[vertices][vertices];
    }

    public void add_edges(int from, int to) {
        adjacency_mat[from][to] = 1;
        adjacency_mat[to][from] = 1;
    }

    public void display_matrix() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjacency_mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Check whether two vertices share a direct edge.
    public void connectedness(int from, int to) {
        if (adjacency_mat[from][to] == 1) {
            System.out.println(from + " and " + to + " are directly connected.");
        } else {
            System.out.println(from + " and " + to + " are not directly connected.");
        }
    }

    // Print every vertex that shares an edge with n.
    public void adjacent_nodes(int n) {
        System.out.print("Adjacent nodes of " + n + ": ");
        boolean found = false;
        for (int i = 0; i < vertices; i++) {
            if (adjacency_mat[n][i] == 1) {
                System.out.print(i + " ");
                found = true;
            }
        }
        if (!found) {
            System.out.print("None");
        }
        System.out.println();
    }
}