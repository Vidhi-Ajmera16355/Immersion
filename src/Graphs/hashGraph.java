package Graphs;
import java.util.*;
public class hashGraph {
//	vertex -> [Neighbours,Cost]
	private HashMap<Integer,HashMap<Integer,Integer>> graph;
	
	public hashGraph(int n){
		this.graph = new HashMap<>();
		for(int i=1;i<=n;i++){
			this.graph.put(i, new HashMap<>());
		}
//		vertex -> new HashMap's address
	}
	
	public void addEdge(int v1, int v2){
		this.graph.get(v1).put(v2,-1);
		this.graph.get(v2).put(v1,-1);
	}
	
	public void removeEdge(int v1,int v2){
		if(this.graph.get(v1).containsKey(v2)){
			this.graph.get(v1).remove(v2);
		}
		if(this.graph.get(v2).containsKey(v1)){
			this.graph.get(v2).remove(v1);
		}
	}
	
	public boolean isNeighbour(int v1, int v2) {
		return this.graph.get(v1).containsKey(v2);
	}
	
	
	public boolean hasPath(int v1,int v2) {
		HashSet<Integer> visited = new HashSet<>();
		return hasPath(v1,v2,visited);
	}
	public boolean hasPath(int curr,int des,HashSet<Integer> visited) {
		if(curr==des) {
			return true;
		}
//		choices-> num of neighbours!!
		visited.add(curr);
		HashMap<Integer,Integer> nbrs = this.graph.get(curr);
		boolean doesExist = false;
		for(int nbr:nbrs.keySet()){
			if(!visited.contains(nbr)) {
				doesExist=hasPath(nbr,des,visited);
				if(doesExist)
					break;
			}
		}
//		backtrack
		visited.remove(curr);
		return doesExist;
	}
	
	public void BFS() {
		Queue<Integer> queue = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		queue.add(1);
		while(!queue.isEmpty()) {
//			remove
			int curr = queue.remove();
//			skip
			if(visited.contains(curr)) {
				continue;
			}
			System.out.print(curr+" ");
//			mark visited
			visited.add(curr);
			
//			neighbours
			HashMap<Integer,Integer> nbrs = this.graph.get(curr);
			for(int nbr : nbrs.keySet()) {
				if(!visited.contains(nbr))
				queue.add(nbr);
			}			
		}
	}
	public boolean BFSCheck(int src,int des) {
		int c=0;
		Queue<Integer> queue = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		queue.add(src);
		while(!queue.isEmpty()) {
//			remove
			int curr = queue.remove();
//			skip
			if(visited.contains(curr)) {
				continue;
			}			
//			System.out.print(curr+" ");
			
			if(src==des) {
				return true;
			}
//			mark visited
			visited.add(curr); 
//			neighbours
			HashMap<Integer,Integer> nbrs = this.graph.get(curr);
			for(int nbr : nbrs.keySet()) {
				queue.add(nbr);
			}
			c++;
		}
		System.out.println(c);
		return false;
	}
	public int cycleCount() {
		int c=0;
		Queue<Integer> queue = new LinkedList<>();
		HashSet<Integer> visited = new HashSet<>();
		queue.add(1);
		while(!queue.isEmpty()) {
//			remove
			int curr = queue.remove();
//			skip
			if(visited.contains(curr)) {
				c++;
				continue;
			}
//			mark visited
			visited.add(curr);
			
//			neighbours
			HashMap<Integer,Integer> nbrs = this.graph.get(curr);
			for(int nbr : nbrs.keySet()) {
				if(!visited.contains(nbr))
				queue.add(nbr);
			}
			
		}
		return c;
	}
	
	public void BFT() {
		HashSet<Integer> visited = new HashSet<>();
		int cycle=0;
		int numOfComponents=0;
		for(int src: this.graph.keySet()) {
			if(visited.contains(src))
				continue;
		Queue<Integer> queue = new LinkedList<>();
		queue.add(src);
		numOfComponents++;
		while(!queue.isEmpty()) {
//			remove
			int curr = queue.remove();
//			skip
			if(visited.contains(curr)) {
				cycle++;
				continue;
			}
			System.out.print(curr+" ");
//			mark visited
			visited.add(curr);
			
//			neighbours
			HashMap<Integer,Integer> nbrs = this.graph.get(curr);
			for(int nbr : nbrs.keySet()) {
				if(!visited.contains(nbr))
				queue.add(nbr);
			}			
		}
		}
		System.out.println("Cycles in BFT -> "+cycle);
		System.out.println("Disconnected components in Graph (Num of provinces)-> "+numOfComponents);
	}
	
	public void print(){
		for(int vertex : this.graph.keySet()) {
			HashMap<Integer, Integer> neighbour = this.graph.get(vertex);
			for(int ngbrs : neighbour.keySet()){
				System.out.println(vertex + " -> " + ngbrs);
			}
		}
	}
}
