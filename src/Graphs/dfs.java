package Graphs;
import java.util.*;

public class dfs {

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
        
        // Creating an instance of the dfs class
        dfs dfsInstance = new dfs();
        
        // Calling the dfsOfGraph method
        ArrayList<Integer> result = dfsInstance.dfsOfGraph(v, adj);
        
        // Printing the result
        System.out.println("DFS Traversal: " + result);
    }

    public ArrayList<Integer> dfsOfGraph(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[v];
        ArrayList<Integer> ls = new ArrayList<>();
        dfs(0, vis, adj, ls);
        return ls;
    }
    
    public void dfs(int node, boolean[] vis, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ls) {
        vis[node] = true;
        ls.add(node);
        
        for (Integer it : adj.get(node)) {
            if (!vis[it]) {
                dfs(it, vis, adj, ls);
            }
        }
    }
}
