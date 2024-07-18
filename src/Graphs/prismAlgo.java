package Graphs;
import java.util.*;

class Pair {
    int node;
    int distance;

    public Pair(int distance, int node) {
        this.distance = distance;
        this.node = node;
    }
}

public class prismAlgo {

    public static void main(String[] args) {
        int V = 5;
        ArrayList<ArrayList<ArrayList<Integer>>> adj = new ArrayList<>();
        
        // Initialize adjacency list
        for (int i = 0; i < V; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Add edges (example graph)
        adj.get(0).add(new ArrayList<>(Arrays.asList(1, 2)));
        adj.get(0).add(new ArrayList<>(Arrays.asList(3, 6)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(0, 2)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(2, 3)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(3, 8)));
        adj.get(1).add(new ArrayList<>(Arrays.asList(4, 5)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(1, 3)));
        adj.get(2).add(new ArrayList<>(Arrays.asList(4, 7)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(0, 6)));
        adj.get(3).add(new ArrayList<>(Arrays.asList(1, 8)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(1, 5)));
        adj.get(4).add(new ArrayList<>(Arrays.asList(2, 7)));
        
        System.out.println("Minimum Spanning Tree cost: " + spanningTree(V, adj));
    }

    static int spanningTree(int V, ArrayList<ArrayList<ArrayList<Integer>>> adj) {
        // node, distance
        PriorityQueue<Pair> pq = new PriorityQueue<Pair>((x, y) -> x.distance - y.distance);
        int[] vis = new int[V];
        
        pq.add(new Pair(0, 0));
        int sum = 0;
        while (pq.size() > 0) {
            int wt = pq.peek().distance;
            int node = pq.peek().node;
            pq.remove();
            if (vis[node] == 1) continue;
            vis[node] = 1;
            sum += wt;
            
            for (ArrayList<Integer> edge : adj.get(node)) {
                int adjNode = edge.get(0);
                int edW = edge.get(1);
                
                if (vis[adjNode] == 0) {
                    pq.add(new Pair(edW, adjNode));
                }
            }
        }
        return sum;
    }
}
