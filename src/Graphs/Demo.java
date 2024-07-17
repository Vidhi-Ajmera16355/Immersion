package Graphs;
import java.util.*;
public class Demo {

	public static void main(String[] args) {
		hashGraph graph = new hashGraph(7);
		
//		graph.addEdge(1,2);
//		graph.addEdge(1,5);
//		graph.addEdge(2,3);
//		graph.addEdge(2,4);
//		graph.print();		
		graph.addEdge(1, 2);
		graph.addEdge(1, 4);
		graph.addEdge(2, 3);
		graph.addEdge(2, 5);
		graph.addEdge(3, 4);
		graph.addEdge(5, 6);
		graph.addEdge(5, 7);
		graph.addEdge(6, 7);
//		graph.print();
//		System.out.println(graph.hasPath(1,6));
//
//		System.out.print("BFS ->");
//		graph.BFS();
//		System.out.println();
//		graph.BFSCheck(2,5);
//		System.out.println("Cycles(BFS) -> "+graph.cycleCount());
		graph.BFT();
		
		
		boolean[] visited = new boolean[8]; // Adjusting the size to handle 1-based index
        System.out.print("DFS -> ");
        graph.dfs(7, 1, visited);
	}
}

// check in visited
// remove 
// skip -> check in visited!! if exist then skip -> cycle count / cycle exist :)
// add to visited
// check in neighbours
// adding neighbours to queue 
//................repeat...............
