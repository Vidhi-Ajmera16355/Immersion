package Trees;
class Node{
	int data;
	Node left;
	Node right;
	Node(int data){
		this.data = data;
	}
}
public class sameTree {
static boolean sameTree(Node p,Node q) {
	if(p==null || q==null) return p==q;
	return (p.data==q.data && sameTree(p.left,q.left) && sameTree(p.right,q.right));
}
	
	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		Node root1 = new Node(1);
		root1.left = new Node(2);
		root1.right = new Node(3);
		System.out.println(sameTree(root,root1));
	}
}