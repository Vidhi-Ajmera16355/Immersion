package Trees;
class TreNode {
    int data;
    TreNode left;
    TreNode right;
    TreNode(int data) {
        this.data = data;
    }
}
public class balancesBT {
	public static boolean isBalanced(TreNode root) {
        if(root==null) return true;
        if(height(root)==-1) 
        return false;
        return true;
    }
    static int height(TreNode root){
        if(root==null) return 0;
        int left = height(root.left);
        int right = height(root.right);
        if(left==-1 || right==-1) return -1; 
        if(Math.abs(left-right)>1) return -1;
        return Math.max(left,right)+1;
    }
	public static void main(String[] args) {
		TreNode root = new TreNode(3);
        root.left = new TreNode(9);
        root.right = new TreNode(20);
        root.right.left = new TreNode(15);
        root.right.right = new TreNode(7);
        System.out.println(isBalanced(root));
	}

}
