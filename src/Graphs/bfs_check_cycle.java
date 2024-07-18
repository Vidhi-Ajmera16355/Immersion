package Graphs;
import java.util.*;

public class bfs_check_cycle {

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            adj.add(new ArrayList<>());
        }
        adj.get(1).add(2);
        adj.get(2).add(1);
        adj.get(2).add(3);
        adj.get(3).add(2);
        adj.get(1).add(3);
        adj.get(3).add(1);
        boolean ans = isCycle(6, adj);
        if (ans)
            System.out.println("1");
        else
            System.out.println("0");
    }

    static boolean checkCycle(int src, int V, ArrayList<ArrayList<Integer>> adj, boolean[] vis) {
        vis[src] = true;
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{src, -1});
        while (!q.isEmpty()) {
            int[] pair = q.poll();
            int node = pair[0];
            int par = pair[1];
            for (Integer it : adj.get(node)) {
                if (!vis[it]) {
                    q.add(new int[]{it, node});
                    vis[it] = true;
                } else if (par != it) {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean isCycle(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean[] vis = new boolean[V]; 
        for (int i = 0; i < V; i++) {
            if (!vis[i]) {
                if (checkCycle(i, V, adj, vis)) {
                    return true;
                }
            }
        }
        return false;
    }
}
