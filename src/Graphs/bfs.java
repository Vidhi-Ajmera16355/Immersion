package Graphs;
import java.util.*;

public class bfs {

    public static void main(String[] args) {
        // Number of vertices
        int v = 5;
        
        // Adjacency list representation of the graph
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        
        // Adding edges to the graph
        adj.get(0).add(1);
        adj.get(0).add(2);
        adj.get(1).add(3);
        adj.get(1).add(4);
        
        // Creating an instance of the bfs class
        bfs bfsInstance = new bfs();
        
        // Calling the bfs method
        ArrayList<Integer> result = bfsInstance.bfs(v, adj);
        
        // Printing the result
        System.out.println("BFS Traversal: " + result);
    }

    public ArrayList<Integer> bfs(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v];
        ArrayList<Integer> bfs = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        
        // Start BFS from node 0
        q.add(0);
        vis[0] = true;
        
        while (!q.isEmpty()) {
            Integer node = q.poll();
            bfs.add(node);
            for (Integer i : adj.get(node)) {
                if (!vis[i]) {
                    vis[i] = true;
                    q.add(i);
                }
            }
        }
        return bfs;
    }
}
