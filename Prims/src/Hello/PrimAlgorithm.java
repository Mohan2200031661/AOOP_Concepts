package Hello;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.PriorityQueue;

public class PrimAlgorithm {

    static class Edge implements Comparable<Edge> {
        int to;
        int weight;

        public Edge(int to, int weight) {
            this.to = to;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge other) {
            return Integer.compare(this.weight, other.weight);
        }
    }

    public static List<Edge> primMST(List<List<Edge>> graph) {
        int n = graph.size();
        boolean[] visited = new boolean[n];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>();
        List<Edge> result = new ArrayList<>();

        // Start from the first vertex (you can start from any vertex)
        minHeap.add(new Edge(0, 0));

        while (!minHeap.isEmpty()) {
            Edge current = minHeap.poll();

            if (visited[current.to]) {
                continue;
            }

            visited[current.to] = true;
            result.add(current);

            for (Edge neighbor : graph.get(current.to)) {
                if (!visited[neighbor.to]) {
                    minHeap.add(neighbor);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 5;  // Number of vertices
        List<List<Edge>> graph = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }

        // Add edges to the graph
        graph.get(0).add(new Edge(1, 2));
        graph.get(1).add(new Edge(0, 2));
        graph.get(1).add(new Edge(2, 3));
        graph.get(2).add(new Edge(1, 3));
        graph.get(2).add(new Edge(0, 1));
        graph.get(3).add(new Edge(2, 3));
        graph.get(3).add(new Edge(1, 4));
        graph.get(4).add(new Edge(3, 1));

        List<Edge> minimumSpanningTree = primMST(graph);

        System.out.println("Minimum Spanning Tree Edges:");
        for (Edge edge : minimumSpanningTree) {
            System.out.println(edge.to + " - " + edge.weight);
        }
    }
}


