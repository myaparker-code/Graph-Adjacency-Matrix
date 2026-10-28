public class Main {
    public static void main(String[] args) {
        // Repository link: https://github.com/myaparker-code/Graph-Adjacency-Matrix.git

        Graph g = new Graph(5);
        g.add_edges(0, 1);
        g.add_edges(0, 3);
        g.add_edges(0, 1);
        g.add_edges(0, 1);
        g.add_edges(0, 1);

        System.out.println("Adjacency matrix:");
        g.display_matrix();
        g.connectedness(0, 1);
        g.connectedness(0, 2);
        g.adjacent_nodes(0);
        g.adjacent_nodes(2);
    }
}