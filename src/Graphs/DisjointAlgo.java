package Graphs;
import java.util.*;

class DisjointSet {
    List<Integer> rank = new ArrayList<>();
    List<Integer> parent = new ArrayList<>();

    public DisjointSet(int n) {
        for (int i = 0; i < n; i++) {
            rank.add(0);
            parent.add(i);
        }
    }

    public int findUPar(int node) {
        if (node != parent.get(node)) {
            parent.set(node, findUPar(parent.get(node)));
        }
        return parent.get(node);
    }

    public void unionByRank(int u, int v) {
        int ulp_u = findUPar(u);
        int ulp_v = findUPar(v);

        if (ulp_u == ulp_v) return;

        if (rank.get(ulp_u) < rank.get(ulp_v)) {
            parent.set(ulp_u, ulp_v);
        } else if (rank.get(ulp_u) > rank.get(ulp_v)) {
            parent.set(ulp_v, ulp_u);
        } else {
            parent.set(ulp_v, ulp_u);
            rank.set(ulp_u, rank.get(ulp_u) + 1);
        }
    }
}

public class DisjointAlgo {

    public static void main(String[] args) {
        DisjointSet ds = new DisjointSet(8); // Ensure enough space for 7 nodes (0 to 7)

        ds.unionByRank(1, 2);
        ds.unionByRank(2, 3);
        ds.unionByRank(4, 5);
        ds.unionByRank(6, 7);
        ds.unionByRank(5, 6);

        // if 3 and 7 are in the same set or not
        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }

        ds.unionByRank(3, 7);

        if (ds.findUPar(3) == ds.findUPar(7)) {
            System.out.println("Same");
        } else {
            System.out.println("Not Same");
        }
    }
}
