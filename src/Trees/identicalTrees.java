package Trees;
class tNode{
	int data;
	tNode left;
	tNode right;
	tNode(int data){
		this.data = data;
	}
}
public class identicalTrees {
	static boolean sameTree(tNode p,tNode q) {
		if(p==null || q==null) return p==q;
		return (p.data==q.data && sameTree(p.left,q.left) && sameTree(p.right,q.right));
	}		
		public static void main(String[] args) {
			tNode root = new tNode(1);
			root.left = new tNode(2);
			root.right = new tNode(3);
			tNode root1 = new tNode(1);
			root1.left = new tNode(2);
			root1.right = new tNode(3);
			System.out.println(sameTree(root,root1));
}
}