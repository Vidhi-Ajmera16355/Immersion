package Graphs;
import java.util.*;

public class detectCycle {
    public static void main(String[] args) {
        int v = 6;
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
//        adj.get(1).add(3);
//        adj.get(3).add(1);
        boolean[] vis = new boolean[v];
        System.out.println(dfs_check_cycle(adj, 1, -1, vis));  // Start from node 1
    }

    public static boolean dfs_check_cycle(ArrayList<ArrayList<Integer>> graph, int s, int parent, boolean[] vis) {
        vis[s] = true;
        ArrayList<Integer> nbr_list = graph.get(s);
        for (int nbr : nbr_list) {
            if (!vis[nbr]) {
                if (dfs_check_cycle(graph, nbr, s, vis)) {
                    return true;
                }
            } else if (nbr != parent) {
                return true;
            }
        }
        return false;
    }
    
    public static boolean dfs_check_directed_cycle(ArrayList<ArrayList<Integer>> graph, int v, int s, boolean[] vis, boolean[] inPath) {
        vis[s] = true;
        inPath[s] = true;
        ArrayList<Integer> nbr_list = graph.get(s);
        for (int nbr : nbr_list) {
            if (!vis[nbr]) {
                if (dfs_check_directed_cycle(graph, v, nbr, vis, inPath)) {
                    return true;
                }
            } else if (inPath[nbr]) {
                return true;
            }
        }
        inPath[s] = false;
        return false;
    }
}