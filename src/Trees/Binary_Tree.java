package Trees;
import java.util.*;
public class Binary_Tree {
	
	class Node{
		int data;
		Node left;
		Node right;
		public Node (int data) {
			this.data = data;
			this.right = null;
			this.left = null;
		}
	}
	
	private Node root = null;
	
	private static Scanner sc = new Scanner(System.in);
	public Binary_Tree(){
		this.root = createTree();
	}
	private Node createTree(){
		int data=sc.nextInt();
		Node node = new Node(data);
		int doesLeftChildPresent = sc.nextInt();
		if(doesLeftChildPresent==1) node.left = createTree();
		int doesRightChildPresent = sc.nextInt();
		if(doesRightChildPresent==1) node.right = createTree();
		return node;
		
	}

	public void print() {
		print(this.root);
	}
	private void print(Node root) {
		if(root==null) {
			return;
		}
		System.out.println(root.left+ "<-"+root.data+ "<-"+ root.right);
		print(root.left);
		print(root.right);
	}
	

}
