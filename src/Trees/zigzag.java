package Trees;
import java.util.*;
class TrNode{
	int data;
	TrNode left;
	TrNode right;
	TrNode(int data){
		this.data = data;
	}
}
public class zigzag {
	static List<List<Integer>> zigzag(TrNode root){
	List<List<Integer>> ans = new ArrayList<>();
	if(root==null)
	return ans;
	boolean leftToRight = true;
	int idx=0;
	Queue<TrNode> q = new LinkedList<>();
	q.add(root);
	while(!q.isEmpty()) {
		int x=q.size();
		List<Integer> l = new ArrayList<>();
		for(int i=0;i<x;i++) {
			TrNode curr = q.poll();
			if(curr.left!=null) q.add(curr.left);
			if(curr.right!=null) q.add(curr.right);
			if(leftToRight) l.add(curr.data);
			else
				l.add(0,curr.data);
		}
		leftToRight=!leftToRight;
		ans.add(l);
	}
	return ans;
}
	public static void main(String[] args){
		TrNode root = new TrNode(3);
		root.left = new TrNode(9);
		root.right = new TrNode(20);
		root.right.left = new TrNode(15);
		root.right.right = new TrNode(7);
		List<List<Integer>> result = zigzag(root);
	    for (List<Integer> level : result) {
	        System.out.println(level);
	    }
	}

}
