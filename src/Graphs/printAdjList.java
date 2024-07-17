package Graphs;
import java.util.*;
public class printAdjList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}  
	    public static List<List<Integer>> printGraph(int V, int edges[][]) {
	        List<List<Integer>> ans = new ArrayList<>();
	        for(int i=0;i<V;i++){
	            ans.add(new ArrayList<>());
	        }
	        for(int[] i:edges){
	            int src=i[0];
	            int dest = i[1];
	            ans.get(src).add(dest);
	            ans.get(dest).add(src);
	        }
	        return ans;
	    }
	}
}
