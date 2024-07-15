package Trees;
public class BST {
	class Node{
		int data;
		Node left;
		Node right;
		public Node(int data) {
			this.data = data;
			this.left = null;
			this.right = null;
		}
	}
	private Node root;
	public BST(int[] arr) {
		
	}
	
	private Node createTree(int[] arr,int s,int e) {
		if(s>e) {
			return null;
		}
		int mid = s+(e-s)/2;
		Node node = new Node(arr[mid]);
		node.left = createTree(arr,s,mid-1);
		node.right = createTree(arr,mid+1,e);
		return node;
		
	}
}
