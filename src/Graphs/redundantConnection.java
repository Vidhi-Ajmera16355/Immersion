package Graphs;

import java.util.*;

public class redundantConnection {

	public static void main(String[] args) {
		int[][] edges = {
				{1,2},{1,3},{2,3}
		};
		for(int i=0;i<edges.length;i++) {
			for(int j=0;j<edges[0].length;j++) {
				System.out.print(edges[i][j]+" ");
			}
		}
		System.out.println();
		answer(edges);
	}
	public static void answer(int[][] edges) {
		int n = edges.length;
	    ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
	        for (int i = 0; i < n; i++)
	            graph.add(new ArrayList<>());
	        for (int[] edge : edges) {
	            int u = edge[0]-1;
//	            System.out.println("u"+u);
	            int v = edge[1]-1;
//	            System.out.println("v"+v);
	            boolean[] visited = new boolean[n]; 
	            if (dfs(graph, u, v, visited)){
//	                return edge;
	            	System.out.println(Arrays.toString(edge));
	            }
	            graph.get(u).add(v);
	            graph.get(v).add(u);
	        }	        
//	        return new int[0];
	    }

	    private static boolean dfs(ArrayList<ArrayList<Integer>> graph, int u, int v, boolean[] visited){
	        if (u == v){
	            return true;
	        }
	        visited[u] = true;
	        for (int nbr : graph.get(u)) {
	            if (!visited[nbr]) {
	                if (dfs(graph, nbr, v, visited)) {
	                    return true;
	                }
	            }
	        }
	        return false;
	    }
	}
